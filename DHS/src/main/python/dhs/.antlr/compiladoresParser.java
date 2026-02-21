// Generated from /home/andres/Documents/DHS/DHSBidoneFiesen/DHS/src/main/python/dhs/compiladores.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class compiladoresParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PA=1, PC=2, LLA=3, LLC=4, PYC=5, COM=6, WHILE=7, FLOAT_LITERAL=8, NUMERO=9, 
		FOR=10, IF=11, ELSE=12, RETURN=13, INT=14, DOUBLE=15, CHAR=16, FLOAT=17, 
		STRING=18, BOOLEAN=19, VOID=20, SUMA=21, RESTA=22, MULT=23, DIV=24, MOD=25, 
		ASIG=26, EQQ=27, NE=28, LT=29, GT=30, LE=31, GE=32, SIMP=33, WS=34, ID=35, 
		ORR=36, AND=37, NOT=38, OTRO=39;
	public static final int
		RULE_s = 0, RULE_programa = 1, RULE_instrucciones = 2, RULE_instruccion = 3, 
		RULE_puntoYComa = 4, RULE_iwhile = 5, RULE_iif = 6, RULE_ielse = 7, RULE_bloque = 8, 
		RULE_opal = 9, RULE_exp = 10, RULE_oplo = 11, RULE_ior = 12, RULE_iand = 13, 
		RULE_a = 14, RULE_cmp = 15, RULE_c = 16, RULE_e = 17, RULE_term = 18, 
		RULE_t = 19, RULE_factor = 20, RULE_ifor = 21, RULE_paramFor = 22, RULE_init = 23, 
		RULE_asignacion = 24, RULE_char = 25, RULE_cond = 26, RULE_condicionales = 27, 
		RULE_iiter = 28, RULE_proto = 29, RULE_func = 30, RULE_tipo = 31, RULE_var_func = 32, 
		RULE_parametro = 33, RULE_callFunc = 34, RULE_var = 35, RULE_incremento = 36, 
		RULE_decremento = 37, RULE_ireturn = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "programa", "instrucciones", "instruccion", "puntoYComa", "iwhile", 
			"iif", "ielse", "bloque", "opal", "exp", "oplo", "ior", "iand", "a", 
			"cmp", "c", "e", "term", "t", "factor", "ifor", "paramFor", "init", "asignacion", 
			"char", "cond", "condicionales", "iiter", "proto", "func", "tipo", "var_func", 
			"parametro", "callFunc", "var", "incremento", "decremento", "ireturn"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "';'", "','", "'while'", null, null, 
			"'for'", "'if'", "'else'", "'return'", "'int'", "'double'", "'char'", 
			"'float'", "'String'", "'bool'", "'void'", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'='", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'''", null, 
			null, "'||'", "'&&'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PA", "PC", "LLA", "LLC", "PYC", "COM", "WHILE", "FLOAT_LITERAL", 
			"NUMERO", "FOR", "IF", "ELSE", "RETURN", "INT", "DOUBLE", "CHAR", "FLOAT", 
			"STRING", "BOOLEAN", "VOID", "SUMA", "RESTA", "MULT", "DIV", "MOD", "ASIG", 
			"EQQ", "NE", "LT", "GT", "LE", "GE", "SIMP", "WS", "ID", "ORR", "AND", 
			"NOT", "OTRO"
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

	@Override
	public String getGrammarFileName() { return "compiladores.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public compiladoresParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SContext extends ParserRuleContext {
		public Token ID;
		public Token NUMERO;
		public Token OTRO;
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public TerminalNode NUMERO() { return getToken(compiladoresParser.NUMERO, 0); }
		public TerminalNode OTRO() { return getToken(compiladoresParser.OTRO, 0); }
		public TerminalNode EOF() { return getToken(compiladoresParser.EOF, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				((SContext)_localctx).ID = match(ID);
				print("ID ->" + (((SContext)_localctx).ID!=null?((SContext)_localctx).ID.getText():null) + "<--") 
				setState(80);
				s();
				}
				break;
			case NUMERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				((SContext)_localctx).NUMERO = match(NUMERO);
				print("NUMERO ->" + (((SContext)_localctx).NUMERO!=null?((SContext)_localctx).NUMERO.getText():null) + "<--") 
				setState(83);
				s();
				}
				break;
			case OTRO:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				((SContext)_localctx).OTRO = match(OTRO);
				print("Otro ->" + (((SContext)_localctx).OTRO!=null?((SContext)_localctx).OTRO.getText():null) + "<--") 
				setState(86);
				s();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(compiladoresParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			instrucciones();
			setState(91);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionesContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instrucciones);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LLA:
			case WHILE:
			case FOR:
			case IF:
			case RETURN:
			case INT:
			case DOUBLE:
			case CHAR:
			case FLOAT:
			case BOOLEAN:
			case VOID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				instruccion();
				setState(94);
				instrucciones();
				}
				break;
			case EOF:
			case LLC:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionContext extends ParserRuleContext {
		public PuntoYComaContext puntoYComa() {
			return getRuleContext(PuntoYComaContext.class,0);
		}
		public IwhileContext iwhile() {
			return getRuleContext(IwhileContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public IforContext ifor() {
			return getRuleContext(IforContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public IifContext iif() {
			return getRuleContext(IifContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instruccion);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				puntoYComa();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				iwhile();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				bloque();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				ifor();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
				func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(104);
				iif();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PuntoYComaContext extends ParserRuleContext {
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public TerminalNode PYC() { return getToken(compiladoresParser.PYC, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public ProtoContext proto() {
			return getRuleContext(ProtoContext.class,0);
		}
		public IreturnContext ireturn() {
			return getRuleContext(IreturnContext.class,0);
		}
		public CallFuncContext callFunc() {
			return getRuleContext(CallFuncContext.class,0);
		}
		public IncrementoContext incremento() {
			return getRuleContext(IncrementoContext.class,0);
		}
		public DecrementoContext decremento() {
			return getRuleContext(DecrementoContext.class,0);
		}
		public PuntoYComaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puntoYComa; }
	}

	public final PuntoYComaContext puntoYComa() throws RecognitionException {
		PuntoYComaContext _localctx = new PuntoYComaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_puntoYComa);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				init();
				setState(108);
				match(PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				asignacion();
				setState(111);
				match(PYC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				proto();
				setState(114);
				match(PYC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				ireturn();
				setState(117);
				match(PYC);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(119);
				callFunc();
				setState(120);
				match(PYC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(122);
				incremento();
				setState(123);
				match(PYC);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(125);
				decremento();
				setState(126);
				match(PYC);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IwhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(compiladoresParser.WHILE, 0); }
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public IwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iwhile; }
	}

	public final IwhileContext iwhile() throws RecognitionException {
		IwhileContext _localctx = new IwhileContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_iwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(WHILE);
			setState(131);
			match(PA);
			setState(132);
			opal();
			setState(133);
			match(PC);
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(134);
				bloque();
				}
				break;
			case 2:
				{
				setState(135);
				instruccion();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(compiladoresParser.IF, 0); }
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
		public IelseContext ielse() {
			return getRuleContext(IelseContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public IifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iif; }
	}

	public final IifContext iif() throws RecognitionException {
		IifContext _localctx = new IifContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_iif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(IF);
			setState(139);
			match(PA);
			setState(140);
			opal();
			setState(141);
			match(PC);
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(142);
				bloque();
				}
				break;
			case 2:
				{
				setState(143);
				instruccion();
				}
				break;
			}
			setState(146);
			ielse();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IelseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(compiladoresParser.ELSE, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public IifContext iif() {
			return getRuleContext(IifContext.class,0);
		}
		public IelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ielse; }
	}

	public final IelseContext ielse() throws RecognitionException {
		IelseContext _localctx = new IelseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ielse);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(ELSE);
				setState(149);
				bloque();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(ELSE);
				setState(151);
				iif();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LLA() { return getToken(compiladoresParser.LLA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LLC() { return getToken(compiladoresParser.LLC, 0); }
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(LLA);
			setState(156);
			instrucciones();
			setState(157);
			match(LLC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpalContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public OploContext oplo() {
			return getRuleContext(OploContext.class,0);
		}
		public CallFuncContext callFunc() {
			return getRuleContext(CallFuncContext.class,0);
		}
		public OpalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opal; }
	}

	public final OpalContext opal() throws RecognitionException {
		OpalContext _localctx = new OpalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_opal);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				oplo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				callFunc();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			term();
			setState(165);
			e();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OploContext extends ParserRuleContext {
		public IandContext iand() {
			return getRuleContext(IandContext.class,0);
		}
		public IorContext ior() {
			return getRuleContext(IorContext.class,0);
		}
		public OploContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oplo; }
	}

	public final OploContext oplo() throws RecognitionException {
		OploContext _localctx = new OploContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_oplo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			iand();
			setState(168);
			ior();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IorContext extends ParserRuleContext {
		public TerminalNode ORR() { return getToken(compiladoresParser.ORR, 0); }
		public IandContext iand() {
			return getRuleContext(IandContext.class,0);
		}
		public IorContext ior() {
			return getRuleContext(IorContext.class,0);
		}
		public IorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ior; }
	}

	public final IorContext ior() throws RecognitionException {
		IorContext _localctx = new IorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ior);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORR:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(ORR);
				setState(171);
				iand();
				setState(172);
				ior();
				}
				break;
			case PC:
			case PYC:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IandContext extends ParserRuleContext {
		public CmpContext cmp() {
			return getRuleContext(CmpContext.class,0);
		}
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public IandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iand; }
	}

	public final IandContext iand() throws RecognitionException {
		IandContext _localctx = new IandContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_iand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			cmp();
			setState(178);
			a();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(compiladoresParser.AND, 0); }
		public CmpContext cmp() {
			return getRuleContext(CmpContext.class,0);
		}
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a; }
	}

	public final AContext a() throws RecognitionException {
		AContext _localctx = new AContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_a);
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(AND);
				setState(181);
				cmp();
				setState(182);
				a();
				}
				break;
			case PC:
			case PYC:
			case ORR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmpContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public CmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp; }
	}

	public final CmpContext cmp() throws RecognitionException {
		CmpContext _localctx = new CmpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cmp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			exp();
			setState(188);
			c();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CContext extends ParserRuleContext {
		public TerminalNode EQQ() { return getToken(compiladoresParser.EQQ, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public TerminalNode NE() { return getToken(compiladoresParser.NE, 0); }
		public TerminalNode LT() { return getToken(compiladoresParser.LT, 0); }
		public TerminalNode GT() { return getToken(compiladoresParser.GT, 0); }
		public TerminalNode LE() { return getToken(compiladoresParser.LE, 0); }
		public TerminalNode GE() { return getToken(compiladoresParser.GE, 0); }
		public CContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c; }
	}

	public final CContext c() throws RecognitionException {
		CContext _localctx = new CContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_c);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(EQQ);
				setState(191);
				exp();
				setState(192);
				c();
				}
				break;
			case NE:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(NE);
				setState(195);
				exp();
				setState(196);
				c();
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				match(LT);
				setState(199);
				exp();
				setState(200);
				c();
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
				match(GT);
				setState(203);
				exp();
				setState(204);
				c();
				}
				break;
			case LE:
				enterOuterAlt(_localctx, 5);
				{
				setState(206);
				match(LE);
				setState(207);
				exp();
				setState(208);
				c();
				}
				break;
			case GE:
				enterOuterAlt(_localctx, 6);
				{
				setState(210);
				match(GE);
				setState(211);
				exp();
				setState(212);
				c();
				}
				break;
			case PC:
			case PYC:
			case ORR:
			case AND:
				enterOuterAlt(_localctx, 7);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(compiladoresParser.SUMA, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode RESTA() { return getToken(compiladoresParser.RESTA, 0); }
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_e);
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(SUMA);
				setState(218);
				term();
				setState(219);
				e();
				}
				break;
			case RESTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(RESTA);
				setState(222);
				term();
				setState(223);
				e();
				}
				break;
			case EOF:
			case PC:
			case PYC:
			case COM:
			case EQQ:
			case NE:
			case LT:
			case GT:
			case LE:
			case GE:
			case ORR:
			case AND:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			factor();
			setState(229);
			t();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(compiladoresParser.MULT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TerminalNode DIV() { return getToken(compiladoresParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(compiladoresParser.MOD, 0); }
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_t);
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(MULT);
				setState(232);
				factor();
				setState(233);
				t();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(DIV);
				setState(236);
				factor();
				setState(237);
				t();
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				match(MOD);
				setState(240);
				factor();
				setState(241);
				t();
				}
				break;
			case EOF:
			case PC:
			case PYC:
			case COM:
			case SUMA:
			case RESTA:
			case EQQ:
			case NE:
			case LT:
			case GT:
			case LE:
			case GE:
			case ORR:
			case AND:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(compiladoresParser.FLOAT_LITERAL, 0); }
		public TerminalNode NUMERO() { return getToken(compiladoresParser.NUMERO, 0); }
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_factor);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(FLOAT_LITERAL);
				}
				break;
			case NUMERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(NUMERO);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				match(ID);
				}
				break;
			case PA:
				enterOuterAlt(_localctx, 4);
				{
				setState(249);
				match(PA);
				setState(250);
				exp();
				setState(251);
				match(PC);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IforContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(compiladoresParser.FOR, 0); }
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public List<TerminalNode> PYC() { return getTokens(compiladoresParser.PYC); }
		public TerminalNode PYC(int i) {
			return getToken(compiladoresParser.PYC, i);
		}
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public ParamForContext paramFor() {
			return getRuleContext(ParamForContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public IforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifor; }
	}

	public final IforContext ifor() throws RecognitionException {
		IforContext _localctx = new IforContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ifor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(FOR);
			setState(256);
			match(PA);
			setState(257);
			asignacion();
			setState(258);
			match(PYC);
			setState(259);
			opal();
			setState(260);
			match(PYC);
			setState(261);
			paramFor();
			setState(262);
			match(PC);
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(263);
				bloque();
				}
				break;
			case 2:
				{
				setState(264);
				instruccion();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamForContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public IncrementoContext incremento() {
			return getRuleContext(IncrementoContext.class,0);
		}
		public DecrementoContext decremento() {
			return getRuleContext(DecrementoContext.class,0);
		}
		public ParamForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramFor; }
	}

	public final ParamForContext paramFor() throws RecognitionException {
		ParamForContext _localctx = new ParamForContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_paramFor);
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				incremento();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				decremento();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(compiladoresParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(compiladoresParser.ID, i);
		}
		public TerminalNode INT() { return getToken(compiladoresParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(compiladoresParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(compiladoresParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(compiladoresParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(compiladoresParser.CHAR, 0); }
		public List<TerminalNode> COM() { return getTokens(compiladoresParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(compiladoresParser.COM, i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 770048L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(273);
			match(ID);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(274);
				match(COM);
				setState(275);
				match(ID);
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public TerminalNode ASIG() { return getToken(compiladoresParser.ASIG, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public CharContext char_() {
			return getRuleContext(CharContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(ID);
			setState(282);
			match(ASIG);
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
			case FLOAT_LITERAL:
			case NUMERO:
			case ID:
				{
				setState(283);
				opal();
				}
				break;
			case SIMP:
				{
				setState(284);
				char_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CharContext extends ParserRuleContext {
		public List<TerminalNode> SIMP() { return getTokens(compiladoresParser.SIMP); }
		public TerminalNode SIMP(int i) {
			return getToken(compiladoresParser.SIMP, i);
		}
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public CharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char; }
	}

	public final CharContext char_() throws RecognitionException {
		CharContext _localctx = new CharContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(SIMP);
			setState(288);
			match(ID);
			setState(289);
			match(SIMP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public CondicionalesContext condicionales() {
			return getRuleContext(CondicionalesContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			term();
			setState(292);
			condicionales();
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
			case FLOAT_LITERAL:
			case NUMERO:
			case ID:
				{
				setState(293);
				term();
				}
				break;
			case EOF:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalesContext extends ParserRuleContext {
		public TerminalNode EQQ() { return getToken(compiladoresParser.EQQ, 0); }
		public TerminalNode LT() { return getToken(compiladoresParser.LT, 0); }
		public TerminalNode GT() { return getToken(compiladoresParser.GT, 0); }
		public TerminalNode LE() { return getToken(compiladoresParser.LE, 0); }
		public TerminalNode GE() { return getToken(compiladoresParser.GE, 0); }
		public CondicionalesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionales; }
	}

	public final CondicionalesContext condicionales() throws RecognitionException {
		CondicionalesContext _localctx = new CondicionalesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_condicionales);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8187281408L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IiterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public IiterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iiter; }
	}

	public final IiterContext iiter() throws RecognitionException {
		IiterContext _localctx = new IiterContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_iiter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(ID);
			setState(300);
			exp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProtoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
		public TerminalNode INT() { return getToken(compiladoresParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(compiladoresParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(compiladoresParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(compiladoresParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(compiladoresParser.CHAR, 0); }
		public TerminalNode VOID() { return getToken(compiladoresParser.VOID, 0); }
		public Var_funcContext var_func() {
			return getRuleContext(Var_funcContext.class,0);
		}
		public ProtoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proto; }
	}

	public final ProtoContext proto() throws RecognitionException {
		ProtoContext _localctx = new ProtoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_proto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1818624L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(303);
			match(ID);
			setState(304);
			match(PA);
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case CHAR:
			case FLOAT:
			case BOOLEAN:
			case VOID:
				{
				setState(305);
				var_func();
				}
				break;
			case PC:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(309);
			match(PC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Var_funcContext var_func() {
			return getRuleContext(Var_funcContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			tipo();
			setState(312);
			match(ID);
			setState(313);
			match(PA);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1818624L) != 0)) {
				{
				setState(314);
				var_func();
				}
			}

			setState(317);
			match(PC);
			setState(318);
			bloque();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(compiladoresParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(compiladoresParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(compiladoresParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(compiladoresParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(compiladoresParser.CHAR, 0); }
		public TerminalNode VOID() { return getToken(compiladoresParser.VOID, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1818624L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_funcContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> COM() { return getTokens(compiladoresParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(compiladoresParser.COM, i);
		}
		public Var_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_func; }
	}

	public final Var_funcContext var_func() throws RecognitionException {
		Var_funcContext _localctx = new Var_funcContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_var_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			parametro();
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(323);
				match(COM);
				setState(324);
				parametro();
				}
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			tipo();
			setState(331);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CallFuncContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public CallFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunc; }
	}

	public final CallFuncContext callFunc() throws RecognitionException {
		CallFuncContext _localctx = new CallFuncContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_callFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(ID);
			setState(334);
			match(PA);
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
			case FLOAT_LITERAL:
			case NUMERO:
			case ID:
				{
				setState(335);
				var();
				}
				break;
			case PC:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(339);
			match(PC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COM() { return getTokens(compiladoresParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(compiladoresParser.COM, i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			exp();
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(342);
				match(COM);
				setState(343);
				exp();
				}
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IncrementoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public List<TerminalNode> SUMA() { return getTokens(compiladoresParser.SUMA); }
		public TerminalNode SUMA(int i) {
			return getToken(compiladoresParser.SUMA, i);
		}
		public IncrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incremento; }
	}

	public final IncrementoContext incremento() throws RecognitionException {
		IncrementoContext _localctx = new IncrementoContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_incremento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(ID);
			setState(350);
			match(SUMA);
			setState(351);
			match(SUMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecrementoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public List<TerminalNode> RESTA() { return getTokens(compiladoresParser.RESTA); }
		public TerminalNode RESTA(int i) {
			return getToken(compiladoresParser.RESTA, i);
		}
		public DecrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decremento; }
	}

	public final DecrementoContext decremento() throws RecognitionException {
		DecrementoContext _localctx = new DecrementoContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_decremento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(ID);
			setState(354);
			match(RESTA);
			setState(355);
			match(RESTA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IreturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(compiladoresParser.RETURN, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public IreturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ireturn; }
	}

	public final IreturnContext ireturn() throws RecognitionException {
		IreturnContext _localctx = new IreturnContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_ireturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(RETURN);
			setState(358);
			opal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\'\u0169\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0003\u0000Y\b\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"b\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003j\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u0081\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u0089\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0091\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u009a\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\t\u0003\t\u00a3\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0003\f\u00b0\b\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00ba\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00d8\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u00e3\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u00f5\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00fe"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u010a"+
		"\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u010f\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0115\b\u0017"+
		"\n\u0017\f\u0017\u0118\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u011e\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0128"+
		"\b\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0134"+
		"\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u013c\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0005 \u0146\b \n \f \u0149\t"+
		" \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0152\b"+
		"\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0005#\u0159\b#\n#\f#\u015c\t"+
		"#\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001&\u0001"+
		"&\u0001&\u0001&\u0000\u0000\'\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJL\u0000"+
		"\u0003\u0002\u0000\u000e\u0011\u0013\u0013\u0002\u0000\u001b\u001b\u001d"+
		" \u0002\u0000\u000e\u0011\u0013\u0014\u0171\u0000X\u0001\u0000\u0000\u0000"+
		"\u0002Z\u0001\u0000\u0000\u0000\u0004a\u0001\u0000\u0000\u0000\u0006i"+
		"\u0001\u0000\u0000\u0000\b\u0080\u0001\u0000\u0000\u0000\n\u0082\u0001"+
		"\u0000\u0000\u0000\f\u008a\u0001\u0000\u0000\u0000\u000e\u0099\u0001\u0000"+
		"\u0000\u0000\u0010\u009b\u0001\u0000\u0000\u0000\u0012\u00a2\u0001\u0000"+
		"\u0000\u0000\u0014\u00a4\u0001\u0000\u0000\u0000\u0016\u00a7\u0001\u0000"+
		"\u0000\u0000\u0018\u00af\u0001\u0000\u0000\u0000\u001a\u00b1\u0001\u0000"+
		"\u0000\u0000\u001c\u00b9\u0001\u0000\u0000\u0000\u001e\u00bb\u0001\u0000"+
		"\u0000\u0000 \u00d7\u0001\u0000\u0000\u0000\"\u00e2\u0001\u0000\u0000"+
		"\u0000$\u00e4\u0001\u0000\u0000\u0000&\u00f4\u0001\u0000\u0000\u0000("+
		"\u00fd\u0001\u0000\u0000\u0000*\u00ff\u0001\u0000\u0000\u0000,\u010e\u0001"+
		"\u0000\u0000\u0000.\u0110\u0001\u0000\u0000\u00000\u0119\u0001\u0000\u0000"+
		"\u00002\u011f\u0001\u0000\u0000\u00004\u0123\u0001\u0000\u0000\u00006"+
		"\u0129\u0001\u0000\u0000\u00008\u012b\u0001\u0000\u0000\u0000:\u012e\u0001"+
		"\u0000\u0000\u0000<\u0137\u0001\u0000\u0000\u0000>\u0140\u0001\u0000\u0000"+
		"\u0000@\u0142\u0001\u0000\u0000\u0000B\u014a\u0001\u0000\u0000\u0000D"+
		"\u014d\u0001\u0000\u0000\u0000F\u0155\u0001\u0000\u0000\u0000H\u015d\u0001"+
		"\u0000\u0000\u0000J\u0161\u0001\u0000\u0000\u0000L\u0165\u0001\u0000\u0000"+
		"\u0000NO\u0005#\u0000\u0000OP\u0006\u0000\uffff\uffff\u0000PY\u0003\u0000"+
		"\u0000\u0000QR\u0005\t\u0000\u0000RS\u0006\u0000\uffff\uffff\u0000SY\u0003"+
		"\u0000\u0000\u0000TU\u0005\'\u0000\u0000UV\u0006\u0000\uffff\uffff\u0000"+
		"VY\u0003\u0000\u0000\u0000WY\u0005\u0000\u0000\u0001XN\u0001\u0000\u0000"+
		"\u0000XQ\u0001\u0000\u0000\u0000XT\u0001\u0000\u0000\u0000XW\u0001\u0000"+
		"\u0000\u0000Y\u0001\u0001\u0000\u0000\u0000Z[\u0003\u0004\u0002\u0000"+
		"[\\\u0005\u0000\u0000\u0001\\\u0003\u0001\u0000\u0000\u0000]^\u0003\u0006"+
		"\u0003\u0000^_\u0003\u0004\u0002\u0000_b\u0001\u0000\u0000\u0000`b\u0001"+
		"\u0000\u0000\u0000a]\u0001\u0000\u0000\u0000a`\u0001\u0000\u0000\u0000"+
		"b\u0005\u0001\u0000\u0000\u0000cj\u0003\b\u0004\u0000dj\u0003\n\u0005"+
		"\u0000ej\u0003\u0010\b\u0000fj\u0003*\u0015\u0000gj\u0003<\u001e\u0000"+
		"hj\u0003\f\u0006\u0000ic\u0001\u0000\u0000\u0000id\u0001\u0000\u0000\u0000"+
		"ie\u0001\u0000\u0000\u0000if\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000"+
		"\u0000ih\u0001\u0000\u0000\u0000j\u0007\u0001\u0000\u0000\u0000kl\u0003"+
		".\u0017\u0000lm\u0005\u0005\u0000\u0000m\u0081\u0001\u0000\u0000\u0000"+
		"no\u00030\u0018\u0000op\u0005\u0005\u0000\u0000p\u0081\u0001\u0000\u0000"+
		"\u0000qr\u0003:\u001d\u0000rs\u0005\u0005\u0000\u0000s\u0081\u0001\u0000"+
		"\u0000\u0000tu\u0003L&\u0000uv\u0005\u0005\u0000\u0000v\u0081\u0001\u0000"+
		"\u0000\u0000wx\u0003D\"\u0000xy\u0005\u0005\u0000\u0000y\u0081\u0001\u0000"+
		"\u0000\u0000z{\u0003H$\u0000{|\u0005\u0005\u0000\u0000|\u0081\u0001\u0000"+
		"\u0000\u0000}~\u0003J%\u0000~\u007f\u0005\u0005\u0000\u0000\u007f\u0081"+
		"\u0001\u0000\u0000\u0000\u0080k\u0001\u0000\u0000\u0000\u0080n\u0001\u0000"+
		"\u0000\u0000\u0080q\u0001\u0000\u0000\u0000\u0080t\u0001\u0000\u0000\u0000"+
		"\u0080w\u0001\u0000\u0000\u0000\u0080z\u0001\u0000\u0000\u0000\u0080}"+
		"\u0001\u0000\u0000\u0000\u0081\t\u0001\u0000\u0000\u0000\u0082\u0083\u0005"+
		"\u0007\u0000\u0000\u0083\u0084\u0005\u0001\u0000\u0000\u0084\u0085\u0003"+
		"\u0012\t\u0000\u0085\u0088\u0005\u0002\u0000\u0000\u0086\u0089\u0003\u0010"+
		"\b\u0000\u0087\u0089\u0003\u0006\u0003\u0000\u0088\u0086\u0001\u0000\u0000"+
		"\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u000b\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0005\u000b\u0000\u0000\u008b\u008c\u0005\u0001\u0000"+
		"\u0000\u008c\u008d\u0003\u0012\t\u0000\u008d\u0090\u0005\u0002\u0000\u0000"+
		"\u008e\u0091\u0003\u0010\b\u0000\u008f\u0091\u0003\u0006\u0003\u0000\u0090"+
		"\u008e\u0001\u0000\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0003\u000e\u0007\u0000\u0093"+
		"\r\u0001\u0000\u0000\u0000\u0094\u0095\u0005\f\u0000\u0000\u0095\u009a"+
		"\u0003\u0010\b\u0000\u0096\u0097\u0005\f\u0000\u0000\u0097\u009a\u0003"+
		"\f\u0006\u0000\u0098\u009a\u0001\u0000\u0000\u0000\u0099\u0094\u0001\u0000"+
		"\u0000\u0000\u0099\u0096\u0001\u0000\u0000\u0000\u0099\u0098\u0001\u0000"+
		"\u0000\u0000\u009a\u000f\u0001\u0000\u0000\u0000\u009b\u009c\u0005\u0003"+
		"\u0000\u0000\u009c\u009d\u0003\u0004\u0002\u0000\u009d\u009e\u0005\u0004"+
		"\u0000\u0000\u009e\u0011\u0001\u0000\u0000\u0000\u009f\u00a3\u0003\u0014"+
		"\n\u0000\u00a0\u00a3\u0003\u0016\u000b\u0000\u00a1\u00a3\u0003D\"\u0000"+
		"\u00a2\u009f\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u0013\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0003$\u0012\u0000\u00a5\u00a6\u0003\"\u0011\u0000\u00a6"+
		"\u0015\u0001\u0000\u0000\u0000\u00a7\u00a8\u0003\u001a\r\u0000\u00a8\u00a9"+
		"\u0003\u0018\f\u0000\u00a9\u0017\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005"+
		"$\u0000\u0000\u00ab\u00ac\u0003\u001a\r\u0000\u00ac\u00ad\u0003\u0018"+
		"\f\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00b0\u0001\u0000\u0000"+
		"\u0000\u00af\u00aa\u0001\u0000\u0000\u0000\u00af\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b0\u0019\u0001\u0000\u0000\u0000\u00b1\u00b2\u0003\u001e\u000f"+
		"\u0000\u00b2\u00b3\u0003\u001c\u000e\u0000\u00b3\u001b\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0005%\u0000\u0000\u00b5\u00b6\u0003\u001e\u000f\u0000"+
		"\u00b6\u00b7\u0003\u001c\u000e\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000"+
		"\u00b8\u00ba\u0001\u0000\u0000\u0000\u00b9\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba\u001d\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bc\u0003\u0014\n\u0000\u00bc\u00bd\u0003 \u0010\u0000\u00bd"+
		"\u001f\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\u001b\u0000\u0000\u00bf"+
		"\u00c0\u0003\u0014\n\u0000\u00c0\u00c1\u0003 \u0010\u0000\u00c1\u00d8"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\u001c\u0000\u0000\u00c3\u00c4"+
		"\u0003\u0014\n\u0000\u00c4\u00c5\u0003 \u0010\u0000\u00c5\u00d8\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0005\u001d\u0000\u0000\u00c7\u00c8\u0003"+
		"\u0014\n\u0000\u00c8\u00c9\u0003 \u0010\u0000\u00c9\u00d8\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u0005\u001e\u0000\u0000\u00cb\u00cc\u0003\u0014"+
		"\n\u0000\u00cc\u00cd\u0003 \u0010\u0000\u00cd\u00d8\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0005\u001f\u0000\u0000\u00cf\u00d0\u0003\u0014\n\u0000"+
		"\u00d0\u00d1\u0003 \u0010\u0000\u00d1\u00d8\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d3\u0005 \u0000\u0000\u00d3\u00d4\u0003\u0014\n\u0000\u00d4\u00d5"+
		"\u0003 \u0010\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d7\u00be\u0001\u0000\u0000\u0000\u00d7\u00c2\u0001"+
		"\u0000\u0000\u0000\u00d7\u00c6\u0001\u0000\u0000\u0000\u00d7\u00ca\u0001"+
		"\u0000\u0000\u0000\u00d7\u00ce\u0001\u0000\u0000\u0000\u00d7\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8!\u0001\u0000"+
		"\u0000\u0000\u00d9\u00da\u0005\u0015\u0000\u0000\u00da\u00db\u0003$\u0012"+
		"\u0000\u00db\u00dc\u0003\"\u0011\u0000\u00dc\u00e3\u0001\u0000\u0000\u0000"+
		"\u00dd\u00de\u0005\u0016\u0000\u0000\u00de\u00df\u0003$\u0012\u0000\u00df"+
		"\u00e0\u0003\"\u0011\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e2\u00d9\u0001\u0000\u0000\u0000\u00e2\u00dd"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e3#\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e5\u0003(\u0014\u0000\u00e5\u00e6\u0003&\u0013"+
		"\u0000\u00e6%\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005\u0017\u0000\u0000"+
		"\u00e8\u00e9\u0003(\u0014\u0000\u00e9\u00ea\u0003&\u0013\u0000\u00ea\u00f5"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005\u0018\u0000\u0000\u00ec\u00ed"+
		"\u0003(\u0014\u0000\u00ed\u00ee\u0003&\u0013\u0000\u00ee\u00f5\u0001\u0000"+
		"\u0000\u0000\u00ef\u00f0\u0005\u0019\u0000\u0000\u00f0\u00f1\u0003(\u0014"+
		"\u0000\u00f1\u00f2\u0003&\u0013\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00e7\u0001\u0000\u0000\u0000"+
		"\u00f4\u00eb\u0001\u0000\u0000\u0000\u00f4\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f5\'\u0001\u0000\u0000\u0000\u00f6"+
		"\u00fe\u0005\b\u0000\u0000\u00f7\u00fe\u0005\t\u0000\u0000\u00f8\u00fe"+
		"\u0005#\u0000\u0000\u00f9\u00fa\u0005\u0001\u0000\u0000\u00fa\u00fb\u0003"+
		"\u0014\n\u0000\u00fb\u00fc\u0005\u0002\u0000\u0000\u00fc\u00fe\u0001\u0000"+
		"\u0000\u0000\u00fd\u00f6\u0001\u0000\u0000\u0000\u00fd\u00f7\u0001\u0000"+
		"\u0000\u0000\u00fd\u00f8\u0001\u0000\u0000\u0000\u00fd\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fe)\u0001\u0000\u0000\u0000\u00ff\u0100\u0005\n\u0000"+
		"\u0000\u0100\u0101\u0005\u0001\u0000\u0000\u0101\u0102\u00030\u0018\u0000"+
		"\u0102\u0103\u0005\u0005\u0000\u0000\u0103\u0104\u0003\u0012\t\u0000\u0104"+
		"\u0105\u0005\u0005\u0000\u0000\u0105\u0106\u0003,\u0016\u0000\u0106\u0109"+
		"\u0005\u0002\u0000\u0000\u0107\u010a\u0003\u0010\b\u0000\u0108\u010a\u0003"+
		"\u0006\u0003\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u0108\u0001"+
		"\u0000\u0000\u0000\u010a+\u0001\u0000\u0000\u0000\u010b\u010f\u00030\u0018"+
		"\u0000\u010c\u010f\u0003H$\u0000\u010d\u010f\u0003J%\u0000\u010e\u010b"+
		"\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010d"+
		"\u0001\u0000\u0000\u0000\u010f-\u0001\u0000\u0000\u0000\u0110\u0111\u0007"+
		"\u0000\u0000\u0000\u0111\u0116\u0005#\u0000\u0000\u0112\u0113\u0005\u0006"+
		"\u0000\u0000\u0113\u0115\u0005#\u0000\u0000\u0114\u0112\u0001\u0000\u0000"+
		"\u0000\u0115\u0118\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117/\u0001\u0000\u0000\u0000"+
		"\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u011a\u0005#\u0000\u0000\u011a"+
		"\u011d\u0005\u001a\u0000\u0000\u011b\u011e\u0003\u0012\t\u0000\u011c\u011e"+
		"\u00032\u0019\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d\u011c\u0001"+
		"\u0000\u0000\u0000\u011e1\u0001\u0000\u0000\u0000\u011f\u0120\u0005!\u0000"+
		"\u0000\u0120\u0121\u0005#\u0000\u0000\u0121\u0122\u0005!\u0000\u0000\u0122"+
		"3\u0001\u0000\u0000\u0000\u0123\u0124\u0003$\u0012\u0000\u0124\u0127\u0003"+
		"6\u001b\u0000\u0125\u0128\u0003$\u0012\u0000\u0126\u0128\u0001\u0000\u0000"+
		"\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0127\u0126\u0001\u0000\u0000"+
		"\u0000\u01285\u0001\u0000\u0000\u0000\u0129\u012a\u0007\u0001\u0000\u0000"+
		"\u012a7\u0001\u0000\u0000\u0000\u012b\u012c\u0005#\u0000\u0000\u012c\u012d"+
		"\u0003\u0014\n\u0000\u012d9\u0001\u0000\u0000\u0000\u012e\u012f\u0007"+
		"\u0002\u0000\u0000\u012f\u0130\u0005#\u0000\u0000\u0130\u0133\u0005\u0001"+
		"\u0000\u0000\u0131\u0134\u0003@ \u0000\u0132\u0134\u0001\u0000\u0000\u0000"+
		"\u0133\u0131\u0001\u0000\u0000\u0000\u0133\u0132\u0001\u0000\u0000\u0000"+
		"\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0136\u0005\u0002\u0000\u0000"+
		"\u0136;\u0001\u0000\u0000\u0000\u0137\u0138\u0003>\u001f\u0000\u0138\u0139"+
		"\u0005#\u0000\u0000\u0139\u013b\u0005\u0001\u0000\u0000\u013a\u013c\u0003"+
		"@ \u0000\u013b\u013a\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000"+
		"\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013e\u0005\u0002\u0000"+
		"\u0000\u013e\u013f\u0003\u0010\b\u0000\u013f=\u0001\u0000\u0000\u0000"+
		"\u0140\u0141\u0007\u0002\u0000\u0000\u0141?\u0001\u0000\u0000\u0000\u0142"+
		"\u0147\u0003B!\u0000\u0143\u0144\u0005\u0006\u0000\u0000\u0144\u0146\u0003"+
		"B!\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0146\u0149\u0001\u0000\u0000"+
		"\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000"+
		"\u0000\u0148A\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000"+
		"\u014a\u014b\u0003>\u001f\u0000\u014b\u014c\u0005#\u0000\u0000\u014cC"+
		"\u0001\u0000\u0000\u0000\u014d\u014e\u0005#\u0000\u0000\u014e\u0151\u0005"+
		"\u0001\u0000\u0000\u014f\u0152\u0003F#\u0000\u0150\u0152\u0001\u0000\u0000"+
		"\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0151\u0150\u0001\u0000\u0000"+
		"\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0154\u0005\u0002\u0000"+
		"\u0000\u0154E\u0001\u0000\u0000\u0000\u0155\u015a\u0003\u0014\n\u0000"+
		"\u0156\u0157\u0005\u0006\u0000\u0000\u0157\u0159\u0003\u0014\n\u0000\u0158"+
		"\u0156\u0001\u0000\u0000\u0000\u0159\u015c\u0001\u0000\u0000\u0000\u015a"+
		"\u0158\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b"+
		"G\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015d\u015e"+
		"\u0005#\u0000\u0000\u015e\u015f\u0005\u0015\u0000\u0000\u015f\u0160\u0005"+
		"\u0015\u0000\u0000\u0160I\u0001\u0000\u0000\u0000\u0161\u0162\u0005#\u0000"+
		"\u0000\u0162\u0163\u0005\u0016\u0000\u0000\u0163\u0164\u0005\u0016\u0000"+
		"\u0000\u0164K\u0001\u0000\u0000\u0000\u0165\u0166\u0005\r\u0000\u0000"+
		"\u0166\u0167\u0003\u0012\t\u0000\u0167M\u0001\u0000\u0000\u0000\u0018"+
		"Xai\u0080\u0088\u0090\u0099\u00a2\u00af\u00b9\u00d7\u00e2\u00f4\u00fd"+
		"\u0109\u010e\u0116\u011d\u0127\u0133\u013b\u0147\u0151\u015a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}