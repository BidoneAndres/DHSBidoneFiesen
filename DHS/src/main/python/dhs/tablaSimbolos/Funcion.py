from Id import Id

class Funcion(Id):
    def __init__(self, nombre, dato, inicializado=False, accedido=False):
        super().__init__(nombre, dato, inicializado, accedido)
        self.args = args