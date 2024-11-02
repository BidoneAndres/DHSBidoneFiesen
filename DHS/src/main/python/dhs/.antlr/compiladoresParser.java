// Generated from /home/eduardo/DHS/DHSBidoneFiesen/DHS/src/main/python/dhs/compiladores.g4 by ANTLR 4.13.1
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
		PA=1, PC=2, LLA=3, LLC=4, PYC=5, COM=6, WHILE=7, NUMERO=8, FOR=9, IF=10, 
		ELSE=11, RETURN=12, INT=13, DOUBLE=14, CHAR=15, FLOAT=16, STRING=17, BOOLEAN=18, 
		VOID=19, SUMA=20, RESTA=21, MULT=22, DIV=23, MOD=24, ASIG=25, EQQ=26, 
		NE=27, LT=28, GT=29, LE=30, GE=31, INCR=32, DECR=33, WS=34, ID=35, OR=36, 
		AND=37, NOT=38, OTRO=39;
	public static final int
		RULE_s = 0, RULE_programa = 1, RULE_instrucciones = 2, RULE_instruccion = 3, 
		RULE_operador = 4, RULE_iwhile = 5, RULE_if = 6, RULE_else = 7, RULE_bloque = 8, 
		RULE_opal = 9, RULE_explogic = 10, RULE_expArit = 11, RULE_termino = 12, 
		RULE_factor = 13, RULE_op = 14, RULE_ifor = 15, RULE_init = 16, RULE_var = 17, 
		RULE_asignacion = 18, RULE_cond = 19, RULE_iter = 20, RULE_proto = 21, 
		RULE_func = 22, RULE_var_func = 23, RULE_callFunc = 24, RULE_incremento = 25, 
		RULE_decremento = 26, RULE_return = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "programa", "instrucciones", "instruccion", "operador", "iwhile", 
			"if", "else", "bloque", "opal", "explogic", "expArit", "termino", "factor", 
			"op", "ifor", "init", "var", "asignacion", "cond", "iter", "proto", "func", 
			"var_func", "callFunc", "incremento", "decremento", "return"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "';'", "','", "'while'", null, "'for'", 
			"'if'", "'else'", "'return'", "'int'", "'double'", "'char'", "'float'", 
			"'String'", "'boolean'", "'void'", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'='", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'++'", "'--'", 
			null, null, "'||'", "'&&'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PA", "PC", "LLA", "LLC", "PYC", "COM", "WHILE", "NUMERO", "FOR", 
			"IF", "ELSE", "RETURN", "INT", "DOUBLE", "CHAR", "FLOAT", "STRING", "BOOLEAN", 
			"VOID", "SUMA", "RESTA", "MULT", "DIV", "MOD", "ASIG", "EQQ", "NE", "LT", 
			"GT", "LE", "GE", "INCR", "DECR", "WS", "ID", "OR", "AND", "NOT", "OTRO"
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
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				((SContext)_localctx).ID = match(ID);
				print("ID ->" + (((SContext)_localctx).ID!=null?((SContext)_localctx).ID.getText():null) + "<--") 
				setState(58);
				s();
				}
				break;
			case NUMERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				((SContext)_localctx).NUMERO = match(NUMERO);
				print("NUMERO ->" + (((SContext)_localctx).NUMERO!=null?((SContext)_localctx).NUMERO.getText():null) + "<--") 
				setState(61);
				s();
				}
				break;
			case OTRO:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				((SContext)_localctx).OTRO = match(OTRO);
				print("Otro ->" + (((SContext)_localctx).OTRO!=null?((SContext)_localctx).OTRO.getText():null) + "<--") 
				setState(64);
				s();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
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
			setState(68);
			instrucciones();
			setState(69);
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
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
			case LLA:
			case WHILE:
			case NUMERO:
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
				setState(71);
				instruccion();
				setState(72);
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
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public TerminalNode PYC() { return getToken(compiladoresParser.PYC, 0); }
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
		public ProtoContext proto() {
			return getRuleContext(ProtoContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public CallFuncContext callFunc() {
			return getRuleContext(CallFuncContext.class,0);
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
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				init();
				setState(78);
				match(PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				iwhile();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				bloque();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				ifor();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				asignacion();
				setState(84);
				match(PYC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(86);
				proto();
				setState(87);
				match(PYC);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(89);
				func();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(90);
				if_();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(91);
				opal();
				setState(92);
				match(PYC);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(94);
				return_();
				setState(95);
				match(PYC);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(97);
				callFunc();
				setState(98);
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
	public static class OperadorContext extends ParserRuleContext {
		public TerminalNode EQQ() { return getToken(compiladoresParser.EQQ, 0); }
		public TerminalNode NE() { return getToken(compiladoresParser.NE, 0); }
		public TerminalNode GT() { return getToken(compiladoresParser.GT, 0); }
		public TerminalNode LT() { return getToken(compiladoresParser.LT, 0); }
		public TerminalNode GE() { return getToken(compiladoresParser.GE, 0); }
		public TerminalNode LE() { return getToken(compiladoresParser.LE, 0); }
		public TerminalNode OR() { return getToken(compiladoresParser.OR, 0); }
		public TerminalNode AND() { return getToken(compiladoresParser.AND, 0); }
		public TerminalNode NOT() { return getToken(compiladoresParser.NOT, 0); }
		public TerminalNode OTRO() { return getToken(compiladoresParser.OTRO, 0); }
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
			setState(102);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1035020009472L) != 0)) ) {
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
	public static class IwhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(compiladoresParser.WHILE, 0); }
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
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
			setState(104);
			match(WHILE);
			setState(105);
			match(PA);
			setState(106);
			match(ID);
			setState(107);
			match(PC);
			setState(108);
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
	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(compiladoresParser.IF, 0); }
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public ExplogicContext explogic() {
			return getRuleContext(ExplogicContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(compiladoresParser.ELSE, 0); }
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(IF);
				setState(111);
				match(PA);
				setState(112);
				explogic();
				setState(113);
				match(PC);
				setState(114);
				bloque();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(IF);
				setState(117);
				match(PA);
				setState(118);
				explogic();
				setState(119);
				match(PC);
				setState(120);
				bloque();
				setState(121);
				match(ELSE);
				setState(122);
				bloque();
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
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(ELSE);
				setState(127);
				bloque();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(ELSE);
				setState(129);
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
			setState(133);
			match(LLA);
			setState(134);
			instrucciones();
			setState(135);
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
		public ExplogicContext explogic() {
			return getRuleContext(ExplogicContext.class,0);
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
			setState(137);
			explogic();
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
	public static class ExplogicContext extends ParserRuleContext {
		public List<ExpAritContext> expArit() {
			return getRuleContexts(ExpAritContext.class);
		}
		public ExpAritContext expArit(int i) {
			return getRuleContext(ExpAritContext.class,i);
		}
		public TerminalNode OR() { return getToken(compiladoresParser.OR, 0); }
		public TerminalNode AND() { return getToken(compiladoresParser.AND, 0); }
		public ExplogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explogic; }
	}

	public final ExplogicContext explogic() throws RecognitionException {
		ExplogicContext _localctx = new ExplogicContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_explogic);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				expArit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				expArit();
				setState(141);
				match(OR);
				setState(142);
				expArit();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				expArit();
				setState(145);
				match(AND);
				setState(146);
				expArit();
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
	public static class ExpAritContext extends ParserRuleContext {
		public List<TerminoContext> termino() {
			return getRuleContexts(TerminoContext.class);
		}
		public TerminoContext termino(int i) {
			return getRuleContext(TerminoContext.class,i);
		}
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public ExpAritContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expArit; }
	}

	public final ExpAritContext expArit() throws RecognitionException {
		ExpAritContext _localctx = new ExpAritContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expArit);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				termino();
				setState(151);
				operador();
				setState(152);
				termino();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				termino();
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
	public static class TerminoContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_termino);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				factor();
				setState(158);
				op();
				setState(159);
				factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				factor();
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
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public TerminalNode NUMERO() { return getToken(compiladoresParser.NUMERO, 0); }
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public ExpAritContext expArit() {
			return getRuleContext(ExpAritContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_factor);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(ID);
				}
				break;
			case NUMERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(NUMERO);
				}
				break;
			case PA:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				match(PA);
				setState(167);
				expArit();
				setState(168);
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
	public static class OpContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(compiladoresParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(compiladoresParser.RESTA, 0); }
		public TerminalNode MULT() { return getToken(compiladoresParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(compiladoresParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(compiladoresParser.MOD, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32505856L) != 0)) ) {
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
		public ExplogicContext explogic() {
			return getRuleContext(ExplogicContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
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
			setState(174);
			match(FOR);
			setState(175);
			match(PA);
			setState(176);
			asignacion();
			setState(177);
			match(PYC);
			setState(178);
			explogic();
			setState(179);
			match(PYC);
			setState(180);
			asignacion();
			setState(181);
			match(PC);
			setState(182);
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
	public static class InitContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public TerminalNode INT() { return getToken(compiladoresParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(compiladoresParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(compiladoresParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(compiladoresParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(compiladoresParser.CHAR, 0); }
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 385024L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(185);
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
	public static class VarContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(compiladoresParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(compiladoresParser.ID, i);
		}
		public TerminalNode COM() { return getToken(compiladoresParser.COM, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_var);
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(ID);
				setState(189);
				match(COM);
				setState(190);
				match(ID);
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
		enterRule(_localctx, 36, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(ID);
			setState(194);
			match(ASIG);
			setState(195);
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
	public static class CondContext extends ParserRuleContext {
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cond);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				termino();
				setState(198);
				operador();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				termino();
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
	public static class IterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public ExplogicContext explogic() {
			return getRuleContext(ExplogicContext.class,0);
		}
		public IterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iter; }
	}

	public final IterContext iter() throws RecognitionException {
		IterContext _localctx = new IterContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_iter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(ID);
			setState(205);
			explogic();
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
		enterRule(_localctx, 42, RULE_proto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 909312L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(208);
			match(ID);
			setState(209);
			match(PA);
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case CHAR:
			case FLOAT:
			case BOOLEAN:
				{
				setState(210);
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
			setState(214);
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
		enterRule(_localctx, 44, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 909312L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(217);
			match(ID);
			setState(218);
			match(PA);
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case CHAR:
			case FLOAT:
			case BOOLEAN:
				{
				setState(219);
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
			setState(223);
			match(PC);
			setState(224);
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
		enterRule(_localctx, 46, RULE_var_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 385024L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(227);
			match(ID);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(228);
				match(COM);
				setState(229);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 385024L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(230);
				match(ID);
				}
				}
				setState(235);
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
		enterRule(_localctx, 48, RULE_callFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(ID);
			setState(237);
			match(PA);
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(238);
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
			setState(242);
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
	public static class IncrementoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public TerminalNode INCR() { return getToken(compiladoresParser.INCR, 0); }
		public IncrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incremento; }
	}

	public final IncrementoContext incremento() throws RecognitionException {
		IncrementoContext _localctx = new IncrementoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_incremento);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(ID);
				setState(245);
				match(INCR);
				}
				break;
			case INCR:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(INCR);
				setState(247);
				match(ID);
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
	public static class DecrementoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public TerminalNode DECR() { return getToken(compiladoresParser.DECR, 0); }
		public DecrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decremento; }
	}

	public final DecrementoContext decremento() throws RecognitionException {
		DecrementoContext _localctx = new DecrementoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_decremento);
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(ID);
				setState(251);
				match(DECR);
				}
				break;
			case DECR:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(DECR);
				setState(253);
				match(ID);
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
		enterRule(_localctx, 54, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(RETURN);
			setState(257);
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
		"\u0004\u0001\'\u0104\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000C\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002L\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003e\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006}\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0084\b\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0095\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u009c\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00a3\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00ab\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u00c0\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00cb"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00d5\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u00de\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u00e8\b\u0017\n"+
		"\u0017\f\u0017\u00eb\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u00f1\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u00f9\b\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u00ff\b\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0000\u0000\u001c\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"0246\u0000\u0004\u0002\u0000\u001a\u001f$\'\u0001\u0000\u0014\u0018\u0002"+
		"\u0000\r\u0010\u0012\u0012\u0002\u0000\r\u0010\u0012\u0013\u0107\u0000"+
		"B\u0001\u0000\u0000\u0000\u0002D\u0001\u0000\u0000\u0000\u0004K\u0001"+
		"\u0000\u0000\u0000\u0006d\u0001\u0000\u0000\u0000\bf\u0001\u0000\u0000"+
		"\u0000\nh\u0001\u0000\u0000\u0000\f|\u0001\u0000\u0000\u0000\u000e\u0083"+
		"\u0001\u0000\u0000\u0000\u0010\u0085\u0001\u0000\u0000\u0000\u0012\u0089"+
		"\u0001\u0000\u0000\u0000\u0014\u0094\u0001\u0000\u0000\u0000\u0016\u009b"+
		"\u0001\u0000\u0000\u0000\u0018\u00a2\u0001\u0000\u0000\u0000\u001a\u00aa"+
		"\u0001\u0000\u0000\u0000\u001c\u00ac\u0001\u0000\u0000\u0000\u001e\u00ae"+
		"\u0001\u0000\u0000\u0000 \u00b8\u0001\u0000\u0000\u0000\"\u00bf\u0001"+
		"\u0000\u0000\u0000$\u00c1\u0001\u0000\u0000\u0000&\u00ca\u0001\u0000\u0000"+
		"\u0000(\u00cc\u0001\u0000\u0000\u0000*\u00cf\u0001\u0000\u0000\u0000,"+
		"\u00d8\u0001\u0000\u0000\u0000.\u00e2\u0001\u0000\u0000\u00000\u00ec\u0001"+
		"\u0000\u0000\u00002\u00f8\u0001\u0000\u0000\u00004\u00fe\u0001\u0000\u0000"+
		"\u00006\u0100\u0001\u0000\u0000\u000089\u0005#\u0000\u00009:\u0006\u0000"+
		"\uffff\uffff\u0000:C\u0003\u0000\u0000\u0000;<\u0005\b\u0000\u0000<=\u0006"+
		"\u0000\uffff\uffff\u0000=C\u0003\u0000\u0000\u0000>?\u0005\'\u0000\u0000"+
		"?@\u0006\u0000\uffff\uffff\u0000@C\u0003\u0000\u0000\u0000AC\u0005\u0000"+
		"\u0000\u0001B8\u0001\u0000\u0000\u0000B;\u0001\u0000\u0000\u0000B>\u0001"+
		"\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000C\u0001\u0001\u0000\u0000"+
		"\u0000DE\u0003\u0004\u0002\u0000EF\u0005\u0000\u0000\u0001F\u0003\u0001"+
		"\u0000\u0000\u0000GH\u0003\u0006\u0003\u0000HI\u0003\u0004\u0002\u0000"+
		"IL\u0001\u0000\u0000\u0000JL\u0001\u0000\u0000\u0000KG\u0001\u0000\u0000"+
		"\u0000KJ\u0001\u0000\u0000\u0000L\u0005\u0001\u0000\u0000\u0000MN\u0003"+
		" \u0010\u0000NO\u0005\u0005\u0000\u0000Oe\u0001\u0000\u0000\u0000Pe\u0003"+
		"\n\u0005\u0000Qe\u0003\u0010\b\u0000Re\u0003\u001e\u000f\u0000ST\u0003"+
		"$\u0012\u0000TU\u0005\u0005\u0000\u0000Ue\u0001\u0000\u0000\u0000VW\u0003"+
		"*\u0015\u0000WX\u0005\u0005\u0000\u0000Xe\u0001\u0000\u0000\u0000Ye\u0003"+
		",\u0016\u0000Ze\u0003\f\u0006\u0000[\\\u0003\u0012\t\u0000\\]\u0005\u0005"+
		"\u0000\u0000]e\u0001\u0000\u0000\u0000^_\u00036\u001b\u0000_`\u0005\u0005"+
		"\u0000\u0000`e\u0001\u0000\u0000\u0000ab\u00030\u0018\u0000bc\u0005\u0005"+
		"\u0000\u0000ce\u0001\u0000\u0000\u0000dM\u0001\u0000\u0000\u0000dP\u0001"+
		"\u0000\u0000\u0000dQ\u0001\u0000\u0000\u0000dR\u0001\u0000\u0000\u0000"+
		"dS\u0001\u0000\u0000\u0000dV\u0001\u0000\u0000\u0000dY\u0001\u0000\u0000"+
		"\u0000dZ\u0001\u0000\u0000\u0000d[\u0001\u0000\u0000\u0000d^\u0001\u0000"+
		"\u0000\u0000da\u0001\u0000\u0000\u0000e\u0007\u0001\u0000\u0000\u0000"+
		"fg\u0007\u0000\u0000\u0000g\t\u0001\u0000\u0000\u0000hi\u0005\u0007\u0000"+
		"\u0000ij\u0005\u0001\u0000\u0000jk\u0005#\u0000\u0000kl\u0005\u0002\u0000"+
		"\u0000lm\u0003\u0010\b\u0000m\u000b\u0001\u0000\u0000\u0000no\u0005\n"+
		"\u0000\u0000op\u0005\u0001\u0000\u0000pq\u0003\u0014\n\u0000qr\u0005\u0002"+
		"\u0000\u0000rs\u0003\u0010\b\u0000s}\u0001\u0000\u0000\u0000tu\u0005\n"+
		"\u0000\u0000uv\u0005\u0001\u0000\u0000vw\u0003\u0014\n\u0000wx\u0005\u0002"+
		"\u0000\u0000xy\u0003\u0010\b\u0000yz\u0005\u000b\u0000\u0000z{\u0003\u0010"+
		"\b\u0000{}\u0001\u0000\u0000\u0000|n\u0001\u0000\u0000\u0000|t\u0001\u0000"+
		"\u0000\u0000}\r\u0001\u0000\u0000\u0000~\u007f\u0005\u000b\u0000\u0000"+
		"\u007f\u0084\u0003\u0010\b\u0000\u0080\u0081\u0005\u000b\u0000\u0000\u0081"+
		"\u0084\u0003\f\u0006\u0000\u0082\u0084\u0001\u0000\u0000\u0000\u0083~"+
		"\u0001\u0000\u0000\u0000\u0083\u0080\u0001\u0000\u0000\u0000\u0083\u0082"+
		"\u0001\u0000\u0000\u0000\u0084\u000f\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0005\u0003\u0000\u0000\u0086\u0087\u0003\u0004\u0002\u0000\u0087\u0088"+
		"\u0005\u0004\u0000\u0000\u0088\u0011\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0003\u0014\n\u0000\u008a\u0013\u0001\u0000\u0000\u0000\u008b\u0095\u0003"+
		"\u0016\u000b\u0000\u008c\u008d\u0003\u0016\u000b\u0000\u008d\u008e\u0005"+
		"$\u0000\u0000\u008e\u008f\u0003\u0016\u000b\u0000\u008f\u0095\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0003\u0016\u000b\u0000\u0091\u0092\u0005%\u0000"+
		"\u0000\u0092\u0093\u0003\u0016\u000b\u0000\u0093\u0095\u0001\u0000\u0000"+
		"\u0000\u0094\u008b\u0001\u0000\u0000\u0000\u0094\u008c\u0001\u0000\u0000"+
		"\u0000\u0094\u0090\u0001\u0000\u0000\u0000\u0095\u0015\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0003\u0018\f\u0000\u0097\u0098\u0003\b\u0004\u0000"+
		"\u0098\u0099\u0003\u0018\f\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a"+
		"\u009c\u0003\u0018\f\u0000\u009b\u0096\u0001\u0000\u0000\u0000\u009b\u009a"+
		"\u0001\u0000\u0000\u0000\u009c\u0017\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0003\u001a\r\u0000\u009e\u009f\u0003\u001c\u000e\u0000\u009f\u00a0\u0003"+
		"\u001a\r\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u00a3\u0003\u001a"+
		"\r\u0000\u00a2\u009d\u0001\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a3\u0019\u0001\u0000\u0000\u0000\u00a4\u00ab\u0005#\u0000\u0000"+
		"\u00a5\u00ab\u0005\b\u0000\u0000\u00a6\u00a7\u0005\u0001\u0000\u0000\u00a7"+
		"\u00a8\u0003\u0016\u000b\u0000\u00a8\u00a9\u0005\u0002\u0000\u0000\u00a9"+
		"\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a4\u0001\u0000\u0000\u0000\u00aa"+
		"\u00a5\u0001\u0000\u0000\u0000\u00aa\u00a6\u0001\u0000\u0000\u0000\u00ab"+
		"\u001b\u0001\u0000\u0000\u0000\u00ac\u00ad\u0007\u0001\u0000\u0000\u00ad"+
		"\u001d\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\t\u0000\u0000\u00af\u00b0"+
		"\u0005\u0001\u0000\u0000\u00b0\u00b1\u0003$\u0012\u0000\u00b1\u00b2\u0005"+
		"\u0005\u0000\u0000\u00b2\u00b3\u0003\u0014\n\u0000\u00b3\u00b4\u0005\u0005"+
		"\u0000\u0000\u00b4\u00b5\u0003$\u0012\u0000\u00b5\u00b6\u0005\u0002\u0000"+
		"\u0000\u00b6\u00b7\u0003\u0010\b\u0000\u00b7\u001f\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b9\u0007\u0002\u0000\u0000\u00b9\u00ba\u0005#\u0000\u0000\u00ba"+
		"!\u0001\u0000\u0000\u0000\u00bb\u00c0\u0005#\u0000\u0000\u00bc\u00bd\u0005"+
		"#\u0000\u0000\u00bd\u00be\u0005\u0006\u0000\u0000\u00be\u00c0\u0005#\u0000"+
		"\u0000\u00bf\u00bb\u0001\u0000\u0000\u0000\u00bf\u00bc\u0001\u0000\u0000"+
		"\u0000\u00c0#\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005#\u0000\u0000\u00c2"+
		"\u00c3\u0005\u0019\u0000\u0000\u00c3\u00c4\u0003\u0012\t\u0000\u00c4%"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c6\u0003\u0018\f\u0000\u00c6\u00c7\u0003"+
		"\b\u0004\u0000\u00c7\u00cb\u0001\u0000\u0000\u0000\u00c8\u00cb\u0003\u0018"+
		"\f\u0000\u00c9\u00cb\u0001\u0000\u0000\u0000\u00ca\u00c5\u0001\u0000\u0000"+
		"\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00c9\u0001\u0000\u0000"+
		"\u0000\u00cb\'\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005#\u0000\u0000"+
		"\u00cd\u00ce\u0003\u0014\n\u0000\u00ce)\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0007\u0003\u0000\u0000\u00d0\u00d1\u0005#\u0000\u0000\u00d1\u00d4"+
		"\u0005\u0001\u0000\u0000\u00d2\u00d5\u0003.\u0017\u0000\u00d3\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005"+
		"\u0002\u0000\u0000\u00d7+\u0001\u0000\u0000\u0000\u00d8\u00d9\u0007\u0003"+
		"\u0000\u0000\u00d9\u00da\u0005#\u0000\u0000\u00da\u00dd\u0005\u0001\u0000"+
		"\u0000\u00db\u00de\u0003.\u0017\u0000\u00dc\u00de\u0001\u0000\u0000\u0000"+
		"\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000"+
		"\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u0002\u0000\u0000"+
		"\u00e0\u00e1\u0003\u0010\b\u0000\u00e1-\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e3\u0007\u0002\u0000\u0000\u00e3\u00e9\u0005#\u0000\u0000\u00e4\u00e5"+
		"\u0005\u0006\u0000\u0000\u00e5\u00e6\u0007\u0002\u0000\u0000\u00e6\u00e8"+
		"\u0005#\u0000\u0000\u00e7\u00e4\u0001\u0000\u0000\u0000\u00e8\u00eb\u0001"+
		"\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ea/\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ed\u0005#\u0000\u0000\u00ed\u00f0\u0005\u0001\u0000"+
		"\u0000\u00ee\u00f1\u0003\"\u0011\u0000\u00ef\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005\u0002\u0000\u0000"+
		"\u00f31\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005#\u0000\u0000\u00f5\u00f9"+
		"\u0005 \u0000\u0000\u00f6\u00f7\u0005 \u0000\u0000\u00f7\u00f9\u0005#"+
		"\u0000\u0000\u00f8\u00f4\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f93\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005#\u0000\u0000"+
		"\u00fb\u00ff\u0005!\u0000\u0000\u00fc\u00fd\u0005!\u0000\u0000\u00fd\u00ff"+
		"\u0005#\u0000\u0000\u00fe\u00fa\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001"+
		"\u0000\u0000\u0000\u00ff5\u0001\u0000\u0000\u0000\u0100\u0101\u0005\f"+
		"\u0000\u0000\u0101\u0102\u0003\u0012\t\u0000\u01027\u0001\u0000\u0000"+
		"\u0000\u0011BKd|\u0083\u0094\u009b\u00a2\u00aa\u00bf\u00ca\u00d4\u00dd"+
		"\u00e9\u00f0\u00f8\u00fe";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}