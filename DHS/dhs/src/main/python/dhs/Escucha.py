from antlr4.tree.Tree import ErrorNode, TerminalNode
from compiladoresListener import compiladoresListener
from compiladoresParser import compiladoresParser

class Escucha(compiladoresListener) :
    
    numTokens = 0
    numNode = 0
    def enterPrograma(self, ctx:compiladoresParser.ProgramaContext):
        print("Comienza la Compilacion")

    # Exit a parse tree produced by compiladoresParser#programa.
    def exitPrograma(self, ctx:compiladoresParser.ProgramaContext):
        print("Fin de la compilacion")
        print("Se encontraron")
        print("\tNodos: "+str(self.numNode))
        print("\tTokens: "+str(self.numTokens))
        
    def enterIWhile(self, ctx:compiladoresParser.ProgramaContext):
        print("Encontre WHILE")
        print("\tCantidad hijos: "+ctx.getChildCount)
        print("\tTOQUENS: "+ctx.getText)

    def exitIWhile(self, ctx:compiladoresParser.ProgramaContext):
        print("Fin de WHILE")
        print("\tCantidad hijos: "+ctx.getChildCount)
        print("\tTOQUENS: "+ctx.getText)
        
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
