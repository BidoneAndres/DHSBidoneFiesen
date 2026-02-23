import re
from util.Constante import Constante

class Optimizador:
    
    @staticmethod
    def contarUsos(lineas):
        """
        FASE DE ANÁLISIS: Conteo de uso de variables.
        Identifica qué variables son necesarias y cuáles pueden ser eliminadas.
        """
        usos = {}
        # Busca lo que sigue a call/function/proto O lo que está antes de un ( o :
        regex_nombres_f = re.compile(r'(?:call|function|proto)\s+([a-zA-Z_]\w*)|([a-zA-Z_]\w*)\s*(?:\(|:)')

        for linea in lineas:
            # 1. Limpiar número de línea
            texto = re.sub(r'^\s*\d+\.\s*', '', linea).strip()
            if not texto:
                continue

            # 2. Identificar nombres de funciones para ignorar en esta línea
            nombres_f = {item for sublist in regex_nombres_f.findall(texto) for item in sublist if item}

            # 3. Analizar la línea para buscar variables
            m = Constante.asignacion.match(texto)
            parte_a_buscar = m.group(2) if m else texto
            candidatos = Constante.usoVariable.findall(parte_a_buscar)
            for v in candidatos:
                # Solo contamos si no es una función detectada
                if v not in nombres_f:
                    usos[v] = usos.get(v, 0) + 1
        return usos

    @classmethod
    def optimizar(cls, lineas_codigo):
        """
        FASE DE OPTIMIZACIÓN: Propagación de constantes y plegamiento.
        """
        print("\n--- Iniciando optimización ---\n")
        codigo = []
        tabla = {} # Diccionario para rastrear valores constantes
        usos = cls.contarUsos(lineas_codigo)
        etiquetas_vistas = set()

        for linea in lineas_codigo:
            # Limpiar número de línea
            instr = re.sub(r'^\s*\d+\.\s*', '', linea).strip()
            if not instr:
                continue
            
            # CONTROL DE FLUJO: Resetear contexto en funciones o etiquetas, para que no terminen con valores de otras partes del código
            if Constante.nombreFuncion.match(instr) or Constante.etiqueta.match(instr):
                print(f"Entrando a función/etiqueta: {instr}, limpiando contexto.")
                tabla.clear()
                etiquetas_vistas.clear()
                codigo.append(instr)
                continue
            
            # CONTROL DE FLUJO: Manejo de saltos (GOTO), si es un bucle que regresa a una etiqueta ya vista, limpiamos el contexto para evitar propagaciones erróneas
            if instr.startswith("goto"):
                print(f" Salto Encontrado: {instr}")
                destino = instr.split()[1]
                if destino in etiquetas_vistas:
                    tabla.clear()
                print(f" Ciclo de salto a {destino}, limpiando contexto.")
                codigo.append(instr)
                continue
            
            # OPTIMIZACIÓN DE PUSH (Propagación de constantes dentro de push)
            if instr.startswith("push"):
                val_push = instr.replace("push", "").strip()
                for v, val in tabla.items():
                    val_push = re.sub(rf'\b{v}\b', str(val), val_push)
                nueva_push = f"push {val_push}"
                if instr != nueva_push:
                    print(f" [CAMBIO] {instr} ---> {nueva_push}")
                else:
                    print(f" [SIN CAMBIO] {instr}")
                codigo.append(nueva_push)
                continue

            # OPTIMIZACIÓN DE CALL 
            if "call" in instr:
                codigo.append(instr)
                continue

            # MANEJO DE ASIGNACIONES (EJ: x = a + b)
            m = Constante.asignacion.match(instr)
            if m:
                var = m.group(1).strip()
                exp = m.group(2).strip()
                # 1. PROPAGACIÓN
                for v, val in tabla.items():
                    exp = re.sub(rf'\b{v}\b', str(val), exp)
                
                # 2. REDUCCIÓN DE POTENCIA E IDENTIDADES
                exp = re.sub(r'\b(\w+)\s*[\+\-]\s*0\b', r'\1', exp)
                exp = re.sub(r'\b0\s*\+\s*(\w+)\b', r'\1', exp)
                exp = re.sub(r'\b(\w+)\s*[\*/]\s*1\b', r'\1', exp)
                exp = re.sub(r'\b1\s*\*\s*(\w+)\b', r'\1', exp)
                exp = re.sub(r'\b(\w+)\s*\*\s*0\b', '0', exp)
                
                # 3. PLEGAMIENTO DE CONSTANTES (Constant Folding)
                if re.fullmatch(r'^\s*-?\d+(\.\d+)?\s*([+\-*/%]|<|>|<=|>=|==|!=)\s*-?\d+(\.\d+)?\s*$', exp):
                    try:
                        res = eval(exp)
                        # Si el resultado es Booleano (True/False), lo convertimos a 1/0
                        if isinstance(res, bool):
                            exp = "1" if res else "0"
                        # Si es un float que termina en .0, lo hacemos entero (ej: 4.0 -> 4)
                        elif isinstance(res, float) and res.is_integer():
                            exp = str(int(res))
                        else:
                            exp = str(res)
                        print(f" [PLEGADO] Simplificado: {exp}")
                    except:
                        pass

                nueva_instruccion = f"{var} = {exp}"

                # 4. ELIMINACIÓN DE TEMPORALES NO USADOS
                if var.startswith("t") and usos.get(var, 0) <= 1:
                    tabla[var] = exp
                    if re.fullmatch(r'[+-]?\d+(\.\d+)?', exp):
                        print(f" [ELIMINADO] Temporal no usado: {instr}")
                        continue

                # 5. ACTUALIZAR TABLA DE CONSTANTES
                if re.fullmatch(r'[+-]?\d+(\.\d+)?', exp): # Solo almacenamos constantes numéricas, no expresiones complejas
                    tabla[var] = exp 
                else:
                    tabla.pop(var, None)

                # 6. LOG DE CAMBIOS
                if instr != nueva_instruccion:
                    print(f" [OPTIMIZADO] {instr} ---> {nueva_instruccion}")
                else:
                    print(f" [SIN CAMBIO] {instr}")
                
                codigo.append(nueva_instruccion)
                continue

            # OPTIMIZACIÓN DE IF NOT
            m_if = Constante.ifNot.match(instr)
            if m_if:
                cond, label = m_if.groups()
                for v, val in tabla.items():
                    cond = re.sub(rf'\b{v}\b', str(val), cond)
                if re.fullmatch(r'[0-9+\-*/().\s%<>=!&|]+', cond):
                    try:
                        res = eval(cond.replace("&&", " and ").replace("||", " or "))
                        # Solo simplificamos la condición interna, mantenemos el 'if NOT'
                        cond = "1" if res else "0"
                        print(f" [PLEGADO] Condición evaluada: if NOT ({cond}) goto {label}")
                    except:
                        pass
                codigo.append(f"if NOT ({cond}) goto {label}")
                continue

            # OPTIMIZACIÓN DE RETURN
            if instr.startswith("return"):
                ret = instr.replace("return", "").strip()
                for v, val in tabla.items():
                    ret = re.sub(rf'\b{v}\b', str(val), ret)
                if re.search(r'[+\-*/%]', ret):
                    nuevo_t = f"t{len(usos)}"
                    codigo.append(f"{nuevo_t} = {ret}")
                    codigo.append(f"return {nuevo_t}")
                else:
                    codigo.append(f"return {ret}")
                continue

            codigo.append(instr)

        print("\n --- Optimización completa ---")
        return codigo

    @classmethod
    def eliminarAsignacionesMuertas(cls, lineas):
        print("\n--- Ejecutando Limpieza de Código Muerto ---")
        siempre_vivas = set()
        for linea in lineas:
            # Consideramos que cualquier variable usada en push, return, if o call es siempre viva, ya que afecta el flujo o resultado del programa
            if any(keyword in linea for keyword in ["push", "return", "if", "call", "<", ">", "==", "!="]): 
                encontradas = Constante.usoVariable.findall(linea)
                for v in encontradas:
                    siempre_vivas.add(v)

        codigo_limpio = []
        variables_vivas = siempre_vivas.copy()

        # Análisis reverso (de abajo hacia arriba)
        for linea in reversed(lineas):
            instr = linea.strip()
            if "function" in instr or ":" in instr: # Consideramos que en funciones o etiquetas, todas las variables son vivas por seguridad, para evitar eliminar algo que podría ser usado en otro bloque
                variables_vivas.update(siempre_vivas) # En cada función o etiqueta, reseteamos el contexto de variables vivas para evitar eliminar algo que podría ser usado en otro bloque
                codigo_limpio.append(linea) # Mantenemos la función o etiqueta sin cambios, pero reseteamos el contexto de variables vivas para esa sección del código
                continue

            m = Constante.asignacion.match(instr)
            if m:
                var = m.group(1).strip()
                exp = m.group(2).strip()
                if var not in variables_vivas and "call" not in exp: # Si la variable asignada no es viva y no es parte de una llamada (que podría tener efectos secundarios), la eliminamos
                    print(f" [ELIMINADO] Asignación muerta (nadie la usa después): {instr}")
                    continue
                
                variables_vivas.discard(var) # La variable que se asigna ya no es viva después de esta línea, a menos que se vuelva a usar más adelante
                for v in Constante.usoVariable.findall(exp): # Cualquier variable usada en la expresión se vuelve viva
                    variables_vivas.add(v)
                codigo_limpio.append(linea) # Mantenemos la línea, ya que es necesaria para el programa, pero actualizamos el conjunto de variables vivas para las líneas anteriores
            else:
                for v in Constante.usoVariable.findall(instr): # Cualquier variable usada en esta línea se vuelve viva
                    variables_vivas.add(v)
                codigo_limpio.append(linea)
        return list(reversed(codigo_limpio))

    @classmethod
    def limpiarEtiquetas(cls, lineas):
        """
        LIMPIEZA DE ETIQUETAS: Colapso y eliminación de huérfanas.
        """
        print("\n--- Iniciando limpieza y colapso de etiquetas ---")
        mapa_alias = {}
        for i in range(len(lineas) - 1):
            act = lineas[i].strip()
            sig = lineas[i+1].strip()
            m_act = re.match(r'^(\w+):$', act) # Revisamos si las líneas son etiquetas
            m_sig = re.match(r'^(\w+):$', sig)
            if m_act and m_sig:# Colapsamos las estiquetas si son consecutivas
                orig = m_act.group(1)
                dest = m_sig.group(1)
                mapa_alias[orig] = mapa_alias.get(dest, dest) # Si la etiqueta destino ya es un alias de otra, apuntamos al destino final para evitar cadenas de alias
                print(f" Colapsando: {orig} -> {mapa_alias[orig]}")

        lineas_intermedias = []
        for l in lineas: # Reemplazamos los saltos a etiquetas colapsadas por su destino final
            nueva_l = l
            for vieja, nuevo in mapa_alias.items():
                nueva_l = re.sub(rf'\bgoto\s+{vieja}\b', f"goto {nuevo}", nueva_l)
            m_l = re.match(r'^(\w+):$', nueva_l.strip())
            if m_l and m_l.group(1) in mapa_alias:
                continue
            lineas_intermedias.append(nueva_l)

        texto_final = "\n".join(lineas_intermedias)
        lineas_finales = []
        for l in lineas_intermedias:
            m_e = re.match(r'^(\w+):$', l.strip()) # Buscamos etiquetas huérfanas, es decir, aquellas que no son destino de ningún salto después de la limpieza
            if m_e:
                etiqueta = m_e.group(1)
                if re.search(rf'goto\s+{etiqueta}\b', texto_final): # Si la etiqueta sigue siendo referenciada por algún salto, la mantenemos
                    lineas_finales.append(l)
                else:
                    print(f" Borrando etiqueta huérfana: {etiqueta}")
            else:
                lineas_finales.append(l)
        return lineas_finales

    @classmethod
    def eliminarCodigoInalcanzable(cls, lineas):
        print("\n--- Limpiando bloques inalcanzables ---")
        resultado = []
        i = 0
        while i < len(lineas):
            instr = lineas[i].strip()
            resultado.append(lineas[i])
            m_goto = re.match(r'^goto\s+(\w+)', instr) # Detectamos saltos incondicionales
            m_if_siempre = re.match(r'^if NOT\s*\(0\)\s*goto\s+(\w+)', instr) # Detectamos condicionales que siempre saltan (if NOT (0) goto etiqueta)
            target_label = None # Si encontramos un salto, buscamos la etiqueta destino y eliminamos todo el bloque intermedio hasta esa etiqueta, siempre y cuando no encontremos otra etiqueta en el camino (lo que indicaría que el bloque es alcanzable desde otro punto del programa)
            if m_goto: target_label = m_goto.group(1) # Si es un salto incondicional, la etiqueta destino es el objetivo del salto
            elif m_if_siempre: target_label = m_if_siempre.group(1) # Si es un if NOT (0) goto, la etiqueta destino también es el objetivo del salto, ya que la condición siempre se evalúa como verdadera, lo que hace que el salto siempre ocurra

            if target_label: # Si encontramos un salto, buscamos la etiqueta destino y eliminamos todo el bloque intermedio hasta esa etiqueta, siempre y cuando no encontremos otra etiqueta en el camino (lo que indicaría que el bloque es alcanzable desde otro punto del programa)
                j = i + 1
                bloque_borrado = []
                encontrado = False
                while j < len(lineas):
                    proxima = lineas[j].strip()
                    if proxima == f"{target_label}:":
                        encontrado = True
                        i = j - 1
                        break
                    if Constante.etiqueta.match(proxima):
                        break
                    bloque_borrado.append(proxima)
                    j += 1
                if encontrado:
                    for b in bloque_borrado:
                        print(f" [BORRADO] Inalcanzable: {b}")
            i += 1
        return resultado

    @classmethod
    def iniciarOptimizacion(cls, archivo_entrada, archivo_salida):
        with open(archivo_entrada, 'r', encoding='utf-8') as f:
            resultado = f.readlines()

        for i in range(7):
            print(f"\n--- Iteración de optimización {i + 1} ---\n")
            codigo_anterior = list(resultado)
            resultado = cls.optimizar(resultado)
            resultado = cls.limpiarEtiquetas(resultado)
            resultado = cls.eliminarCodigoInalcanzable(resultado)
            resultado = cls.eliminarAsignacionesMuertas(resultado)
            
            check_anterior = [l.strip() for l in codigo_anterior]
            check_nuevo = [l.strip() for l in resultado]

            if check_anterior == check_nuevo:
                print(f"\n[INFO] Punto fijo alcanzado en la iteración {i + 1}. No hay más cambios.")
                break

        with open(archivo_salida, 'w', encoding='utf-8') as f:
            for i, linea in enumerate(resultado, 1):
                f.write(f"{i:3d}. {linea.strip()}\n")
        print("\n---Optimización finalizada con éxito ---\n")
