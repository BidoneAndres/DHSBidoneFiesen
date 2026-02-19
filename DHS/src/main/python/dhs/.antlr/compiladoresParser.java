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
		RULE_puntoYComa = 4, RULE_iwhile = 5, RULE_if = 6, RULE_else = 7, RULE_bloque = 8, 
		RULE_opal = 9, RULE_exp = 10, RULE_oplo = 11, RULE_or = 12, RULE_and = 13, 
		RULE_a = 14, RULE_cmp = 15, RULE_c = 16, RULE_e = 17, RULE_term = 18, 
		RULE_t = 19, RULE_factor = 20, RULE_ifor = 21, RULE_paramFor = 22, RULE_init = 23, 
		RULE_asignacion = 24, RULE_char = 25, RULE_cond = 26, RULE_condicionales = 27, 
		RULE_iter = 28, RULE_proto = 29, RULE_func = 30, RULE_var_func = 31, RULE_callFunc = 32, 
		RULE_var = 33, RULE_incremento = 34, RULE_decremento = 35, RULE_return = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "programa", "instrucciones", "instruccion", "puntoYComa", "iwhile", 
			"if", "else", "bloque", "opal", "exp", "oplo", "or", "and", "a", "cmp", 
			"c", "e", "term", "t", "factor", "ifor", "paramFor", "init", "asignacion", 
			"char", "cond", "condicionales", "iter", "proto", "func", "var_func", 
			"callFunc", "var", "incremento", "decremento", "return"
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
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				((SContext)_localctx).ID = match(ID);
				print("ID ->" + (((SContext)_localctx).ID!=null?((SContext)_localctx).ID.getText():null) + "<--") 
				setState(76);
				s();
				}
				break;
			case NUMERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				((SContext)_localctx).NUMERO = match(NUMERO);
				print("NUMERO ->" + (((SContext)_localctx).NUMERO!=null?((SContext)_localctx).NUMERO.getText():null) + "<--") 
				setState(79);
				s();
				}
				break;
			case OTRO:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				((SContext)_localctx).OTRO = match(OTRO);
				print("Otro ->" + (((SContext)_localctx).OTRO!=null?((SContext)_localctx).OTRO.getText():null) + "<--") 
				setState(82);
				s();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
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
			setState(86);
			instrucciones();
			setState(87);
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
			setState(93);
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
				setState(89);
				instruccion();
				setState(90);
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
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
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
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				puntoYComa();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				iwhile();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				bloque();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				ifor();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(99);
				func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(100);
				if_();
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
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
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
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				init();
				setState(104);
				match(PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				asignacion();
				setState(107);
				match(PYC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				proto();
				setState(110);
				match(PYC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				return_();
				setState(113);
				match(PYC);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				callFunc();
				setState(116);
				match(PYC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(118);
				incremento();
				setState(119);
				match(PYC);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(121);
				decremento();
				setState(122);
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
			setState(126);
			match(WHILE);
			setState(127);
			match(PA);
			setState(128);
			opal();
			setState(129);
			match(PC);
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(130);
				bloque();
				}
				break;
			case 2:
				{
				setState(131);
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
	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(compiladoresParser.IF, 0); }
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(IF);
			setState(135);
			match(PA);
			setState(136);
			opal();
			setState(137);
			match(PC);
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(138);
				bloque();
				}
				break;
			case 2:
				{
				setState(139);
				instruccion();
				}
				break;
			}
			setState(142);
			else_();
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
	public static class ElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(compiladoresParser.ELSE, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_else);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(ELSE);
				setState(145);
				bloque();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(ELSE);
				setState(147);
				if_();
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
			setState(151);
			match(LLA);
			setState(152);
			instrucciones();
			setState(153);
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
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				oplo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
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
			setState(160);
			term();
			setState(161);
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
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
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
			setState(163);
			and();
			setState(164);
			or();
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
	public static class OrContext extends ParserRuleContext {
		public TerminalNode ORR() { return getToken(compiladoresParser.ORR, 0); }
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_or);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORR:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(ORR);
				setState(167);
				and();
				setState(168);
				or();
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
	public static class AndContext extends ParserRuleContext {
		public CmpContext cmp() {
			return getRuleContext(CmpContext.class,0);
		}
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			cmp();
			setState(174);
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
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(AND);
				setState(177);
				cmp();
				setState(178);
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
			setState(183);
			exp();
			setState(184);
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
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(EQQ);
				setState(187);
				exp();
				setState(188);
				c();
				}
				break;
			case NE:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(NE);
				setState(191);
				exp();
				setState(192);
				c();
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				match(LT);
				setState(195);
				exp();
				setState(196);
				c();
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
				match(GT);
				setState(199);
				exp();
				setState(200);
				c();
				}
				break;
			case LE:
				enterOuterAlt(_localctx, 5);
				{
				setState(202);
				match(LE);
				setState(203);
				exp();
				setState(204);
				c();
				}
				break;
			case GE:
				enterOuterAlt(_localctx, 6);
				{
				setState(206);
				match(GE);
				setState(207);
				exp();
				setState(208);
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
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(SUMA);
				setState(214);
				term();
				setState(215);
				e();
				}
				break;
			case RESTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(RESTA);
				setState(218);
				term();
				setState(219);
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
			setState(224);
			factor();
			setState(225);
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
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(MULT);
				setState(228);
				factor();
				setState(229);
				t();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(DIV);
				setState(232);
				factor();
				setState(233);
				t();
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				match(MOD);
				setState(236);
				factor();
				setState(237);
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
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(FLOAT_LITERAL);
				}
				break;
			case NUMERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(NUMERO);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				match(ID);
				}
				break;
			case PA:
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				match(PA);
				setState(246);
				exp();
				setState(247);
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
			setState(251);
			match(FOR);
			setState(252);
			match(PA);
			setState(253);
			asignacion();
			setState(254);
			match(PYC);
			setState(255);
			opal();
			setState(256);
			match(PYC);
			setState(257);
			paramFor();
			setState(258);
			match(PC);
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(259);
				bloque();
				}
				break;
			case 2:
				{
				setState(260);
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
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				incremento();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
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
			setState(268);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 770048L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(269);
			match(ID);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(270);
				match(COM);
				setState(271);
				match(ID);
				}
				}
				setState(276);
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
			setState(277);
			match(ID);
			setState(278);
			match(ASIG);
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
			case FLOAT_LITERAL:
			case NUMERO:
			case ID:
				{
				setState(279);
				opal();
				}
				break;
			case SIMP:
				{
				setState(280);
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
			setState(283);
			match(SIMP);
			setState(284);
			match(ID);
			setState(285);
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
			setState(287);
			term();
			setState(288);
			condicionales();
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
			case FLOAT_LITERAL:
			case NUMERO:
			case ID:
				{
				setState(289);
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
			setState(293);
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
		enterRule(_localctx, 56, RULE_iter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(ID);
			setState(296);
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
			setState(298);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1818624L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(299);
			match(ID);
			setState(300);
			match(PA);
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case CHAR:
			case FLOAT:
			case BOOLEAN:
				{
				setState(301);
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
			setState(305);
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
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode INT() { return getToken(compiladoresParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(compiladoresParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(compiladoresParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(compiladoresParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(compiladoresParser.CHAR, 0); }
		public TerminalNode VOID() { return getToken(compiladoresParser.VOID, 0); }
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
			setState(307);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1818624L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(308);
			match(ID);
			setState(309);
			match(PA);
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case CHAR:
			case FLOAT:
			case BOOLEAN:
				{
				setState(310);
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
			setState(314);
			match(PC);
			setState(315);
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
	public static class Var_funcContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(compiladoresParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(compiladoresParser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(compiladoresParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(compiladoresParser.INT, i);
		}
		public List<TerminalNode> DOUBLE() { return getTokens(compiladoresParser.DOUBLE); }
		public TerminalNode DOUBLE(int i) {
			return getToken(compiladoresParser.DOUBLE, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(compiladoresParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(compiladoresParser.FLOAT, i);
		}
		public List<TerminalNode> BOOLEAN() { return getTokens(compiladoresParser.BOOLEAN); }
		public TerminalNode BOOLEAN(int i) {
			return getToken(compiladoresParser.BOOLEAN, i);
		}
		public List<TerminalNode> CHAR() { return getTokens(compiladoresParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(compiladoresParser.CHAR, i);
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
		enterRule(_localctx, 62, RULE_var_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 770048L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(318);
			match(ID);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(319);
				match(COM);
				setState(320);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 770048L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(321);
				match(ID);
				}
				}
				setState(326);
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
		enterRule(_localctx, 64, RULE_callFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(ID);
			setState(328);
			match(PA);
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
			case FLOAT_LITERAL:
			case NUMERO:
			case ID:
				{
				setState(329);
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
			setState(333);
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
		enterRule(_localctx, 66, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			exp();
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(336);
				match(COM);
				setState(337);
				exp();
				}
				}
				setState(342);
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
		enterRule(_localctx, 68, RULE_incremento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(ID);
			setState(344);
			match(SUMA);
			setState(345);
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
		enterRule(_localctx, 70, RULE_decremento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(ID);
			setState(348);
			match(RESTA);
			setState(349);
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
	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(compiladoresParser.RETURN, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(RETURN);
			setState(352);
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
		"\u0004\u0001\'\u0163\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000U\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002^\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"f\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004}\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u0085\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u008d\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0096\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0003\t\u009f\b\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00ac\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00b6\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00d4\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u00df\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u00f1\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00fa\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0106\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u010b\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u0111\b\u0017\n\u0017\f\u0017\u0114\t\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u011a\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u0124\b\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u0130\b\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u0139\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0143\b\u001f\n\u001f"+
		"\f\u001f\u0146\t\u001f\u0001 \u0001 \u0001 \u0001 \u0003 \u014c\b \u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0005!\u0153\b!\n!\f!\u0156\t!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001"+
		"$\u0000\u0000%\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFH\u0000\u0003\u0002\u0000"+
		"\u000e\u0011\u0013\u0013\u0002\u0000\u001b\u001b\u001d \u0002\u0000\u000e"+
		"\u0011\u0013\u0014\u016d\u0000T\u0001\u0000\u0000\u0000\u0002V\u0001\u0000"+
		"\u0000\u0000\u0004]\u0001\u0000\u0000\u0000\u0006e\u0001\u0000\u0000\u0000"+
		"\b|\u0001\u0000\u0000\u0000\n~\u0001\u0000\u0000\u0000\f\u0086\u0001\u0000"+
		"\u0000\u0000\u000e\u0095\u0001\u0000\u0000\u0000\u0010\u0097\u0001\u0000"+
		"\u0000\u0000\u0012\u009e\u0001\u0000\u0000\u0000\u0014\u00a0\u0001\u0000"+
		"\u0000\u0000\u0016\u00a3\u0001\u0000\u0000\u0000\u0018\u00ab\u0001\u0000"+
		"\u0000\u0000\u001a\u00ad\u0001\u0000\u0000\u0000\u001c\u00b5\u0001\u0000"+
		"\u0000\u0000\u001e\u00b7\u0001\u0000\u0000\u0000 \u00d3\u0001\u0000\u0000"+
		"\u0000\"\u00de\u0001\u0000\u0000\u0000$\u00e0\u0001\u0000\u0000\u0000"+
		"&\u00f0\u0001\u0000\u0000\u0000(\u00f9\u0001\u0000\u0000\u0000*\u00fb"+
		"\u0001\u0000\u0000\u0000,\u010a\u0001\u0000\u0000\u0000.\u010c\u0001\u0000"+
		"\u0000\u00000\u0115\u0001\u0000\u0000\u00002\u011b\u0001\u0000\u0000\u0000"+
		"4\u011f\u0001\u0000\u0000\u00006\u0125\u0001\u0000\u0000\u00008\u0127"+
		"\u0001\u0000\u0000\u0000:\u012a\u0001\u0000\u0000\u0000<\u0133\u0001\u0000"+
		"\u0000\u0000>\u013d\u0001\u0000\u0000\u0000@\u0147\u0001\u0000\u0000\u0000"+
		"B\u014f\u0001\u0000\u0000\u0000D\u0157\u0001\u0000\u0000\u0000F\u015b"+
		"\u0001\u0000\u0000\u0000H\u015f\u0001\u0000\u0000\u0000JK\u0005#\u0000"+
		"\u0000KL\u0006\u0000\uffff\uffff\u0000LU\u0003\u0000\u0000\u0000MN\u0005"+
		"\t\u0000\u0000NO\u0006\u0000\uffff\uffff\u0000OU\u0003\u0000\u0000\u0000"+
		"PQ\u0005\'\u0000\u0000QR\u0006\u0000\uffff\uffff\u0000RU\u0003\u0000\u0000"+
		"\u0000SU\u0005\u0000\u0000\u0001TJ\u0001\u0000\u0000\u0000TM\u0001\u0000"+
		"\u0000\u0000TP\u0001\u0000\u0000\u0000TS\u0001\u0000\u0000\u0000U\u0001"+
		"\u0001\u0000\u0000\u0000VW\u0003\u0004\u0002\u0000WX\u0005\u0000\u0000"+
		"\u0001X\u0003\u0001\u0000\u0000\u0000YZ\u0003\u0006\u0003\u0000Z[\u0003"+
		"\u0004\u0002\u0000[^\u0001\u0000\u0000\u0000\\^\u0001\u0000\u0000\u0000"+
		"]Y\u0001\u0000\u0000\u0000]\\\u0001\u0000\u0000\u0000^\u0005\u0001\u0000"+
		"\u0000\u0000_f\u0003\b\u0004\u0000`f\u0003\n\u0005\u0000af\u0003\u0010"+
		"\b\u0000bf\u0003*\u0015\u0000cf\u0003<\u001e\u0000df\u0003\f\u0006\u0000"+
		"e_\u0001\u0000\u0000\u0000e`\u0001\u0000\u0000\u0000ea\u0001\u0000\u0000"+
		"\u0000eb\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ed\u0001\u0000"+
		"\u0000\u0000f\u0007\u0001\u0000\u0000\u0000gh\u0003.\u0017\u0000hi\u0005"+
		"\u0005\u0000\u0000i}\u0001\u0000\u0000\u0000jk\u00030\u0018\u0000kl\u0005"+
		"\u0005\u0000\u0000l}\u0001\u0000\u0000\u0000mn\u0003:\u001d\u0000no\u0005"+
		"\u0005\u0000\u0000o}\u0001\u0000\u0000\u0000pq\u0003H$\u0000qr\u0005\u0005"+
		"\u0000\u0000r}\u0001\u0000\u0000\u0000st\u0003@ \u0000tu\u0005\u0005\u0000"+
		"\u0000u}\u0001\u0000\u0000\u0000vw\u0003D\"\u0000wx\u0005\u0005\u0000"+
		"\u0000x}\u0001\u0000\u0000\u0000yz\u0003F#\u0000z{\u0005\u0005\u0000\u0000"+
		"{}\u0001\u0000\u0000\u0000|g\u0001\u0000\u0000\u0000|j\u0001\u0000\u0000"+
		"\u0000|m\u0001\u0000\u0000\u0000|p\u0001\u0000\u0000\u0000|s\u0001\u0000"+
		"\u0000\u0000|v\u0001\u0000\u0000\u0000|y\u0001\u0000\u0000\u0000}\t\u0001"+
		"\u0000\u0000\u0000~\u007f\u0005\u0007\u0000\u0000\u007f\u0080\u0005\u0001"+
		"\u0000\u0000\u0080\u0081\u0003\u0012\t\u0000\u0081\u0084\u0005\u0002\u0000"+
		"\u0000\u0082\u0085\u0003\u0010\b\u0000\u0083\u0085\u0003\u0006\u0003\u0000"+
		"\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000"+
		"\u0085\u000b\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u000b\u0000\u0000"+
		"\u0087\u0088\u0005\u0001\u0000\u0000\u0088\u0089\u0003\u0012\t\u0000\u0089"+
		"\u008c\u0005\u0002\u0000\u0000\u008a\u008d\u0003\u0010\b\u0000\u008b\u008d"+
		"\u0003\u0006\u0003\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008b"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0003\u000e\u0007\u0000\u008f\r\u0001\u0000\u0000\u0000\u0090\u0091\u0005"+
		"\f\u0000\u0000\u0091\u0096\u0003\u0010\b\u0000\u0092\u0093\u0005\f\u0000"+
		"\u0000\u0093\u0096\u0003\f\u0006\u0000\u0094\u0096\u0001\u0000\u0000\u0000"+
		"\u0095\u0090\u0001\u0000\u0000\u0000\u0095\u0092\u0001\u0000\u0000\u0000"+
		"\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u000f\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0005\u0003\u0000\u0000\u0098\u0099\u0003\u0004\u0002\u0000"+
		"\u0099\u009a\u0005\u0004\u0000\u0000\u009a\u0011\u0001\u0000\u0000\u0000"+
		"\u009b\u009f\u0003\u0014\n\u0000\u009c\u009f\u0003\u0016\u000b\u0000\u009d"+
		"\u009f\u0003@ \u0000\u009e\u009b\u0001\u0000\u0000\u0000\u009e\u009c\u0001"+
		"\u0000\u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u0013\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\u0003$\u0012\u0000\u00a1\u00a2\u0003\""+
		"\u0011\u0000\u00a2\u0015\u0001\u0000\u0000\u0000\u00a3\u00a4\u0003\u001a"+
		"\r\u0000\u00a4\u00a5\u0003\u0018\f\u0000\u00a5\u0017\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u0005$\u0000\u0000\u00a7\u00a8\u0003\u001a\r\u0000"+
		"\u00a8\u00a9\u0003\u0018\f\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ab\u00a6\u0001\u0000\u0000\u0000\u00ab"+
		"\u00aa\u0001\u0000\u0000\u0000\u00ac\u0019\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0003\u001e\u000f\u0000\u00ae\u00af\u0003\u001c\u000e\u0000\u00af"+
		"\u001b\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005%\u0000\u0000\u00b1\u00b2"+
		"\u0003\u001e\u000f\u0000\u00b2\u00b3\u0003\u001c\u000e\u0000\u00b3\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6\u001d"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b8\u0003\u0014\n\u0000\u00b8\u00b9\u0003"+
		" \u0010\u0000\u00b9\u001f\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\u001b"+
		"\u0000\u0000\u00bb\u00bc\u0003\u0014\n\u0000\u00bc\u00bd\u0003 \u0010"+
		"\u0000\u00bd\u00d4\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\u001c\u0000"+
		"\u0000\u00bf\u00c0\u0003\u0014\n\u0000\u00c0\u00c1\u0003 \u0010\u0000"+
		"\u00c1\u00d4\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\u001d\u0000\u0000"+
		"\u00c3\u00c4\u0003\u0014\n\u0000\u00c4\u00c5\u0003 \u0010\u0000\u00c5"+
		"\u00d4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\u001e\u0000\u0000\u00c7"+
		"\u00c8\u0003\u0014\n\u0000\u00c8\u00c9\u0003 \u0010\u0000\u00c9\u00d4"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\u001f\u0000\u0000\u00cb\u00cc"+
		"\u0003\u0014\n\u0000\u00cc\u00cd\u0003 \u0010\u0000\u00cd\u00d4\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cf\u0005 \u0000\u0000\u00cf\u00d0\u0003\u0014"+
		"\n\u0000\u00d0\u00d1\u0003 \u0010\u0000\u00d1\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d4\u0001\u0000\u0000\u0000\u00d3\u00ba\u0001\u0000\u0000"+
		"\u0000\u00d3\u00be\u0001\u0000\u0000\u0000\u00d3\u00c2\u0001\u0000\u0000"+
		"\u0000\u00d3\u00c6\u0001\u0000\u0000\u0000\u00d3\u00ca\u0001\u0000\u0000"+
		"\u0000\u00d3\u00ce\u0001\u0000\u0000\u0000\u00d3\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d4!\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u0015\u0000\u0000"+
		"\u00d6\u00d7\u0003$\u0012\u0000\u00d7\u00d8\u0003\"\u0011\u0000\u00d8"+
		"\u00df\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\u0016\u0000\u0000\u00da"+
		"\u00db\u0003$\u0012\u0000\u00db\u00dc\u0003\"\u0011\u0000\u00dc\u00df"+
		"\u0001\u0000\u0000\u0000\u00dd\u00df\u0001\u0000\u0000\u0000\u00de\u00d5"+
		"\u0001\u0000\u0000\u0000\u00de\u00d9\u0001\u0000\u0000\u0000\u00de\u00dd"+
		"\u0001\u0000\u0000\u0000\u00df#\u0001\u0000\u0000\u0000\u00e0\u00e1\u0003"+
		"(\u0014\u0000\u00e1\u00e2\u0003&\u0013\u0000\u00e2%\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0005\u0017\u0000\u0000\u00e4\u00e5\u0003(\u0014\u0000"+
		"\u00e5\u00e6\u0003&\u0013\u0000\u00e6\u00f1\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e8\u0005\u0018\u0000\u0000\u00e8\u00e9\u0003(\u0014\u0000\u00e9\u00ea"+
		"\u0003&\u0013\u0000\u00ea\u00f1\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005"+
		"\u0019\u0000\u0000\u00ec\u00ed\u0003(\u0014\u0000\u00ed\u00ee\u0003&\u0013"+
		"\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f0\u00e3\u0001\u0000\u0000\u0000\u00f0\u00e7\u0001\u0000\u0000"+
		"\u0000\u00f0\u00eb\u0001\u0000\u0000\u0000\u00f0\u00ef\u0001\u0000\u0000"+
		"\u0000\u00f1\'\u0001\u0000\u0000\u0000\u00f2\u00fa\u0005\b\u0000\u0000"+
		"\u00f3\u00fa\u0005\t\u0000\u0000\u00f4\u00fa\u0005#\u0000\u0000\u00f5"+
		"\u00f6\u0005\u0001\u0000\u0000\u00f6\u00f7\u0003\u0014\n\u0000\u00f7\u00f8"+
		"\u0005\u0002\u0000\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000\u00f9\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f9\u00f3\u0001\u0000\u0000\u0000\u00f9\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f9\u00f5\u0001\u0000\u0000\u0000\u00fa)\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fc\u0005\n\u0000\u0000\u00fc\u00fd\u0005\u0001"+
		"\u0000\u0000\u00fd\u00fe\u00030\u0018\u0000\u00fe\u00ff\u0005\u0005\u0000"+
		"\u0000\u00ff\u0100\u0003\u0012\t\u0000\u0100\u0101\u0005\u0005\u0000\u0000"+
		"\u0101\u0102\u0003,\u0016\u0000\u0102\u0105\u0005\u0002\u0000\u0000\u0103"+
		"\u0106\u0003\u0010\b\u0000\u0104\u0106\u0003\u0006\u0003\u0000\u0105\u0103"+
		"\u0001\u0000\u0000\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0106+\u0001"+
		"\u0000\u0000\u0000\u0107\u010b\u00030\u0018\u0000\u0108\u010b\u0003D\""+
		"\u0000\u0109\u010b\u0003F#\u0000\u010a\u0107\u0001\u0000\u0000\u0000\u010a"+
		"\u0108\u0001\u0000\u0000\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010b"+
		"-\u0001\u0000\u0000\u0000\u010c\u010d\u0007\u0000\u0000\u0000\u010d\u0112"+
		"\u0005#\u0000\u0000\u010e\u010f\u0005\u0006\u0000\u0000\u010f\u0111\u0005"+
		"#\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0111\u0114\u0001\u0000"+
		"\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000"+
		"\u0000\u0000\u0113/\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000"+
		"\u0000\u0115\u0116\u0005#\u0000\u0000\u0116\u0119\u0005\u001a\u0000\u0000"+
		"\u0117\u011a\u0003\u0012\t\u0000\u0118\u011a\u00032\u0019\u0000\u0119"+
		"\u0117\u0001\u0000\u0000\u0000\u0119\u0118\u0001\u0000\u0000\u0000\u011a"+
		"1\u0001\u0000\u0000\u0000\u011b\u011c\u0005!\u0000\u0000\u011c\u011d\u0005"+
		"#\u0000\u0000\u011d\u011e\u0005!\u0000\u0000\u011e3\u0001\u0000\u0000"+
		"\u0000\u011f\u0120\u0003$\u0012\u0000\u0120\u0123\u00036\u001b\u0000\u0121"+
		"\u0124\u0003$\u0012\u0000\u0122\u0124\u0001\u0000\u0000\u0000\u0123\u0121"+
		"\u0001\u0000\u0000\u0000\u0123\u0122\u0001\u0000\u0000\u0000\u01245\u0001"+
		"\u0000\u0000\u0000\u0125\u0126\u0007\u0001\u0000\u0000\u01267\u0001\u0000"+
		"\u0000\u0000\u0127\u0128\u0005#\u0000\u0000\u0128\u0129\u0003\u0014\n"+
		"\u0000\u01299\u0001\u0000\u0000\u0000\u012a\u012b\u0007\u0002\u0000\u0000"+
		"\u012b\u012c\u0005#\u0000\u0000\u012c\u012f\u0005\u0001\u0000\u0000\u012d"+
		"\u0130\u0003>\u001f\u0000\u012e\u0130\u0001\u0000\u0000\u0000\u012f\u012d"+
		"\u0001\u0000\u0000\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u0130\u0131"+
		"\u0001\u0000\u0000\u0000\u0131\u0132\u0005\u0002\u0000\u0000\u0132;\u0001"+
		"\u0000\u0000\u0000\u0133\u0134\u0007\u0002\u0000\u0000\u0134\u0135\u0005"+
		"#\u0000\u0000\u0135\u0138\u0005\u0001\u0000\u0000\u0136\u0139\u0003>\u001f"+
		"\u0000\u0137\u0139\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000"+
		"\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000"+
		"\u0000\u013a\u013b\u0005\u0002\u0000\u0000\u013b\u013c\u0003\u0010\b\u0000"+
		"\u013c=\u0001\u0000\u0000\u0000\u013d\u013e\u0007\u0000\u0000\u0000\u013e"+
		"\u0144\u0005#\u0000\u0000\u013f\u0140\u0005\u0006\u0000\u0000\u0140\u0141"+
		"\u0007\u0000\u0000\u0000\u0141\u0143\u0005#\u0000\u0000\u0142\u013f\u0001"+
		"\u0000\u0000\u0000\u0143\u0146\u0001\u0000\u0000\u0000\u0144\u0142\u0001"+
		"\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145?\u0001\u0000"+
		"\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0147\u0148\u0005#\u0000"+
		"\u0000\u0148\u014b\u0005\u0001\u0000\u0000\u0149\u014c\u0003B!\u0000\u014a"+
		"\u014c\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014b"+
		"\u014a\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d"+
		"\u014e\u0005\u0002\u0000\u0000\u014eA\u0001\u0000\u0000\u0000\u014f\u0154"+
		"\u0003\u0014\n\u0000\u0150\u0151\u0005\u0006\u0000\u0000\u0151\u0153\u0003"+
		"\u0014\n\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0153\u0156\u0001\u0000"+
		"\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000"+
		"\u0000\u0000\u0155C\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000"+
		"\u0000\u0157\u0158\u0005#\u0000\u0000\u0158\u0159\u0005\u0015\u0000\u0000"+
		"\u0159\u015a\u0005\u0015\u0000\u0000\u015aE\u0001\u0000\u0000\u0000\u015b"+
		"\u015c\u0005#\u0000\u0000\u015c\u015d\u0005\u0016\u0000\u0000\u015d\u015e"+
		"\u0005\u0016\u0000\u0000\u015eG\u0001\u0000\u0000\u0000\u015f\u0160\u0005"+
		"\r\u0000\u0000\u0160\u0161\u0003\u0012\t\u0000\u0161I\u0001\u0000\u0000"+
		"\u0000\u0018T]e|\u0084\u008c\u0095\u009e\u00ab\u00b5\u00d3\u00de\u00f0"+
		"\u00f9\u0105\u010a\u0112\u0119\u0123\u012f\u0138\u0144\u014b\u0154";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}