// Generated from /home/eduardo/DHS/desarrollo-herramientas-software/DHS/dhs/src/main/python/dhs/compiladores.g4 by ANTLR 4.13.1
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
		PA=1, PC=2, LLA=3, LLC=4, PYC=5, WHILE=6, NUMERO=7, INT=8, SUMA=9, RESTA=10, 
		MULT=11, DIV=12, MOD=13, ASIG=14, EQQ=15, NE=16, LT=17, GT=18, LE=19, 
		GE=20, WS=21, ID=22, FOR=23, ORR=24, AND=25;
	public static final int
		RULE_programa = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_operador = 3, 
		RULE_declaracion = 4, RULE_asignacion = 5, RULE_opal = 6, RULE_exp = 7, 
		RULE_e = 8, RULE_term = 9, RULE_t = 10, RULE_factor = 11, RULE_iwhile = 12, 
		RULE_bloque = 13, RULE_ifor = 14, RULE_oplo = 15, RULE_expresion_logica = 16, 
		RULE_termino_logico = 17, RULE_term_logico = 18, RULE_factor_logico = 19, 
		RULE_comp = 20, RULE_init = 21, RULE_cond = 22, RULE_iter = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instrucciones", "instruccion", "operador", "declaracion", 
			"asignacion", "opal", "exp", "e", "term", "t", "factor", "iwhile", "bloque", 
			"ifor", "oplo", "expresion_logica", "termino_logico", "term_logico", 
			"factor_logico", "comp", "init", "cond", "iter"
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
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			instrucciones();
			setState(49);
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
		enterRule(_localctx, 2, RULE_instrucciones);
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				instruccion();
				setState(52);
				instrucciones();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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
	public static class InstruccionContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
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
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				declaracion();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				iwhile();
				}
				break;
			case LLA:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				bloque();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				ifor();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
				asignacion();
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
	public static class OperadorContext extends ParserRuleContext {
		public TerminalNode EQQ() { return getToken(compiladoresParser.EQQ, 0); }
		public TerminalNode NE() { return getToken(compiladoresParser.NE, 0); }
		public TerminalNode GT() { return getToken(compiladoresParser.GT, 0); }
		public TerminalNode LT() { return getToken(compiladoresParser.LT, 0); }
		public TerminalNode GE() { return getToken(compiladoresParser.GE, 0); }
		public TerminalNode LE() { return getToken(compiladoresParser.LE, 0); }
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2064384L) != 0)) ) {
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
	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(compiladoresParser.INT, 0); }
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public TerminalNode PYC() { return getToken(compiladoresParser.PYC, 0); }
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(INT);
			setState(67);
			match(ID);
			setState(68);
			match(PYC);
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
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(ID);
			setState(71);
			match(ASIG);
			setState(72);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpalContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public OpalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opal; }
	}

	public final OpalContext opal() throws RecognitionException {
		OpalContext _localctx = new OpalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_opal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
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
		enterRule(_localctx, 14, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			term();
			setState(77);
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
		enterRule(_localctx, 16, RULE_e);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(SUMA);
				setState(80);
				term();
				setState(81);
				e();
				}
				break;
			case RESTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(RESTA);
				setState(84);
				term();
				setState(85);
				e();
				}
				break;
			case EOF:
			case PC:
			case LLA:
			case LLC:
			case PYC:
			case WHILE:
			case INT:
			case ID:
			case FOR:
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
		enterRule(_localctx, 18, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			factor();
			setState(91);
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
		enterRule(_localctx, 20, RULE_t);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(MULT);
				setState(94);
				factor();
				setState(95);
				t();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(DIV);
				setState(98);
				factor();
				setState(99);
				t();
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				match(MOD);
				setState(102);
				factor();
				setState(103);
				t();
				}
				break;
			case EOF:
			case PC:
			case LLA:
			case LLC:
			case PYC:
			case WHILE:
			case INT:
			case SUMA:
			case RESTA:
			case ID:
			case FOR:
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
		public TerminalNode NUMERO() { return getToken(compiladoresParser.NUMERO, 0); }
		public TerminalNode RESTA() { return getToken(compiladoresParser.RESTA, 0); }
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
		enterRule(_localctx, 22, RULE_factor);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(110);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RESTA:
					{
					setState(108);
					match(RESTA);
					}
					break;
				case NUMERO:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(112);
				match(NUMERO);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(115);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RESTA:
					{
					setState(113);
					match(RESTA);
					}
					break;
				case ID:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(117);
				match(ID);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				match(PA);
				setState(119);
				exp();
				setState(120);
				match(PC);
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
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
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
		enterRule(_localctx, 24, RULE_iwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(WHILE);
			setState(125);
			match(PA);
			setState(126);
			match(ID);
			setState(127);
			match(PC);
			setState(128);
			instruccion();
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
		enterRule(_localctx, 26, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(LLA);
			setState(131);
			instrucciones();
			setState(132);
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
	public static class IforContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(compiladoresParser.FOR, 0); }
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<TerminalNode> PYC() { return getTokens(compiladoresParser.PYC); }
		public TerminalNode PYC(int i) {
			return getToken(compiladoresParser.PYC, i);
		}
		public OploContext oplo() {
			return getRuleContext(OploContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public IforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifor; }
	}

	public final IforContext ifor() throws RecognitionException {
		IforContext _localctx = new IforContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(FOR);
			setState(135);
			match(PA);
			setState(136);
			asignacion();
			setState(137);
			match(PYC);
			setState(138);
			oplo();
			setState(139);
			match(PYC);
			setState(140);
			asignacion();
			setState(141);
			match(PC);
			setState(142);
			instrucciones();
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
		public Expresion_logicaContext expresion_logica() {
			return getRuleContext(Expresion_logicaContext.class,0);
		}
		public OploContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oplo; }
	}

	public final OploContext oplo() throws RecognitionException {
		OploContext _localctx = new OploContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_oplo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			expresion_logica();
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
	public static class Expresion_logicaContext extends ParserRuleContext {
		public TerminalNode ORR() { return getToken(compiladoresParser.ORR, 0); }
		public Termino_logicoContext termino_logico() {
			return getRuleContext(Termino_logicoContext.class,0);
		}
		public Expresion_logicaContext expresion_logica() {
			return getRuleContext(Expresion_logicaContext.class,0);
		}
		public Expresion_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_logica; }
	}

	public final Expresion_logicaContext expresion_logica() throws RecognitionException {
		Expresion_logicaContext _localctx = new Expresion_logicaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expresion_logica);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(ORR);
				setState(147);
				termino_logico();
				setState(148);
				expresion_logica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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
	public static class Termino_logicoContext extends ParserRuleContext {
		public Factor_logicoContext factor_logico() {
			return getRuleContext(Factor_logicoContext.class,0);
		}
		public Term_logicoContext term_logico() {
			return getRuleContext(Term_logicoContext.class,0);
		}
		public Termino_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino_logico; }
	}

	public final Termino_logicoContext termino_logico() throws RecognitionException {
		Termino_logicoContext _localctx = new Termino_logicoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_termino_logico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			factor_logico();
			setState(154);
			term_logico();
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
	public static class Term_logicoContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(compiladoresParser.AND, 0); }
		public Factor_logicoContext factor_logico() {
			return getRuleContext(Factor_logicoContext.class,0);
		}
		public Term_logicoContext term_logico() {
			return getRuleContext(Term_logicoContext.class,0);
		}
		public Term_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_logico; }
	}

	public final Term_logicoContext term_logico() throws RecognitionException {
		Term_logicoContext _localctx = new Term_logicoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_term_logico);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(AND);
				setState(157);
				factor_logico();
				setState(158);
				term_logico();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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
	public static class Factor_logicoContext extends ParserRuleContext {
		public OploContext oplo() {
			return getRuleContext(OploContext.class,0);
		}
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public Expresion_logicaContext expresion_logica() {
			return getRuleContext(Expresion_logicaContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
		public Factor_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_logico; }
	}

	public final Factor_logicoContext factor_logico() throws RecognitionException {
		Factor_logicoContext _localctx = new Factor_logicoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_factor_logico);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				oplo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				comp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(165);
				match(PA);
				setState(166);
				expresion_logica();
				setState(167);
				match(PC);
				}
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
	public static class CompContext extends ParserRuleContext {
		public List<OploContext> oplo() {
			return getRuleContexts(OploContext.class);
		}
		public OploContext oplo(int i) {
			return getRuleContext(OploContext.class,i);
		}
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public List<CompContext> comp() {
			return getRuleContexts(CompContext.class);
		}
		public CompContext comp(int i) {
			return getRuleContext(CompContext.class,i);
		}
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
	}

	public final CompContext comp() throws RecognitionException {
		return comp(0);
	}

	private CompContext comp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CompContext _localctx = new CompContext(_ctx, _parentState);
		CompContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_comp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(172);
			oplo();
			setState(173);
			operador();
			setState(174);
			oplo();
			}
			_ctx.stop = _input.LT(-1);
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CompContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_comp);
					setState(176);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(177);
					operador();
					setState(178);
					comp(2);
					}
					} 
				}
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitContext extends ParserRuleContext {
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
	public static class IterContext extends ParserRuleContext {
		public IterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iter; }
	}

	public final IterContext iter() throws RecognitionException {
		IterContext _localctx = new IterContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_iter);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return comp_sempred((CompContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean comp_sempred(CompContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0019\u00c0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u00018\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002?\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\bY\b\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\nk\b\n\u0001\u000b\u0001\u000b\u0003\u000bo\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000bt\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b{\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0098\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u00a2\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00aa\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00b5\b\u0014\n\u0014"+
		"\f\u0014\u00b8\t\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0000\u0001(\u0018\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.\u0000\u0001\u0001\u0000\u000f\u0014\u00ba\u00000\u0001\u0000\u0000"+
		"\u0000\u00027\u0001\u0000\u0000\u0000\u0004>\u0001\u0000\u0000\u0000\u0006"+
		"@\u0001\u0000\u0000\u0000\bB\u0001\u0000\u0000\u0000\nF\u0001\u0000\u0000"+
		"\u0000\fJ\u0001\u0000\u0000\u0000\u000eL\u0001\u0000\u0000\u0000\u0010"+
		"X\u0001\u0000\u0000\u0000\u0012Z\u0001\u0000\u0000\u0000\u0014j\u0001"+
		"\u0000\u0000\u0000\u0016z\u0001\u0000\u0000\u0000\u0018|\u0001\u0000\u0000"+
		"\u0000\u001a\u0082\u0001\u0000\u0000\u0000\u001c\u0086\u0001\u0000\u0000"+
		"\u0000\u001e\u0090\u0001\u0000\u0000\u0000 \u0097\u0001\u0000\u0000\u0000"+
		"\"\u0099\u0001\u0000\u0000\u0000$\u00a1\u0001\u0000\u0000\u0000&\u00a9"+
		"\u0001\u0000\u0000\u0000(\u00ab\u0001\u0000\u0000\u0000*\u00b9\u0001\u0000"+
		"\u0000\u0000,\u00bb\u0001\u0000\u0000\u0000.\u00bd\u0001\u0000\u0000\u0000"+
		"01\u0003\u0002\u0001\u000012\u0005\u0000\u0000\u00012\u0001\u0001\u0000"+
		"\u0000\u000034\u0003\u0004\u0002\u000045\u0003\u0002\u0001\u000058\u0001"+
		"\u0000\u0000\u000068\u0001\u0000\u0000\u000073\u0001\u0000\u0000\u0000"+
		"76\u0001\u0000\u0000\u00008\u0003\u0001\u0000\u0000\u00009?\u0003\b\u0004"+
		"\u0000:?\u0003\u0018\f\u0000;?\u0003\u001a\r\u0000<?\u0003\u001c\u000e"+
		"\u0000=?\u0003\n\u0005\u0000>9\u0001\u0000\u0000\u0000>:\u0001\u0000\u0000"+
		"\u0000>;\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>=\u0001\u0000"+
		"\u0000\u0000?\u0005\u0001\u0000\u0000\u0000@A\u0007\u0000\u0000\u0000"+
		"A\u0007\u0001\u0000\u0000\u0000BC\u0005\b\u0000\u0000CD\u0005\u0016\u0000"+
		"\u0000DE\u0005\u0005\u0000\u0000E\t\u0001\u0000\u0000\u0000FG\u0005\u0016"+
		"\u0000\u0000GH\u0005\u000e\u0000\u0000HI\u0003\f\u0006\u0000I\u000b\u0001"+
		"\u0000\u0000\u0000JK\u0003\u000e\u0007\u0000K\r\u0001\u0000\u0000\u0000"+
		"LM\u0003\u0012\t\u0000MN\u0003\u0010\b\u0000N\u000f\u0001\u0000\u0000"+
		"\u0000OP\u0005\t\u0000\u0000PQ\u0003\u0012\t\u0000QR\u0003\u0010\b\u0000"+
		"RY\u0001\u0000\u0000\u0000ST\u0005\n\u0000\u0000TU\u0003\u0012\t\u0000"+
		"UV\u0003\u0010\b\u0000VY\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000\u0000"+
		"XO\u0001\u0000\u0000\u0000XS\u0001\u0000\u0000\u0000XW\u0001\u0000\u0000"+
		"\u0000Y\u0011\u0001\u0000\u0000\u0000Z[\u0003\u0016\u000b\u0000[\\\u0003"+
		"\u0014\n\u0000\\\u0013\u0001\u0000\u0000\u0000]^\u0005\u000b\u0000\u0000"+
		"^_\u0003\u0016\u000b\u0000_`\u0003\u0014\n\u0000`k\u0001\u0000\u0000\u0000"+
		"ab\u0005\f\u0000\u0000bc\u0003\u0016\u000b\u0000cd\u0003\u0014\n\u0000"+
		"dk\u0001\u0000\u0000\u0000ef\u0005\r\u0000\u0000fg\u0003\u0016\u000b\u0000"+
		"gh\u0003\u0014\n\u0000hk\u0001\u0000\u0000\u0000ik\u0001\u0000\u0000\u0000"+
		"j]\u0001\u0000\u0000\u0000ja\u0001\u0000\u0000\u0000je\u0001\u0000\u0000"+
		"\u0000ji\u0001\u0000\u0000\u0000k\u0015\u0001\u0000\u0000\u0000lo\u0005"+
		"\n\u0000\u0000mo\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000nm\u0001"+
		"\u0000\u0000\u0000op\u0001\u0000\u0000\u0000p{\u0005\u0007\u0000\u0000"+
		"qt\u0005\n\u0000\u0000rt\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000"+
		"sr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u{\u0005\u0016\u0000"+
		"\u0000vw\u0005\u0001\u0000\u0000wx\u0003\u000e\u0007\u0000xy\u0005\u0002"+
		"\u0000\u0000y{\u0001\u0000\u0000\u0000zn\u0001\u0000\u0000\u0000zs\u0001"+
		"\u0000\u0000\u0000zv\u0001\u0000\u0000\u0000{\u0017\u0001\u0000\u0000"+
		"\u0000|}\u0005\u0006\u0000\u0000}~\u0005\u0001\u0000\u0000~\u007f\u0005"+
		"\u0016\u0000\u0000\u007f\u0080\u0005\u0002\u0000\u0000\u0080\u0081\u0003"+
		"\u0004\u0002\u0000\u0081\u0019\u0001\u0000\u0000\u0000\u0082\u0083\u0005"+
		"\u0003\u0000\u0000\u0083\u0084\u0003\u0002\u0001\u0000\u0084\u0085\u0005"+
		"\u0004\u0000\u0000\u0085\u001b\u0001\u0000\u0000\u0000\u0086\u0087\u0005"+
		"\u0017\u0000\u0000\u0087\u0088\u0005\u0001\u0000\u0000\u0088\u0089\u0003"+
		"\n\u0005\u0000\u0089\u008a\u0005\u0005\u0000\u0000\u008a\u008b\u0003\u001e"+
		"\u000f\u0000\u008b\u008c\u0005\u0005\u0000\u0000\u008c\u008d\u0003\n\u0005"+
		"\u0000\u008d\u008e\u0005\u0002\u0000\u0000\u008e\u008f\u0003\u0002\u0001"+
		"\u0000\u008f\u001d\u0001\u0000\u0000\u0000\u0090\u0091\u0003 \u0010\u0000"+
		"\u0091\u001f\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u0018\u0000\u0000"+
		"\u0093\u0094\u0003\"\u0011\u0000\u0094\u0095\u0003 \u0010\u0000\u0095"+
		"\u0098\u0001\u0000\u0000\u0000\u0096\u0098\u0001\u0000\u0000\u0000\u0097"+
		"\u0092\u0001\u0000\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098"+
		"!\u0001\u0000\u0000\u0000\u0099\u009a\u0003&\u0013\u0000\u009a\u009b\u0003"+
		"$\u0012\u0000\u009b#\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u0019\u0000"+
		"\u0000\u009d\u009e\u0003&\u0013\u0000\u009e\u009f\u0003$\u0012\u0000\u009f"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1"+
		"\u009c\u0001\u0000\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2"+
		"%\u0001\u0000\u0000\u0000\u00a3\u00aa\u0003\u001e\u000f\u0000\u00a4\u00aa"+
		"\u0003(\u0014\u0000\u00a5\u00a6\u0005\u0001\u0000\u0000\u00a6\u00a7\u0003"+
		" \u0010\u0000\u00a7\u00a8\u0005\u0002\u0000\u0000\u00a8\u00aa\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a3\u0001\u0000\u0000\u0000\u00a9\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a5\u0001\u0000\u0000\u0000\u00aa\'\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0006\u0014\uffff\uffff\u0000\u00ac\u00ad\u0003\u001e"+
		"\u000f\u0000\u00ad\u00ae\u0003\u0006\u0003\u0000\u00ae\u00af\u0003\u001e"+
		"\u000f\u0000\u00af\u00b6\u0001\u0000\u0000\u0000\u00b0\u00b1\n\u0001\u0000"+
		"\u0000\u00b1\u00b2\u0003\u0006\u0003\u0000\u00b2\u00b3\u0003(\u0014\u0002"+
		"\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7)\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba"+
		"+\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc-\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be/\u0001\u0000"+
		"\u0000\u0000\u000b7>Xjnsz\u0097\u00a1\u00a9\u00b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}