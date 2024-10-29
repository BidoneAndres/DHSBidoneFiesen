from antlr4.tree.Tree import ErrorNode, TerminalNode
from compiladoresListener import compiladoresListener
from compiladoresParser import compiladoresParser
from TablaSimbolos import TablaSimbolos
from Contexto import Contexto
from Id import ID


class Escucha(compiladoresListener) :


    TablaSimbolos = TablaSimbolos()    

    
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

    #Cuando usamos un bloque, estoy probando con while 
    # -----------------------------------------------------------
    def enterBloque(self, ctx: compiladoresParser.BloqueContext):
        print("---> Encontre un BLOQUE")
        contexto = Contexto()
        self.tablaDeSimbolos.addContexto(contexto)
        
    def exitBloque(self, ctx: compiladoresParser.BloqueContext):
        
        print ("Salgo de un bloque")
        print ("Cantidad de hijos: " + str(ctx.getChildCount()))
        print("Tokens: " + str(ctx.getText()))

        print("Se encontro:")
        TablaSimbolos.contextos[-1].imprimirTabla()
        TablaSimbolos.delContexto()

        return super().exitBloque(ctx)
    # -----------------------------------------------------------

    #Ecuchamos si viene un while entonces hacemos...
    # -----------------------------------------------------------       
    def enterIWhile(self, ctx:compiladoresParser.IwhileContext):
        print("Encontre WHILE")
        print ("--------------------------------------")
        #print("\tCantidad hijos: "+ctx.getChildCount)
        #print("\tTOQUENS: "+ctx.getText)

    def exitIWhile(self, ctx:compiladoresParser.IwhileContext):
        

        iwhile = ctx.getChild(0).getText()
        condicional = ctx.getChild(2).getText()


        print ("--------------------------------------")
        
        print ( "---> Funcion: " + iwhile )
        print ( "---> Condicional: " + condicional )

        print ("--------------------------------------")
        print("Fin de WHILE")

        
        #print("\tCantidad hijos: "+ctx.getChildCount)
        #print("\tTOQUENS: "+ctx.getText)
    # -----------------------------------------------------------

    


    #Aca declaramos cuando inicializamos las variables...
    # -----------------------------------------------------------

    def enterInit(self, ctx: compiladoresParser.InitContext):
        print ("---> Inicializamos una variable") 
        return super().enterInit(ctx)
    



    def exitInit(self, ctx: compiladoresParser.InitContext):
        
        tipoDato = ctx.getChild(0).getText()
        nombre = ctx.getChild(1).getText()

        comprobarGlobal = TablaSimbolos.buscarGlobal(TablaSimbolos, nombre)

        if comprobarGlobal == 1 :

            if TablaSimbolos.buscarLocal( TablaSimbolos, nombre) == 1:
                print ("Se agrego correctamente la variable")
                print ("--------------------------------------")
        
                print("--->Tipo de dato: " + tipoDato)
                print("--->Nombre de Variable: " + nombre ) 

                print ("--------------------------------------")
        
                TablaSimbolos.addIdentificador(TablaSimbolos, nombre, tipoDato)
            else: 
                print ("---> El id ya esta en uso...")
        else :
            print ("---> El id ya esta en uso...")

        return super().exitInit(ctx)
    # -----------------------------------------------------------
    

    #Esta parte la vamos a usar para las asignaciones.
    # -----------------------------------------------------------
    def enterAsignacion(self, ctx: compiladoresParser.AsignacionContext):
        
        print("---> Se encontro una asignacion...")
        
        return super().enterAsignacion(ctx)
    
    def exitAsignacion(self, ctx: compiladoresParser.AsignacionContext):

        nombre = ctx.getChild(0).getText()
        valor = ctx.getChild(2).getText()
        
        if TablaSimbolos.buscarLocal(TablaSimbolos, nombre) != 1 : 
            print("La variable ' " + nombre + " ' se le asigno el valor ' " + valor + " ' ")

        else:
            print("ERROR, la variable no a sido inicializada...")

        return super().exitAsignacion(ctx)
        

    # -----------------------------------------------------------
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

    #Aca se va a declarar las fuciones...
     # -----------------------------------------------------------
   
    def enterFunc(self, ctx: compiladoresParser.FuncContext):
        print("---> Se ingreso una funcion... ")
        
        return super().enterFunc(ctx)
    
    def exitFunc(self, ctx: compiladoresParser.FuncContext):
        
        tipoFuncion = ctx.proto.getChild(0).getText()
        nombre = ctx.proto.getChild(1).getText()
        #valores = ctx.getChild(2).getText()


        comprobarGlobal = TablaSimbolos.buscarGlobal(TablaSimbolos, nombre)

        if comprobarGlobal == 1 :

            if TablaSimbolos.buscarLocal( TablaSimbolos, nombre) == 1:
                print ("Se agrego correctamente la funcion")
                print ("--------------------------------------")
        
                print("---> Tipo de dato: " + tipoDato)
                print("---> Nombre de la Funcion: " + nombre ) 
               # print( "---> Parametros / Argumentos de la funcion: " + valores )
                print ("--------------------------------------")
        
                TablaSimbolos.addIdentificador(TablaSimbolos, nombre, tipoDato)
            else: 
                print ("---> El id ya esta en uso...")
        else :
            print ("---> El id ya esta en uso...")
           
        return super().exitFunc(ctx)

    #Aca declaramos el prototipo 
    # -----------------------------------------------------------
    def enterProto(self, ctx: compiladoresParser.ProtoContext):
        print ("---> Encontre un prototipo")
        return super().enterProto(ctx)
    
    def exitProto(self, ctx: compiladoresParser.ProtoContext):
        
        retorno = ctx.getChild(0).getText()
        nombrePrototipo = ctx.getChild(1).getText()


        buscarGlobal = TablaSimbolos.buscarGlobal(TablaSimbolos, nombrePrototipo)

        comprobar = False
        listaParametros = []

        if buscarGlobal == 1 :

            parametros = ctx.var_func()

            if parametros and parametros.getChildCount() > 0:
                
                comprobar = True

                i = 0

                while i < parametros.getChildCount() :
            
                    tipo = parametros.getChild(i).getText()
                    nombre = parametros. getChild(i+1).getText()
                    listaParametros.append(f"{tipo} {nombre}")

                    i+=3

            print ("---> La funcion ' " + nombrePrototipo + " ' fue ingresada correctamente")
            print ("--------------------------------------")
            print ("Nombre: " + nombrePrototipo)
            print ("Tipo de Retorno: " + retorno)
            
            if comprobar :
                print("Parametros: ")
                print(listaParametros)
            else :
                print("La funcion no necesita parametros")
            
            print ("--------------------------------------")       
            TablaSimbolos.addIdentificador(TablaSimbolos, nombrePrototipo, retorno )
        else :
            print("ERROR!!! La funcion ' " + nombrePrototipo + " ' ya existe")
            return None
        return super().exitProto(ctx)
    # -----------------------------------------------------------