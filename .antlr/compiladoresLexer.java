// Generated from /home/eduardo/DHS/DHSBidoneFiesen/compiladores.g4 by ANTLR 4.13.1
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
		GE=20, WS=21, ID=22, OTRO=23;
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
			"GT", "LE", "GE", "WS", "ID", "OTRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "';'", "'while'", null, "'int'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'='", "'=='", "'!='", "'<'", "'>'", "'<='", 
			"'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PA", "PC", "LLA", "LLC", "PYC", "WHILE", "NUMERO", "INT", "SUMA", 
			"RESTA", "MULT", "DIV", "MOD", "ASIG", "EQQ", "NE", "LT", "GT", "LE", 
			"GE", "WS", "ID", "OTRO"
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
		"\u0004\u0000\u0017~\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0004\bI\b\b\u000b"+
		"\b\f\bJ\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0003\u0017"+
		"s\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017x\b\u0017\n\u0017"+
		"\f\u0017{\t\u0017\u0001\u0018\u0001\u0018\u0000\u0000\u0019\u0001\u0000"+
		"\u0003\u0000\u0005\u0001\u0007\u0002\t\u0003\u000b\u0004\r\u0005\u000f"+
		"\u0006\u0011\u0007\u0013\b\u0015\t\u0017\n\u0019\u000b\u001b\f\u001d\r"+
		"\u001f\u000e!\u000f#\u0010%\u0011\'\u0012)\u0013+\u0014-\u0015/\u0016"+
		"1\u0017\u0001\u0000\u0003\u0002\u0000AZaz\u0001\u000009\u0003\u0000\t"+
		"\n\r\r  \u0080\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0001"+
		"3\u0001\u0000\u0000\u0000\u00035\u0001\u0000\u0000\u0000\u00057\u0001"+
		"\u0000\u0000\u0000\u00079\u0001\u0000\u0000\u0000\t;\u0001\u0000\u0000"+
		"\u0000\u000b=\u0001\u0000\u0000\u0000\r?\u0001\u0000\u0000\u0000\u000f"+
		"A\u0001\u0000\u0000\u0000\u0011H\u0001\u0000\u0000\u0000\u0013L\u0001"+
		"\u0000\u0000\u0000\u0015P\u0001\u0000\u0000\u0000\u0017R\u0001\u0000\u0000"+
		"\u0000\u0019T\u0001\u0000\u0000\u0000\u001bV\u0001\u0000\u0000\u0000\u001d"+
		"X\u0001\u0000\u0000\u0000\u001fZ\u0001\u0000\u0000\u0000!\\\u0001\u0000"+
		"\u0000\u0000#_\u0001\u0000\u0000\u0000%b\u0001\u0000\u0000\u0000\'d\u0001"+
		"\u0000\u0000\u0000)f\u0001\u0000\u0000\u0000+i\u0001\u0000\u0000\u0000"+
		"-l\u0001\u0000\u0000\u0000/r\u0001\u0000\u0000\u00001|\u0001\u0000\u0000"+
		"\u000034\u0007\u0000\u0000\u00004\u0002\u0001\u0000\u0000\u000056\u0007"+
		"\u0001\u0000\u00006\u0004\u0001\u0000\u0000\u000078\u0005(\u0000\u0000"+
		"8\u0006\u0001\u0000\u0000\u00009:\u0005)\u0000\u0000:\b\u0001\u0000\u0000"+
		"\u0000;<\u0005{\u0000\u0000<\n\u0001\u0000\u0000\u0000=>\u0005}\u0000"+
		"\u0000>\f\u0001\u0000\u0000\u0000?@\u0005;\u0000\u0000@\u000e\u0001\u0000"+
		"\u0000\u0000AB\u0005w\u0000\u0000BC\u0005h\u0000\u0000CD\u0005i\u0000"+
		"\u0000DE\u0005l\u0000\u0000EF\u0005e\u0000\u0000F\u0010\u0001\u0000\u0000"+
		"\u0000GI\u0003\u0003\u0001\u0000HG\u0001\u0000\u0000\u0000IJ\u0001\u0000"+
		"\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000K\u0012"+
		"\u0001\u0000\u0000\u0000LM\u0005i\u0000\u0000MN\u0005n\u0000\u0000NO\u0005"+
		"t\u0000\u0000O\u0014\u0001\u0000\u0000\u0000PQ\u0005+\u0000\u0000Q\u0016"+
		"\u0001\u0000\u0000\u0000RS\u0005-\u0000\u0000S\u0018\u0001\u0000\u0000"+
		"\u0000TU\u0005*\u0000\u0000U\u001a\u0001\u0000\u0000\u0000VW\u0005/\u0000"+
		"\u0000W\u001c\u0001\u0000\u0000\u0000XY\u0005%\u0000\u0000Y\u001e\u0001"+
		"\u0000\u0000\u0000Z[\u0005=\u0000\u0000[ \u0001\u0000\u0000\u0000\\]\u0005"+
		"=\u0000\u0000]^\u0005=\u0000\u0000^\"\u0001\u0000\u0000\u0000_`\u0005"+
		"!\u0000\u0000`a\u0005=\u0000\u0000a$\u0001\u0000\u0000\u0000bc\u0005<"+
		"\u0000\u0000c&\u0001\u0000\u0000\u0000de\u0005>\u0000\u0000e(\u0001\u0000"+
		"\u0000\u0000fg\u0005<\u0000\u0000gh\u0005=\u0000\u0000h*\u0001\u0000\u0000"+
		"\u0000ij\u0005>\u0000\u0000jk\u0005=\u0000\u0000k,\u0001\u0000\u0000\u0000"+
		"lm\u0007\u0002\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0006\u0016\u0000"+
		"\u0000o.\u0001\u0000\u0000\u0000ps\u0003\u0001\u0000\u0000qs\u0005_\u0000"+
		"\u0000rp\u0001\u0000\u0000\u0000rq\u0001\u0000\u0000\u0000sy\u0001\u0000"+
		"\u0000\u0000tx\u0003\u0001\u0000\u0000ux\u0003\u0003\u0001\u0000vx\u0005"+
		"_\u0000\u0000wt\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wv\u0001"+
		"\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000"+
		"yz\u0001\u0000\u0000\u0000z0\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000"+
		"\u0000|}\t\u0000\u0000\u0000}2\u0001\u0000\u0000\u0000\u0005\u0000Jrw"+
		"y\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}