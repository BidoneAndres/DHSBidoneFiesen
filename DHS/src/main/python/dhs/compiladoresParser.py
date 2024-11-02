# Generated from /home/andres/Documents/DHS/DHSBidoneFiesen/DHS/src/main/python/dhs/compiladores.g4 by ANTLR 4.13.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,37,300,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,20,
        7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,2,26,7,26,
        2,27,7,27,2,28,7,28,2,29,7,29,2,30,7,30,2,31,7,31,2,32,7,32,1,0,
        1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,3,0,77,8,0,1,1,1,1,1,1,1,2,1,
        2,1,2,1,2,3,2,86,8,2,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,
        1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,3,3,111,8,3,1,4,
        1,4,1,5,1,5,1,5,1,5,1,5,1,5,1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,7,1,7,
        1,7,1,7,1,7,3,7,133,8,7,1,8,1,8,1,8,1,8,1,9,1,9,1,10,1,10,1,10,1,
        11,1,11,1,11,1,11,1,11,1,11,1,11,1,11,1,11,3,11,153,8,11,1,12,1,
        12,1,12,1,13,1,13,1,13,1,13,1,13,1,13,1,13,1,13,1,13,1,13,1,13,1,
        13,1,13,3,13,171,8,13,1,14,1,14,1,14,1,14,1,14,1,14,3,14,179,8,14,
        1,15,1,15,1,15,1,15,1,15,1,15,1,15,1,15,1,15,1,15,1,16,1,16,1,17,
        1,17,1,17,1,17,1,17,3,17,198,8,17,1,18,1,18,1,18,1,19,1,19,1,19,
        1,19,1,19,3,19,208,8,19,1,20,1,20,1,20,1,20,1,20,1,20,3,20,216,8,
        20,1,21,1,21,1,21,1,21,1,21,1,21,1,21,1,21,1,21,5,21,227,8,21,10,
        21,12,21,230,9,21,1,22,1,22,1,22,1,23,1,23,1,23,5,23,238,8,23,10,
        23,12,23,241,9,23,3,23,243,8,23,1,24,1,24,1,24,1,24,1,25,1,25,1,
        25,1,25,3,25,253,8,25,1,26,1,26,1,27,1,27,1,27,1,28,1,28,1,28,1,
        28,1,28,3,28,265,8,28,1,28,1,28,1,29,1,29,1,29,1,29,1,29,3,29,274,
        8,29,1,29,1,29,1,29,1,30,1,30,1,30,1,30,1,30,5,30,284,8,30,10,30,
        12,30,287,9,30,1,31,1,31,1,31,1,31,3,31,293,8,31,1,31,1,31,1,32,
        1,32,1,32,1,32,0,1,42,33,0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,
        30,32,34,36,38,40,42,44,46,48,50,52,54,56,58,60,62,64,0,4,1,0,26,
        31,2,0,13,16,18,18,2,0,26,26,28,31,2,0,13,16,18,19,301,0,76,1,0,
        0,0,2,78,1,0,0,0,4,85,1,0,0,0,6,110,1,0,0,0,8,112,1,0,0,0,10,114,
        1,0,0,0,12,120,1,0,0,0,14,132,1,0,0,0,16,134,1,0,0,0,18,138,1,0,
        0,0,20,140,1,0,0,0,22,152,1,0,0,0,24,154,1,0,0,0,26,170,1,0,0,0,
        28,178,1,0,0,0,30,180,1,0,0,0,32,190,1,0,0,0,34,197,1,0,0,0,36,199,
        1,0,0,0,38,207,1,0,0,0,40,215,1,0,0,0,42,217,1,0,0,0,44,231,1,0,
        0,0,46,242,1,0,0,0,48,244,1,0,0,0,50,248,1,0,0,0,52,254,1,0,0,0,
        54,256,1,0,0,0,56,259,1,0,0,0,58,268,1,0,0,0,60,278,1,0,0,0,62,288,
        1,0,0,0,64,296,1,0,0,0,66,67,5,33,0,0,67,68,6,0,-1,0,68,77,3,0,0,
        0,69,70,5,8,0,0,70,71,6,0,-1,0,71,77,3,0,0,0,72,73,5,37,0,0,73,74,
        6,0,-1,0,74,77,3,0,0,0,75,77,5,0,0,1,76,66,1,0,0,0,76,69,1,0,0,0,
        76,72,1,0,0,0,76,75,1,0,0,0,77,1,1,0,0,0,78,79,3,4,2,0,79,80,5,0,
        0,1,80,3,1,0,0,0,81,82,3,6,3,0,82,83,3,4,2,0,83,86,1,0,0,0,84,86,
        1,0,0,0,85,81,1,0,0,0,85,84,1,0,0,0,86,5,1,0,0,0,87,88,3,44,22,0,
        88,89,5,5,0,0,89,111,1,0,0,0,90,111,3,10,5,0,91,111,3,16,8,0,92,
        111,3,30,15,0,93,94,3,48,24,0,94,95,5,5,0,0,95,111,1,0,0,0,96,97,
        3,56,28,0,97,98,5,5,0,0,98,111,1,0,0,0,99,111,3,58,29,0,100,111,
        3,12,6,0,101,102,3,18,9,0,102,103,5,5,0,0,103,111,1,0,0,0,104,105,
        3,64,32,0,105,106,5,5,0,0,106,111,1,0,0,0,107,108,3,62,31,0,108,
        109,5,5,0,0,109,111,1,0,0,0,110,87,1,0,0,0,110,90,1,0,0,0,110,91,
        1,0,0,0,110,92,1,0,0,0,110,93,1,0,0,0,110,96,1,0,0,0,110,99,1,0,
        0,0,110,100,1,0,0,0,110,101,1,0,0,0,110,104,1,0,0,0,110,107,1,0,
        0,0,111,7,1,0,0,0,112,113,7,0,0,0,113,9,1,0,0,0,114,115,5,7,0,0,
        115,116,5,1,0,0,116,117,5,33,0,0,117,118,5,2,0,0,118,119,3,16,8,
        0,119,11,1,0,0,0,120,121,5,10,0,0,121,122,5,1,0,0,122,123,3,18,9,
        0,123,124,5,2,0,0,124,125,3,16,8,0,125,126,3,14,7,0,126,13,1,0,0,
        0,127,128,5,11,0,0,128,133,3,16,8,0,129,130,5,11,0,0,130,133,3,12,
        6,0,131,133,1,0,0,0,132,127,1,0,0,0,132,129,1,0,0,0,132,131,1,0,
        0,0,133,15,1,0,0,0,134,135,5,3,0,0,135,136,3,4,2,0,136,137,5,4,0,
        0,137,17,1,0,0,0,138,139,3,20,10,0,139,19,1,0,0,0,140,141,3,24,12,
        0,141,142,3,22,11,0,142,21,1,0,0,0,143,144,5,20,0,0,144,145,3,24,
        12,0,145,146,3,22,11,0,146,153,1,0,0,0,147,148,5,21,0,0,148,149,
        3,24,12,0,149,150,3,22,11,0,150,153,1,0,0,0,151,153,1,0,0,0,152,
        143,1,0,0,0,152,147,1,0,0,0,152,151,1,0,0,0,153,23,1,0,0,0,154,155,
        3,28,14,0,155,156,3,26,13,0,156,25,1,0,0,0,157,158,5,22,0,0,158,
        159,3,28,14,0,159,160,3,26,13,0,160,171,1,0,0,0,161,162,5,23,0,0,
        162,163,3,28,14,0,163,164,3,26,13,0,164,171,1,0,0,0,165,166,5,24,
        0,0,166,167,3,28,14,0,167,168,3,26,13,0,168,171,1,0,0,0,169,171,
        1,0,0,0,170,157,1,0,0,0,170,161,1,0,0,0,170,165,1,0,0,0,170,169,
        1,0,0,0,171,27,1,0,0,0,172,179,5,8,0,0,173,179,5,33,0,0,174,175,
        5,1,0,0,175,176,3,20,10,0,176,177,5,2,0,0,177,179,1,0,0,0,178,172,
        1,0,0,0,178,173,1,0,0,0,178,174,1,0,0,0,179,29,1,0,0,0,180,181,5,
        9,0,0,181,182,5,1,0,0,182,183,3,48,24,0,183,184,5,5,0,0,184,185,
        3,18,9,0,185,186,5,5,0,0,186,187,3,48,24,0,187,188,5,2,0,0,188,189,
        3,16,8,0,189,31,1,0,0,0,190,191,3,34,17,0,191,33,1,0,0,0,192,193,
        5,34,0,0,193,194,3,36,18,0,194,195,3,34,17,0,195,198,1,0,0,0,196,
        198,1,0,0,0,197,192,1,0,0,0,197,196,1,0,0,0,198,35,1,0,0,0,199,200,
        3,40,20,0,200,201,3,38,19,0,201,37,1,0,0,0,202,203,5,35,0,0,203,
        204,3,40,20,0,204,205,3,38,19,0,205,208,1,0,0,0,206,208,1,0,0,0,
        207,202,1,0,0,0,207,206,1,0,0,0,208,39,1,0,0,0,209,216,3,32,16,0,
        210,216,3,42,21,0,211,212,5,1,0,0,212,213,3,34,17,0,213,214,5,2,
        0,0,214,216,1,0,0,0,215,209,1,0,0,0,215,210,1,0,0,0,215,211,1,0,
        0,0,216,41,1,0,0,0,217,218,6,21,-1,0,218,219,3,32,16,0,219,220,3,
        8,4,0,220,221,3,32,16,0,221,228,1,0,0,0,222,223,10,1,0,0,223,224,
        3,8,4,0,224,225,3,42,21,2,225,227,1,0,0,0,226,222,1,0,0,0,227,230,
        1,0,0,0,228,226,1,0,0,0,228,229,1,0,0,0,229,43,1,0,0,0,230,228,1,
        0,0,0,231,232,7,1,0,0,232,233,5,33,0,0,233,45,1,0,0,0,234,243,5,
        33,0,0,235,236,5,6,0,0,236,238,5,33,0,0,237,235,1,0,0,0,238,241,
        1,0,0,0,239,237,1,0,0,0,239,240,1,0,0,0,240,243,1,0,0,0,241,239,
        1,0,0,0,242,234,1,0,0,0,242,239,1,0,0,0,243,47,1,0,0,0,244,245,5,
        33,0,0,245,246,5,25,0,0,246,247,3,18,9,0,247,49,1,0,0,0,248,249,
        3,24,12,0,249,252,3,52,26,0,250,253,3,24,12,0,251,253,1,0,0,0,252,
        250,1,0,0,0,252,251,1,0,0,0,253,51,1,0,0,0,254,255,7,2,0,0,255,53,
        1,0,0,0,256,257,5,33,0,0,257,258,3,20,10,0,258,55,1,0,0,0,259,260,
        7,3,0,0,260,261,5,33,0,0,261,264,5,1,0,0,262,265,3,60,30,0,263,265,
        1,0,0,0,264,262,1,0,0,0,264,263,1,0,0,0,265,266,1,0,0,0,266,267,
        5,2,0,0,267,57,1,0,0,0,268,269,7,3,0,0,269,270,5,33,0,0,270,273,
        5,1,0,0,271,274,3,60,30,0,272,274,1,0,0,0,273,271,1,0,0,0,273,272,
        1,0,0,0,274,275,1,0,0,0,275,276,5,2,0,0,276,277,3,16,8,0,277,59,
        1,0,0,0,278,279,7,1,0,0,279,285,5,33,0,0,280,281,5,6,0,0,281,282,
        7,1,0,0,282,284,5,33,0,0,283,280,1,0,0,0,284,287,1,0,0,0,285,283,
        1,0,0,0,285,286,1,0,0,0,286,61,1,0,0,0,287,285,1,0,0,0,288,289,5,
        33,0,0,289,292,5,1,0,0,290,293,3,46,23,0,291,293,1,0,0,0,292,290,
        1,0,0,0,292,291,1,0,0,0,293,294,1,0,0,0,294,295,5,2,0,0,295,63,1,
        0,0,0,296,297,5,12,0,0,297,298,3,18,9,0,298,65,1,0,0,0,18,76,85,
        110,132,152,170,178,197,207,215,228,239,242,252,264,273,285,292
    ]

