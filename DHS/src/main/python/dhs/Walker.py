from compiladoresVisitor import compiladoresVisitor
from compiladoresParser import compiladoresParser

#Esto recorre nodo por nodo basicamente
class Walker (compiladoresVisitor) :

    temporales = 0
    etiquetas = 0




    #Comenzamos recorriendo el programa
    #--------------------------------------------------------------
    def visitPrograma(self, ctx:compiladoresParser.ProgramaContext):
        print("=-"*20)
        print("--Comienza a caminar--")
        self.visitInstrucciones(ctx.getChild(0))
        print("Fin del Recorrido")

    #Comenzamos con las declaraciones
    #------------------------------------------------------------
    def visitInit(self, ctx):
        #Podemos hacer la declaracion de varias variables a la vez, la recorremos
        print("=-"*20)
        print("SE ENCONTRO UNA DECLARACION")
        print("=-"*20)
        for i in range(1, ctx.getChildCount()):
            nombre = ctx.getChild(i)
            if hasattr(nombre, 'symbol') and nombre.symbol.type == compiladoresParser.ID:
                variable = nombre.getText()
                print("Variable: " + variable)
        print("=-"*20)
        #print (ctx.getChild(0).getText()+" - "+ctx.getChild(1))
        #return none
    
    def visitBloque(self, ctx:compiladoresParser.BloqueContext):
        print("Nuevo Programa")
        return super().visitInstrucciones(ctx.getChild(1))

    def visitTerminal(self, node):
        print(" ==> Token "+ node.getText())
        return super().visitTerminal(node)
    
    def visitInstrucciones(self, ctx: compiladoresParser.InstruccionesContext):
        for i in range(ctx.getChildCount()):
            child = ctx.getChild(i)
            
            if hasattr(child, 'getRuleIndex') and not isinstance(child, compiladoresParser.InstruccionesContext):
                self.visit(child)
            elif isinstance(child, compiladoresParser.InstruccionesContext):
                self.visit(child)

    def visitInstruccion(self, ctx:compiladoresParser.InstruccionContext):
    # Despacha a la instrucción específica (declaración, asignación, etc.)
        if ctx.puntoYComa():
            print("si")
            return self.visitPuntoYComa(ctx.puntoYComa())
        elif ctx.iwhile():
            return self.visitIwhile(ctx.iwhile())
        elif ctx.bloque():
            return self.visitBloque(ctx.bloque())
        elif ctx.ifor():
            return self.visitIfor(ctx.ifor())
        elif ctx.func():
            return self.visitFunc(ctx.func())
        elif ctx.IF():  
            return self.visitIf(ctx.if_())