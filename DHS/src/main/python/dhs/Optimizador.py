import re
from util.Constante import Constante

class Optimizador:
    @staticmethod
    
    # --- FASE DE ANÁLISIS: Conteo de uso de variables ---
    # Sirve para identificar qué variables son necesarias y cuáles pueden ser eliminadas
    # si no se usan más adelante (especialmente variables temporales 't').
    
    def contarUsos(lineas):
        usos = {}
        print("\n--- Contando usos de variables ---\n")
        for linea in lineas:
            # Elimina el número de línea (ej. "1. ") para analizar solo el código
            texto = re.sub(r'^\s*\d+\.\s*', '', linea)
            m = Constante.asignacion.match(texto)
            # Si es una asignación (x = y + z), analizamos solo la parte derecha (y + z)
            if m: texto = m.group(2)
            # Busca todas las variables en la expresión y suma sus apariciones
            for v in Constante.usoVariable.findall(texto):
                usos[v] = usos.get(v, 0) + 1
                print(f"  Variable '{v}' usada {usos[v]} veces.")
        print("\n--- Conteo de usos completado ---\n")
        return usos

    @classmethod
    # --- FASE 1: Optimización Local y Propagación ---
    def optimizar(cls, lineas_codigo):
        print("\n--- Iniciando optimización ---\n")
        codigo = []
        tabla = {} # Diccionario para rastrear valores constantes (Propagación de constantes)
        usos = cls.contarUsos(lineas_codigo)
        etiquetas_vistas = set()

        for linea in lineas_codigo:
            
            # Limpiar número de línea
            instr = re.sub(r'^\s*\d+\.\s*', '', linea).strip()
            print(f"Procesando instrucción: {instr}")
            if not instr: 
                print("Línea vacía, saltando...")
                continue
            
            # CONTROL DE FLUJO: Si entramos a una función o etiqueta, el contexto cambia.
            # Se limpia la tabla para evitar propagar valores de un bloque a otro de forma errónea.
            if Constante.nombreFuncion.match(instr) or Constante.etiqueta.match(instr):
                tabla.clear()
                etiquetas_vistas.clear()
                codigo.append(instr)
                print(f"Manteniendo función/etiqueta: {instr}")
                continue
            
            # CONTROL DE FLUJO: Si hay un salto, los valores de las variables podrían cambiar 
            # fuera de este flujo lineal.
            if instr.startswith("goto"):
                destino = instr.split()[1]
                if destino in etiquetas_vistas: tabla.clear()
                codigo.append(instr)
                print(f"Manteniendo GOTO: {instr}")
                continue
            
            # MANEJO DE ASIGNACIONES (EJ: x = a + b)
            m = Constante.asignacion.match(instr)
            if m:
                var = m.group(1).strip()
                exp = m.group(2).strip()

                # PROPAGACIÓN: Sustituye variables por sus valores constantes conocidos
                for v, val in tabla.items():
                    exp = re.sub(rf'\b{v}\b', str(val), exp)
                    
                # REDUCCIÓN DE POTENCIA E IDENTIDADES: Simplifica operaciones inútiles
                exp = re.sub(r'\b(\w+)\s*[\+\-]\s*0\b', r'\1', exp)
                exp = re.sub(r'\b0\s*\+\s*(\w+)\b', r'\1', exp)
                exp = re.sub(r'\b(\w+)\s*[\*/]\s*1\b', r'\1', exp)
                exp = re.sub(r'\b1\s*\*\s*(\w+)\b', r'\1', exp)
                exp = re.sub(r'\b(\w+)\s*\*\s*0\b', '0', exp)
                
                # PLEGAMIENTO DE CONSTANTES (Constant Folding): 
                # Si la expresión es puramente numérica (ej: 5 + 10), la resuelve.
                if re.fullmatch(r'[0-9+\-*/().\s%]+', exp):
                    try:
                        res = eval(exp) # Evaluar la expresión numérica 
                        exp = str(int(res)) if isinstance(res, float) and res.is_integer() else str(res) 
                        print(f"Evaluando expresión constante: {exp}")
                    except: 
                        print(f"Error al evaluar expresión: {exp}")
                        pass

                # ELIMINACIÓN DE TEMPORALES NO USADOS:
                # Si es un temporal (t1) que se usa 1 o 0 veces, lo guardamos en tabla 
                # y no escribimos la línea para limpiar el código final.
                if var.startswith("t") and usos.get(var, 0) <= 1:
                    tabla[var] = exp
                    # Si es constante pura, no escribimos la línea
                    if re.fullmatch(r'[+-]?\d+(\.\d+)?', exp): 
                        print(f"Eliminando asignación a temporal no usado: {var} = {exp}")
                        continue

                # Actualizar la tabla de constantes si el resultado es un número
                if re.fullmatch(r'[+-]?\d+(\.\d+)?', exp):
                    tabla[var] = exp
                else:
                    # Si ya no es constante, se quita de la tabla
                    tabla.pop(var, None)

                codigo.append(f"{var} = {exp}")
                print(f"Optimizando asignación: {var} = {exp}")
                continue

            m_if = Constante.ifNot.match(instr)
            if m_if:
                cond, label = m_if.groups()
    
                # 1. Propagar constantes en la condición
                for v, val in tabla.items():
                    cond = re.sub(rf'\b{v}\b', str(val), cond)
    
                    # 2. Intentar resolver la condición si ya no tiene variables
                    # Reemplazamos operadores de C/Java por Python para poder usar eval()
                    cond_python = cond.replace("&&", " and ").replace("||", " or ").replace("!", " not ")
    
                    # Si la condición ahora solo tiene números y operadores lógicos
                    if re.fullmatch(r'[0-9+\-*/().\s><=!|&]+', cond):
                        try:
            # Evaluamos la condición. 
            # Si 'if NOT (cond)' es verdadero, saltamos siempre.
            # Si 'if NOT (cond)' es falso, nunca saltamos (se elimina la línea).
                            resultado_cond = eval(cond_python)
            
                            if not resultado_cond: # El 'NOT' de tu instrucción
                                print(f"Condición siempre FALSA: if NOT ({cond}) -> GOTO {label} forzado")
                                codigo.append(f"goto {label}")
                            else:
                                print(f"Condición siempre VERDADERA: if NOT ({cond}) -> Se elimina el salto")
                # No agregamos nada al código (cae por su propio peso al bloque siguiente)
                            continue
                        except:
                            pass

                codigo.append(f"if NOT ({cond}) goto {label}")
                print(f"Manteniendo IF optimizado: if NOT ({cond}) goto {label}")
                continue

            # OPTIMIZACIÓN DE RETURN: Propaga constantes en el retorno
            if instr.startswith("return"):
                ret = instr.replace("return", "").strip()
                for v, val in tabla.items():
                    ret = re.sub(rf'\b{v}\b', str(val), ret)
                codigo.append(f"return {ret}")
                print(f"Manteniendo RETURN optimizado: return {ret}")
                continue

            codigo.append(instr)
        print("\n --- Optimización completa ---")
        return codigo

    @staticmethod
    # --- FASE 2: Eliminación de Código Muerto ---
    # Borra instrucciones que calculan valores que NUNCA se utilizan después.
    def eliminar_codigo_muerto(codigo):
        print("\n--- Eliminando código muerto ---\n")
        # Limpiar números de línea
        lineas_limpias = [re.sub(r'^\s*\d+\.\s*', '', l).strip() for l in codigo]
        
        vivas = set() # Variables que sabemos que se usarán más adelante
        resultado_indices = []
        
        # Se recorre de ABAJO hacia ARRIBA
        for i in range(len(lineas_limpias) - 1, -1, -1):
            instr = lineas_limpias[i]
            
            # Al entrar en una función, reiniciamos el análisis de vida
            if instr.startswith("function"):
                vivas.clear()
                resultado_indices.append(i)
                print(f"Manteniendo inicio de función: {instr}")
                continue
            
            # Las etiquetas siempre se mantienen (pueden ser destinos de saltos lejanos)
            if Constante.etiqueta.match(instr):
                resultado_indices.append(i)
                print(f"Manteniendo etiqueta: {instr}")
                continue

            m = Constante.asignacion.match(instr)
            if m:
                var_destino = m.group(1).strip()
                exp_origen = m.group(2).strip()
                
                
                # Si la variable destino está en 'vivas', la instrucción es útil
                if var_destino in vivas:
                    resultado_indices.append(i)
                    vivas.remove(var_destino)
                    print(f"Manteniendo asignación a variable viva en línea {i+1}: {instr}")
                    # Las variables en la parte derecha ahora se consideran "vivas"
                    vivas.update(Constante.usoVariable.findall(exp_origen))
                # Caso especial para variables no temporales al final del código
                elif not var_destino.startswith("t") and i == len(lineas_limpias)-1:
                    print(f"Eliminando asignación a variable no usada en línea {i+1}: {instr}")
                    resultado_indices.append(i)
                else:
                    # Si no es viva ni necesaria, se ignora (se elimina)
                    print(f"Eliminando código muerto en línea {i+1}: {instr}")
                    continue
            else:
                # Instrucciones IF, GOTO y RETURN siempre mantienen vivas a sus variables
                vivas.update(Constante.usoVariable.findall(instr))
                resultado_indices.append(i)

        resultado_indices.reverse()
        print("\n--- Código muerto eliminado ---")
        return [codigo[i] for i in resultado_indices]
   
    @staticmethod
    # --- FASE 3: Optimización de Saltos (Control Flow) ---
    def optimizar_saltos(codigo):
        print("\n--- Optimizando saltos ---")
        # Limpiar números de línea
        lineas = [re.sub(r'^\s*\d+\.\s*', '', l).strip() for l in codigo]
        
        # JUMP THREADING: Mapear saltos que van a etiquetas que solo contienen otro salto
        redireccion = {}
        for i in range(len(lineas) - 1):
            m_etiq = re.match(r'^(\w+):$', lineas[i])
            if m_etiq:
                etiq_actual = m_etiq.group(1)
                # Salto a etiqueta vacía que precede a otra etiqueta (L1: L2: ...)
                m_next_etiq = re.match(r'^(\w+):$', lineas[i+1])
                if m_next_etiq:
                    redireccion[etiq_actual] = m_next_etiq.group(1)
                # Salto a una etiqueta que inmediatamente tiene un GOTO (L1: goto L2)
                m_next_goto = re.match(r'^goto\s+(\w+)$', lineas[i+1])
                if m_next_goto:
                    redireccion[etiq_actual] = m_next_goto.group(1)
        
        print(f"Redirecciones encontradas: {redireccion}")
        
        temp_resultado = []
        for i, instr in enumerate(lineas):
             # Aplicar las redirecciones a todos los 'goto'
            m_any_goto = re.search(r'goto\s+(\w+)', instr)
            if m_any_goto:
                dest = m_any_goto.group(1)
                while dest in redireccion:
                    dest = redireccion[dest]
                    print(f"Redirigiendo salto a {dest}resultado")
                instr = re.sub(r'goto\s+\w+', f'goto {dest}', instr)

            # PEEPHOLE: Si un GOTO salta a la línea inmediatamente siguiente, es basura.          
            m_goto_simple = re.match(r'^goto\s+(\w+)$', instr)
            if m_goto_simple and i + 1 < len(lineas):
                if f"{m_goto_simple.group(1)}:" == lineas[i+1]:
                    print(f"Eliminando salto innecesario en línea {i+1}: {instr}")
                    continue
            
            # Lo mismo para bloques IF que saltan a la siguiente línea
            m_if_simple = re.match(r'^if NOT\s*\(.*\)\s*goto\s+(\w+)$', instr)
            if m_if_simple and i + 1 < len(lineas):
                if f"{m_if_simple.group(1)}:" == lineas[i+1]:
                    print(f"Eliminando IF innecesario en línea {i+1}: {instr}")
                    continue

            temp_resultado.append(instr)

        # Limpieza de etiquetas innecesarias
        usadas = set(re.findall(r'goto\s+(\w+)', "\n".join(temp_resultado)))
        final = []
        for l in temp_resultado:
            m_etiq = re.match(r'^(\w+):$', l)
            if m_etiq and m_etiq.group(1) not in usadas:
                print(f"Eliminando etiqueta innecesaria: {l}")
                continue
            final.append(l)
        print("\n--- Optimización de saltos completada ---\n")
        return final
    
    @classmethod
    def iniciarOptimizacion(cls, archivo_entrada, archivo_salida):
        with open(archivo_entrada, 'r', encoding='utf-8') as f:
            resultado = f.readlines()

        for _ in range(7):
            print(f"\n--- Iteración de optimización {_ + 1} ---\n")
            resultado = cls.optimizar(resultado)
            resultado = cls.optimizar_saltos(resultado)
            resultado = cls.eliminar_codigo_muerto(resultado)


        with open(archivo_salida, 'w', encoding='utf-8') as f:
            for i, linea in enumerate(resultado, 1):
                f.write(f"{i:3d}. {linea}\n")
        print("\n---Optimización finalizada con éxito ---\n")