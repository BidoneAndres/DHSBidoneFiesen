import re

class Constante:

    # =========================
    # ASIGNACIONES
    # =========================
    # Ej: a = t1 , t2 = 3 + 4
    asignacion = re.compile(
        r'^(?!(?:function|proto|int|pop|call|main|push|return|goto|if)\b)'  # Exclusiones
        r'([a-zA-Z_]\w*)\s*=\s*(.+)$'                                       # Variable = Expresión
    )

    # =========================
    # ETIQUETAS Y FUNCIONES
    # =========================
    etiqueta = re.compile(r'^L\d+:$')
    nombreFuncion = re.compile(r'^(function|call)\s+\w+\(\):$')

    # =========================
    # IF NOT
    # =========================
    ifNot = re.compile(
        r'^if\s+NOT\s*\((.+)\)\s+goto\s+(L\d+)$',
        re.IGNORECASE
    )

    # =========================
    # EXPRESIONES
    # =========================
    esMatematica = re.compile(r'^[0-9+\-*/().\s%]+$')
    esConstante = re.compile(r'^[+-]?\d+(\.\d+)?$')

    # =========================
    # VARIABLES
    # =========================
    #usoVariable = re.compile(r'\b([a-zA-Z_]\w*)\b')
    # Regex con Negative Lookahead
    usoVariable = re.compile(r'\b(?!(?:if|NOT|return|goto|function|proto|push|pop|call|main|int|void|L\d+)\b)([a-zA-Z_]\w*)\b')
