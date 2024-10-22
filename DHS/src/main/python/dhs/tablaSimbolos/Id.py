from abc import ABC

class Id(ABC):
    def __init__(self, name, dato, inicializado = False, accedido = False):
        self.name = name
        self.dato = dato
        self.inicializado = inicializado
        self.accedido = accedido
        
    def setInicializado(self):
        self.inicializado = True
        
    def setAccedido(self):
        self.accedido = True
        