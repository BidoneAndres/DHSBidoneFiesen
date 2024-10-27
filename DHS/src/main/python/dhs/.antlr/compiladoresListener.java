// Generated from /home/eduardo/DHS/DHSBidoneFiesen/DHS/src/main/python/dhs/compiladores.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link compiladoresParser}.
 */
public interface compiladoresListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(compiladoresParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(compiladoresParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(compiladoresParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(compiladoresParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(compiladoresParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(compiladoresParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(compiladoresParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(compiladoresParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#operador}.
	 * @param ctx the parse tree
	 */
	void enterOperador(compiladoresParser.OperadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#operador}.
	 * @param ctx the parse tree
	 */
	void exitOperador(compiladoresParser.OperadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#iwhile}.
	 * @param ctx the parse tree
	 */
	void enterIwhile(compiladoresParser.IwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#iwhile}.
	 * @param ctx the parse tree
	 */
	void exitIwhile(compiladoresParser.IwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(compiladoresParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(compiladoresParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(compiladoresParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(compiladoresParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(compiladoresParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(compiladoresParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#opal}.
	 * @param ctx the parse tree
	 */
	void enterOpal(compiladoresParser.OpalContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#opal}.
	 * @param ctx the parse tree
	 */
	void exitOpal(compiladoresParser.OpalContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(compiladoresParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(compiladoresParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(compiladoresParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(compiladoresParser.EContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(compiladoresParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(compiladoresParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(compiladoresParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(compiladoresParser.TContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(compiladoresParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(compiladoresParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#ifor}.
	 * @param ctx the parse tree
	 */
	void enterIfor(compiladoresParser.IforContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#ifor}.
	 * @param ctx the parse tree
	 */
	void exitIfor(compiladoresParser.IforContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#oplo}.
	 * @param ctx the parse tree
	 */
	void enterOplo(compiladoresParser.OploContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#oplo}.
	 * @param ctx the parse tree
	 */
	void exitOplo(compiladoresParser.OploContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#expresion_logica}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_logica(compiladoresParser.Expresion_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#expresion_logica}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_logica(compiladoresParser.Expresion_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#termino_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermino_logico(compiladoresParser.Termino_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#termino_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermino_logico(compiladoresParser.Termino_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#term_logico}.
	 * @param ctx the parse tree
	 */
	void enterTerm_logico(compiladoresParser.Term_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#term_logico}.
	 * @param ctx the parse tree
	 */
	void exitTerm_logico(compiladoresParser.Term_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#factor_logico}.
	 * @param ctx the parse tree
	 */
	void enterFactor_logico(compiladoresParser.Factor_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#factor_logico}.
	 * @param ctx the parse tree
	 */
	void exitFactor_logico(compiladoresParser.Factor_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(compiladoresParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(compiladoresParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(compiladoresParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(compiladoresParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(compiladoresParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(compiladoresParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(compiladoresParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(compiladoresParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(compiladoresParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(compiladoresParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#condicionales}.
	 * @param ctx the parse tree
	 */
	void enterCondicionales(compiladoresParser.CondicionalesContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#condicionales}.
	 * @param ctx the parse tree
	 */
	void exitCondicionales(compiladoresParser.CondicionalesContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#iter}.
	 * @param ctx the parse tree
	 */
	void enterIter(compiladoresParser.IterContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#iter}.
	 * @param ctx the parse tree
	 */
	void exitIter(compiladoresParser.IterContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#proto}.
	 * @param ctx the parse tree
	 */
	void enterProto(compiladoresParser.ProtoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#proto}.
	 * @param ctx the parse tree
	 */
	void exitProto(compiladoresParser.ProtoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(compiladoresParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(compiladoresParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#var_func}.
	 * @param ctx the parse tree
	 */
	void enterVar_func(compiladoresParser.Var_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#var_func}.
	 * @param ctx the parse tree
	 */
	void exitVar_func(compiladoresParser.Var_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(compiladoresParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(compiladoresParser.ReturnContext ctx);
}