import re
from util.Constante import Constante

class Optimizador:

    @staticmethod
    def contarUsos(lineas):
        usos = {}
        for linea in lineas:
            texto = re.sub(r'^\s*\d+\.\s*', '', linea)
            m = Constante.asignacion.match(texto)
            if m: texto = m.group(2)
            for v in Constante.usoVariable.findall(texto):
                usos[v] = usos.get(v, 0) + 1
        return usos

    @classmethod
    def optimizar(cls, lineas_codigo):
        codigo = []
        tabla = {}
        usos = cls.contarUsos(lineas_codigo)
        etiquetas_vistas = set()

        for linea in lineas_codigo:
            instr = re.sub(r'^\s*\d+\.\s*', '', linea).strip()
            if not instr: continue

            if Constante.nombreFuncion.match(instr) or Constante.etiqueta.match(instr):
                tabla.clear()
                etiquetas_vistas.clear()
                codigo.append(instr)
                continue

            if instr.startswith("goto"):
                destino = instr.split()[1]
                if destino in etiquetas_vistas: tabla.clear()
                codigo.append(instr)
                continue

            m = Constante.asignacion.match(instr)
            if m:
                var = m.group(1).strip()
                exp = m.group(2).strip()

                # 1. Propagación de constantes
                for v, val in tabla.items():
                    exp = re.sub(rf'\b{v}\b', str(val), exp)

                # 2. Identidades Algebraicas (Suma, Resta, Mult, Div)
                exp = re.sub(r'\b(\w+)\s*[\+\-]\s*0\b', r'\1', exp)
                exp = re.sub(r'\b0\s*\+\s*(\w+)\b', r'\1', exp)
                exp = re.sub(r'\b(\w+)\s*[\*/]\s*1\b', r'\1', exp)
                exp = re.sub(r'\b1\s*\*\s*(\w+)\b', r'\1', exp)
                exp = re.sub(r'\b(\w+)\s*\*\s*0\b', '0', exp)

                # 3. Constant Folding (Manejo de Floats a Ints)
                # Buscamos patrones de operación numérica
                if re.fullmatch(r'[0-9+\-*/().\s%]+', exp):
                    try:
                        res = eval(exp)
                        # Si es 2.0 -> lo volvemos 2
                        exp = str(int(res)) if isinstance(res, float) and res.is_integer() else str(res)
                    except: pass

                # 4. Inline de Temporales (Evita que queden t2, t7 sueltos)
                if var.startswith("t") and usos.get(var, 0) <= 1:
                    tabla[var] = exp
                    # Si es constante pura, no escribimos la línea
                    if re.fullmatch(r'[+-]?\d+(\.\d+)?', exp): continue

                # Guardar constantes en tabla
                if re.fullmatch(r'[+-]?\d+(\.\d+)?', exp):
                    tabla[var] = exp
                else:
                    tabla.pop(var, None)

                codigo.append(f"{var} = {exp}")
                continue

            # Bloque IF NOT
            m_if = Constante.ifNot.match(instr)
            if m_if:
                cond, label = m_if.groups()
                for v, val in tabla.items():
                    cond = re.sub(rf'\b{v}\b', str(val), cond)
                codigo.append(f"if NOT ({cond}) goto {label}")
                continue

            # Bloque RETURN
            if instr.startswith("return"):
                ret = instr.replace("return", "").strip()
                for v, val in tabla.items():
                    ret = re.sub(rf'\b{v}\b', str(val), ret)
                codigo.append(f"return {ret}")
                continue

            codigo.append(instr)
        return codigo

    @staticmethod
    def eliminar_codigo_muerto_avanzado(codigo):
        # Limpiar números de línea
        lineas_limpias = [re.sub(r'^\s*\d+\.\s*', '', l).strip() for l in codigo]
        
        vivas = set()
        resultado_indices = []
        
        # Analizamos de abajo hacia arriba
        for i in range(len(lineas_limpias) - 1, -1, -1):
            instr = lineas_limpias[i]
            
            # Si es el inicio de una función, reseteamos porque las variables locales mueren aquí
            if instr.startswith("function"):
                vivas.clear()
                resultado_indices.append(i)
                continue

            # Las etiquetas NO deben resetear 'vivas' para poder optimizar entre bloques
            if Constante.etiqueta.match(instr):
                resultado_indices.append(i)
                continue

            m = Constante.asignacion.match(instr)
            if m:
                var_destino = m.group(1).strip()
                exp_origen = m.group(2).strip()
                
                # REGLA DE ORO: Si la variable no está en 'vivas', la definición es inútil
                if var_destino in vivas:
                    resultado_indices.append(i)
                    vivas.remove(var_destino) # Ya no está "viva" hacia atrás porque aquí nace
                    # Pero sus componentes sí están vivos ahora
                    vivas.update(Constante.usoVariable.findall(exp_origen))
                elif not var_destino.startswith("t") and i == len(lineas_limpias)-1:
                    # Mantener solo si es la última asignación de una variable de usuario
                    resultado_indices.append(i)
                else:
                    # ¡BORRADO! (No se agrega a resultado_indices)
                    continue
            else:
                # Ifs, Gotos y Returns mantienen vivas a sus variables
                vivas.update(Constante.usoVariable.findall(instr))
                resultado_indices.append(i)

        resultado_indices.reverse()
        return [codigo[i] for i in resultado_indices]

    @staticmethod
    def eliminar_incrementos_inversos(codigo):
        # Esta versión detecta el patrón TAC: t=a+1, a=t, t2=a-1, a=t2
        lineas = [re.sub(r'^\s*\d+\.\s*', '', l).strip() for l in codigo]
        res = []
        skip = 0
        for i in range(len(lineas)):
            if skip > 0:
                skip -= 1
                continue
            if i < len(lineas) - 3:
                # Patrón complejo de incremento/decremento en TAC
                m1 = re.match(r't\d+\s*=\s*(\w+)\s*\+\s*1', lineas[i])
                m2 = re.match(r'(\w+)\s*=\s*t\d+', lineas[i+1])
                m3 = re.match(r't\d+\s*=\s*(\w+)\s*-\s*1', lineas[i+2])
                m4 = re.match(r'(\w+)\s*=\s*t\d+', lineas[i+3])
                if m1 and m2 and m3 and m4 and m1.group(1) == m2.group(1) == m3.group(1) == m4.group(1):
                    skip = 3
                    continue
            res.append(codigo[i])
        return res

    @staticmethod
    def optimizar_saltos(codigo):
        # Limpiar números de línea
        lineas = [re.sub(r'^\s*\d+\.\s*', '', l).strip() for l in codigo]
        
        # 1. Mapa de Redirección (Jump Threading)
        # Si L5: goto L6, entonces cualquier goto L5 se convierte en goto L6
        # Si L7: L8:, entonces L7 es lo mismo que L8
        redireccion = {}
        for i in range(len(lineas) - 1):
            m_etiq = re.match(r'^(\w+):$', lineas[i])
            if m_etiq:
                etiq_actual = m_etiq.group(1)
                # Caso A: Etiqueta seguida de otra etiqueta
                m_next_etiq = re.match(r'^(\w+):$', lineas[i+1])
                if m_next_etiq:
                    redireccion[etiq_actual] = m_next_etiq.group(1)
                # Caso B: Etiqueta seguida de un goto directo
                m_next_goto = re.match(r'^goto\s+(\w+)$', lineas[i+1])
                if m_next_goto:
                    redireccion[etiq_actual] = m_next_goto.group(1)

        temp_resultado = []
        for i, instr in enumerate(lineas):
            # A. Redirigir todos los GOTOs (incluyendo los de los IF)
            m_any_goto = re.search(r'goto\s+(\w+)', instr)
            if m_any_goto:
                dest = m_any_goto.group(1)
                while dest in redireccion:
                    dest = redireccion[dest]
                instr = re.sub(r'goto\s+\w+', f'goto {dest}', instr)

            # B. Eliminar saltos a la línea siguiente (Peephole)
            # goto L6
            # L6:  <-- El goto es inútil
            m_goto_simple = re.match(r'^goto\s+(\w+)$', instr)
            if m_goto_simple and i + 1 < len(lineas):
                if f"{m_goto_simple.group(1)}:" == lineas[i+1]:
                    continue
            
            # C. Eliminar IFs que saltan a la línea siguiente
            m_if_simple = re.match(r'^if NOT\s*\(.*\)\s*goto\s+(\w+)$', instr)
            if m_if_simple and i + 1 < len(lineas):
                if f"{m_if_simple.group(1)}:" == lineas[i+1]:
                    continue

            temp_resultado.append(instr)

        # 2. Limpieza de etiquetas huérfanas
        usadas = set(re.findall(r'goto\s+(\w+)', "\n".join(temp_resultado)))
        final = []
        for l in temp_resultado:
            m_etiq = re.match(r'^(\w+):$', l)
            if m_etiq and m_etiq.group(1) not in usadas:
                continue
            final.append(l)
        return final
    
    @classmethod
    def iniciarOptimizacion(cls, archivo_entrada, archivo_salida):
        with open(archivo_entrada, 'r', encoding='utf-8') as f:
            resultado = f.readlines()

        for _ in range(10): # Dale 10 pasadas para que quede "flama"
            resultado = cls.optimizar(resultado)
            resultado = cls.optimizar_saltos(resultado) # <--- Aquí dentro
            resultado = cls.eliminar_codigo_muerto_avanzado(resultado)

        with open(archivo_salida, 'w', encoding='utf-8') as f:
            for i, linea in enumerate(resultado, 1):
                f.write(f"{i:3d}. {linea}\n")
        print("✔ Optimización profunda finalizada con éxito.")