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
            
            # CONTROL DE FLUJO: Resetear contexto en funciones o etiquetas
            if Constante.nombreFuncion.match(instr) or Constante.etiqueta.match(instr):
                print(f"Entrando a función/etiqueta: {instr}, limpiando contexto.")
                tabla.clear()
                etiquetas_vistas.clear()
                codigo.append(instr)
                continue
            
            # CONTROL DE FLUJO: Manejo de saltos (GOTO)
            if instr.startswith("goto"):
                print(f" Salto Encontrado: {instr}")
                destino = instr.split()[1]
                if destino in etiquetas_vistas: 
                    tabla.clear()
                print(f" Ciclo de salto a {destino}, limpiando contexto.")
                codigo.append(instr)
                continue
            
            # OPTIMIZACIÓN DE PUSH
            if instr.startswith("push"):
                val_push = instr.replace("push", "").strip()
                for v, val in tabla.items(): 
                    val_push = re.sub(rf'\b{v}\b', str(val), val_push)
                
                nueva_push = f"push {val_push}"
                if instr != nueva_push:
                    print(f"  [CAMBIO] {instr}  --->  {nueva_push}")
                else:
                    print(f"  [SIN CAMBIO] {instr}")
                
                codigo.append(nueva_push)
                continue

            # OPTIMIZACIÓN DE CALL
            if "call" in instr:
                for v, val in tabla.items():
                    instr = re.sub(rf'\b{v}\b', str(val), instr)
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
                if re.fullmatch(r'^\s*-?\d+(\.\d+)?\s*[+\-*/%]\s*-?\d+(\.\d+)?\s*$', exp):
                    try:
                        res = eval(exp)
                        exp = str(int(res)) if isinstance(res, float) and res.is_integer() else str(res)
                    except: 
                        pass

                nueva_instruccion = f"{var} = {exp}"

                # 4. ELIMINACIÓN DE TEMPORALES NO USADOS
                if var.startswith("t") and usos.get(var, 0) <= 1:
                    tabla[var] = exp
                    if re.fullmatch(r'[+-]?\d+(\.\d+)?', exp):
                        print(f"  [ELIMINADO] Temporal no usado: {instr}")
                        continue

                # 5. ACTUALIZAR TABLA DE CONSTANTES
                if re.fullmatch(r'[+-]?\d+(\.\d+)?', exp):
                    tabla[var] = exp
                else:
                    tabla.pop(var, None)

                # 6. LOG DE CAMBIOS
                if instr != nueva_instruccion:
                    print(f"  [OPTIMIZADO] {instr}  --->  {nueva_instruccion}")
                else:
                    print(f"  [SIN CAMBIO] {instr}")
                
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
                            print(f"  [PLEGADO] {instr}  --->  goto {label} (condición evaluada a {res})")
                            if not res: 
                                codigo.append(f"goto {label}")
                                print(f"  [SALTO] Condición es False, agregando goto {label}")
                                continue
                        except: 
                            pass
                print(f"  [OPTIMIZADO] {instr}  --->  if NOT ({cond}) goto {label}")
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
        """
        ELIMINACIÓN DE CÓDIGO MUERTO: Análisis reverso.
        """
        print("\n--- Ejecutando Limpieza de Código Muerto ---")
    
        siempre_vivas = set()
        for linea in lineas:
            if any(keyword in linea for keyword in ["if", "return", "push", "call"]):
                for v in Constante.usoVariable.findall(linea):
                    siempre_vivas.add(v)

        codigo_limpio = []
        variables_vivas = siempre_vivas.copy()

        for linea in reversed(lineas):
            instr = re.sub(r'^\s*\d+\.\s*', '', linea).strip()
            if not instr: 
                continue

            if "function" in instr:
                variables_vivas = siempre_vivas.copy()
                codigo_limpio.append(instr)
                continue

            if instr.startswith("pop"):
                var_pop = instr.replace("pop", "").strip()
                variables_vivas.add(var_pop)
                codigo_limpio.append(instr)
                continue

            if ":" in instr:
                variables_vivas.update(siempre_vivas)
                codigo_limpio.append(instr)
                continue

            m = Constante.asignacion.match(instr)
            if m:
                var = m.group(1).strip()
                exp = m.group(2).strip()
                es_temporal = var.startswith("t")
                usa_a_si_misma = re.search(rf'\b{var}\b', exp)

                if var not in variables_vivas and "(" not in exp and not usa_a_si_misma:
                    print(f"  [ELIMINADO] Redundancia detectada: {instr}")
                    continue
            
                if not es_temporal:
                    variables_vivas.add(var)

                variables_vivas.discard(var) 
                for v in Constante.usoVariable.findall(exp):
                    variables_vivas.add(v)
                codigo_limpio.append(instr)
            else:
                for v in Constante.usoVariable.findall(instr):
                    variables_vivas.add(v)
                codigo_limpio.append(instr)
        
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
            m_act = re.match(r'^(\w+):$', act)
            m_sig = re.match(r'^(\w+):$', sig)
            
            if m_act and m_sig:
                orig = m_act.group(1)
                dest = m_sig.group(1)
                mapa_alias[orig] = mapa_alias.get(dest, dest)
                print(f"  Colapsando: {orig} -> {mapa_alias[orig]}")

        lineas_intermedias = []
        for l in lineas:
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
            m_e = re.match(r'^(\w+):$', l.strip())
            if m_e:
                etiqueta = m_e.group(1)
                if re.search(rf'goto\s+{etiqueta}\b', texto_final):
                    lineas_finales.append(l)
                else:
                    print(f"  Borrando etiqueta huérfana: {etiqueta}")
            else:
                lineas_finales.append(l)

        return lineas_finales

    @classmethod
    def iniciarOptimizacion(cls, archivo_entrada, archivo_salida):
        with open(archivo_entrada, 'r', encoding='utf-8') as f:
            resultado = f.readlines()

        for i in range(7):
            print(f"\n--- Iteración de optimización {i + 1} ---\n")
            codigo_anterior = list(resultado) 

            resultado = cls.optimizar(resultado)
            resultado = cls.eliminarAsignacionesMuertas(resultado)
            resultado = cls.limpiarEtiquetas(resultado)
            
            check_anterior = [l.strip() for l in codigo_anterior]
            check_nuevo = [l.strip() for l in resultado]

            if check_anterior == check_nuevo:
                print(f"\n[INFO] Punto fijo alcanzado en la iteración {i + 1}. No hay más cambios.")
                break

        with open(archivo_salida, 'w', encoding='utf-8') as f:
            for i, linea in enumerate(resultado, 1):
                f.write(f"{i:3d}. {linea.strip()}\n")
        print("\n---Optimización finalizada con éxito ---\n")
