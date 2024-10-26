from antlr4.tree.Tree import ErrorNode, TerminalNode
from compiladoresListener import compiladoresListener
from compiladoresParser import compiladoresParser



class Escucha(compiladoresListener) :
    
    archivo = open('./output/TablaSimbolos.txt', 'w')
    errores = open('./output/Errores&Warnings.txt', 'w')
    
    numTokens = 0
    numNode = 0

    # Vemos el comienzo del programa
    # -----------------------------------------------------------
    def enterPrograma(self, ctx:compiladoresParser.ProgramaContext):
        print("Comienza la Compilacion")

    # Exit a parse tree produced by compiladoresParser#programa.
    def exitPrograma(self, ctx:compiladoresParser.ProgramaContext):
        print("Fin de la compilacion")
        print("Se encontraron")
        print("\tNodos: "+str(self.numNode))
        print("\tTokens: "+str(self.numTokens))
    # -----------------------------------------------------------



    #Ecuchamos si viene un while entonces hacemos...
    # -----------------------------------------------------------       
    def enterIWhile(self, ctx:compiladoresParser.IwhileContext):
        print("Encontre WHILE")
        print("\tCantidad hijos: "+ctx.getChildCount)
        print("\tTOQUENS: "+ctx.getText)

    def exitIWhile(self, ctx:compiladoresParser.IwhileContext):
        print("Fin de WHILE")
        print("\tCantidad hijos: "+ctx.getChildCount)
        print("\tTOQUENS: "+ctx.getText)
    # -----------------------------------------------------------

    #Para el caso de las operaciones aritmeticas o logicas tenemos...
    # -----------------------------------------------------------
    def enterOpal ( self, ctx:compiladoresParser.OpalContext):
        print("Encontrer una operacion aritmetica o logica")
        print("\tCantidad de hijos: "+ctx.getChildCount)
        print("\tTOQUENS: "+ctx.getText)        

    
    def exitOpal(self, ctx:compiladoresParser.OpalContext):
        print("Fin de la funcion aritmetica o logica")
        print("\tCantidad hijos: "+ctx.getChildCount)
        print("\tTOQUENS: "+ctx.getText)
    # -----------------------------------------------------------


    def enterDeclaracion(self, ctx:compiladoresParser.ProgramaContext):
        print("### Declaracion")

    # Exit a parse tree produced by compiladoresParser#programa.
    def exitPrograma(self, ctx:compiladoresParser.ProgramaContext):
         print("Nombre Variable: "+ ctx.getChild(1).getText())  
         
    def visitTerminal(self, node: TerminalNode):
        print("----> Token: " + node.getText())
        self.numTokens =+ 1
        
    def visitErrorNode(self, node: ErrorNode):
        print("----> ERROR ")
        
    def enterEveryRule(self, ctx):
        self.numNode += 1

    def enterFucion(self, ctx: compiladoresParser.FuncionContext):
        print("Se ingreso a una funcion...")
        