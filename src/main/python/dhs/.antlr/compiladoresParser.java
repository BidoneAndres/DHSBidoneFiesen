// Generated from /home/eduardo/DHS/DHSBidoneFiesen/DHS/dhs/src/main/python/dhs/compiladores.g4 by ANTLR 4.13.1
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
		PA=1, PC=2, LLA=3, LLC=4, PYC=5, WHILE=6, NUMERO=7, FOR=8, INT=9, SUMA=10, 
		RESTA=11, MULT=12, DIV=13, MOD=14, ASIG=15, EQQ=16, NE=17, LT=18, GT=19, 
		LE=20, GE=21, WS=22, ID=23, ORR=24, AND=25, NOT=26, OTRO=27, NOMBRE=28;
	public static final int
		RULE_s = 0, RULE_programa = 1, RULE_instrucciones = 2, RULE_instruccion = 3, 
		RULE_operador = 4, RULE_asignacion = 5, RULE_declaracion = 6, RULE_iwhile = 7, 
		RULE_bloque = 8, RULE_opal = 9, RULE_exp = 10, RULE_e = 11, RULE_term = 12, 
		RULE_t = 13, RULE_factor = 14, RULE_ifor = 15, RULE_oplo = 16, RULE_expresion_logica = 17, 
		RULE_termino_logico = 18, RULE_term_logico = 19, RULE_factor_logico = 20, 
		RULE_comp = 21, RULE_init = 22, RULE_val = 23, RULE_cond = 24, RULE_condicionales = 25, 
		RULE_iter = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "programa", "instrucciones", "instruccion", "operador", "asignacion", 
			"declaracion", "iwhile", "bloque", "opal", "exp", "e", "term", "t", "factor", 
			"ifor", "oplo", "expresion_logica", "termino_logico", "term_logico", 
			"factor_logico", "comp", "init", "val", "cond", "condicionales", "iter"
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
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				((SContext)_localctx).ID = match(ID);
				print("ID ->" + (((SContext)_localctx).ID!=null?((SContext)_localctx).ID.getText():null) + "<--") 
				setState(56);
				s();
				}
				break;
			case NUMERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				((SContext)_localctx).NUMERO = match(NUMERO);
				print("NUMERO ->" + (((SContext)_localctx).NUMERO!=null?((SContext)_localctx).NUMERO.getText():null) + "<--") 
				setState(59);
				s();
				}
				break;
			case OTRO:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				((SContext)_localctx).OTRO = match(OTRO);
				print("Otro ->" + (((SContext)_localctx).OTRO!=null?((SContext)_localctx).OTRO.getText():null) + "<--") 
				setState(62);
				s();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
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
			setState(66);
			instrucciones();
			setState(67);
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
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LLA:
			case WHILE:
			case INT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				instruccion();
				setState(70);
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
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public IwhileContext iwhile() {
			return getRuleContext(IwhileContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
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
		enterRule(_localctx, 6, RULE_instruccion);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				declaracion();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				iwhile();
				}
				break;
			case LLA:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				bloque();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
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
		enterRule(_localctx, 8, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4128768L) != 0)) ) {
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
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public TerminalNode ASIG() { return getToken(compiladoresParser.ASIG, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public TerminalNode PYC() { return getToken(compiladoresParser.PYC, 0); }
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
			setState(83);
			match(ID);
			setState(84);
			match(ASIG);
			setState(85);
			opal();
			setState(86);
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
		enterRule(_localctx, 12, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(INT);
			setState(89);
			match(ID);
			setState(90);
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
		enterRule(_localctx, 14, RULE_iwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(WHILE);
			setState(93);
			match(PA);
			setState(94);
			match(ID);
			setState(95);
			match(PC);
			setState(96);
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
		enterRule(_localctx, 16, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(LLA);
			setState(99);
			instrucciones();
			setState(100);
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
		public OpalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opal; }
	}

	public final OpalContext opal() throws RecognitionException {
		OpalContext _localctx = new OpalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_opal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
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
		enterRule(_localctx, 20, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			term();
			setState(105);
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
		enterRule(_localctx, 22, RULE_e);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(SUMA);
				setState(108);
				term();
				setState(109);
				e();
				}
				break;
			case RESTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(RESTA);
				setState(112);
				term();
				setState(113);
				e();
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
		enterRule(_localctx, 24, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			factor();
			setState(118);
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
		enterRule(_localctx, 26, RULE_t);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(MULT);
				setState(121);
				factor();
				setState(122);
				t();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(DIV);
				setState(125);
				factor();
				setState(126);
				t();
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				match(MOD);
				setState(129);
				factor();
				setState(130);
				t();
				}
				break;
			case EOF:
			case SUMA:
			case RESTA:
			case EQQ:
			case LT:
			case GT:
			case LE:
			case GE:
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
		enterRule(_localctx, 28, RULE_factor);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(NUMERO);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(ID);
				}
				break;
			case PA:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				match(PA);
				setState(138);
				exp();
				setState(139);
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
		enterRule(_localctx, 30, RULE_ifor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(FOR);
			setState(144);
			match(PA);
			setState(145);
			asignacion();
			setState(146);
			match(PYC);
			setState(147);
			oplo();
			setState(148);
			match(PYC);
			setState(149);
			asignacion();
			setState(150);
			match(PC);
			setState(151);
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
		enterRule(_localctx, 32, RULE_oplo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
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
		enterRule(_localctx, 34, RULE_expresion_logica);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(ORR);
				setState(156);
				termino_logico();
				setState(157);
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
		enterRule(_localctx, 36, RULE_termino_logico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			factor_logico();
			setState(163);
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
		enterRule(_localctx, 38, RULE_term_logico);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(AND);
				setState(166);
				factor_logico();
				setState(167);
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
		enterRule(_localctx, 40, RULE_factor_logico);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				oplo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				comp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(174);
				match(PA);
				setState(175);
				expresion_logica();
				setState(176);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_comp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(181);
			oplo();
			setState(182);
			operador();
			setState(183);
			oplo();
			}
			_ctx.stop = _input.LT(-1);
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CompContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_comp);
					setState(185);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(186);
					operador();
					setState(187);
					comp(2);
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		public TerminalNode INT() { return getToken(compiladoresParser.INT, 0); }
		public TerminalNode NOMBRE() { return getToken(compiladoresParser.NOMBRE, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public TerminalNode PYC() { return getToken(compiladoresParser.PYC, 0); }
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(INT);
			setState(195);
			match(NOMBRE);
			setState(196);
			val();
			setState(197);
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
	public static class ValContext extends ParserRuleContext {
		public TerminalNode ASIG() { return getToken(compiladoresParser.ASIG, 0); }
		public TerminalNode NUMERO() { return getToken(compiladoresParser.NUMERO, 0); }
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_val);
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASIG:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(ASIG);
				setState(200);
				match(NUMERO);
				}
				break;
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
		enterRule(_localctx, 48, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			term();
			setState(205);
			condicionales();
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
			case NUMERO:
			case ID:
				{
				setState(206);
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
		enterRule(_localctx, 50, RULE_condicionales);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3997696L) != 0)) ) {
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
	public static class IterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public IterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iter; }
	}

	public final IterContext iter() throws RecognitionException {
		IterContext _localctx = new IterContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_iter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(ID);
			setState(213);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21:
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
		"\u0004\u0001\u001c\u00d8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0003\u0000A\b\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002J\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003P\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000bt\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0086\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u008e"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u00a1\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00ab\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u00b3\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u00be"+
		"\b\u0015\n\u0015\f\u0015\u00c1\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u00cb\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u00d1\b\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0000\u0001*\u001b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.024\u0000\u0002\u0001"+
		"\u0000\u0010\u0015\u0002\u0000\u0010\u0010\u0012\u0015\u00d0\u0000@\u0001"+
		"\u0000\u0000\u0000\u0002B\u0001\u0000\u0000\u0000\u0004I\u0001\u0000\u0000"+
		"\u0000\u0006O\u0001\u0000\u0000\u0000\bQ\u0001\u0000\u0000\u0000\nS\u0001"+
		"\u0000\u0000\u0000\fX\u0001\u0000\u0000\u0000\u000e\\\u0001\u0000\u0000"+
		"\u0000\u0010b\u0001\u0000\u0000\u0000\u0012f\u0001\u0000\u0000\u0000\u0014"+
		"h\u0001\u0000\u0000\u0000\u0016s\u0001\u0000\u0000\u0000\u0018u\u0001"+
		"\u0000\u0000\u0000\u001a\u0085\u0001\u0000\u0000\u0000\u001c\u008d\u0001"+
		"\u0000\u0000\u0000\u001e\u008f\u0001\u0000\u0000\u0000 \u0099\u0001\u0000"+
		"\u0000\u0000\"\u00a0\u0001\u0000\u0000\u0000$\u00a2\u0001\u0000\u0000"+
		"\u0000&\u00aa\u0001\u0000\u0000\u0000(\u00b2\u0001\u0000\u0000\u0000*"+
		"\u00b4\u0001\u0000\u0000\u0000,\u00c2\u0001\u0000\u0000\u0000.\u00ca\u0001"+
		"\u0000\u0000\u00000\u00cc\u0001\u0000\u0000\u00002\u00d2\u0001\u0000\u0000"+
		"\u00004\u00d4\u0001\u0000\u0000\u000067\u0005\u0017\u0000\u000078\u0006"+
		"\u0000\uffff\uffff\u00008A\u0003\u0000\u0000\u00009:\u0005\u0007\u0000"+
		"\u0000:;\u0006\u0000\uffff\uffff\u0000;A\u0003\u0000\u0000\u0000<=\u0005"+
		"\u001b\u0000\u0000=>\u0006\u0000\uffff\uffff\u0000>A\u0003\u0000\u0000"+
		"\u0000?A\u0005\u0000\u0000\u0001@6\u0001\u0000\u0000\u0000@9\u0001\u0000"+
		"\u0000\u0000@<\u0001\u0000\u0000\u0000@?\u0001\u0000\u0000\u0000A\u0001"+
		"\u0001\u0000\u0000\u0000BC\u0003\u0004\u0002\u0000CD\u0005\u0000\u0000"+
		"\u0001D\u0003\u0001\u0000\u0000\u0000EF\u0003\u0006\u0003\u0000FG\u0003"+
		"\u0004\u0002\u0000GJ\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000"+
		"IE\u0001\u0000\u0000\u0000IH\u0001\u0000\u0000\u0000J\u0005\u0001\u0000"+
		"\u0000\u0000KP\u0003\f\u0006\u0000LP\u0003\u000e\u0007\u0000MP\u0003\u0010"+
		"\b\u0000NP\u0003\n\u0005\u0000OK\u0001\u0000\u0000\u0000OL\u0001\u0000"+
		"\u0000\u0000OM\u0001\u0000\u0000\u0000ON\u0001\u0000\u0000\u0000P\u0007"+
		"\u0001\u0000\u0000\u0000QR\u0007\u0000\u0000\u0000R\t\u0001\u0000\u0000"+
		"\u0000ST\u0005\u0017\u0000\u0000TU\u0005\u000f\u0000\u0000UV\u0003\u0012"+
		"\t\u0000VW\u0005\u0005\u0000\u0000W\u000b\u0001\u0000\u0000\u0000XY\u0005"+
		"\t\u0000\u0000YZ\u0005\u0017\u0000\u0000Z[\u0005\u0005\u0000\u0000[\r"+
		"\u0001\u0000\u0000\u0000\\]\u0005\u0006\u0000\u0000]^\u0005\u0001\u0000"+
		"\u0000^_\u0005\u0017\u0000\u0000_`\u0005\u0002\u0000\u0000`a\u0003\u0006"+
		"\u0003\u0000a\u000f\u0001\u0000\u0000\u0000bc\u0005\u0003\u0000\u0000"+
		"cd\u0003\u0004\u0002\u0000de\u0005\u0004\u0000\u0000e\u0011\u0001\u0000"+
		"\u0000\u0000fg\u0003\u0014\n\u0000g\u0013\u0001\u0000\u0000\u0000hi\u0003"+
		"\u0018\f\u0000ij\u0003\u0016\u000b\u0000j\u0015\u0001\u0000\u0000\u0000"+
		"kl\u0005\n\u0000\u0000lm\u0003\u0018\f\u0000mn\u0003\u0016\u000b\u0000"+
		"nt\u0001\u0000\u0000\u0000op\u0005\u000b\u0000\u0000pq\u0003\u0018\f\u0000"+
		"qr\u0003\u0016\u000b\u0000rt\u0001\u0000\u0000\u0000sk\u0001\u0000\u0000"+
		"\u0000so\u0001\u0000\u0000\u0000t\u0017\u0001\u0000\u0000\u0000uv\u0003"+
		"\u001c\u000e\u0000vw\u0003\u001a\r\u0000w\u0019\u0001\u0000\u0000\u0000"+
		"xy\u0005\f\u0000\u0000yz\u0003\u001c\u000e\u0000z{\u0003\u001a\r\u0000"+
		"{\u0086\u0001\u0000\u0000\u0000|}\u0005\r\u0000\u0000}~\u0003\u001c\u000e"+
		"\u0000~\u007f\u0003\u001a\r\u0000\u007f\u0086\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0005\u000e\u0000\u0000\u0081\u0082\u0003\u001c\u000e\u0000"+
		"\u0082\u0083\u0003\u001a\r\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084"+
		"\u0086\u0001\u0000\u0000\u0000\u0085x\u0001\u0000\u0000\u0000\u0085|\u0001"+
		"\u0000\u0000\u0000\u0085\u0080\u0001\u0000\u0000\u0000\u0085\u0084\u0001"+
		"\u0000\u0000\u0000\u0086\u001b\u0001\u0000\u0000\u0000\u0087\u008e\u0005"+
		"\u0007\u0000\u0000\u0088\u008e\u0005\u0017\u0000\u0000\u0089\u008a\u0005"+
		"\u0001\u0000\u0000\u008a\u008b\u0003\u0014\n\u0000\u008b\u008c\u0005\u0002"+
		"\u0000\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008d\u0087\u0001\u0000"+
		"\u0000\u0000\u008d\u0088\u0001\u0000\u0000\u0000\u008d\u0089\u0001\u0000"+
		"\u0000\u0000\u008e\u001d\u0001\u0000\u0000\u0000\u008f\u0090\u0005\b\u0000"+
		"\u0000\u0090\u0091\u0005\u0001\u0000\u0000\u0091\u0092\u0003\n\u0005\u0000"+
		"\u0092\u0093\u0005\u0005\u0000\u0000\u0093\u0094\u0003 \u0010\u0000\u0094"+
		"\u0095\u0005\u0005\u0000\u0000\u0095\u0096\u0003\n\u0005\u0000\u0096\u0097"+
		"\u0005\u0002\u0000\u0000\u0097\u0098\u0003\u0004\u0002\u0000\u0098\u001f"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0003\"\u0011\u0000\u009a!\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0005\u0018\u0000\u0000\u009c\u009d\u0003"+
		"$\u0012\u0000\u009d\u009e\u0003\"\u0011\u0000\u009e\u00a1\u0001\u0000"+
		"\u0000\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u009b\u0001\u0000"+
		"\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1#\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0003(\u0014\u0000\u00a3\u00a4\u0003&\u0013\u0000\u00a4"+
		"%\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0019\u0000\u0000\u00a6\u00a7"+
		"\u0003(\u0014\u0000\u00a7\u00a8\u0003&\u0013\u0000\u00a8\u00ab\u0001\u0000"+
		"\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a5\u0001\u0000"+
		"\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\'\u0001\u0000\u0000"+
		"\u0000\u00ac\u00b3\u0003 \u0010\u0000\u00ad\u00b3\u0003*\u0015\u0000\u00ae"+
		"\u00af\u0005\u0001\u0000\u0000\u00af\u00b0\u0003\"\u0011\u0000\u00b0\u00b1"+
		"\u0005\u0002\u0000\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2\u00ac"+
		"\u0001\u0000\u0000\u0000\u00b2\u00ad\u0001\u0000\u0000\u0000\u00b2\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b3)\u0001\u0000\u0000\u0000\u00b4\u00b5\u0006"+
		"\u0015\uffff\uffff\u0000\u00b5\u00b6\u0003 \u0010\u0000\u00b6\u00b7\u0003"+
		"\b\u0004\u0000\u00b7\u00b8\u0003 \u0010\u0000\u00b8\u00bf\u0001\u0000"+
		"\u0000\u0000\u00b9\u00ba\n\u0001\u0000\u0000\u00ba\u00bb\u0003\b\u0004"+
		"\u0000\u00bb\u00bc\u0003*\u0015\u0002\u00bc\u00be\u0001\u0000\u0000\u0000"+
		"\u00bd\u00b9\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000"+
		"\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c0+\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0005\t\u0000\u0000\u00c3\u00c4\u0005\u001c\u0000\u0000\u00c4\u00c5"+
		"\u0003.\u0017\u0000\u00c5\u00c6\u0005\u0005\u0000\u0000\u00c6-\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c8\u0005\u000f\u0000\u0000\u00c8\u00cb\u0005\u0007"+
		"\u0000\u0000\u00c9\u00cb\u0001\u0000\u0000\u0000\u00ca\u00c7\u0001\u0000"+
		"\u0000\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000\u00cb/\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cd\u0003\u0018\f\u0000\u00cd\u00d0\u00032\u0019\u0000"+
		"\u00ce\u00d1\u0003\u0018\f\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000\u00d0"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1"+
		"1\u0001\u0000\u0000\u0000\u00d2\u00d3\u0007\u0001\u0000\u0000\u00d33\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0005\u0017\u0000\u0000\u00d5\u00d6\u0003"+
		"\u0014\n\u0000\u00d65\u0001\u0000\u0000\u0000\f@IOs\u0085\u008d\u00a0"+
		"\u00aa\u00b2\u00bf\u00ca\u00d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}