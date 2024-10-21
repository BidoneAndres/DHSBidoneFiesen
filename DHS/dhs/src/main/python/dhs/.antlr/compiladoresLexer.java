// Generated from /home/eduardo/DHS/desarrollo-herramientas-software/DHS/dhs/src/main/python/dhs/compiladores.g4 by ANTLR 4.13.1
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
		PA=1, PC=2, LLA=3, LLC=4, PYC=5, WHILE=6, NUMERO=7, INT=8, SUMA=9, RESTA=10, 
		MULT=11, DIV=12, MOD=13, ASIG=14, EQQ=15, NE=16, LT=17, GT=18, LE=19, 
		GE=20, WS=21, ID=22, FOR=23, ORR=24, AND=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "PA", "PC", "LLA", "LLC", "PYC", "WHILE", "NUMERO", 
			"INT", "SUMA", "RESTA", "MULT", "DIV", "MOD", "ASIG", "EQQ", "NE", "LT", 
			"GT", "LE", "GE", "WS", "ID", "FOR", "ORR", "AND"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "';'", "'while'", null, "'int'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'='", "'=='", "'!='", "'<'", "'>'", "'<='", 
			"'>='", null, null, "'for'", "'||'", "'&&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PA", "PC", "LLA", "LLC", "PYC", "WHILE", "NUMERO", "INT", "SUMA", 
			"RESTA", "MULT", "DIV", "MOD", "ASIG", "EQQ", "NE", "LT", "GT", "LE", 
			"GE", "WS", "ID", "FOR", "ORR", "AND"
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
		"\u0004\u0000\u0019\u008a\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0004\bM\b\b\u000b\b\f\bN\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0003\u0017w\b\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0005\u0017|\b\u0017\n\u0017\f\u0017\u007f"+
		"\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0000\u0000\u001b"+
		"\u0001\u0000\u0003\u0000\u0005\u0001\u0007\u0002\t\u0003\u000b\u0004\r"+
		"\u0005\u000f\u0006\u0011\u0007\u0013\b\u0015\t\u0017\n\u0019\u000b\u001b"+
		"\f\u001d\r\u001f\u000e!\u000f#\u0010%\u0011\'\u0012)\u0013+\u0014-\u0015"+
		"/\u00161\u00173\u00185\u0019\u0001\u0000\u0003\u0002\u0000AZaz\u0001\u0000"+
		"09\u0003\u0000\t\n\r\r  \u008c\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000"+
		"\u00017\u0001\u0000\u0000\u0000\u00039\u0001\u0000\u0000\u0000\u0005;"+
		"\u0001\u0000\u0000\u0000\u0007=\u0001\u0000\u0000\u0000\t?\u0001\u0000"+
		"\u0000\u0000\u000bA\u0001\u0000\u0000\u0000\rC\u0001\u0000\u0000\u0000"+
		"\u000fE\u0001\u0000\u0000\u0000\u0011L\u0001\u0000\u0000\u0000\u0013P"+
		"\u0001\u0000\u0000\u0000\u0015T\u0001\u0000\u0000\u0000\u0017V\u0001\u0000"+
		"\u0000\u0000\u0019X\u0001\u0000\u0000\u0000\u001bZ\u0001\u0000\u0000\u0000"+
		"\u001d\\\u0001\u0000\u0000\u0000\u001f^\u0001\u0000\u0000\u0000!`\u0001"+
		"\u0000\u0000\u0000#c\u0001\u0000\u0000\u0000%f\u0001\u0000\u0000\u0000"+
		"\'h\u0001\u0000\u0000\u0000)j\u0001\u0000\u0000\u0000+m\u0001\u0000\u0000"+
		"\u0000-p\u0001\u0000\u0000\u0000/v\u0001\u0000\u0000\u00001\u0080\u0001"+
		"\u0000\u0000\u00003\u0084\u0001\u0000\u0000\u00005\u0087\u0001\u0000\u0000"+
		"\u000078\u0007\u0000\u0000\u00008\u0002\u0001\u0000\u0000\u00009:\u0007"+
		"\u0001\u0000\u0000:\u0004\u0001\u0000\u0000\u0000;<\u0005(\u0000\u0000"+
		"<\u0006\u0001\u0000\u0000\u0000=>\u0005)\u0000\u0000>\b\u0001\u0000\u0000"+
		"\u0000?@\u0005{\u0000\u0000@\n\u0001\u0000\u0000\u0000AB\u0005}\u0000"+
		"\u0000B\f\u0001\u0000\u0000\u0000CD\u0005;\u0000\u0000D\u000e\u0001\u0000"+
		"\u0000\u0000EF\u0005w\u0000\u0000FG\u0005h\u0000\u0000GH\u0005i\u0000"+
		"\u0000HI\u0005l\u0000\u0000IJ\u0005e\u0000\u0000J\u0010\u0001\u0000\u0000"+
		"\u0000KM\u0003\u0003\u0001\u0000LK\u0001\u0000\u0000\u0000MN\u0001\u0000"+
		"\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000O\u0012"+
		"\u0001\u0000\u0000\u0000PQ\u0005i\u0000\u0000QR\u0005n\u0000\u0000RS\u0005"+
		"t\u0000\u0000S\u0014\u0001\u0000\u0000\u0000TU\u0005+\u0000\u0000U\u0016"+
		"\u0001\u0000\u0000\u0000VW\u0005-\u0000\u0000W\u0018\u0001\u0000\u0000"+
		"\u0000XY\u0005*\u0000\u0000Y\u001a\u0001\u0000\u0000\u0000Z[\u0005/\u0000"+
		"\u0000[\u001c\u0001\u0000\u0000\u0000\\]\u0005%\u0000\u0000]\u001e\u0001"+
		"\u0000\u0000\u0000^_\u0005=\u0000\u0000_ \u0001\u0000\u0000\u0000`a\u0005"+
		"=\u0000\u0000ab\u0005=\u0000\u0000b\"\u0001\u0000\u0000\u0000cd\u0005"+
		"!\u0000\u0000de\u0005=\u0000\u0000e$\u0001\u0000\u0000\u0000fg\u0005<"+
		"\u0000\u0000g&\u0001\u0000\u0000\u0000hi\u0005>\u0000\u0000i(\u0001\u0000"+
		"\u0000\u0000jk\u0005<\u0000\u0000kl\u0005=\u0000\u0000l*\u0001\u0000\u0000"+
		"\u0000mn\u0005>\u0000\u0000no\u0005=\u0000\u0000o,\u0001\u0000\u0000\u0000"+
		"pq\u0007\u0002\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0006\u0016\u0000"+
		"\u0000s.\u0001\u0000\u0000\u0000tw\u0003\u0001\u0000\u0000uw\u0005_\u0000"+
		"\u0000vt\u0001\u0000\u0000\u0000vu\u0001\u0000\u0000\u0000w}\u0001\u0000"+
		"\u0000\u0000x|\u0003\u0001\u0000\u0000y|\u0003\u0003\u0001\u0000z|\u0005"+
		"_\u0000\u0000{x\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{z\u0001"+
		"\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000"+
		"\u0000}~\u0001\u0000\u0000\u0000~0\u0001\u0000\u0000\u0000\u007f}\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0005f\u0000\u0000\u0081\u0082\u0005o\u0000"+
		"\u0000\u0082\u0083\u0005r\u0000\u0000\u00832\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0005|\u0000\u0000\u0085\u0086\u0005|\u0000\u0000\u00864\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0005&\u0000\u0000\u0088\u0089\u0005&\u0000"+
		"\u0000\u00896\u0001\u0000\u0000\u0000\u0005\u0000Nv{}\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}