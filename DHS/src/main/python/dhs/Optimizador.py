import re
from util.Constante import Constante

class Optimizador:

    @staticmethod
    def contarUsos(lineas):
        usos = {}
        print("\n--- Contando usos de variables ---\n")
        for linea in lineas:
            texto = re.sub(r'^\s*\d+\.\s*', '', linea)
            m = Constante.asignacion.match(texto)
            if m: texto = m.group(2)
            for v in Constante.usoVariable.findall(texto):
                usos[v] = usos.get(v, 0) + 1
                print(f"  Variable '{v}' usada {usos[v]} veces.")
        print("\n--- Conteo de usos completado ---\n")
        return usos

    @classmethod
    def optimizar(cls, lineas_codigo):
        print("\n--- Iniciando optimización ---\n")
        codigo = []
        tabla = {}
        usos = cls.contarUsos(lineas_codigo)
        etiquetas_vistas = set()

        for linea in lineas_codigo:
            
            # Limpiar número de línea
            instr = re.sub(r'^\s*\d+\.\s*', '', linea).strip()
            print(f"Procesando instrucción: {instr}")
            if not instr: 
                print("Línea vacía, saltando...")
                continue
            
            # Reiniciar tabla en funciones y etiquetas
            if Constante.nombreFuncion.match(instr) or Constante.etiqueta.match(instr):
                tabla.clear()
                etiquetas_vistas.clear()
                codigo.append(instr)
                print(f"Manteniendo función/etiqueta: {instr}")
                continue
            
            # Mantener registro de etiquetas vistas
            if instr.startswith("goto"):
                destino = instr.split()[1]
                if destino in etiquetas_vistas: tabla.clear()
                codigo.append(instr)
                print(f"Manteniendo GOTO: {instr}")
                continue
            
            # Registro de etiquetas vistas
            m = Constante.asignacion.match(instr)
            if m:
                var = m.group(1).strip()
                exp = m.group(2).strip()

                for v, val in tabla.items():
                    exp = re.sub(rf'\b{v}\b', str(val), exp)

                # Algebraicas (Suma, Resta, Mult, Div)
                exp = re.sub(r'\b(\w+)\s*[\+\-]\s*0\b', r'\1', exp)
                exp = re.sub(r'\b0\s*\+\s*(\w+)\b', r'\1', exp)
                exp = re.sub(r'\b(\w+)\s*[\*/]\s*1\b', r'\1', exp)
                exp = re.sub(r'\b1\s*\*\s*(\w+)\b', r'\1', exp)
                exp = re.sub(r'\b(\w+)\s*\*\s*0\b', '0', exp)
                
                # Evaluación de Constantes
                # Buscamos patrones de operación numérica
                if re.fullmatch(r'[0-9+\-*/().\s%]+', exp):
                    try:
                        res = eval(exp)
                        exp = str(int(res)) if isinstance(res, float) and res.is_integer() else str(res)
                        print(f"Evaluando expresión constante: {exp}")
                    except: 
                        print(f"Error al evaluar expresión: {exp}")
                        pass

                # Eliminación de asignaciones a temporales no usados
                if var.startswith("t") and usos.get(var, 0) <= 1:
                    tabla[var] = exp
                    # Si es constante pura, no escribimos la línea
                    if re.fullmatch(r'[+-]?\d+(\.\d+)?', exp): 
                        print(f"Eliminando asignación a temporal no usado: {var} = {exp}")
                        continue

                # Guardar constantes en tabla
                if re.fullmatch(r'[+-]?\d+(\.\d+)?', exp):
                    tabla[var] = exp
                else:
                    tabla.pop(var, None)

                codigo.append(f"{var} = {exp}")
                print(f"Optimizando asignación: {var} = {exp}")
                continue

            # Bloque IF 
            m_if = Constante.ifNot.match(instr)
            if m_if:
                cond, label = m_if.groups()
                for v, val in tabla.items():
                    cond = re.sub(rf'\b{v}\b', str(val), cond)
                codigo.append(f"if NOT ({cond}) goto {label}")
                print(f"Manteniendo IF optimizado: if NOT ({cond}) goto {label}")
                continue

            # Bloque RETURN
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
    def eliminar_codigo_muerto(codigo):
        print("\n--- Eliminando código muerto ---\n")
        # Limpiar números de línea
        lineas_limpias = [re.sub(r'^\s*\d+\.\s*', '', l).strip() for l in codigo]
        
        vivas = set()
        resultado_indices = []
        
        for i in range(len(lineas_limpias) - 1, -1, -1):
            instr = lineas_limpias[i]
            
            if instr.startswith("function"):
                vivas.clear()
                resultado_indices.append(i)
                print(f"Manteniendo inicio de función: {instr}")
                continue

            if Constante.etiqueta.match(instr):
                resultado_indices.append(i)
                print(f"Manteniendo etiqueta: {instr}")
                continue

            m = Constante.asignacion.match(instr)
            if m:
                var_destino = m.group(1).strip()
                exp_origen = m.group(2).strip()
                
                if var_destino in vivas:
                    resultado_indices.append(i)
                    vivas.remove(var_destino)
                    print(f"Manteniendo asignación a variable viva en línea {i+1}: {instr}")
                    vivas.update(Constante.usoVariable.findall(exp_origen))
                elif not var_destino.startswith("t") and i == len(lineas_limpias)-1:
                    print(f"Eliminando asignación a variable no usada en línea {i+1}: {instr}")
                    resultado_indices.append(i)
                else:
                    print(f"Eliminando código muerto en línea {i+1}: {instr}")
                    continue
            else:
                # Ifs, Gotos y Returns mantienen vivas a sus variables
                vivas.update(Constante.usoVariable.findall(instr))
                resultado_indices.append(i)

        resultado_indices.reverse()
        print("\n--- Código muerto eliminado ---")
        return [codigo[i] for i in resultado_indices]
   
    @staticmethod
    def optimizar_saltos(codigo):
        print("\n--- Optimizando saltos ---")
        # Limpiar números de línea
        lineas = [re.sub(r'^\s*\d+\.\s*', '', l).strip() for l in codigo]
        
        # Mapa de Redirección (Jump Threading)
        redireccion = {}
        for i in range(len(lineas) - 1):
            m_etiq = re.match(r'^(\w+):$', lineas[i])
            if m_etiq:
                etiq_actual = m_etiq.group(1)
                # Eliminación de etiquetas en Cadena
                m_next_etiq = re.match(r'^(\w+):$', lineas[i+1])
                if m_next_etiq:
                    redireccion[etiq_actual] = m_next_etiq.group(1)
                # Eliminación de Saltos en Cadena
                m_next_goto = re.match(r'^goto\s+(\w+)$', lineas[i+1])
                if m_next_goto:
                    redireccion[etiq_actual] = m_next_goto.group(1)
        
        print(f"Redirecciones encontradas: {redireccion}")
        # Aplicar redirecciones y eliminar saltos innecesarios
        temp_resultado = []
        for i, instr in enumerate(lineas):
            # Redirigir todos los GOTOs (incluyendo los de los IF)
            m_any_goto = re.search(r'goto\s+(\w+)', instr)
            if m_any_goto:
                dest = m_any_goto.group(1)
                while dest in redireccion:
                    dest = redireccion[dest]
                    print(f"Redirigiendo salto a {dest}")
                instr = re.sub(r'goto\s+\w+', f'goto {dest}', instr)

            # Eliminar saltos a la línea siguiente (Peephole)
            m_goto_simple = re.match(r'^goto\s+(\w+)$', instr)
            if m_goto_simple and i + 1 < len(lineas):
                if f"{m_goto_simple.group(1)}:" == lineas[i+1]:
                    print(f"Eliminando salto innecesario en línea {i+1}: {instr}")
                    continue
            
            # Eliminar los IF que saltan a la línea siguiente
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