// Generated from /home/eduardo/DHS/DHSBidoneFiesen/DHS/src/main/python/dhs/.antlr/compiladores.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class compiladoresLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PA=1, PC=2, LLA=3, LLC=4, PYC=5, WHILE=6, NUMERO=7, FOR=8, INT=9, SUMA=10, 
		RESTA=11, MULT=12, DIV=13, MOD=14, ASIG=15, EQQ=16, NE=17, LT=18, GT=19, 
		LE=20, GE=21, WS=22, ID=23, ORR=24, AND=25, NOT=26, OTRO=27, NOMBRE=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "PA", "PC", "LLA", "LLC", "PYC", "WHILE", "NUMERO", 
			"FOR", "INT", "SUMA", "RESTA", "MULT", "DIV", "MOD", "ASIG", "EQQ", "NE", 
			"LT", "GT", "LE", "GE", "WS", "ID", "ORR", "AND", "NOT", "OTRO", "NOMBRE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "';'", "'while'", null, "'for'", "'int'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'=='", "'!='", "'<'", "'>'", 
			"'<='", "'>='", null, null, "'||'", "'&&'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PA", "PC", "LLA", "LLC", "PYC", "WHILE", "NUMERO", "FOR", "INT", 
			"SUMA", "RESTA", "MULT", "DIV", "MOD", "ASIG", "EQQ", "NE", "LT", "GT", 
			"LE", "GE", "WS", "ID", "ORR", "AND", "NOT", "OTRO", "NOMBRE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public compiladoresLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "compiladores.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u001c\u0099\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0004\bS\b\b\u000b\b\f\bT\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u0081\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005"+
		"\u0018\u0086\b\u0018\n\u0018\f\u0018\u0089\t\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0004\u001d\u0096\b\u001d\u000b\u001d"+
		"\f\u001d\u0097\u0000\u0000\u001e\u0001\u0000\u0003\u0000\u0005\u0001\u0007"+
		"\u0002\t\u0003\u000b\u0004\r\u0005\u000f\u0006\u0011\u0007\u0013\b\u0015"+
		"\t\u0017\n\u0019\u000b\u001b\f\u001d\r\u001f\u000e!\u000f#\u0010%\u0011"+
		"\'\u0012)\u0013+\u0014-\u0015/\u00161\u00173\u00185\u00197\u001a9\u001b"+
		";\u001c\u0001\u0000\u0003\u0002\u0000AZaz\u0001\u000009\u0003\u0000\t"+
		"\n\r\r  \u009c\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
		"\u0000\u0001=\u0001\u0000\u0000\u0000\u0003?\u0001\u0000\u0000\u0000\u0005"+
		"A\u0001\u0000\u0000\u0000\u0007C\u0001\u0000\u0000\u0000\tE\u0001\u0000"+
		"\u0000\u0000\u000bG\u0001\u0000\u0000\u0000\rI\u0001\u0000\u0000\u0000"+
		"\u000fK\u0001\u0000\u0000\u0000\u0011R\u0001\u0000\u0000\u0000\u0013V"+
		"\u0001\u0000\u0000\u0000\u0015Z\u0001\u0000\u0000\u0000\u0017^\u0001\u0000"+
		"\u0000\u0000\u0019`\u0001\u0000\u0000\u0000\u001bb\u0001\u0000\u0000\u0000"+
		"\u001dd\u0001\u0000\u0000\u0000\u001ff\u0001\u0000\u0000\u0000!h\u0001"+
		"\u0000\u0000\u0000#j\u0001\u0000\u0000\u0000%m\u0001\u0000\u0000\u0000"+
		"\'p\u0001\u0000\u0000\u0000)r\u0001\u0000\u0000\u0000+t\u0001\u0000\u0000"+
		"\u0000-w\u0001\u0000\u0000\u0000/z\u0001\u0000\u0000\u00001\u0080\u0001"+
		"\u0000\u0000\u00003\u008a\u0001\u0000\u0000\u00005\u008d\u0001\u0000\u0000"+
		"\u00007\u0090\u0001\u0000\u0000\u00009\u0092\u0001\u0000\u0000\u0000;"+
		"\u0095\u0001\u0000\u0000\u0000=>\u0007\u0000\u0000\u0000>\u0002\u0001"+
		"\u0000\u0000\u0000?@\u0007\u0001\u0000\u0000@\u0004\u0001\u0000\u0000"+
		"\u0000AB\u0005(\u0000\u0000B\u0006\u0001\u0000\u0000\u0000CD\u0005)\u0000"+
		"\u0000D\b\u0001\u0000\u0000\u0000EF\u0005{\u0000\u0000F\n\u0001\u0000"+
		"\u0000\u0000GH\u0005}\u0000\u0000H\f\u0001\u0000\u0000\u0000IJ\u0005;"+
		"\u0000\u0000J\u000e\u0001\u0000\u0000\u0000KL\u0005w\u0000\u0000LM\u0005"+
		"h\u0000\u0000MN\u0005i\u0000\u0000NO\u0005l\u0000\u0000OP\u0005e\u0000"+
		"\u0000P\u0010\u0001\u0000\u0000\u0000QS\u0003\u0003\u0001\u0000RQ\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000"+
		"TU\u0001\u0000\u0000\u0000U\u0012\u0001\u0000\u0000\u0000VW\u0005f\u0000"+
		"\u0000WX\u0005o\u0000\u0000XY\u0005r\u0000\u0000Y\u0014\u0001\u0000\u0000"+
		"\u0000Z[\u0005i\u0000\u0000[\\\u0005n\u0000\u0000\\]\u0005t\u0000\u0000"+
		"]\u0016\u0001\u0000\u0000\u0000^_\u0005+\u0000\u0000_\u0018\u0001\u0000"+
		"\u0000\u0000`a\u0005-\u0000\u0000a\u001a\u0001\u0000\u0000\u0000bc\u0005"+
		"*\u0000\u0000c\u001c\u0001\u0000\u0000\u0000de\u0005/\u0000\u0000e\u001e"+
		"\u0001\u0000\u0000\u0000fg\u0005%\u0000\u0000g \u0001\u0000\u0000\u0000"+
		"hi\u0005=\u0000\u0000i\"\u0001\u0000\u0000\u0000jk\u0005=\u0000\u0000"+
		"kl\u0005=\u0000\u0000l$\u0001\u0000\u0000\u0000mn\u0005!\u0000\u0000n"+
		"o\u0005=\u0000\u0000o&\u0001\u0000\u0000\u0000pq\u0005<\u0000\u0000q("+
		"\u0001\u0000\u0000\u0000rs\u0005>\u0000\u0000s*\u0001\u0000\u0000\u0000"+
		"tu\u0005<\u0000\u0000uv\u0005=\u0000\u0000v,\u0001\u0000\u0000\u0000w"+
		"x\u0005>\u0000\u0000xy\u0005=\u0000\u0000y.\u0001\u0000\u0000\u0000z{"+
		"\u0007\u0002\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0006\u0017\u0000"+
		"\u0000}0\u0001\u0000\u0000\u0000~\u0081\u0003\u0001\u0000\u0000\u007f"+
		"\u0081\u0005_\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u007f\u0001"+
		"\u0000\u0000\u0000\u0081\u0087\u0001\u0000\u0000\u0000\u0082\u0086\u0003"+
		"\u0001\u0000\u0000\u0083\u0086\u0003\u0003\u0001\u0000\u0084\u0086\u0005"+
		"_\u0000\u0000\u0085\u0082\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000"+
		"\u0000\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000"+
		"\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000"+
		"\u0000\u0000\u00882\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0005|\u0000\u0000\u008b\u008c\u0005|\u0000\u0000\u008c"+
		"4\u0001\u0000\u0000\u0000\u008d\u008e\u0005&\u0000\u0000\u008e\u008f\u0005"+
		"&\u0000\u0000\u008f6\u0001\u0000\u0000\u0000\u0090\u0091\u0005!\u0000"+
		"\u0000\u00918\u0001\u0000\u0000\u0000\u0092\u0093\t\u0000\u0000\u0000"+
		"\u0093:\u0001\u0000\u0000\u0000\u0094\u0096\u0003\u0001\u0000\u0000\u0095"+
		"\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097"+
		"\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098"+
		"<\u0001\u0000\u0000\u0000\u0006\u0000T\u0080\u0085\u0087\u0097\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}