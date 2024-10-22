class Contexto():
    def __init__(self):
        self.simbolos = dict()
    
    def addSimbolo(self, variable):
        self.simbolos[variable.name] = variable
        
    def getSimbolos(self) -> dict:
        return self.simbolos
        