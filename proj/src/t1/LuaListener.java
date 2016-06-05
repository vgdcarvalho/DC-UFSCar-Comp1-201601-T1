// Generated from D:/Projects/GitHub_locals/DC-UFSCar-Comp1-201601-T1/proj/src/t1\Lua.g4 by ANTLR 4.5.1
package t1;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LuaParser}.
 */
public interface LuaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LuaParser#operadorPotencia}.
	 * @param ctx the parse tree
	 */
	void enterOperadorPotencia(LuaParser.OperadorPotenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#operadorPotencia}.
	 * @param ctx the parse tree
	 */
	void exitOperadorPotencia(LuaParser.OperadorPotenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#operadorSomaSub}.
	 * @param ctx the parse tree
	 */
	void enterOperadorSomaSub(LuaParser.OperadorSomaSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#operadorSomaSub}.
	 * @param ctx the parse tree
	 */
	void exitOperadorSomaSub(LuaParser.OperadorSomaSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#operadorE}.
	 * @param ctx the parse tree
	 */
	void enterOperadorE(LuaParser.OperadorEContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#operadorE}.
	 * @param ctx the parse tree
	 */
	void exitOperadorE(LuaParser.OperadorEContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#operadorOu}.
	 * @param ctx the parse tree
	 */
	void enterOperadorOu(LuaParser.OperadorOuContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#operadorOu}.
	 * @param ctx the parse tree
	 */
	void exitOperadorOu(LuaParser.OperadorOuContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#operadorRelacional}.
	 * @param ctx the parse tree
	 */
	void enterOperadorRelacional(LuaParser.OperadorRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#operadorRelacional}.
	 * @param ctx the parse tree
	 */
	void exitOperadorRelacional(LuaParser.OperadorRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#operadorAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterOperadorAtribuicao(LuaParser.OperadorAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#operadorAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitOperadorAtribuicao(LuaParser.OperadorAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#operadorStrcat}.
	 * @param ctx the parse tree
	 */
	void enterOperadorStrcat(LuaParser.OperadorStrcatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#operadorStrcat}.
	 * @param ctx the parse tree
	 */
	void exitOperadorStrcat(LuaParser.OperadorStrcatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#operadorMulDivMod}.
	 * @param ctx the parse tree
	 */
	void enterOperadorMulDivMod(LuaParser.OperadorMulDivModContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#operadorMulDivMod}.
	 * @param ctx the parse tree
	 */
	void exitOperadorMulDivMod(LuaParser.OperadorMulDivModContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#operadorUnario}.
	 * @param ctx the parse tree
	 */
	void enterOperadorUnario(LuaParser.OperadorUnarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#operadorUnario}.
	 * @param ctx the parse tree
	 */
	void exitOperadorUnario(LuaParser.OperadorUnarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#operadorExtra}.
	 * @param ctx the parse tree
	 */
	void enterOperadorExtra(LuaParser.OperadorExtraContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#operadorExtra}.
	 * @param ctx the parse tree
	 */
	void exitOperadorExtra(LuaParser.OperadorExtraContext ctx);
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
	 * Enter a parse tree produced by {@link LuaParser#exp0}.
	 * @param ctx the parse tree
	 */
	void enterExp0(LuaParser.Exp0Context ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#exp0}.
	 * @param ctx the parse tree
	 */
	void exitExp0(LuaParser.Exp0Context ctx);
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
	 * Enter a parse tree produced by {@link LuaParser#exp1}.
	 * @param ctx the parse tree
	 */
	void enterExp1(LuaParser.Exp1Context ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#exp1}.
	 * @param ctx the parse tree
	 */
	void exitExp1(LuaParser.Exp1Context ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#exp2}.
	 * @param ctx the parse tree
	 */
	void enterExp2(LuaParser.Exp2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#exp2}.
	 * @param ctx the parse tree
	 */
	void exitExp2(LuaParser.Exp2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#exp3}.
	 * @param ctx the parse tree
	 */
	void enterExp3(LuaParser.Exp3Context ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#exp3}.
	 * @param ctx the parse tree
	 */
	void exitExp3(LuaParser.Exp3Context ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#exp4}.
	 * @param ctx the parse tree
	 */
	void enterExp4(LuaParser.Exp4Context ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#exp4}.
	 * @param ctx the parse tree
	 */
	void exitExp4(LuaParser.Exp4Context ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#exp5}.
	 * @param ctx the parse tree
	 */
	void enterExp5(LuaParser.Exp5Context ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#exp5}.
	 * @param ctx the parse tree
	 */
	void exitExp5(LuaParser.Exp5Context ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#exp6}.
	 * @param ctx the parse tree
	 */
	void enterExp6(LuaParser.Exp6Context ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#exp6}.
	 * @param ctx the parse tree
	 */
	void exitExp6(LuaParser.Exp6Context ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#exp7}.
	 * @param ctx the parse tree
	 */
	void enterExp7(LuaParser.Exp7Context ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#exp7}.
	 * @param ctx the parse tree
	 */
	void exitExp7(LuaParser.Exp7Context ctx);
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