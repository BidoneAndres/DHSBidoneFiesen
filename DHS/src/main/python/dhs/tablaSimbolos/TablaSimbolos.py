from Contexto import Contexto

class tablaSimbolos():
    _instance = None
    _ctx = []
    
    
    # Singleton(se usa para que solo haya una tabla de simbolos)
    def __new__(cls):
        if tablaSimbolos._instance is None:
            tablaSimbolos._instance = object.__new__(cls)
            tablaSimbolos._ctx.append(Contexto())
        return (tablaSimbolos._instance)
    
    def getContextos(self):
        return tablaSimbolos._ctx
    
    def addContexto(self):
        tablaSimbolos._ctx.append(Contexto())
        
    def delContexto(self):
        tablaSimbolos.pop()
        
    def add(self, variable):
        tablaSimbolos._ctx[-1].addSimbolo(variable) #va al primer elemnto
        
    def buscarGlobal(self, name) -> Contexto:
        for Context in tablaSimbolos._ctx[::-1]:
            if name in Context.getSimbolos():
                return Context
        
    def actualizar(self, variable):
        tablaSimbolos.buscarGlobal(tablaSimbolos, variable.name)
        
    def buscarLocal(self, name):
        if name in tablaSimbolos._ctx[-1].getSimbolos():
            return tablaSimbolos._ctx[-1]
        return False
        