class compiladoresParser ( Parser ):

    grammarFileName = "compiladores.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'('", "')'", "'{'", "'}'", "';'", "','", 
                     "'while'", "<INVALID>", "'for'", "'if'", "'else'", 
                     "'return'", "'int'", "'double'", "'char'", "'float'", 
                     "'String'", "'boolean'", "'void'", "'+'", "'-'", "'*'", 
                     "'/'", "'%'", "'='", "'=='", "'!='", "'<'", "'>'", 
                     "'<='", "'>='", "<INVALID>", "<INVALID>", "'||'", "'&&'", 
                     "'!'" ]

    symbolicNames = [ "<INVALID>", "PA", "PC", "LLA", "LLC", "PYC", "COM", 
                      "WHILE", "NUMERO", "FOR", "IF", "ELSE", "RETURN", 
                      "INT", "DOUBLE", "CHAR", "FLOAT", "STRING", "BOOLEAN", 
                      "VOID", "SUMA", "RESTA", "MULT", "DIV", "MOD", "ASIG", 
                      "EQQ", "NE", "LT", "GT", "LE", "GE", "WS", "ID", "ORR", 
                      "AND", "NOT", "OTRO" ]

    RULE_s = 0
    RULE_programa = 1
    RULE_instrucciones = 2
    RULE_instruccion = 3
    RULE_operador = 4
    RULE_iwhile = 5
    RULE_if = 6
    RULE_else = 7
    RULE_bloque = 8
    RULE_opal = 9
    RULE_exp = 10
    RULE_e = 11
    RULE_term = 12
    RULE_t = 13
    RULE_factor = 14
    RULE_ifor = 15
    RULE_oplo = 16
    RULE_expresion_logica = 17
    RULE_termino_logico = 18
    RULE_term_logico = 19
    RULE_factor_logico = 20
    RULE_comp = 21
    RULE_init = 22
    RULE_var = 23
    RULE_asignacion = 24
    RULE_cond = 25
    RULE_condicionales = 26
    RULE_iter = 27
    RULE_proto = 28
    RULE_func = 29
    RULE_var_func = 30
    RULE_callFunc = 31
    RULE_return = 32

    ruleNames =  [ "s", "programa", "instrucciones", "instruccion", "operador", 
                   "iwhile", "if", "else", "bloque", "opal", "exp", "e", 
                   "term", "t", "factor", "ifor", "oplo", "expresion_logica", 
                   "termino_logico", "term_logico", "factor_logico", "comp", 
                   "init", "var", "asignacion", "cond", "condicionales", 
                   "iter", "proto", "func", "var_func", "callFunc", "return" ]

    EOF = Token.EOF
    PA=1
    PC=2
    LLA=3
    LLC=4
    PYC=5
    COM=6
    WHILE=7
    NUMERO=8
    FOR=9
    IF=10
    ELSE=11
    RETURN=12
    INT=13
    DOUBLE=14
    CHAR=15
    FLOAT=16
    STRING=17
    BOOLEAN=18
    VOID=19
    SUMA=20
    RESTA=21
    MULT=22
    DIV=23
    MOD=24
    ASIG=25
    EQQ=26
    NE=27
    LT=28
    GT=29
    LE=30
    GE=31
    WS=32
    ID=33
    ORR=34
    AND=35
    NOT=36
    OTRO=37

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class SContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._ID = None # Token
            self._NUMERO = None # Token
            self._OTRO = None # Token

        def ID(self):
            return self.getToken(compiladoresParser.ID, 0)

        def s(self):
            return self.getTypedRuleContext(compiladoresParser.SContext,0)


        def NUMERO(self):
            return self.getToken(compiladoresParser.NUMERO, 0)

        def OTRO(self):
            return self.getToken(compiladoresParser.OTRO, 0)

        def EOF(self):
            return self.getToken(compiladoresParser.EOF, 0)

        def getRuleIndex(self):
            return compiladoresParser.RULE_s

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterS" ):
                listener.enterS(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitS" ):
                listener.exitS(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitS" ):
                return visitor.visitS(self)
            else:
                return visitor.visitChildren(self)




    def s(self):

        localctx = compiladoresParser.SContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_s)
        try:
            self.state = 76
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [33]:
                self.enterOuterAlt(localctx, 1)
                self.state = 66
                localctx._ID = self.match(compiladoresParser.ID)
                print("ID ->" + (None if localctx._ID is None else localctx._ID.text) + "<--") 
                self.state = 68
                self.s()
                pass
            elif token in [8]:
                self.enterOuterAlt(localctx, 2)
                self.state = 69
                localctx._NUMERO = self.match(compiladoresParser.NUMERO)
                print("NUMERO ->" + (None if localctx._NUMERO is None else localctx._NUMERO.text) + "<--") 
                self.state = 71
                self.s()
                pass
            elif token in [37]:
                self.enterOuterAlt(localctx, 3)
                self.state = 72
                localctx._OTRO = self.match(compiladoresParser.OTRO)
                print("Otro ->" + (None if localctx._OTRO is None else localctx._OTRO.text) + "<--") 
                self.state = 74
                self.s()
                pass
            elif token in [-1]:
                self.enterOuterAlt(localctx, 4)
                self.state = 75
                self.match(compiladoresParser.EOF)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ProgramaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def instrucciones(self):
            return self.getTypedRuleContext(compiladoresParser.InstruccionesContext,0)


        def EOF(self):
            return self.getToken(compiladoresParser.EOF, 0)

        def getRuleIndex(self):
            return compiladoresParser.RULE_programa

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPrograma" ):
                listener.enterPrograma(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPrograma" ):
                listener.exitPrograma(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPrograma" ):
                return visitor.visitPrograma(self)
            else:
                return visitor.visitChildren(self)




    def programa(self):

        localctx = compiladoresParser.ProgramaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_programa)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 78
            self.instrucciones()
            self.state = 79
            self.match(compiladoresParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class InstruccionesContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def instruccion(self):
            return self.getTypedRuleContext(compiladoresParser.InstruccionContext,0)


        def instrucciones(self):
            return self.getTypedRuleContext(compiladoresParser.InstruccionesContext,0)


        def getRuleIndex(self):
            return compiladoresParser.RULE_instrucciones

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInstrucciones" ):
                listener.enterInstrucciones(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInstrucciones" ):
                listener.exitInstrucciones(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitInstrucciones" ):
                return visitor.visitInstrucciones(self)
            else:
                return visitor.visitChildren(self)




    def instrucciones(self):

        localctx = compiladoresParser.InstruccionesContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_instrucciones)
        try:
            self.state = 85
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [1, 3, 7, 8, 9, 10, 12, 13, 14, 15, 16, 18, 19, 33]:
                self.enterOuterAlt(localctx, 1)
                self.state = 81
                self.instruccion()
                self.state = 82
                self.instrucciones()
                pass
            elif token in [-1, 4]:
                self.enterOuterAlt(localctx, 2)

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class InstruccionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def init(self):
            return self.getTypedRuleContext(compiladoresParser.InitContext,0)


        def PYC(self):
            return self.getToken(compiladoresParser.PYC, 0)

        def iwhile(self):
            return self.getTypedRuleContext(compiladoresParser.IwhileContext,0)


        def bloque(self):
            return self.getTypedRuleContext(compiladoresParser.BloqueContext,0)


        def ifor(self):
            return self.getTypedRuleContext(compiladoresParser.IforContext,0)


        def asignacion(self):
            return self.getTypedRuleContext(compiladoresParser.AsignacionContext,0)


        def proto(self):
            return self.getTypedRuleContext(compiladoresParser.ProtoContext,0)


        def func(self):
            return self.getTypedRuleContext(compiladoresParser.FuncContext,0)


        def if_(self):
            return self.getTypedRuleContext(compiladoresParser.IfContext,0)


        def opal(self):
            return self.getTypedRuleContext(compiladoresParser.OpalContext,0)


        def return_(self):
            return self.getTypedRuleContext(compiladoresParser.ReturnContext,0)


        def callFunc(self):
            return self.getTypedRuleContext(compiladoresParser.CallFuncContext,0)


        def getRuleIndex(self):
            return compiladoresParser.RULE_instruccion

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInstruccion" ):
                listener.enterInstruccion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInstruccion" ):
                listener.exitInstruccion(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitInstruccion" ):
                return visitor.visitInstruccion(self)
            else:
                return visitor.visitChildren(self)




    def instruccion(self):

        localctx = compiladoresParser.InstruccionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_instruccion)
        try:
            self.state = 110
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,2,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 87
                self.init()
                self.state = 88
                self.match(compiladoresParser.PYC)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 90
                self.iwhile()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 91
                self.bloque()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 92
                self.ifor()
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 93
                self.asignacion()
                self.state = 94
                self.match(compiladoresParser.PYC)
                pass

            elif la_ == 6:
                self.enterOuterAlt(localctx, 6)
                self.state = 96
                self.proto()
                self.state = 97
                self.match(compiladoresParser.PYC)
                pass

            elif la_ == 7:
                self.enterOuterAlt(localctx, 7)
                self.state = 99
                self.func()
                pass

            elif la_ == 8:
                self.enterOuterAlt(localctx, 8)
                self.state = 100
                self.if_()
                pass

            elif la_ == 9:
                self.enterOuterAlt(localctx, 9)
                self.state = 101
                self.opal()
                self.state = 102
                self.match(compiladoresParser.PYC)
                pass

            elif la_ == 10:
                self.enterOuterAlt(localctx, 10)
                self.state = 104
                self.return_()
                self.state = 105
                self.match(compiladoresParser.PYC)
                pass

            elif la_ == 11:
                self.enterOuterAlt(localctx, 11)
                self.state = 107
                self.callFunc()
                self.state = 108
                self.match(compiladoresParser.PYC)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class OperadorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EQQ(self):
            return self.getToken(compiladoresParser.EQQ, 0)

        def NE(self):
            return self.getToken(compiladoresParser.NE, 0)

        def GT(self):
            return self.getToken(compiladoresParser.GT, 0)

        def LT(self):
            return self.getToken(compiladoresParser.LT, 0)

        def GE(self):
            return self.getToken(compiladoresParser.GE, 0)

        def LE(self):
            return self.getToken(compiladoresParser.LE, 0)

        def getRuleIndex(self):
            return compiladoresParser.RULE_operador

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOperador" ):
                listener.enterOperador(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOperador" ):
                listener.exitOperador(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOperador" ):
                return visitor.visitOperador(self)
            else:
                return visitor.visitChildren(self)




    def operador(self):

        localctx = compiladoresParser.OperadorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_operador)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 112
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 4227858432) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class IwhileContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def WHILE(self):
            return self.getToken(compiladoresParser.WHILE, 0)

        def PA(self):
            return self.getToken(compiladoresParser.PA, 0)

        def ID(self):
            return self.getToken(compiladoresParser.ID, 0)

        def PC(self):
            return self.getToken(compiladoresParser.PC, 0)

        def bloque(self):
            return self.getTypedRuleContext(compiladoresParser.BloqueContext,0)


        def getRuleIndex(self):
            return compiladoresParser.RULE_iwhile

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIwhile" ):
                listener.enterIwhile(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIwhile" ):
                listener.exitIwhile(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIwhile" ):
                return visitor.visitIwhile(self)
            else:
                return visitor.visitChildren(self)




    def iwhile(self):

        localctx = compiladoresParser.IwhileContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_iwhile)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 114
            self.match(compiladoresParser.WHILE)
            self.state = 115
            self.match(compiladoresParser.PA)
            self.state = 116
            self.match(compiladoresParser.ID)
            self.state = 117
            self.match(compiladoresParser.PC)
            self.state = 118
            self.bloque()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class IfContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IF(self):
            return self.getToken(compiladoresParser.IF, 0)

        def PA(self):
            return self.getToken(compiladoresParser.PA, 0)

        def opal(self):
            return self.getTypedRuleContext(compiladoresParser.OpalContext,0)


        def PC(self):
            return self.getToken(compiladoresParser.PC, 0)

        def bloque(self):
            return self.getTypedRuleContext(compiladoresParser.BloqueContext,0)


        def else_(self):
            return self.getTypedRuleContext(compiladoresParser.ElseContext,0)


        def getRuleIndex(self):
            return compiladoresParser.RULE_if

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIf" ):
                listener.enterIf(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIf" ):
                listener.exitIf(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIf" ):
                return visitor.visitIf(self)
            else:
                return visitor.visitChildren(self)




    def if_(self):

        localctx = compiladoresParser.IfContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_if)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 120
            self.match(compiladoresParser.IF)
            self.state = 121
            self.match(compiladoresParser.PA)
            self.state = 122
            self.opal()
            self.state = 123
            self.match(compiladoresParser.PC)
            self.state = 124
            self.bloque()
            self.state = 125
            self.else_()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ElseContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ELSE(self):
            return self.getToken(compiladoresParser.ELSE, 0)

        def bloque(self):
            return self.getTypedRuleContext(compiladoresParser.BloqueContext,0)


        def if_(self):
            return self.getTypedRuleContext(compiladoresParser.IfContext,0)


        def getRuleIndex(self):
            return compiladoresParser.RULE_else

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterElse" ):
                listener.enterElse(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitElse" ):
                listener.exitElse(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitElse" ):
                return visitor.visitElse(self)
            else:
                return visitor.visitChildren(self)




    def else_(self):

        localctx = compiladoresParser.ElseContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_else)
        try:
            self.state = 132
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,3,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 127
                self.match(compiladoresParser.ELSE)
                self.state = 128
                self.bloque()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 129
                self.match(compiladoresParser.ELSE)
                self.state = 130
                self.if_()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)

                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BloqueContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LLA(self):
            return self.getToken(compiladoresParser.LLA, 0)

        def instrucciones(self):
            return self.getTypedRuleContext(compiladoresParser.InstruccionesContext,0)


        def LLC(self):
            return self.getToken(compiladoresParser.LLC, 0)

        def getRuleIndex(self):
            return compiladoresParser.RULE_bloque

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBloque" ):
                listener.enterBloque(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBloque" ):
                listener.exitBloque(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBloque" ):
                return visitor.visitBloque(self)
            else:
                return visitor.visitChildren(self)




    def bloque(self):

        localctx = compiladoresParser.BloqueContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_bloque)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 134
            self.match(compiladoresParser.LLA)
            self.state = 135
            self.instrucciones()
            self.state = 136
            self.match(compiladoresParser.LLC)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class OpalContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def exp(self):
            return self.getTypedRuleContext(compiladoresParser.ExpContext,0)


        def getRuleIndex(self):
            return compiladoresParser.RULE_opal

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOpal" ):
                listener.enterOpal(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOpal" ):
                listener.exitOpal(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOpal" ):
                return visitor.visitOpal(self)
            else:
                return visitor.visitChildren(self)




    def opal(self):

        localctx = compiladoresParser.OpalContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_opal)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 138
            self.exp()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def term(self):
            return self.getTypedRuleContext(compiladoresParser.TermContext,0)


        def e(self):
            return self.getTypedRuleContext(compiladoresParser.EContext,0)


        def getRuleIndex(self):
            return compiladoresParser.RULE_exp

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExp" ):
                listener.enterExp(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExp" ):
                listener.exitExp(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExp" ):
                return visitor.visitExp(self)
            else:
                return visitor.visitChildren(self)




    def exp(self):

        localctx = compiladoresParser.ExpContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_exp)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 140
            self.term()
            self.state = 141
            self.e()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class EContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SUMA(self):
            return self.getToken(compiladoresParser.SUMA, 0)

        def term(self):
            return self.getTypedRuleContext(compiladoresParser.TermContext,0)


        def e(self):
            return self.getTypedRuleContext(compiladoresParser.EContext,0)


        def RESTA(self):
            return self.getToken(compiladoresParser.RESTA, 0)

        def getRuleIndex(self):
            return compiladoresParser.RULE_e

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterE" ):
                listener.enterE(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitE" ):
                listener.exitE(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitE" ):
                return visitor.visitE(self)
            else:
                return visitor.visitChildren(self)




    def e(self):

        localctx = compiladoresParser.EContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_e)
        try:
            self.state = 152
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [20]:
                self.enterOuterAlt(localctx, 1)
                self.state = 143
                self.match(compiladoresParser.SUMA)
                self.state = 144
                self.term()
                self.state = 145
                self.e()
                pass
            elif token in [21]:
                self.enterOuterAlt(localctx, 2)
                self.state = 147
                self.match(compiladoresParser.RESTA)
                self.state = 148
                self.term()
                self.state = 149
                self.e()
                pass
            elif token in [-1, 2, 5]:
                self.enterOuterAlt(localctx, 3)

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TermContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def factor(self):
            return self.getTypedRuleContext(compiladoresParser.FactorContext,0)


        def t(self):
            return self.getTypedRuleContext(compiladoresParser.TContext,0)


        def getRuleIndex(self):
            return compiladoresParser.RULE_term

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTerm" ):
                listener.enterTerm(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTerm" ):
                listener.exitTerm(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTerm" ):
                return visitor.visitTerm(self)
            else:
                return visitor.visitChildren(self)




    def term(self):

        localctx = compiladoresParser.TermContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_term)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 154
            self.factor()
            self.state = 155
            self.t()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def MULT(self):
            return self.getToken(compiladoresParser.MULT, 0)

        def factor(self):
            return self.getTypedRuleContext(compiladoresParser.FactorContext,0)


        def t(self):
            return self.getTypedRuleContext(compiladoresParser.TContext,0)


        def DIV(self):
            return self.getToken(compiladoresParser.DIV, 0)

        def MOD(self):
            return self.getToken(compiladoresParser.MOD, 0)

        def getRuleIndex(self):
            return compiladoresParser.RULE_t

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterT" ):
                listener.enterT(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitT" ):
                listener.exitT(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitT" ):
                return visitor.visitT(self)
            else:
                return visitor.visitChildren(self)




    def t(self):

        localctx = compiladoresParser.TContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_t)
        try:
            self.state = 170
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [22]:
                self.enterOuterAlt(localctx, 1)
                self.state = 157
                self.match(compiladoresParser.MULT)
                self.state = 158
                self.factor()
                self.state = 159
                self.t()
                pass
            elif token in [23]:
                self.enterOuterAlt(localctx, 2)
                self.state = 161
                self.match(compiladoresParser.DIV)
                self.state = 162
                self.factor()
                self.state = 163
                self.t()
                pass
            elif token in [24]:
                self.enterOuterAlt(localctx, 3)
                self.state = 165
                self.match(compiladoresParser.MOD)
                self.state = 166
                self.factor()
                self.state = 167
                self.t()
                pass
            elif token in [-1, 2, 5, 20, 21, 26, 28, 29, 30, 31]:
                self.enterOuterAlt(localctx, 4)

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FactorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUMERO(self):
            return self.getToken(compiladoresParser.NUMERO, 0)

        def ID(self):
            return self.getToken(compiladoresParser.ID, 0)

        def PA(self):
            return self.getToken(compiladoresParser.PA, 0)

        def exp(self):
            return self.getTypedRuleContext(compiladoresParser.ExpContext,0)


        def PC(self):
            return self.getToken(compiladoresParser.PC, 0)

        def getRuleIndex(self):
            return compiladoresParser.RULE_factor

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFactor" ):
                listener.enterFactor(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFactor" ):
                listener.exitFactor(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFactor" ):
                return visitor.visitFactor(self)
            else:
                return visitor.visitChildren(self)




    def factor(self):

        localctx = compiladoresParser.FactorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_factor)
        try:
            self.state = 178
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [8]:
                self.enterOuterAlt(localctx, 1)
                self.state = 172
                self.match(compiladoresParser.NUMERO)
                pass
            elif token in [33]:
                self.enterOuterAlt(localctx, 2)
                self.state = 173
                self.match(compiladoresParser.ID)
                pass
            elif token in [1]:
                self.enterOuterAlt(localctx, 3)
                self.state = 174
                self.match(compiladoresParser.PA)
                self.state = 175
                self.exp()
                self.state = 176
                self.match(compiladoresParser.PC)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class IforContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FOR(self):
            return self.getToken(compiladoresParser.FOR, 0)

        def PA(self):
            return self.getToken(compiladoresParser.PA, 0)

        def asignacion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(compiladoresParser.AsignacionContext)
            else:
                return self.getTypedRuleContext(compiladoresParser.AsignacionContext,i)


        def PYC(self, i:int=None):
            if i is None:
                return self.getTokens(compiladoresParser.PYC)
            else:
                return self.getToken(compiladoresParser.PYC, i)

        def opal(self):
            return self.getTypedRuleContext(compiladoresParser.OpalContext,0)


        def PC(self):
            return self.getToken(compiladoresParser.PC, 0)

        def bloque(self):
            return self.getTypedRuleContext(compiladoresParser.BloqueContext,0)


        def getRuleIndex(self):
            return compiladoresParser.RULE_ifor

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIfor" ):
                listener.enterIfor(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIfor" ):
                listener.exitIfor(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIfor" ):
                return visitor.visitIfor(self)
            else:
                return visitor.visitChildren(self)




    def ifor(self):

        localctx = compiladoresParser.IforContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_ifor)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 180
            self.match(compiladoresParser.FOR)
            self.state = 181
            self.match(compiladoresParser.PA)
            self.state = 182
            self.asignacion()
            self.state = 183
            self.match(compiladoresParser.PYC)
            self.state = 184
            self.opal()
            self.state = 185
            self.match(compiladoresParser.PYC)
            self.state = 186
            self.asignacion()
            self.state = 187
            self.match(compiladoresParser.PC)
            self.state = 188
            self.bloque()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class OploContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expresion_logica(self):
            return self.getTypedRuleContext(compiladoresParser.Expresion_logicaContext,0)


        def getRuleIndex(self):
            return compiladoresParser.RULE_oplo

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOplo" ):
                listener.enterOplo(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOplo" ):
                listener.exitOplo(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOplo" ):
                return visitor.visitOplo(self)
            else:
                return visitor.visitChildren(self)




    def oplo(self):

        localctx = compiladoresParser.OploContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_oplo)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 190
            self.expresion_logica()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Expresion_logicaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ORR(self):
            return self.getToken(compiladoresParser.ORR, 0)

        def termino_logico(self):
            return self.getTypedRuleContext(compiladoresParser.Termino_logicoContext,0)


        def expresion_logica(self):
            return self.getTypedRuleContext(compiladoresParser.Expresion_logicaContext,0)


        def getRuleIndex(self):
            return compiladoresParser.RULE_expresion_logica

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpresion_logica" ):
                listener.enterExpresion_logica(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpresion_logica" ):
                listener.exitExpresion_logica(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpresion_logica" ):
                return visitor.visitExpresion_logica(self)
            else:
                return visitor.visitChildren(self)




    def expresion_logica(self):

        localctx = compiladoresParser.Expresion_logicaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_expresion_logica)
        try:
            self.state = 197
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,7,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 192
                self.match(compiladoresParser.ORR)
                self.state = 193
                self.termino_logico()
                self.state = 194
                self.expresion_logica()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)

                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Termino_logicoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def factor_logico(self):
            return self.getTypedRuleContext(compiladoresParser.Factor_logicoContext,0)


        def term_logico(self):
            return self.getTypedRuleContext(compiladoresParser.Term_logicoContext,0)


        def getRuleIndex(self):
            return compiladoresParser.RULE_termino_logico

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTermino_logico" ):
                listener.enterTermino_logico(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTermino_logico" ):
                listener.exitTermino_logico(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTermino_logico" ):
                return visitor.visitTermino_logico(self)
            else:
                return visitor.visitChildren(self)




    def termino_logico(self):

        localctx = compiladoresParser.Termino_logicoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 36, self.RULE_termino_logico)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 199
            self.factor_logico()
            self.state = 200
            self.term_logico()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Term_logicoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def AND(self):
            return self.getToken(compiladoresParser.AND, 0)

        def factor_logico(self):
            return self.getTypedRuleContext(compiladoresParser.Factor_logicoContext,0)


        def term_logico(self):
            return self.getTypedRuleContext(compiladoresParser.Term_logicoContext,0)


        def getRuleIndex(self):
            return compiladoresParser.RULE_term_logico

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTerm_logico" ):
                listener.enterTerm_logico(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTerm_logico" ):
                listener.exitTerm_logico(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTerm_logico" ):
                return visitor.visitTerm_logico(self)
            else:
                return visitor.visitChildren(self)




    def term_logico(self):

        localctx = compiladoresParser.Term_logicoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 38, self.RULE_term_logico)
        try:
            self.state = 207
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,8,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 202
                self.match(compiladoresParser.AND)
                self.state = 203
                self.factor_logico()
                self.state = 204
                self.term_logico()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)

                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Factor_logicoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def oplo(self):
            return self.getTypedRuleContext(compiladoresParser.OploContext,0)


        def comp(self):
            return self.getTypedRuleContext(compiladoresParser.CompContext,0)


        def PA(self):
            return self.getToken(compiladoresParser.PA, 0)

        def expresion_logica(self):
            return self.getTypedRuleContext(compiladoresParser.Expresion_logicaContext,0)


        def PC(self):
            return self.getToken(compiladoresParser.PC, 0)

        def getRuleIndex(self):
            return compiladoresParser.RULE_factor_logico

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFactor_logico" ):
                listener.enterFactor_logico(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFactor_logico" ):
                listener.exitFactor_logico(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFactor_logico" ):
                return visitor.visitFactor_logico(self)
            else:
                return visitor.visitChildren(self)




    def factor_logico(self):

        localctx = compiladoresParser.Factor_logicoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 40, self.RULE_factor_logico)
        try:
            self.state = 215
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,9,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 209
                self.oplo()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 210
                self.comp(0)
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 211
                self.match(compiladoresParser.PA)
                self.state = 212
                self.expresion_logica()
                self.state = 213
                self.match(compiladoresParser.PC)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CompContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def oplo(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(compiladoresParser.OploContext)
            else:
                return self.getTypedRuleContext(compiladoresParser.OploContext,i)


        def operador(self):
            return self.getTypedRuleContext(compiladoresParser.OperadorContext,0)


        def comp(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(compiladoresParser.CompContext)
            else:
                return self.getTypedRuleContext(compiladoresParser.CompContext,i)


        def getRuleIndex(self):
            return compiladoresParser.RULE_comp

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterComp" ):
                listener.enterComp(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitComp" ):
                listener.exitComp(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitComp" ):
                return visitor.visitComp(self)
            else:
                return visitor.visitChildren(self)



    def comp(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = compiladoresParser.CompContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 42
        self.enterRecursionRule(localctx, 42, self.RULE_comp, _p)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 218
            self.oplo()
            self.state = 219
            self.operador()
            self.state = 220
            self.oplo()
            self._ctx.stop = self._input.LT(-1)
            self.state = 228
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,10,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    localctx = compiladoresParser.CompContext(self, _parentctx, _parentState)
                    self.pushNewRecursionContext(localctx, _startState, self.RULE_comp)
                    self.state = 222
                    if not self.precpred(self._ctx, 1):
                        from antlr4.error.Errors import FailedPredicateException
                        raise FailedPredicateException(self, "self.precpred(self._ctx, 1)")
                    self.state = 223
                    self.operador()
                    self.state = 224
                    self.comp(2) 
                self.state = 230
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,10,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class InitContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(compiladoresParser.ID, 0)

        def INT(self):
            return self.getToken(compiladoresParser.INT, 0)

        def DOUBLE(self):
            return self.getToken(compiladoresParser.DOUBLE, 0)

        def FLOAT(self):
            return self.getToken(compiladoresParser.FLOAT, 0)

        def BOOLEAN(self):
            return self.getToken(compiladoresParser.BOOLEAN, 0)

        def CHAR(self):
            return self.getToken(compiladoresParser.CHAR, 0)

        def getRuleIndex(self):
            return compiladoresParser.RULE_init

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInit" ):
                listener.enterInit(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInit" ):
                listener.exitInit(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitInit" ):
                return visitor.visitInit(self)
            else:
                return visitor.visitChildren(self)




    def init(self):

        localctx = compiladoresParser.InitContext(self, self._ctx, self.state)
        self.enterRule(localctx, 44, self.RULE_init)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 231
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 385024) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 232
            self.match(compiladoresParser.ID)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class VarContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(compiladoresParser.ID)
            else:
                return self.getToken(compiladoresParser.ID, i)

        def COM(self, i:int=None):
            if i is None:
                return self.getTokens(compiladoresParser.COM)
            else:
                return self.getToken(compiladoresParser.COM, i)

        def getRuleIndex(self):
            return compiladoresParser.RULE_var

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVar" ):
                listener.enterVar(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVar" ):
                listener.exitVar(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitVar" ):
                return visitor.visitVar(self)
            else:
                return visitor.visitChildren(self)




    def var(self):

        localctx = compiladoresParser.VarContext(self, self._ctx, self.state)
        self.enterRule(localctx, 46, self.RULE_var)
        self._la = 0 # Token type
        try:
            self.state = 242
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [33]:
                self.enterOuterAlt(localctx, 1)
                self.state = 234
                self.match(compiladoresParser.ID)
                pass
            elif token in [2, 6]:
                self.enterOuterAlt(localctx, 2)
                self.state = 239
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==6:
                    self.state = 235
                    self.match(compiladoresParser.COM)
                    self.state = 236
                    self.match(compiladoresParser.ID)
                    self.state = 241
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AsignacionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(compiladoresParser.ID, 0)

        def ASIG(self):
            return self.getToken(compiladoresParser.ASIG, 0)

        def opal(self):
            return self.getTypedRuleContext(compiladoresParser.OpalContext,0)


        def getRuleIndex(self):
            return compiladoresParser.RULE_asignacion

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAsignacion" ):
                listener.enterAsignacion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAsignacion" ):
                listener.exitAsignacion(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAsignacion" ):
                return visitor.visitAsignacion(self)
            else:
                return visitor.visitChildren(self)




    def asignacion(self):

        localctx = compiladoresParser.AsignacionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 48, self.RULE_asignacion)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 244
            self.match(compiladoresParser.ID)
            self.state = 245
            self.match(compiladoresParser.ASIG)
            self.state = 246
            self.opal()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CondContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def term(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(compiladoresParser.TermContext)
            else:
                return self.getTypedRuleContext(compiladoresParser.TermContext,i)


        def condicionales(self):
            return self.getTypedRuleContext(compiladoresParser.CondicionalesContext,0)


        def getRuleIndex(self):
            return compiladoresParser.RULE_cond

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCond" ):
                listener.enterCond(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCond" ):
                listener.exitCond(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCond" ):
                return visitor.visitCond(self)
            else:
                return visitor.visitChildren(self)




    def cond(self):

        localctx = compiladoresParser.CondContext(self, self._ctx, self.state)
        self.enterRule(localctx, 50, self.RULE_cond)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 248
            self.term()
            self.state = 249
            self.condicionales()
            self.state = 252
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [1, 8, 33]:
                self.state = 250
                self.term()
                pass
            elif token in [-1]:
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CondicionalesContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EQQ(self):
            return self.getToken(compiladoresParser.EQQ, 0)

        def LT(self):
            return self.getToken(compiladoresParser.LT, 0)

        def GT(self):
            return self.getToken(compiladoresParser.GT, 0)

        def LE(self):
            return self.getToken(compiladoresParser.LE, 0)

        def GE(self):
            return self.getToken(compiladoresParser.GE, 0)

        def getRuleIndex(self):
            return compiladoresParser.RULE_condicionales

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCondicionales" ):
                listener.enterCondicionales(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCondicionales" ):
                listener.exitCondicionales(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCondicionales" ):
                return visitor.visitCondicionales(self)
            else:
                return visitor.visitChildren(self)




    def condicionales(self):

        localctx = compiladoresParser.CondicionalesContext(self, self._ctx, self.state)
        self.enterRule(localctx, 52, self.RULE_condicionales)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 254
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 4093640704) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class IterContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(compiladoresParser.ID, 0)

        def exp(self):
            return self.getTypedRuleContext(compiladoresParser.ExpContext,0)


        def getRuleIndex(self):
            return compiladoresParser.RULE_iter

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIter" ):
                listener.enterIter(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIter" ):
                listener.exitIter(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIter" ):
                return visitor.visitIter(self)
            else:
                return visitor.visitChildren(self)




    def iter_(self):

        localctx = compiladoresParser.IterContext(self, self._ctx, self.state)
        self.enterRule(localctx, 54, self.RULE_iter)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 256
            self.match(compiladoresParser.ID)
            self.state = 257
            self.exp()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ProtoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(compiladoresParser.ID, 0)

        def PA(self):
            return self.getToken(compiladoresParser.PA, 0)

        def PC(self):
            return self.getToken(compiladoresParser.PC, 0)

        def INT(self):
            return self.getToken(compiladoresParser.INT, 0)

        def DOUBLE(self):
            return self.getToken(compiladoresParser.DOUBLE, 0)

        def FLOAT(self):
            return self.getToken(compiladoresParser.FLOAT, 0)

        def BOOLEAN(self):
            return self.getToken(compiladoresParser.BOOLEAN, 0)

        def CHAR(self):
            return self.getToken(compiladoresParser.CHAR, 0)

        def VOID(self):
            return self.getToken(compiladoresParser.VOID, 0)

        def var_func(self):
            return self.getTypedRuleContext(compiladoresParser.Var_funcContext,0)


        def getRuleIndex(self):
            return compiladoresParser.RULE_proto

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProto" ):
                listener.enterProto(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProto" ):
                listener.exitProto(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProto" ):
                return visitor.visitProto(self)
            else:
                return visitor.visitChildren(self)




    def proto(self):

        localctx = compiladoresParser.ProtoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 56, self.RULE_proto)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 259
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 909312) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 260
            self.match(compiladoresParser.ID)
            self.state = 261
            self.match(compiladoresParser.PA)
            self.state = 264
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [13, 14, 15, 16, 18]:
                self.state = 262
                self.var_func()
                pass
            elif token in [2]:
                pass
            else:
                raise NoViableAltException(self)

            self.state = 266
            self.match(compiladoresParser.PC)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FuncContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(compiladoresParser.ID, 0)

        def PA(self):
            return self.getToken(compiladoresParser.PA, 0)

        def PC(self):
            return self.getToken(compiladoresParser.PC, 0)

        def bloque(self):
            return self.getTypedRuleContext(compiladoresParser.BloqueContext,0)


        def INT(self):
            return self.getToken(compiladoresParser.INT, 0)

        def DOUBLE(self):
            return self.getToken(compiladoresParser.DOUBLE, 0)

        def FLOAT(self):
            return self.getToken(compiladoresParser.FLOAT, 0)

        def BOOLEAN(self):
            return self.getToken(compiladoresParser.BOOLEAN, 0)

        def CHAR(self):
            return self.getToken(compiladoresParser.CHAR, 0)

        def VOID(self):
            return self.getToken(compiladoresParser.VOID, 0)

        def var_func(self):
            return self.getTypedRuleContext(compiladoresParser.Var_funcContext,0)


        def getRuleIndex(self):
            return compiladoresParser.RULE_func

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFunc" ):
                listener.enterFunc(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFunc" ):
                listener.exitFunc(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFunc" ):
                return visitor.visitFunc(self)
            else:
                return visitor.visitChildren(self)




    def func(self):

        localctx = compiladoresParser.FuncContext(self, self._ctx, self.state)
        self.enterRule(localctx, 58, self.RULE_func)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 268
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 909312) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 269
            self.match(compiladoresParser.ID)
            self.state = 270
            self.match(compiladoresParser.PA)
            self.state = 273
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [13, 14, 15, 16, 18]:
                self.state = 271
                self.var_func()
                pass
            elif token in [2]:
                pass
            else:
                raise NoViableAltException(self)

            self.state = 275
            self.match(compiladoresParser.PC)
            self.state = 276
            self.bloque()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Var_funcContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(compiladoresParser.ID)
            else:
                return self.getToken(compiladoresParser.ID, i)

        def INT(self, i:int=None):
            if i is None:
                return self.getTokens(compiladoresParser.INT)
            else:
                return self.getToken(compiladoresParser.INT, i)

        def DOUBLE(self, i:int=None):
            if i is None:
                return self.getTokens(compiladoresParser.DOUBLE)
            else:
                return self.getToken(compiladoresParser.DOUBLE, i)

        def FLOAT(self, i:int=None):
            if i is None:
                return self.getTokens(compiladoresParser.FLOAT)
            else:
                return self.getToken(compiladoresParser.FLOAT, i)

        def BOOLEAN(self, i:int=None):
            if i is None:
                return self.getTokens(compiladoresParser.BOOLEAN)
            else:
                return self.getToken(compiladoresParser.BOOLEAN, i)

        def CHAR(self, i:int=None):
            if i is None:
                return self.getTokens(compiladoresParser.CHAR)
            else:
                return self.getToken(compiladoresParser.CHAR, i)

        def COM(self, i:int=None):
            if i is None:
                return self.getTokens(compiladoresParser.COM)
            else:
                return self.getToken(compiladoresParser.COM, i)

        def getRuleIndex(self):
            return compiladoresParser.RULE_var_func

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVar_func" ):
                listener.enterVar_func(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVar_func" ):
                listener.exitVar_func(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitVar_func" ):
                return visitor.visitVar_func(self)
            else:
                return visitor.visitChildren(self)




    def var_func(self):

        localctx = compiladoresParser.Var_funcContext(self, self._ctx, self.state)
        self.enterRule(localctx, 60, self.RULE_var_func)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 278
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 385024) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 279
            self.match(compiladoresParser.ID)
            self.state = 285
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==6:
                self.state = 280
                self.match(compiladoresParser.COM)
                self.state = 281
                _la = self._input.LA(1)
                if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 385024) != 0)):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 282
                self.match(compiladoresParser.ID)
                self.state = 287
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CallFuncContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(compiladoresParser.ID, 0)

        def PA(self):
            return self.getToken(compiladoresParser.PA, 0)

        def PC(self):
            return self.getToken(compiladoresParser.PC, 0)

        def var(self):
            return self.getTypedRuleContext(compiladoresParser.VarContext,0)


        def getRuleIndex(self):
            return compiladoresParser.RULE_callFunc

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCallFunc" ):
                listener.enterCallFunc(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCallFunc" ):
                listener.exitCallFunc(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCallFunc" ):
                return visitor.visitCallFunc(self)
            else:
                return visitor.visitChildren(self)




    def callFunc(self):

        localctx = compiladoresParser.CallFuncContext(self, self._ctx, self.state)
        self.enterRule(localctx, 62, self.RULE_callFunc)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 288
            self.match(compiladoresParser.ID)
            self.state = 289
            self.match(compiladoresParser.PA)
            self.state = 292
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,17,self._ctx)
            if la_ == 1:
                self.state = 290
                self.var()
                pass

            elif la_ == 2:
                pass


            self.state = 294
            self.match(compiladoresParser.PC)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ReturnContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def RETURN(self):
            return self.getToken(compiladoresParser.RETURN, 0)

        def opal(self):
            return self.getTypedRuleContext(compiladoresParser.OpalContext,0)


        def getRuleIndex(self):
            return compiladoresParser.RULE_return

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterReturn" ):
                listener.enterReturn(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitReturn" ):
                listener.exitReturn(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitReturn" ):
                return visitor.visitReturn(self)
            else:
                return visitor.visitChildren(self)




    def return_(self):

        localctx = compiladoresParser.ReturnContext(self, self._ctx, self.state)
        self.enterRule(localctx, 64, self.RULE_return)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 296
            self.match(compiladoresParser.RETURN)
            self.state = 297
            self.opal()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[21] = self.comp_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def comp_sempred(self, localctx:CompContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 1)
         




