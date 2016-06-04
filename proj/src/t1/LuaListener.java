// Generated from D:/Projects/GitHub_locals/DC-UFSCar-Comp1-201601-T1/proj/src/t1\Lua.g4 by ANTLR 4.5.1
package t1;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LuaParser}.
 */
public interface LuaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LuaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(LuaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(LuaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(LuaParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(LuaParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#retbreak}.
	 * @param ctx the parse tree
	 */
	void enterRetbreak(LuaParser.RetbreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#retbreak}.
	 * @param ctx the parse tree
	 */
	void exitRetbreak(LuaParser.RetbreakContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#trecho}.
	 * @param ctx the parse tree
	 */
	void enterTrecho(LuaParser.TrechoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#trecho}.
	 * @param ctx the parse tree
	 */
	void exitTrecho(LuaParser.TrechoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(LuaParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(LuaParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#nomedafuncao}.
	 * @param ctx the parse tree
	 */
	void enterNomedafuncao(LuaParser.NomedafuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#nomedafuncao}.
	 * @param ctx the parse tree
	 */
	void exitNomedafuncao(LuaParser.NomedafuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#listadenomes}.
	 * @param ctx the parse tree
	 */
	void enterListadenomes(LuaParser.ListadenomesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#listadenomes}.
	 * @param ctx the parse tree
	 */
	void exitListadenomes(LuaParser.ListadenomesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(LuaParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(LuaParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#listaexp}.
	 * @param ctx the parse tree
	 */
	void enterListaexp(LuaParser.ListaexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#listaexp}.
	 * @param ctx the parse tree
	 */
	void exitListaexp(LuaParser.ListaexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#listavar}.
	 * @param ctx the parse tree
	 */
	void enterListavar(LuaParser.ListavarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#listavar}.
	 * @param ctx the parse tree
	 */
	void exitListavar(LuaParser.ListavarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#expprefixo}.
	 * @param ctx the parse tree
	 */
	void enterExpprefixo(LuaParser.ExpprefixoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#expprefixo}.
	 * @param ctx the parse tree
	 */
	void exitExpprefixo(LuaParser.ExpprefixoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#complementovar}.
	 * @param ctx the parse tree
	 */
	void enterComplementovar(LuaParser.ComplementovarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#complementovar}.
	 * @param ctx the parse tree
	 */
	void exitComplementovar(LuaParser.ComplementovarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(LuaParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(LuaParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#chamadadefuncao}.
	 * @param ctx the parse tree
	 */
	void enterChamadadefuncao(LuaParser.ChamadadefuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#chamadadefuncao}.
	 * @param ctx the parse tree
	 */
	void exitChamadadefuncao(LuaParser.ChamadadefuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(LuaParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(LuaParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(LuaParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(LuaParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#corpodafuncao}.
	 * @param ctx the parse tree
	 */
	void enterCorpodafuncao(LuaParser.CorpodafuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#corpodafuncao}.
	 * @param ctx the parse tree
	 */
	void exitCorpodafuncao(LuaParser.CorpodafuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#listadeparametros}.
	 * @param ctx the parse tree
	 */
	void enterListadeparametros(LuaParser.ListadeparametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#listadeparametros}.
	 * @param ctx the parse tree
	 */
	void exitListadeparametros(LuaParser.ListadeparametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#construtordetabelas}.
	 * @param ctx the parse tree
	 */
	void enterConstrutordetabelas(LuaParser.ConstrutordetabelasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#construtordetabelas}.
	 * @param ctx the parse tree
	 */
	void exitConstrutordetabelas(LuaParser.ConstrutordetabelasContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#listadecampos}.
	 * @param ctx the parse tree
	 */
	void enterListadecampos(LuaParser.ListadecamposContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#listadecampos}.
	 * @param ctx the parse tree
	 */
	void exitListadecampos(LuaParser.ListadecamposContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#campo}.
	 * @param ctx the parse tree
	 */
	void enterCampo(LuaParser.CampoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#campo}.
	 * @param ctx the parse tree
	 */
	void exitCampo(LuaParser.CampoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#separadordecampos}.
	 * @param ctx the parse tree
	 */
	void enterSeparadordecampos(LuaParser.SeparadordecamposContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#separadordecampos}.
	 * @param ctx the parse tree
	 */
	void exitSeparadordecampos(LuaParser.SeparadordecamposContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#opLogicoOu}.
	 * @param ctx the parse tree
	 */
	void enterOpLogicoOu(LuaParser.OpLogicoOuContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#opLogicoOu}.
	 * @param ctx the parse tree
	 */
	void exitOpLogicoOu(LuaParser.OpLogicoOuContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#opLogicoE}.
	 * @param ctx the parse tree
	 */
	void enterOpLogicoE(LuaParser.OpLogicoEContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#opLogicoE}.
	 * @param ctx the parse tree
	 */
	void exitOpLogicoE(LuaParser.OpLogicoEContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#opComparacao}.
	 * @param ctx the parse tree
	 */
	void enterOpComparacao(LuaParser.OpComparacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#opComparacao}.
	 * @param ctx the parse tree
	 */
	void exitOpComparacao(LuaParser.OpComparacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#opConcat}.
	 * @param ctx the parse tree
	 */
	void enterOpConcat(LuaParser.OpConcatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#opConcat}.
	 * @param ctx the parse tree
	 */
	void exitOpConcat(LuaParser.OpConcatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#opSomaSub}.
	 * @param ctx the parse tree
	 */
	void enterOpSomaSub(LuaParser.OpSomaSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#opSomaSub}.
	 * @param ctx the parse tree
	 */
	void exitOpSomaSub(LuaParser.OpSomaSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#opMulDivMod}.
	 * @param ctx the parse tree
	 */
	void enterOpMulDivMod(LuaParser.OpMulDivModContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#opMulDivMod}.
	 * @param ctx the parse tree
	 */
	void exitOpMulDivMod(LuaParser.OpMulDivModContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#opUnario}.
	 * @param ctx the parse tree
	 */
	void enterOpUnario(LuaParser.OpUnarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#opUnario}.
	 * @param ctx the parse tree
	 */
	void exitOpUnario(LuaParser.OpUnarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#opPotencia}.
	 * @param ctx the parse tree
	 */
	void enterOpPotencia(LuaParser.OpPotenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#opPotencia}.
	 * @param ctx the parse tree
	 */
	void exitOpPotencia(LuaParser.OpPotenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(LuaParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(LuaParser.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#cadeia}.
	 * @param ctx the parse tree
	 */
	void enterCadeia(LuaParser.CadeiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#cadeia}.
	 * @param ctx the parse tree
	 */
	void exitCadeia(LuaParser.CadeiaContext ctx);
}