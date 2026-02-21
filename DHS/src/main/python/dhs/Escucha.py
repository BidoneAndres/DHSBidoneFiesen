from antlr4.tree.Tree import ErrorNode, TerminalNode
from compiladoresListener import compiladoresListener
from compiladoresParser import compiladoresParser
from TablaSimbolos import TablaSimbolos
from Contexto import Contexto
from Id import ID,TipoDato


class Escucha(compiladoresListener) :

    def __init__(self):
        self.hubo_error = False
        self.TablaSimbolos = TablaSimbolos()
        self.vengoDeUnaFucion = False   
        self.parametros_temporales = [] 
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

        print( "*******Identificadores no Usados*******" )
        print (TablaSimbolos.buscarNoUsados(TablaSimbolos))
    # -----------------------------------------------------------

    #Cuando usamos un bloque, estoy probando con while 
    # -----------------------------------------------------------
    def enterBloque(self, ctx: compiladoresParser.BloqueContext):
        # SI venimos de una función, REUSAMOS el contexto que ya creó enterFunc
        if self.vengoDeUnaFucion:
            print("---> BLOQUE de Función: Reusando contexto de parámetros")
            self.vengoDeUnaFucion = False 
        else:
            # SI es un IF o WHILE, sí creamos uno nuevo
            print("---> BLOQUE normal: Creando nuevo contexto")
            contexto_nuevo = Contexto()
            self.TablaSimbolos.addContexto(contexto_nuevo)

    def exitBloque(self, ctx: compiladoresParser.BloqueContext):
        print("Salgo de un bloque")
        # Imprimimos la tabla del contexto actual
        self.TablaSimbolos.contextos[-1].imprimirTabla()
        # Borramos el contexto. Si era de función, se borra acá. Si era de IF, también.
        self.TablaSimbolos.delContexto()
    # -----------------------------------------------------------

    #Ecuchamos si viene un while entonces hacemos...
    # -----------------------------------------------------------       
    def enterIwhile(self, ctx: compiladoresParser.IwhileContext):
        return super().enterIwhile(ctx)
    
    def exitIwhile(self, ctx: compiladoresParser.IwhileContext):
        opal = ctx.opal()
        pa = ctx.PA()
        pc = ctx.PC()
        #Lo que tenemos que hacer aca es comprobar si tenemos ambos parentesis en el while 

        if pa == None :
            print( "ERROR, se espera un '(' " )
            self.hubo_error = True
            return None

        if pc == None :
            print ( "ERROR, se espera un ')'" )
            self.hubo_error = True
            return None
        
        if opal == None : 
            print ( "ERROR, se espera una operacion aritmetica o logica")
            self.hubo_error = True
            return None
        #En el caso de tenerlos tenemos que comprobar si tenemos el opal.

        
        
        return super().exitIwhile(ctx)
    # -----------------------------------------------------------

    # Esto es para el if
    # -----------------------------------------------------------

    def exitIif(self, ctx: compiladoresParser.IifContext):
        
        opal = ctx.opal()
        pa = ctx.PA()
        pc = ctx.PC()
        #Lo que tenemos que hacer aca es comprobar si tenemos ambos parentesis en el while 
        print ("Entra")
        if pa == None :
            print( "ERROR, se espera un '(' " )
            self.hubo_error = True
            return None

        if pc == None :
            print ( "ERROR, se espera un ')'" )
            self.hubo_error = True
            return None
        
        if opal == None : 
            print ( "ERROR, se espera una operacion aritmetica o logica")
            self.hubo_error = True
        return super().exitIif(ctx)
    # -----------------------------------------------------------
    
    #Esto va a ser para el for, enrealidad tengo tener en cuenta mas cosas
    # -----------------------------------------------------------
    def enterIfor(self, ctx: compiladoresParser.IforContext):
        return super().enterIfor(ctx)
    
    def exitIfor(self, ctx: compiladoresParser.IforContext):
        
        opal = ctx.opal()
        pa = ctx.PA()
        pc = ctx.PC()
        asig = ctx.asignacion()

        #Lo que tenemos que hacer aca es comprobar si tenemos ambos parentesis en el while 
        
        if pa == None :
            print( "ERROR, se espera un '(' " )
            self.hubo_error = True
            return None

        if pc == None :
            print ( "ERROR, se espera un ')'" )
            self.hubo_error = True
            return None
        
        if opal == None : 
            print ( "ERROR, se espera una operacion aritmetica o logica")
            self.hubo_error = True
            return None
        
        if asig == None :
            print( "ERROR, se espera una asignacion " )
            self.hubo_error = True
            return None
        
        

        return super().exitIfor(ctx)
    # -----------------------------------------------------------

    #Aca declaramos cuando inicializamos las variables...
    # -----------------------------------------------------------

    def enterInit(self, ctx: compiladoresParser.InitContext):
        print ("---> Inicializamos una variable") 
        return super().enterInit(ctx)
    



    def exitInit(self, ctx: compiladoresParser.InitContext):
        
        tipoDato = ctx.getChild(0).getText()


        i = 1

        while i < ctx.getChildCount() :

            nombre = ctx.getChild(i).getText()

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
                    print(f"ERROR SEMÁNTICO: El identificador '{nombre}' ya está en uso.")
                    self.hubo_error = True
            else :
                print(f"ERROR SEMÁNTICO: El identificador '{nombre}' ya está en uso.")
                self.hubo_error = True

            i = i + 2

        # comprobarGlobal = TablaSimbolos.buscarGlobal(TablaSimbolos, nombre)

        # if comprobarGlobal == 1 :

        #     if TablaSimbolos.buscarLocal( TablaSimbolos, nombre) == 1:
        #         print ("Se agrego correctamente la variable")
        #         print ("--------------------------------------")
        
        #         print("--->Tipo de dato: " + tipoDato)
        #         print("--->Nombre de Variable: " + nombre ) 

        #         print ("--------------------------------------")
        
        #         TablaSimbolos.addIdentificador(TablaSimbolos, nombre, tipoDato)
        #     else: 
        #         print ("---> El id ya esta en uso...")
        # else :
        #     print ("---> El id ya esta en uso...")

        return super().exitInit(ctx)
    # -----------------------------------------------------------
    

    #Esta parte la vamos a usar para las asignaciones.
    # -----------------------------------------------------------
    def enterAsignacion(self, ctx: compiladoresParser.AsignacionContext):
        
        print("---> Se encontro una asignacion...")
        
        return super().enterAsignacion(ctx)
    
    def exitAsignacion(self, ctx: compiladoresParser.AsignacionContext):

        print("---> Se encontro una asignacion...")

        # =========================
        # LADO IZQUIERDO
        # =========================
        nombre = ctx.ID().getText()

        simbolo = self.TablaSimbolos.buscarIdentificador(nombre)
    
        if simbolo is None or simbolo == 1: # Ajusta según lo que devuelva tu método
            print(f"ERROR SEMÁNTICO: Variable '{nombre}' no declarada.")
            self.hubo_error = True
            return

        tipo_lhs = simbolo.tipoDato

        # =========================
        # LADO DERECHO
        # =========================
        tipo_rhs = None

        # CASO 1: opal
        if ctx.opal() is not None:
            if not hasattr(ctx.opal(), "tipoDato"):
                print(f"ERROR, no se pudo determinar el tipo de la expresión asignada a {nombre}")
                ctx.tipoDato = TipoDato.ERROR
                return

            tipo_rhs = ctx.opal().tipoDato

        # CASO 2: char
        elif ctx.char() is not None:
            tipo_rhs = TipoDato.CHAR

        else:
            print(f"ERROR, asignación inválida a {nombre}")
            ctx.tipoDato = TipoDato.ERROR
            return

        # =========================
        # CHEQUEO DE TIPOS
        # =========================
        if tipo_rhs == TipoDato.ERROR:
            ctx.tipoDato = TipoDato.ERROR
            return

        if tipo_lhs != tipo_rhs:
            print(f"ERROR de tipos: no se puede asignar {tipo_rhs} a {tipo_lhs}")
            ctx.tipoDato = TipoDato.ERROR
            self.hubo_error = True
            return

        # =========================
        # ASIGNACIÓN OK
        # =========================
        simbolo.inicializado = 1
        simbolo.usado = 1

        print(f"La variable '{nombre}' se inicializó correctamente")

        ctx.tipoDato = tipo_lhs
        

    # -----------------------------------------------------------
    # Exit a parse tree produced by compiladoresParser#programa.


    def exitPrograma(self, ctx:compiladoresParser.ProgramaContext):
         print("Nombre Variable: "+ ctx.getChild(1).getText())  
         
    def visitTerminal(self, node: TerminalNode):
        #print("----> Token: " + node.getText())
        self.numTokens =+ 1
        
    def visitErrorNode(self, node: ErrorNode):
        print("----> ERROR ")
        
    def enterEveryRule(self, ctx):
        self.numNode += 1

    #Aca se va a declarar las fuciones...
     # -----------------------------------------------------------
    def enterFunc(self, ctx: compiladoresParser.FuncContext):
        print("---> Se ingreso una funcion... ")
        # (Asegurate de tener un método para agregar funciones o usá el de variables)

        nuevo_contexto_local = Contexto()
        self.TablaSimbolos.addContexto(nuevo_contexto_local)
        self.vengoDeUnaFucion = True

    def exitFunc(self, ctx: compiladoresParser.FuncContext):
        # NO TOCAR LA TABLA DE SIMBOLOS ACÁ
        # El contexto se cierra solo en exitBloque
        retorno = ctx.getChild(0).getText()
        nombrefuncion = ctx.getChild(1).getText()
        
        TablaSimbolos.addIdentificador(TablaSimbolos, nombrefuncion, retorno )
        # 2. IMPORTANTE: Las funciones siempre están "inicializadas"
        f = self.TablaSimbolos.buscarIdentificador(nombrefuncion)
        print(f"---> Finalizó el análisis de la función '{nombrefuncion}'")

    def exitParametro(self, ctx: compiladoresParser.ParametroContext):
    # 1. Extraemos los datos directamente de la regla
        tipo_str = ctx.tipo().getText()
        nombre = ctx.ID().getText()
        
        # 2. Registramos en la tabla de símbolos (USANDO self.)
        self.TablaSimbolos.addIdentificador(nombre, self.mapear_tipo(tipo_str))
        
        # 3. Marcamos como inicializado para que 'a = 0' no de error de inicialización
        simbolo = self.TablaSimbolos.buscarIdentificador(nombre)
        if simbolo:
            simbolo.inicializado = 1
            print(f"   >>> Parámetro '{nombre}' ({tipo_str}) registrado y validado.")

    def mapear_tipo(self, t):
        t = t.lower()
        # Asegúrate de que TipoDato.INT etc. coincidan con tu archivo Id.py
        if t == 'int': return TipoDato.INT
        if t == 'double': return TipoDato.DOUBLE
        if t == 'float': return TipoDato.FLOAT
        if t == 'char': return TipoDato.CHAR
        if t == 'bool': return TipoDato.BOOLEAN
        return TipoDato.VOID
        

    #Aca declaramos el prototipo 
    # -----------------------------------------------------------
    def enterProto(self, ctx: compiladoresParser.ProtoContext):
        print ("---> Encontre un prototipo")
        print(">>> ENTRE EN PROTO")
        return super().enterProto(ctx)
    
    def exitProto(self, ctx: compiladoresParser.ProtoContext):
        
        retorno = ctx.getChild(0).getText()
        nombrePrototipo = ctx.getChild(1).getText()
        
        #Lo primero que quiero comprobar es que este cuente con el punto y coma 


        buscarGlobal = TablaSimbolos.buscarGlobal(TablaSimbolos, nombrePrototipo)

        comprobar = False
        listaParametros = []

        if buscarGlobal == 1 :

            parametros = ctx.var_func()
            self.hubo_error = True

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

    #Esta es la parte de las opal
    #------------------------------------------------------------------
    def enterFactor(self, ctx: compiladoresParser.FactorContext):
        
        return super().enterFactor(ctx)

    def exitFactor(self, ctx: compiladoresParser.FactorContext):

        # =========================
        # CASO: IDENTIFICADOR
        # =========================
        if ctx.ID() is not None:
            nombre = ctx.ID().getText()

            busqueda = self.TablaSimbolos.buscarIdentificador(nombre)
        
            if busqueda is None or busqueda == 1:
                print(f"ERROR SEMÁNTICO: Variable '{nombre}' no declarada en este alcance.")
                self.hubo_error = True
                return

            if busqueda.inicializado != 1:
                print("ERROR, la variable no ha sido inicializada:", nombre)
                ctx.tipoDato = TipoDato.ERROR
                self.hubo_error = True
                return

            busqueda.usado = 1
            ctx.tipoDato = busqueda.tipoDato
            return

        # =========================
        # CASO: LITERAL
        # =========================
        texto = ctx.getChild(0).getText()

        # int
        if texto.isdigit():
            ctx.tipoDato = TipoDato.INT
            return

        # float
        if texto.replace('.', '', 1).isdigit():
            ctx.tipoDato = TipoDato.FLOAT
            return

        # char
        if len(texto) == 3 and texto.startswith("'") and texto.endswith("'"):
            ctx.tipoDato = TipoDato.CHAR
            return

        # =========================
        # SI NO ENTRA EN NADA
        # =========================
        print("ERROR, factor no reconocido:", texto)
        ctx.tipoDato = TipoDato.ERROR




    #Aca vamos a definir la llamadas a funciones...
    #------------------------------------------------------------------
    def enterCallFunc(self, ctx: compiladoresParser.CallFuncContext):
        return super().enterCallFunc(ctx)
    

    def exitCallFunc(self, ctx: compiladoresParser.CallFuncContext):
        
        nombre = ctx.getChild(0).getText()

        comprobarGlobal = TablaSimbolos.buscarGlobal(TablaSimbolos, nombre)

        if comprobarGlobal == 1 :

            print("ERROR, la funcion no esta definida")
            self.hubo_error = True
            return None
        
        
        
        return super().exitCallFunc(ctx)
        #La parte de comprobar si las variables estan inicializadas ya esta echa, porque como sabemos podemos tener
        #funciones aritmeticas en las mismas, entonces son comprobadas por factor.
    #------------------------------------------------------------------


    #Parte de incremento y decremento 
    #------------------------------------------------------------------

    def enterIncremento(self, ctx: compiladoresParser.IncrementoContext):
        return super().enterIncremento(ctx)

    def exitIncremento(self, ctx: compiladoresParser.IncrementoContext):


        variable = ctx.getChild(0).getText()

        simbolo = self.TablaSimbolos.buscarIdentificador(variable)

        if simbolo is None or simbolo == 1:
            print(f"ERROR: No se puede incrementar '{variable}', no existe.")
            self.hubo_error = True
            return
        
        if simbolo.inicializado != 1:
            print(f"ERROR: Variable '{variable}' no inicializada.")
            return
        
        simbolo.usado = 1


        return super().exitIncremento(ctx)

    def enterDecremento(self, ctx: compiladoresParser.DecrementoContext):
        return super().enterDecremento(ctx)
    
    def exitDecremento(self, ctx: compiladoresParser.DecrementoContext):

        variable = ctx.getChild(0).getText()

        simbolo = self.TablaSimbolos.buscarIdentificador(variable)

        if simbolo is None or simbolo == 1:
            print(f"ERROR: No se puede incrementar '{variable}', no existe.")
            self.hubo_error = True
            return
        
        if simbolo.inicializado != 1:
            print(f"ERROR: Variable '{variable}' no inicializada.")
            return
        
        simbolo.usado = 1



        return super().exitDecremento(ctx)

    #------------------------------------------------------------------

    
    #Para comprobar si hace falta un punto y coma 
    #------------------------------------------------------------------
    def enterPuntoYComa(self, ctx: compiladoresParser.PuntoYComaContext):
        return super().enterPuntoYComa(ctx)
    
    def exitPuntoYComa(self, ctx: compiladoresParser.PuntoYComaContext):
        #Comprobamos si tenemos el punto y coma en nuestra instruccion
        puntoYComa = ctx.PYC()
        if puntoYComa == None:
            print ( "ERROR, se espera un: ';'" )
            return None;
     
        return super().exitPuntoYComa(ctx)
    #------------------------------------------------------------------
    
    
    def exitTerm(self, ctx: compiladoresParser.TermContext):
        if hasattr(ctx.factor(), "tipoDato"):
            ctx.tipoDato = ctx.factor().tipoDato
        else:
            print("ERROR, no se pudo determinar el tipo en term")
            ctx.tipoDato = TipoDato.ERROR

        
    def exitT(self, ctx: compiladoresParser.TContext):

        # t : (* factor t) | ε
        if ctx.factor() is None:
            ctx.tipoDato = None
            return

        tipo_izq = ctx.factor().tipoDato

        if ctx.t() is None or ctx.t().tipoDato is None:
            ctx.tipoDato = tipo_izq
            return

        tipo_der = ctx.t().tipoDato

        if tipo_izq != tipo_der:
            print("ERROR de tipos en multiplicacion:", tipo_izq, "y", tipo_der)
            ctx.tipoDato = tipo_izq
            self.hubo_error = True
            return

        ctx.tipoDato = tipo_izq



    def exitExp(self, ctx: compiladoresParser.ExpContext):
        if hasattr(ctx.term(), "tipoDato"):
            ctx.tipoDato = ctx.term().tipoDato
        else:
            print("ERROR, no se pudo determinar el tipo en exp")
            ctx.tipoDato = TipoDato.ERROR


    def exitE(self, ctx: compiladoresParser.EContext):

        # e : (+ term e) | ε
        if ctx.term() is None:
            ctx.tipoDato = None
            return

        tipo_izq = ctx.term().tipoDato

        if ctx.e() is None or ctx.e().tipoDato is None:
            ctx.tipoDato = tipo_izq
            return

        tipo_der = ctx.e().tipoDato

        if tipo_izq != tipo_der:
            print("ERROR de tipos en suma/resta:", tipo_izq, "y", tipo_der)
            ctx.tipoDato = tipo_izq
            return

        ctx.tipoDato = tipo_izq

    def exitOpal(self, ctx: compiladoresParser.OpalContext):
        """
        opal : exp | oplo | callFunc ;
        """

        if ctx.exp() is not None:
            if hasattr(ctx.exp(), "tipoDato"):
                ctx.tipoDato = ctx.exp().tipoDato
            else:
                print("ERROR, no se pudo determinar el tipo en opal (exp)")
                ctx.tipoDato = TipoDato.ERROR
            return

        if ctx.oplo() is not None:
            # expresiones lógicas → boolean
            ctx.tipoDato = TipoDato.BOOLEAN
            return

        if ctx.callFunc() is not None:
            if hasattr(ctx.callFunc(), "tipoDato"):
                ctx.tipoDato = ctx.callFunc().tipoDato
            else:
                print("ERROR, no se pudo determinar el tipo en opal (callFunc)")
                ctx.tipoDato = TipoDato.ERROR
            return