import sys
from antlr4 import *
from compiladoresLexer import compiladoresLexer
from compiladoresParser import compiladoresParser
from Escucha import Escucha
from Walker import Walker


def main(argv):
    archivo = "/home/andres/Documents/DHS/DHSBidoneFiesen/DHS/input/opal.txt"
    if len(argv) > 1 :
        archivo = argv[1]
    input = FileStream(archivo)
    lexer = compiladoresLexer(input)
    stream = CommonTokenStream(lexer)
    parser = compiladoresParser(stream)
    escucha = Escucha()
    parser.addParseListener(escucha)
    tree = parser.programa()
    #print(tree.toStringTree(recog=parser))
    #caminante = Walker()
    #caminante.visitPrograma(tree)
    #Agregar una lista de declaracion
    


if __name__ == '__main__':
    main(sys.argv)