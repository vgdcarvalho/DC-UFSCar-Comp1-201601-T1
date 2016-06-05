// Generated from D:/Projects/GitHub_locals/DC-UFSCar-Comp1-201601-T1/proj/src/t1\Lua.g4 by ANTLR 4.5.1
package t1;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LuaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, NOME=49, CADEIA_NORMAL=50, CADEIA_CHAR=51, 
		NUMERO=52, COMENTARIO=53, WS=54, PalavraReservada=55;
	public static final int
		RULE_operadorPotencia = 0, RULE_operadorSomaSub = 1, RULE_operadorE = 2, 
		RULE_operadorOu = 3, RULE_operadorRelacional = 4, RULE_operadorAtribuicao = 5, 
		RULE_operadorStrcat = 6, RULE_operadorMulDivMod = 7, RULE_operadorUnario = 8, 
		RULE_operadorExtra = 9, RULE_programa = 10, RULE_comando = 11, RULE_retbreak = 12, 
		RULE_trecho = 13, RULE_bloco = 14, RULE_nomedafuncao = 15, RULE_listadenomes = 16, 
		RULE_exp0 = 17, RULE_exp = 18, RULE_exp1 = 19, RULE_exp2 = 20, RULE_exp3 = 21, 
		RULE_exp4 = 22, RULE_exp5 = 23, RULE_exp6 = 24, RULE_exp7 = 25, RULE_listaexp = 26, 
		RULE_listavar = 27, RULE_expprefixo = 28, RULE_complementovar = 29, RULE_var = 30, 
		RULE_chamadadefuncao = 31, RULE_argumentos = 32, RULE_funcao = 33, RULE_corpodafuncao = 34, 
		RULE_listadeparametros = 35, RULE_construtordetabelas = 36, RULE_listadecampos = 37, 
		RULE_campo = 38, RULE_separadordecampos = 39, RULE_cadeia = 40;
	public static final String[] ruleNames = {
		"operadorPotencia", "operadorSomaSub", "operadorE", "operadorOu", "operadorRelacional", 
		"operadorAtribuicao", "operadorStrcat", "operadorMulDivMod", "operadorUnario", 
		"operadorExtra", "programa", "comando", "retbreak", "trecho", "bloco", 
		"nomedafuncao", "listadenomes", "exp0", "exp", "exp1", "exp2", "exp3", 
		"exp4", "exp5", "exp6", "exp7", "listaexp", "listavar", "expprefixo", 
		"complementovar", "var", "chamadadefuncao", "argumentos", "funcao", "corpodafuncao", 
		"listadeparametros", "construtordetabelas", "listadecampos", "campo", 
		"separadordecampos", "cadeia"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'^'", "'+'", "'-'", "'and'", "'or'", "'<'", "'>'", "'<='", "'>='", 
		"'=='", "'~='", "'='", "'..'", "'*'", "'/'", "'%'", "'not'", "'#'", "'~'", 
		"'...'", "'.'", "','", "'['", "']'", "'('", "')'", "'{'", "'}'", "':'", 
		"';'", "'do'", "'end'", "'while'", "'repeat'", "'until'", "'if'", "'then'", 
		"'elseif'", "'else'", "'for'", "'in'", "'function'", "'local'", "'return'", 
		"'break'", "'nil'", "'false'", "'true'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "NOME", "CADEIA_NORMAL", "CADEIA_CHAR", "NUMERO", "COMENTARIO", 
		"WS", "PalavraReservada"
	};
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
	public String getGrammarFileName() { return "Lua.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	   public static String grupo="<<551805, 551945>>";

	public LuaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class OperadorPotenciaContext extends ParserRuleContext {
		public OperadorPotenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorPotencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOperadorPotencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOperadorPotencia(this);
		}
	}

	public final OperadorPotenciaContext operadorPotencia() throws RecognitionException {
		OperadorPotenciaContext _localctx = new OperadorPotenciaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_operadorPotencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__0);
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

	public static class OperadorSomaSubContext extends ParserRuleContext {
		public OperadorSomaSubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorSomaSub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOperadorSomaSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOperadorSomaSub(this);
		}
	}

	public final OperadorSomaSubContext operadorSomaSub() throws RecognitionException {
		OperadorSomaSubContext _localctx = new OperadorSomaSubContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_operadorSomaSub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class OperadorEContext extends ParserRuleContext {
		public OperadorEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOperadorE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOperadorE(this);
		}
	}

	public final OperadorEContext operadorE() throws RecognitionException {
		OperadorEContext _localctx = new OperadorEContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operadorE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__3);
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

	public static class OperadorOuContext extends ParserRuleContext {
		public OperadorOuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorOu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOperadorOu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOperadorOu(this);
		}
	}

	public final OperadorOuContext operadorOu() throws RecognitionException {
		OperadorOuContext _localctx = new OperadorOuContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operadorOu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__4);
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

	public static class OperadorRelacionalContext extends ParserRuleContext {
		public OperadorRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOperadorRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOperadorRelacional(this);
		}
	}

	public final OperadorRelacionalContext operadorRelacional() throws RecognitionException {
		OperadorRelacionalContext _localctx = new OperadorRelacionalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operadorRelacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class OperadorAtribuicaoContext extends ParserRuleContext {
		public OperadorAtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorAtribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOperadorAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOperadorAtribuicao(this);
		}
	}

	public final OperadorAtribuicaoContext operadorAtribuicao() throws RecognitionException {
		OperadorAtribuicaoContext _localctx = new OperadorAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operadorAtribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__11);
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

	public static class OperadorStrcatContext extends ParserRuleContext {
		public OperadorStrcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorStrcat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOperadorStrcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOperadorStrcat(this);
		}
	}

	public final OperadorStrcatContext operadorStrcat() throws RecognitionException {
		OperadorStrcatContext _localctx = new OperadorStrcatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_operadorStrcat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__12);
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

	public static class OperadorMulDivModContext extends ParserRuleContext {
		public OperadorMulDivModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorMulDivMod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOperadorMulDivMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOperadorMulDivMod(this);
		}
	}

	public final OperadorMulDivModContext operadorMulDivMod() throws RecognitionException {
		OperadorMulDivModContext _localctx = new OperadorMulDivModContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operadorMulDivMod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class OperadorUnarioContext extends ParserRuleContext {
		public OperadorUnarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorUnario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOperadorUnario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOperadorUnario(this);
		}
	}

	public final OperadorUnarioContext operadorUnario() throws RecognitionException {
		OperadorUnarioContext _localctx = new OperadorUnarioContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operadorUnario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class OperadorExtraContext extends ParserRuleContext {
		public OperadorExtraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorExtra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOperadorExtra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOperadorExtra(this);
		}
	}

	public final OperadorExtraContext operadorExtra() throws RecognitionException {
		OperadorExtraContext _localctx = new OperadorExtraContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operadorExtra);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ProgramaContext extends ParserRuleContext {
		public TrechoContext trecho() {
			return getRuleContext(TrechoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			trecho();
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

	public static class ComandoContext extends ParserRuleContext {
		public Token NOME;
		public NomedafuncaoContext nomedafuncao;
		public ListavarContext listavar() {
			return getRuleContext(ListavarContext.class,0);
		}
		public OperadorAtribuicaoContext operadorAtribuicao() {
			return getRuleContext(OperadorAtribuicaoContext.class,0);
		}
		public ListaexpContext listaexp() {
			return getRuleContext(ListaexpContext.class,0);
		}
		public ChamadadefuncaoContext chamadadefuncao() {
			return getRuleContext(ChamadadefuncaoContext.class,0);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode NOME() { return getToken(LuaParser.NOME, 0); }
		public ListadenomesContext listadenomes() {
			return getRuleContext(ListadenomesContext.class,0);
		}
		public NomedafuncaoContext nomedafuncao() {
			return getRuleContext(NomedafuncaoContext.class,0);
		}
		public CorpodafuncaoContext corpodafuncao() {
			return getRuleContext(CorpodafuncaoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comando);
		int _la;
		try {
			setState(184);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				listavar();
				setState(105);
				operadorAtribuicao();
				setState(106);
				listaexp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				chamadadefuncao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				match(T__30);
				setState(110);
				bloco();
				setState(111);
				match(T__31);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				match(T__32);
				setState(114);
				exp();
				setState(115);
				match(T__30);
				setState(116);
				bloco();
				setState(117);
				match(T__31);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(119);
				match(T__33);
				setState(120);
				bloco();
				setState(121);
				match(T__34);
				setState(122);
				exp();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
				match(T__35);
				setState(125);
				exp();
				setState(126);
				match(T__36);
				setState(127);
				bloco();
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__37) {
					{
					{
					setState(128);
					match(T__37);
					setState(129);
					exp();
					setState(130);
					match(T__36);
					setState(131);
					bloco();
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(140);
				_la = _input.LA(1);
				if (_la==T__38) {
					{
					setState(138);
					match(T__38);
					setState(139);
					bloco();
					}
				}

				setState(142);
				match(T__31);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(144);
				match(T__39);
				setState(145);
				((ComandoContext)_localctx).NOME = match(NOME);
				 TabelaDeSimbolos.adicionarSimbolo((((ComandoContext)_localctx).NOME!=null?((ComandoContext)_localctx).NOME.getText():null),Tipo.VARIAVEL); 
				setState(147);
				operadorAtribuicao();
				setState(148);
				exp();
				setState(149);
				match(T__21);
				setState(150);
				exp();
				setState(153);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(151);
					match(T__21);
					setState(152);
					exp();
					}
				}

				setState(155);
				match(T__30);
				setState(156);
				bloco();
				setState(157);
				match(T__31);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(159);
				match(T__39);
				setState(160);
				listadenomes();
				setState(161);
				match(T__40);
				setState(162);
				listaexp();
				setState(163);
				match(T__30);
				setState(164);
				bloco();
				setState(165);
				match(T__31);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(167);
				match(T__41);
				setState(168);
				((ComandoContext)_localctx).nomedafuncao = nomedafuncao();
				 TabelaDeSimbolos.adicionarSimbolo((((ComandoContext)_localctx).nomedafuncao!=null?_input.getText(((ComandoContext)_localctx).nomedafuncao.start,((ComandoContext)_localctx).nomedafuncao.stop):null),Tipo.FUNCAO); 
				setState(170);
				corpodafuncao();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(172);
				match(T__42);
				{
				setState(173);
				match(T__41);
				setState(174);
				((ComandoContext)_localctx).NOME = match(NOME);
				 TabelaDeSimbolos.adicionarSimbolo((((ComandoContext)_localctx).NOME!=null?((ComandoContext)_localctx).NOME.getText():null),Tipo.FUNCAO); 
				setState(176);
				corpodafuncao();
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(177);
				match(T__42);
				setState(178);
				listadenomes();
				setState(182);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(179);
					operadorAtribuicao();
					setState(180);
					listaexp();
					}
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

	public static class RetbreakContext extends ParserRuleContext {
		public ListaexpContext listaexp() {
			return getRuleContext(ListaexpContext.class,0);
		}
		public RetbreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retbreak; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterRetbreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitRetbreak(this);
		}
	}

	public final RetbreakContext retbreak() throws RecognitionException {
		RetbreakContext _localctx = new RetbreakContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_retbreak);
		int _la;
		try {
			setState(191);
			switch (_input.LA(1)) {
			case T__43:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(T__43);
				setState(188);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__24) | (1L << T__26) | (1L << T__41) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << NOME) | (1L << CADEIA_NORMAL) | (1L << CADEIA_CHAR) | (1L << NUMERO))) != 0)) {
					{
					setState(187);
					listaexp();
					}
				}

				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(T__44);
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

	public static class TrechoContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public RetbreakContext retbreak() {
			return getRuleContext(RetbreakContext.class,0);
		}
		public TrechoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trecho; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterTrecho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitTrecho(this);
		}
	}

	public final TrechoContext trecho() throws RecognitionException {
		TrechoContext _localctx = new TrechoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_trecho);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << NOME))) != 0)) {
				{
				{
				setState(193);
				comando();
				setState(195);
				_la = _input.LA(1);
				if (_la==T__29) {
					{
					setState(194);
					match(T__29);
					}
				}

				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
			_la = _input.LA(1);
			if (_la==T__43 || _la==T__44) {
				{
				setState(202);
				retbreak();
				setState(204);
				_la = _input.LA(1);
				if (_la==T__29) {
					{
					setState(203);
					match(T__29);
					}
				}

				}
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

	public static class BlocoContext extends ParserRuleContext {
		public TrechoContext trecho() {
			return getRuleContext(TrechoContext.class,0);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			trecho();
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

	public static class NomedafuncaoContext extends ParserRuleContext {
		public List<TerminalNode> NOME() { return getTokens(LuaParser.NOME); }
		public TerminalNode NOME(int i) {
			return getToken(LuaParser.NOME, i);
		}
		public NomedafuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomedafuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterNomedafuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitNomedafuncao(this);
		}
	}

	public final NomedafuncaoContext nomedafuncao() throws RecognitionException {
		NomedafuncaoContext _localctx = new NomedafuncaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_nomedafuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(NOME);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(211);
				match(T__20);
				setState(212);
				match(NOME);
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(218);
				match(T__28);
				setState(219);
				match(NOME);
				}
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

	public static class ListadenomesContext extends ParserRuleContext {
		public Token NOME;
		public List<TerminalNode> NOME() { return getTokens(LuaParser.NOME); }
		public TerminalNode NOME(int i) {
			return getToken(LuaParser.NOME, i);
		}
		public ListadenomesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listadenomes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListadenomes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListadenomes(this);
		}
	}

	public final ListadenomesContext listadenomes() throws RecognitionException {
		ListadenomesContext _localctx = new ListadenomesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_listadenomes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			((ListadenomesContext)_localctx).NOME = match(NOME);
			 TabelaDeSimbolos.adicionarSimbolo((((ListadenomesContext)_localctx).NOME!=null?((ListadenomesContext)_localctx).NOME.getText():null),Tipo.VARIAVEL); 
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(224);
					match(T__21);
					setState(225);
					((ListadenomesContext)_localctx).NOME = match(NOME);
					 TabelaDeSimbolos.adicionarSimbolo((((ListadenomesContext)_localctx).NOME!=null?((ListadenomesContext)_localctx).NOME.getText():null),Tipo.VARIAVEL); 
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class Exp0Context extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(LuaParser.NUMERO, 0); }
		public CadeiaContext cadeia() {
			return getRuleContext(CadeiaContext.class,0);
		}
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public ExpprefixoContext expprefixo() {
			return getRuleContext(ExpprefixoContext.class,0);
		}
		public ConstrutordetabelasContext construtordetabelas() {
			return getRuleContext(ConstrutordetabelasContext.class,0);
		}
		public Exp0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExp0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExp0(this);
		}
	}

	public final Exp0Context exp0() throws RecognitionException {
		Exp0Context _localctx = new Exp0Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_exp0);
		try {
			setState(241);
			switch (_input.LA(1)) {
			case T__45:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(T__45);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(T__46);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				match(T__47);
				}
				break;
			case NUMERO:
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				match(NUMERO);
				}
				break;
			case CADEIA_NORMAL:
			case CADEIA_CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				cadeia();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 6);
				{
				setState(237);
				match(T__19);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 7);
				{
				setState(238);
				funcao();
				}
				break;
			case T__24:
			case NOME:
				enterOuterAlt(_localctx, 8);
				{
				setState(239);
				expprefixo();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 9);
				{
				setState(240);
				construtordetabelas();
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

	public static class ExpContext extends ParserRuleContext {
		public List<Exp1Context> exp1() {
			return getRuleContexts(Exp1Context.class);
		}
		public Exp1Context exp1(int i) {
			return getRuleContext(Exp1Context.class,i);
		}
		public List<OperadorOuContext> operadorOu() {
			return getRuleContexts(OperadorOuContext.class);
		}
		public OperadorOuContext operadorOu(int i) {
			return getRuleContext(OperadorOuContext.class,i);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			exp1();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(244);
				operadorOu();
				setState(245);
				exp1();
				}
				}
				setState(251);
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

	public static class Exp1Context extends ParserRuleContext {
		public List<Exp2Context> exp2() {
			return getRuleContexts(Exp2Context.class);
		}
		public Exp2Context exp2(int i) {
			return getRuleContext(Exp2Context.class,i);
		}
		public List<OperadorEContext> operadorE() {
			return getRuleContexts(OperadorEContext.class);
		}
		public OperadorEContext operadorE(int i) {
			return getRuleContext(OperadorEContext.class,i);
		}
		public Exp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExp1(this);
		}
	}

	public final Exp1Context exp1() throws RecognitionException {
		Exp1Context _localctx = new Exp1Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_exp1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			exp2();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(253);
				operadorE();
				setState(254);
				exp2();
				}
				}
				setState(260);
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

	public static class Exp2Context extends ParserRuleContext {
		public List<Exp3Context> exp3() {
			return getRuleContexts(Exp3Context.class);
		}
		public Exp3Context exp3(int i) {
			return getRuleContext(Exp3Context.class,i);
		}
		public List<OperadorRelacionalContext> operadorRelacional() {
			return getRuleContexts(OperadorRelacionalContext.class);
		}
		public OperadorRelacionalContext operadorRelacional(int i) {
			return getRuleContext(OperadorRelacionalContext.class,i);
		}
		public Exp2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExp2(this);
		}
	}

	public final Exp2Context exp2() throws RecognitionException {
		Exp2Context _localctx = new Exp2Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_exp2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			exp3();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) {
				{
				{
				setState(262);
				operadorRelacional();
				setState(263);
				exp3();
				}
				}
				setState(269);
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

	public static class Exp3Context extends ParserRuleContext {
		public List<Exp4Context> exp4() {
			return getRuleContexts(Exp4Context.class);
		}
		public Exp4Context exp4(int i) {
			return getRuleContext(Exp4Context.class,i);
		}
		public List<OperadorStrcatContext> operadorStrcat() {
			return getRuleContexts(OperadorStrcatContext.class);
		}
		public OperadorStrcatContext operadorStrcat(int i) {
			return getRuleContext(OperadorStrcatContext.class,i);
		}
		public Exp3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExp3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExp3(this);
		}
	}

	public final Exp3Context exp3() throws RecognitionException {
		Exp3Context _localctx = new Exp3Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_exp3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			exp4();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(271);
				operadorStrcat();
				setState(272);
				exp4();
				}
				}
				setState(278);
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

	public static class Exp4Context extends ParserRuleContext {
		public List<Exp5Context> exp5() {
			return getRuleContexts(Exp5Context.class);
		}
		public Exp5Context exp5(int i) {
			return getRuleContext(Exp5Context.class,i);
		}
		public List<OperadorSomaSubContext> operadorSomaSub() {
			return getRuleContexts(OperadorSomaSubContext.class);
		}
		public OperadorSomaSubContext operadorSomaSub(int i) {
			return getRuleContext(OperadorSomaSubContext.class,i);
		}
		public Exp4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExp4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExp4(this);
		}
	}

	public final Exp4Context exp4() throws RecognitionException {
		Exp4Context _localctx = new Exp4Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_exp4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			exp5();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==T__2) {
				{
				{
				setState(280);
				operadorSomaSub();
				setState(281);
				exp5();
				}
				}
				setState(287);
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

	public static class Exp5Context extends ParserRuleContext {
		public List<Exp6Context> exp6() {
			return getRuleContexts(Exp6Context.class);
		}
		public Exp6Context exp6(int i) {
			return getRuleContext(Exp6Context.class,i);
		}
		public List<OperadorMulDivModContext> operadorMulDivMod() {
			return getRuleContexts(OperadorMulDivModContext.class);
		}
		public OperadorMulDivModContext operadorMulDivMod(int i) {
			return getRuleContext(OperadorMulDivModContext.class,i);
		}
		public Exp5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExp5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExp5(this);
		}
	}

	public final Exp5Context exp5() throws RecognitionException {
		Exp5Context _localctx = new Exp5Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_exp5);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			exp6();
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) {
				{
				{
				setState(289);
				operadorMulDivMod();
				setState(290);
				exp6();
				}
				}
				setState(296);
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

	public static class Exp6Context extends ParserRuleContext {
		public Exp7Context exp7() {
			return getRuleContext(Exp7Context.class,0);
		}
		public List<OperadorUnarioContext> operadorUnario() {
			return getRuleContexts(OperadorUnarioContext.class);
		}
		public OperadorUnarioContext operadorUnario(int i) {
			return getRuleContext(OperadorUnarioContext.class,i);
		}
		public List<OperadorSomaSubContext> operadorSomaSub() {
			return getRuleContexts(OperadorSomaSubContext.class);
		}
		public OperadorSomaSubContext operadorSomaSub(int i) {
			return getRuleContext(OperadorSomaSubContext.class,i);
		}
		public Exp6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExp6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExp6(this);
		}
	}

	public final Exp6Context exp6() throws RecognitionException {
		Exp6Context _localctx = new Exp6Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_exp6);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) {
				{
				setState(299);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(297);
					operadorUnario();
					}
					break;
				case 2:
					{
					setState(298);
					operadorSomaSub();
					}
					break;
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(304);
			exp7();
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

	public static class Exp7Context extends ParserRuleContext {
		public List<Exp0Context> exp0() {
			return getRuleContexts(Exp0Context.class);
		}
		public Exp0Context exp0(int i) {
			return getRuleContext(Exp0Context.class,i);
		}
		public List<OperadorPotenciaContext> operadorPotencia() {
			return getRuleContexts(OperadorPotenciaContext.class);
		}
		public OperadorPotenciaContext operadorPotencia(int i) {
			return getRuleContext(OperadorPotenciaContext.class,i);
		}
		public Exp7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp7; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExp7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExp7(this);
		}
	}

	public final Exp7Context exp7() throws RecognitionException {
		Exp7Context _localctx = new Exp7Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_exp7);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			exp0();
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(307);
				operadorPotencia();
				setState(308);
				exp0();
				}
				}
				setState(314);
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

	public static class ListaexpContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ListaexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListaexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListaexp(this);
		}
	}

	public final ListaexpContext listaexp() throws RecognitionException {
		ListaexpContext _localctx = new ListaexpContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_listaexp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(315);
					exp();
					setState(316);
					match(T__21);
					}
					} 
				}
				setState(322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(323);
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

	public static class ListavarContext extends ParserRuleContext {
		public VarContext var;
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public ListavarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listavar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListavar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListavar(this);
		}
	}

	public final ListavarContext listavar() throws RecognitionException {
		ListavarContext _localctx = new ListavarContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_listavar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			((ListavarContext)_localctx).var = var();
			 TabelaDeSimbolos.adicionarSimbolo((((ListavarContext)_localctx).var!=null?_input.getText(((ListavarContext)_localctx).var.start,((ListavarContext)_localctx).var.stop):null),Tipo.VARIAVEL); 
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(327);
				match(T__21);
				setState(328);
				((ListavarContext)_localctx).var = var();
				 TabelaDeSimbolos.adicionarSimbolo((((ListavarContext)_localctx).var!=null?_input.getText(((ListavarContext)_localctx).var.start,((ListavarContext)_localctx).var.stop):null),Tipo.VARIAVEL); 
				}
				}
				setState(335);
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

	public static class ExpprefixoContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ChamadadefuncaoContext chamadadefuncao() {
			return getRuleContext(ChamadadefuncaoContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpprefixoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expprefixo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExpprefixo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExpprefixo(this);
		}
	}

	public final ExpprefixoContext expprefixo() throws RecognitionException {
		ExpprefixoContext _localctx = new ExpprefixoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expprefixo);
		try {
			setState(342);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				chamadadefuncao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				match(T__24);
				setState(339);
				exp();
				setState(340);
				match(T__25);
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

	public static class ComplementovarContext extends ParserRuleContext {
		public List<TerminalNode> NOME() { return getTokens(LuaParser.NOME); }
		public TerminalNode NOME(int i) {
			return getToken(LuaParser.NOME, i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ComplementovarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complementovar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterComplementovar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitComplementovar(this);
		}
	}

	public final ComplementovarContext complementovar() throws RecognitionException {
		ComplementovarContext _localctx = new ComplementovarContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_complementovar);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(NOME);
			setState(353);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(351);
					switch (_input.LA(1)) {
					case T__22:
						{
						setState(345);
						match(T__22);
						setState(346);
						exp();
						setState(347);
						match(T__23);
						}
						break;
					case T__20:
						{
						setState(349);
						match(T__20);
						setState(350);
						match(NOME);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(355);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class VarContext extends ParserRuleContext {
		public Token NOME;
		public TerminalNode NOME() { return getToken(LuaParser.NOME, 0); }
		public ComplementovarContext complementovar() {
			return getRuleContext(ComplementovarContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_var);
		try {
			setState(367);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				((VarContext)_localctx).NOME = match(NOME);
				 TabelaDeSimbolos.adicionarSimbolo((((VarContext)_localctx).NOME!=null?((VarContext)_localctx).NOME.getText():null),Tipo.VARIAVEL); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				complementovar();
				setState(359);
				match(T__22);
				setState(360);
				exp();
				setState(361);
				match(T__23);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(363);
				complementovar();
				setState(364);
				match(T__20);
				setState(365);
				match(NOME);
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

	public static class ChamadadefuncaoContext extends ParserRuleContext {
		public ComplementovarContext complementovar;
		public ComplementovarContext complementovar() {
			return getRuleContext(ComplementovarContext.class,0);
		}
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public TerminalNode NOME() { return getToken(LuaParser.NOME, 0); }
		public ChamadadefuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadadefuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterChamadadefuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitChamadadefuncao(this);
		}
	}

	public final ChamadadefuncaoContext chamadadefuncao() throws RecognitionException {
		ChamadadefuncaoContext _localctx = new ChamadadefuncaoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_chamadadefuncao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			((ChamadadefuncaoContext)_localctx).complementovar = complementovar();
			setState(374);
			switch (_input.LA(1)) {
			case T__24:
			case T__26:
			case CADEIA_NORMAL:
			case CADEIA_CHAR:
				{
				setState(370);
				argumentos();
				}
				break;
			case T__28:
				{
				{
				setState(371);
				match(T__28);
				setState(372);
				match(NOME);
				setState(373);
				argumentos();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 TabelaDeSimbolos.adicionarSimbolo((((ChamadadefuncaoContext)_localctx).complementovar!=null?_input.getText(((ChamadadefuncaoContext)_localctx).complementovar.start,((ChamadadefuncaoContext)_localctx).complementovar.stop):null),Tipo.FUNCAO); 
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

	public static class ArgumentosContext extends ParserRuleContext {
		public ListaexpContext listaexp() {
			return getRuleContext(ListaexpContext.class,0);
		}
		public ConstrutordetabelasContext construtordetabelas() {
			return getRuleContext(ConstrutordetabelasContext.class,0);
		}
		public CadeiaContext cadeia() {
			return getRuleContext(CadeiaContext.class,0);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitArgumentos(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_argumentos);
		int _la;
		try {
			setState(385);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				match(T__24);
				setState(380);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__24) | (1L << T__26) | (1L << T__41) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << NOME) | (1L << CADEIA_NORMAL) | (1L << CADEIA_CHAR) | (1L << NUMERO))) != 0)) {
					{
					setState(379);
					listaexp();
					}
				}

				setState(382);
				match(T__25);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				construtordetabelas();
				}
				break;
			case CADEIA_NORMAL:
			case CADEIA_CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(384);
				cadeia();
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

	public static class FuncaoContext extends ParserRuleContext {
		public CorpodafuncaoContext corpodafuncao() {
			return getRuleContext(CorpodafuncaoContext.class,0);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(T__41);
			setState(388);
			corpodafuncao();
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

	public static class CorpodafuncaoContext extends ParserRuleContext {
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ListadeparametrosContext listadeparametros() {
			return getRuleContext(ListadeparametrosContext.class,0);
		}
		public CorpodafuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpodafuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterCorpodafuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitCorpodafuncao(this);
		}
	}

	public final CorpodafuncaoContext corpodafuncao() throws RecognitionException {
		CorpodafuncaoContext _localctx = new CorpodafuncaoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_corpodafuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(T__24);
			setState(392);
			_la = _input.LA(1);
			if (_la==T__19 || _la==NOME) {
				{
				setState(391);
				listadeparametros();
				}
			}

			setState(394);
			match(T__25);
			setState(395);
			bloco();
			setState(396);
			match(T__31);
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

	public static class ListadeparametrosContext extends ParserRuleContext {
		public ListadenomesContext listadenomes() {
			return getRuleContext(ListadenomesContext.class,0);
		}
		public ListadeparametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listadeparametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListadeparametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListadeparametros(this);
		}
	}

	public final ListadeparametrosContext listadeparametros() throws RecognitionException {
		ListadeparametrosContext _localctx = new ListadeparametrosContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_listadeparametros);
		int _la;
		try {
			setState(404);
			switch (_input.LA(1)) {
			case NOME:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				listadenomes();
				setState(401);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(399);
					match(T__21);
					setState(400);
					match(T__19);
					}
				}

				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				match(T__19);
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

	public static class ConstrutordetabelasContext extends ParserRuleContext {
		public ListadecamposContext listadecampos() {
			return getRuleContext(ListadecamposContext.class,0);
		}
		public ConstrutordetabelasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_construtordetabelas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterConstrutordetabelas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitConstrutordetabelas(this);
		}
	}

	public final ConstrutordetabelasContext construtordetabelas() throws RecognitionException {
		ConstrutordetabelasContext _localctx = new ConstrutordetabelasContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_construtordetabelas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(T__26);
			setState(408);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__22) | (1L << T__24) | (1L << T__26) | (1L << T__41) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << NOME) | (1L << CADEIA_NORMAL) | (1L << CADEIA_CHAR) | (1L << NUMERO))) != 0)) {
				{
				setState(407);
				listadecampos();
				}
			}

			setState(410);
			match(T__27);
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

	public static class ListadecamposContext extends ParserRuleContext {
		public List<CampoContext> campo() {
			return getRuleContexts(CampoContext.class);
		}
		public CampoContext campo(int i) {
			return getRuleContext(CampoContext.class,i);
		}
		public List<SeparadordecamposContext> separadordecampos() {
			return getRuleContexts(SeparadordecamposContext.class);
		}
		public SeparadordecamposContext separadordecampos(int i) {
			return getRuleContext(SeparadordecamposContext.class,i);
		}
		public ListadecamposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listadecampos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListadecampos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListadecampos(this);
		}
	}

	public final ListadecamposContext listadecampos() throws RecognitionException {
		ListadecamposContext _localctx = new ListadecamposContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_listadecampos);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			campo();
			setState(418);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(413);
					separadordecampos();
					setState(414);
					campo();
					}
					} 
				}
				setState(420);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(422);
			_la = _input.LA(1);
			if (_la==T__21 || _la==T__29) {
				{
				setState(421);
				separadordecampos();
				}
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

	public static class CampoContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OperadorAtribuicaoContext operadorAtribuicao() {
			return getRuleContext(OperadorAtribuicaoContext.class,0);
		}
		public TerminalNode NOME() { return getToken(LuaParser.NOME, 0); }
		public CampoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterCampo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitCampo(this);
		}
	}

	public final CampoContext campo() throws RecognitionException {
		CampoContext _localctx = new CampoContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_campo);
		try {
			setState(435);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				match(T__22);
				setState(425);
				exp();
				setState(426);
				match(T__23);
				setState(427);
				operadorAtribuicao();
				setState(428);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				match(NOME);
				setState(431);
				operadorAtribuicao();
				setState(432);
				exp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(434);
				exp();
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

	public static class SeparadordecamposContext extends ParserRuleContext {
		public SeparadordecamposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separadordecampos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterSeparadordecampos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitSeparadordecampos(this);
		}
	}

	public final SeparadordecamposContext separadordecampos() throws RecognitionException {
		SeparadordecamposContext _localctx = new SeparadordecamposContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_separadordecampos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			_la = _input.LA(1);
			if ( !(_la==T__21 || _la==T__29) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class CadeiaContext extends ParserRuleContext {
		public TerminalNode CADEIA_NORMAL() { return getToken(LuaParser.CADEIA_NORMAL, 0); }
		public TerminalNode CADEIA_CHAR() { return getToken(LuaParser.CADEIA_CHAR, 0); }
		public CadeiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadeia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterCadeia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitCadeia(this);
		}
	}

	public final CadeiaContext cadeia() throws RecognitionException {
		CadeiaContext _localctx = new CadeiaContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_cadeia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			_la = _input.LA(1);
			if ( !(_la==CADEIA_NORMAL || _la==CADEIA_CHAR) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\39\u01bc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0088"+
		"\n\r\f\r\16\r\u008b\13\r\3\r\3\r\5\r\u008f\n\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u009c\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00b9\n\r\5\r\u00bb\n\r\3\16\3\16\5\16\u00bf\n\16\3\16\5\16\u00c2"+
		"\n\16\3\17\3\17\5\17\u00c6\n\17\7\17\u00c8\n\17\f\17\16\17\u00cb\13\17"+
		"\3\17\3\17\5\17\u00cf\n\17\5\17\u00d1\n\17\3\20\3\20\3\21\3\21\3\21\7"+
		"\21\u00d8\n\21\f\21\16\21\u00db\13\21\3\21\3\21\5\21\u00df\n\21\3\22\3"+
		"\22\3\22\3\22\3\22\7\22\u00e6\n\22\f\22\16\22\u00e9\13\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f4\n\23\3\24\3\24\3\24\3\24"+
		"\7\24\u00fa\n\24\f\24\16\24\u00fd\13\24\3\25\3\25\3\25\3\25\7\25\u0103"+
		"\n\25\f\25\16\25\u0106\13\25\3\26\3\26\3\26\3\26\7\26\u010c\n\26\f\26"+
		"\16\26\u010f\13\26\3\27\3\27\3\27\3\27\7\27\u0115\n\27\f\27\16\27\u0118"+
		"\13\27\3\30\3\30\3\30\3\30\7\30\u011e\n\30\f\30\16\30\u0121\13\30\3\31"+
		"\3\31\3\31\3\31\7\31\u0127\n\31\f\31\16\31\u012a\13\31\3\32\3\32\7\32"+
		"\u012e\n\32\f\32\16\32\u0131\13\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33"+
		"\u0139\n\33\f\33\16\33\u013c\13\33\3\34\3\34\3\34\7\34\u0141\n\34\f\34"+
		"\16\34\u0144\13\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u014e"+
		"\n\35\f\35\16\35\u0151\13\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0159"+
		"\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0162\n\37\f\37\16\37\u0165"+
		"\13\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0172\n \3!\3!\3!\3!\3!\5!"+
		"\u0179\n!\3!\3!\3\"\3\"\5\"\u017f\n\"\3\"\3\"\3\"\5\"\u0184\n\"\3#\3#"+
		"\3#\3$\3$\5$\u018b\n$\3$\3$\3$\3$\3%\3%\3%\5%\u0194\n%\3%\5%\u0197\n%"+
		"\3&\3&\5&\u019b\n&\3&\3&\3\'\3\'\3\'\3\'\7\'\u01a3\n\'\f\'\16\'\u01a6"+
		"\13\'\3\'\5\'\u01a9\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01b6\n(\3"+
		")\3)\3*\3*\3*\2\2+\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPR\2\t\3\2\4\5\3\2\b\r\3\2\20\22\4\2\5\5\23\25\3"+
		"\2\26 \4\2\30\30  \3\2\64\65\u01ce\2T\3\2\2\2\4V\3\2\2\2\6X\3\2\2\2\b"+
		"Z\3\2\2\2\n\\\3\2\2\2\f^\3\2\2\2\16`\3\2\2\2\20b\3\2\2\2\22d\3\2\2\2\24"+
		"f\3\2\2\2\26h\3\2\2\2\30\u00ba\3\2\2\2\32\u00c1\3\2\2\2\34\u00c9\3\2\2"+
		"\2\36\u00d2\3\2\2\2 \u00d4\3\2\2\2\"\u00e0\3\2\2\2$\u00f3\3\2\2\2&\u00f5"+
		"\3\2\2\2(\u00fe\3\2\2\2*\u0107\3\2\2\2,\u0110\3\2\2\2.\u0119\3\2\2\2\60"+
		"\u0122\3\2\2\2\62\u012f\3\2\2\2\64\u0134\3\2\2\2\66\u0142\3\2\2\28\u0147"+
		"\3\2\2\2:\u0158\3\2\2\2<\u015a\3\2\2\2>\u0171\3\2\2\2@\u0173\3\2\2\2B"+
		"\u0183\3\2\2\2D\u0185\3\2\2\2F\u0188\3\2\2\2H\u0196\3\2\2\2J\u0198\3\2"+
		"\2\2L\u019e\3\2\2\2N\u01b5\3\2\2\2P\u01b7\3\2\2\2R\u01b9\3\2\2\2TU\7\3"+
		"\2\2U\3\3\2\2\2VW\t\2\2\2W\5\3\2\2\2XY\7\6\2\2Y\7\3\2\2\2Z[\7\7\2\2[\t"+
		"\3\2\2\2\\]\t\3\2\2]\13\3\2\2\2^_\7\16\2\2_\r\3\2\2\2`a\7\17\2\2a\17\3"+
		"\2\2\2bc\t\4\2\2c\21\3\2\2\2de\t\5\2\2e\23\3\2\2\2fg\t\6\2\2g\25\3\2\2"+
		"\2hi\5\34\17\2i\27\3\2\2\2jk\58\35\2kl\5\f\7\2lm\5\66\34\2m\u00bb\3\2"+
		"\2\2n\u00bb\5@!\2op\7!\2\2pq\5\36\20\2qr\7\"\2\2r\u00bb\3\2\2\2st\7#\2"+
		"\2tu\5&\24\2uv\7!\2\2vw\5\36\20\2wx\7\"\2\2x\u00bb\3\2\2\2yz\7$\2\2z{"+
		"\5\36\20\2{|\7%\2\2|}\5&\24\2}\u00bb\3\2\2\2~\177\7&\2\2\177\u0080\5&"+
		"\24\2\u0080\u0081\7\'\2\2\u0081\u0089\5\36\20\2\u0082\u0083\7(\2\2\u0083"+
		"\u0084\5&\24\2\u0084\u0085\7\'\2\2\u0085\u0086\5\36\20\2\u0086\u0088\3"+
		"\2\2\2\u0087\u0082\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008e\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7)"+
		"\2\2\u008d\u008f\5\36\20\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0091\7\"\2\2\u0091\u00bb\3\2\2\2\u0092\u0093\7*"+
		"\2\2\u0093\u0094\7\63\2\2\u0094\u0095\b\r\1\2\u0095\u0096\5\f\7\2\u0096"+
		"\u0097\5&\24\2\u0097\u0098\7\30\2\2\u0098\u009b\5&\24\2\u0099\u009a\7"+
		"\30\2\2\u009a\u009c\5&\24\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009e\7!\2\2\u009e\u009f\5\36\20\2\u009f\u00a0\7"+
		"\"\2\2\u00a0\u00bb\3\2\2\2\u00a1\u00a2\7*\2\2\u00a2\u00a3\5\"\22\2\u00a3"+
		"\u00a4\7+\2\2\u00a4\u00a5\5\66\34\2\u00a5\u00a6\7!\2\2\u00a6\u00a7\5\36"+
		"\20\2\u00a7\u00a8\7\"\2\2\u00a8\u00bb\3\2\2\2\u00a9\u00aa\7,\2\2\u00aa"+
		"\u00ab\5 \21\2\u00ab\u00ac\b\r\1\2\u00ac\u00ad\5F$\2\u00ad\u00bb\3\2\2"+
		"\2\u00ae\u00af\7-\2\2\u00af\u00b0\7,\2\2\u00b0\u00b1\7\63\2\2\u00b1\u00b2"+
		"\b\r\1\2\u00b2\u00bb\5F$\2\u00b3\u00b4\7-\2\2\u00b4\u00b8\5\"\22\2\u00b5"+
		"\u00b6\5\f\7\2\u00b6\u00b7\5\66\34\2\u00b7\u00b9\3\2\2\2\u00b8\u00b5\3"+
		"\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00baj\3\2\2\2\u00ban\3"+
		"\2\2\2\u00bao\3\2\2\2\u00bas\3\2\2\2\u00bay\3\2\2\2\u00ba~\3\2\2\2\u00ba"+
		"\u0092\3\2\2\2\u00ba\u00a1\3\2\2\2\u00ba\u00a9\3\2\2\2\u00ba\u00ae\3\2"+
		"\2\2\u00ba\u00b3\3\2\2\2\u00bb\31\3\2\2\2\u00bc\u00be\7.\2\2\u00bd\u00bf"+
		"\5\66\34\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c2\3\2\2\2"+
		"\u00c0\u00c2\7/\2\2\u00c1\u00bc\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\33\3"+
		"\2\2\2\u00c3\u00c5\5\30\r\2\u00c4\u00c6\7 \2\2\u00c5\u00c4\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c8\u00cb\3\2"+
		"\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00d0\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cc\u00ce\5\32\16\2\u00cd\u00cf\7 \2\2\u00ce\u00cd\3"+
		"\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\35\3\2\2\2\u00d2\u00d3\5\34\17\2\u00d3\37\3\2\2\2"+
		"\u00d4\u00d9\7\63\2\2\u00d5\u00d6\7\27\2\2\u00d6\u00d8\7\63\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00de\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7\37\2\2\u00dd"+
		"\u00df\7\63\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df!\3\2\2\2"+
		"\u00e0\u00e1\7\63\2\2\u00e1\u00e7\b\22\1\2\u00e2\u00e3\7\30\2\2\u00e3"+
		"\u00e4\7\63\2\2\u00e4\u00e6\b\22\1\2\u00e5\u00e2\3\2\2\2\u00e6\u00e9\3"+
		"\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8#\3\2\2\2\u00e9\u00e7"+
		"\3\2\2\2\u00ea\u00f4\7\60\2\2\u00eb\u00f4\7\61\2\2\u00ec\u00f4\7\62\2"+
		"\2\u00ed\u00f4\7\66\2\2\u00ee\u00f4\5R*\2\u00ef\u00f4\7\26\2\2\u00f0\u00f4"+
		"\5D#\2\u00f1\u00f4\5:\36\2\u00f2\u00f4\5J&\2\u00f3\u00ea\3\2\2\2\u00f3"+
		"\u00eb\3\2\2\2\u00f3\u00ec\3\2\2\2\u00f3\u00ed\3\2\2\2\u00f3\u00ee\3\2"+
		"\2\2\u00f3\u00ef\3\2\2\2\u00f3\u00f0\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f2\3\2\2\2\u00f4%\3\2\2\2\u00f5\u00fb\5(\25\2\u00f6\u00f7\5\b\5\2"+
		"\u00f7\u00f8\5(\25\2\u00f8\u00fa\3\2\2\2\u00f9\u00f6\3\2\2\2\u00fa\u00fd"+
		"\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\'\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fe\u0104\5*\26\2\u00ff\u0100\5\6\4\2\u0100\u0101\5*"+
		"\26\2\u0101\u0103\3\2\2\2\u0102\u00ff\3\2\2\2\u0103\u0106\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105)\3\2\2\2\u0106\u0104\3\2\2\2"+
		"\u0107\u010d\5,\27\2\u0108\u0109\5\n\6\2\u0109\u010a\5,\27\2\u010a\u010c"+
		"\3\2\2\2\u010b\u0108\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e+\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0116\5.\30\2"+
		"\u0111\u0112\5\16\b\2\u0112\u0113\5.\30\2\u0113\u0115\3\2\2\2\u0114\u0111"+
		"\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"-\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011f\5\60\31\2\u011a\u011b\5\4\3"+
		"\2\u011b\u011c\5\60\31\2\u011c\u011e\3\2\2\2\u011d\u011a\3\2\2\2\u011e"+
		"\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120/\3\2\2\2"+
		"\u0121\u011f\3\2\2\2\u0122\u0128\5\62\32\2\u0123\u0124\5\20\t\2\u0124"+
		"\u0125\5\62\32\2\u0125\u0127\3\2\2\2\u0126\u0123\3\2\2\2\u0127\u012a\3"+
		"\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\61\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012b\u012e\5\22\n\2\u012c\u012e\5\4\3\2\u012d\u012b\3"+
		"\2\2\2\u012d\u012c\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133\5\64"+
		"\33\2\u0133\63\3\2\2\2\u0134\u013a\5$\23\2\u0135\u0136\5\2\2\2\u0136\u0137"+
		"\5$\23\2\u0137\u0139\3\2\2\2\u0138\u0135\3\2\2\2\u0139\u013c\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\65\3\2\2\2\u013c\u013a\3\2\2"+
		"\2\u013d\u013e\5&\24\2\u013e\u013f\7\30\2\2\u013f\u0141\3\2\2\2\u0140"+
		"\u013d\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2"+
		"\2\2\u0143\u0145\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0146\5&\24\2\u0146"+
		"\67\3\2\2\2\u0147\u0148\5> \2\u0148\u014f\b\35\1\2\u0149\u014a\7\30\2"+
		"\2\u014a\u014b\5> \2\u014b\u014c\b\35\1\2\u014c\u014e\3\2\2\2\u014d\u0149"+
		"\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"9\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0159\5> \2\u0153\u0159\5@!\2\u0154"+
		"\u0155\7\33\2\2\u0155\u0156\5&\24\2\u0156\u0157\7\34\2\2\u0157\u0159\3"+
		"\2\2\2\u0158\u0152\3\2\2\2\u0158\u0153\3\2\2\2\u0158\u0154\3\2\2\2\u0159"+
		";\3\2\2\2\u015a\u0163\7\63\2\2\u015b\u015c\7\31\2\2\u015c\u015d\5&\24"+
		"\2\u015d\u015e\7\32\2\2\u015e\u0162\3\2\2\2\u015f\u0160\7\27\2\2\u0160"+
		"\u0162\7\63\2\2\u0161\u015b\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0165\3"+
		"\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164=\3\2\2\2\u0165\u0163"+
		"\3\2\2\2\u0166\u0167\7\63\2\2\u0167\u0172\b \1\2\u0168\u0169\5<\37\2\u0169"+
		"\u016a\7\31\2\2\u016a\u016b\5&\24\2\u016b\u016c\7\32\2\2\u016c\u0172\3"+
		"\2\2\2\u016d\u016e\5<\37\2\u016e\u016f\7\27\2\2\u016f\u0170\7\63\2\2\u0170"+
		"\u0172\3\2\2\2\u0171\u0166\3\2\2\2\u0171\u0168\3\2\2\2\u0171\u016d\3\2"+
		"\2\2\u0172?\3\2\2\2\u0173\u0178\5<\37\2\u0174\u0179\5B\"\2\u0175\u0176"+
		"\7\37\2\2\u0176\u0177\7\63\2\2\u0177\u0179\5B\"\2\u0178\u0174\3\2\2\2"+
		"\u0178\u0175\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\b!\1\2\u017bA\3\2"+
		"\2\2\u017c\u017e\7\33\2\2\u017d\u017f\5\66\34\2\u017e\u017d\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0184\7\34\2\2\u0181\u0184\5"+
		"J&\2\u0182\u0184\5R*\2\u0183\u017c\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0182"+
		"\3\2\2\2\u0184C\3\2\2\2\u0185\u0186\7,\2\2\u0186\u0187\5F$\2\u0187E\3"+
		"\2\2\2\u0188\u018a\7\33\2\2\u0189\u018b\5H%\2\u018a\u0189\3\2\2\2\u018a"+
		"\u018b\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\7\34\2\2\u018d\u018e\5"+
		"\36\20\2\u018e\u018f\7\"\2\2\u018fG\3\2\2\2\u0190\u0193\5\"\22\2\u0191"+
		"\u0192\7\30\2\2\u0192\u0194\7\26\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3"+
		"\2\2\2\u0194\u0197\3\2\2\2\u0195\u0197\7\26\2\2\u0196\u0190\3\2\2\2\u0196"+
		"\u0195\3\2\2\2\u0197I\3\2\2\2\u0198\u019a\7\35\2\2\u0199\u019b\5L\'\2"+
		"\u019a\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d"+
		"\7\36\2\2\u019dK\3\2\2\2\u019e\u01a4\5N(\2\u019f\u01a0\5P)\2\u01a0\u01a1"+
		"\5N(\2\u01a1\u01a3\3\2\2\2\u01a2\u019f\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4"+
		"\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2"+
		"\2\2\u01a7\u01a9\5P)\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9M"+
		"\3\2\2\2\u01aa\u01ab\7\31\2\2\u01ab\u01ac\5&\24\2\u01ac\u01ad\7\32\2\2"+
		"\u01ad\u01ae\5\f\7\2\u01ae\u01af\5&\24\2\u01af\u01b6\3\2\2\2\u01b0\u01b1"+
		"\7\63\2\2\u01b1\u01b2\5\f\7\2\u01b2\u01b3\5&\24\2\u01b3\u01b6\3\2\2\2"+
		"\u01b4\u01b6\5&\24\2\u01b5\u01aa\3\2\2\2\u01b5\u01b0\3\2\2\2\u01b5\u01b4"+
		"\3\2\2\2\u01b6O\3\2\2\2\u01b7\u01b8\t\7\2\2\u01b8Q\3\2\2\2\u01b9\u01ba"+
		"\t\b\2\2\u01baS\3\2\2\2*\u0089\u008e\u009b\u00b8\u00ba\u00be\u00c1\u00c5"+
		"\u00c9\u00ce\u00d0\u00d9\u00de\u00e7\u00f3\u00fb\u0104\u010d\u0116\u011f"+
		"\u0128\u012d\u012f\u013a\u0142\u014f\u0158\u0161\u0163\u0171\u0178\u017e"+
		"\u0183\u018a\u0193\u0196\u019a\u01a4\u01a8\u01b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}