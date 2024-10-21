# Generated from /home/joaquincernik/Desktop/facultad/DHS/dhs/src/main/python/dhs/compiladores.g4 by ANTLR 4.13.1
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
    from typing import TextIO
else:
    from typing.io import TextIO


def serializedATN():
    return [
        4,0,10,70,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,
        6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,1,0,1,0,1,1,1,
        1,1,2,1,2,1,3,1,3,1,4,1,4,1,5,1,5,1,6,1,6,1,7,1,7,1,7,1,7,1,7,1,
        7,1,8,4,8,47,8,8,11,8,12,8,48,1,9,1,9,1,9,1,9,1,10,1,10,1,10,1,10,
        1,11,1,11,3,11,61,8,11,1,11,1,11,1,11,5,11,66,8,11,10,11,12,11,69,
        9,11,0,0,12,1,0,3,0,5,1,7,2,9,3,11,4,13,5,15,6,17,7,19,8,21,9,23,
        10,1,0,3,2,0,65,90,97,122,1,0,48,57,3,0,9,10,13,13,32,32,72,0,5,
        1,0,0,0,0,7,1,0,0,0,0,9,1,0,0,0,0,11,1,0,0,0,0,13,1,0,0,0,0,15,1,
        0,0,0,0,17,1,0,0,0,0,19,1,0,0,0,0,21,1,0,0,0,0,23,1,0,0,0,1,25,1,
        0,0,0,3,27,1,0,0,0,5,29,1,0,0,0,7,31,1,0,0,0,9,33,1,0,0,0,11,35,
        1,0,0,0,13,37,1,0,0,0,15,39,1,0,0,0,17,46,1,0,0,0,19,50,1,0,0,0,
        21,54,1,0,0,0,23,60,1,0,0,0,25,26,7,0,0,0,26,2,1,0,0,0,27,28,7,1,
        0,0,28,4,1,0,0,0,29,30,5,40,0,0,30,6,1,0,0,0,31,32,5,41,0,0,32,8,
        1,0,0,0,33,34,5,123,0,0,34,10,1,0,0,0,35,36,5,125,0,0,36,12,1,0,
        0,0,37,38,5,59,0,0,38,14,1,0,0,0,39,40,5,119,0,0,40,41,5,104,0,0,
        41,42,5,105,0,0,42,43,5,108,0,0,43,44,5,101,0,0,44,16,1,0,0,0,45,
        47,3,3,1,0,46,45,1,0,0,0,47,48,1,0,0,0,48,46,1,0,0,0,48,49,1,0,0,
        0,49,18,1,0,0,0,50,51,5,105,0,0,51,52,5,110,0,0,52,53,5,116,0,0,
        53,20,1,0,0,0,54,55,7,2,0,0,55,56,1,0,0,0,56,57,6,10,0,0,57,22,1,
        0,0,0,58,61,3,1,0,0,59,61,5,95,0,0,60,58,1,0,0,0,60,59,1,0,0,0,61,
        67,1,0,0,0,62,66,3,1,0,0,63,66,3,3,1,0,64,66,5,95,0,0,65,62,1,0,
        0,0,65,63,1,0,0,0,65,64,1,0,0,0,66,69,1,0,0,0,67,65,1,0,0,0,67,68,
        1,0,0,0,68,24,1,0,0,0,69,67,1,0,0,0,5,0,48,60,65,67,1,6,0,0
    ]

class compiladoresLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    PA = 1
    PC = 2
    LLA = 3
    LLC = 4
    PYC = 5
    WHILE = 6
    NUMERO = 7
    INT = 8
    WS = 9
    ID = 10

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'('", "')'", "'{'", "'}'", "';'", "'while'", "'int'" ]

    symbolicNames = [ "<INVALID>",
            "PA", "PC", "LLA", "LLC", "PYC", "WHILE", "NUMERO", "INT", "WS", 
            "ID" ]

    ruleNames = [ "LETRA", "DIGITO", "PA", "PC", "LLA", "LLC", "PYC", "WHILE", 
                  "NUMERO", "INT", "WS", "ID" ]

    grammarFileName = "compiladores.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


