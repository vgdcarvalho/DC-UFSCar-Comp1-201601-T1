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
		CADEIA_NUMERICA=52, COMENTARIO=53, WS=54, PalavraReservada=55;
	public static final int
		RULE_operadorBinario = 0, RULE_operadorUnario = 1, RULE_operadorAtribuicao = 2, 
		RULE_operadorExtra = 3, RULE_programa = 4, RULE_comando = 5, RULE_retbreak = 6, 
		RULE_trecho = 7, RULE_bloco = 8, RULE_nomedafuncao = 9, RULE_listadenomes = 10, 
		RULE_exp = 11, RULE_listaexp = 12, RULE_listavar = 13, RULE_expprefixo = 14, 
		RULE_complementovar = 15, RULE_var = 16, RULE_chamadadefuncao = 17, RULE_argumentos = 18, 
		RULE_funcao = 19, RULE_corpodafuncao = 20, RULE_listadeparametros = 21, 
		RULE_construtordetabelas = 22, RULE_listadecampos = 23, RULE_campo = 24, 
		RULE_separadordecampos = 25, RULE_cadeia = 26;
	public static final String[] ruleNames = {
		"operadorBinario", "operadorUnario", "operadorAtribuicao", "operadorExtra", 
		"programa", "comando", "retbreak", "trecho", "bloco", "nomedafuncao", 
		"listadenomes", "exp", "listaexp", "listavar", "expprefixo", "complementovar", 
		"var", "chamadadefuncao", "argumentos", "funcao", "corpodafuncao", "listadeparametros", 
		"construtordetabelas", "listadecampos", "campo", "separadordecampos", 
		"cadeia"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'^'", "'+'", "'-'", "'and'", "'or'", "'<'", "'>'", "'<='", "'>='", 
		"'=='", "'~='", "'..'", "'*'", "'/'", "'%'", "'not'", "'#'", "'~'", "'='", 
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
		null, "NOME", "CADEIA_NORMAL", "CADEIA_CHAR", "CADEIA_NUMERICA", "COMENTARIO", 
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


	   public static String grupo="<551805, 551945>";

	public LuaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class OperadorBinarioContext extends ParserRuleContext {
		public OperadorBinarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorBinario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOperadorBinario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOperadorBinario(this);
		}
	}

	public final OperadorBinarioContext operadorBinario() throws RecognitionException {
		OperadorBinarioContext _localctx = new OperadorBinarioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_operadorBinario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
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
		enterRule(_localctx, 2, RULE_operadorUnario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
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
		enterRule(_localctx, 4, RULE_operadorAtribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__18);
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
		enterRule(_localctx, 6, RULE_operadorExtra);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
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
		enterRule(_localctx, 8, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
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
		enterRule(_localctx, 10, RULE_comando);
		int _la;
		try {
			setState(144);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				listavar();
				setState(65);
				operadorAtribuicao();
				setState(66);
				listaexp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				chamadadefuncao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				match(T__30);
				setState(70);
				bloco();
				setState(71);
				match(T__31);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				match(T__32);
				setState(74);
				exp(0);
				setState(75);
				match(T__30);
				setState(76);
				bloco();
				setState(77);
				match(T__31);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				match(T__33);
				setState(80);
				bloco();
				setState(81);
				match(T__34);
				setState(82);
				exp(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
				match(T__35);
				setState(85);
				exp(0);
				setState(86);
				match(T__36);
				setState(87);
				bloco();
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__37) {
					{
					{
					setState(88);
					match(T__37);
					setState(89);
					exp(0);
					setState(90);
					match(T__36);
					setState(91);
					bloco();
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(100);
				_la = _input.LA(1);
				if (_la==T__38) {
					{
					setState(98);
					match(T__38);
					setState(99);
					bloco();
					}
				}

				setState(102);
				match(T__31);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(104);
				match(T__39);
				setState(105);
				((ComandoContext)_localctx).NOME = match(NOME);
				 TabelaDeSimbolos.adicionarSimbolo((((ComandoContext)_localctx).NOME!=null?((ComandoContext)_localctx).NOME.getText():null),Tipo.VARIAVEL); 
				setState(107);
				operadorAtribuicao();
				setState(108);
				exp(0);
				setState(109);
				match(T__21);
				setState(110);
				exp(0);
				setState(113);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(111);
					match(T__21);
					setState(112);
					exp(0);
					}
				}

				setState(115);
				match(T__30);
				setState(116);
				bloco();
				setState(117);
				match(T__31);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(119);
				match(T__39);
				setState(120);
				listadenomes();
				setState(121);
				match(T__40);
				setState(122);
				listaexp();
				setState(123);
				match(T__30);
				setState(124);
				bloco();
				setState(125);
				match(T__31);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(127);
				match(T__41);
				setState(128);
				((ComandoContext)_localctx).nomedafuncao = nomedafuncao();
				 TabelaDeSimbolos.adicionarSimbolo((((ComandoContext)_localctx).nomedafuncao!=null?_input.getText(((ComandoContext)_localctx).nomedafuncao.start,((ComandoContext)_localctx).nomedafuncao.stop):null),Tipo.FUNCAO); 
				setState(130);
				corpodafuncao();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(132);
				match(T__42);
				{
				setState(133);
				match(T__41);
				setState(134);
				((ComandoContext)_localctx).NOME = match(NOME);
				 TabelaDeSimbolos.adicionarSimbolo((((ComandoContext)_localctx).NOME!=null?((ComandoContext)_localctx).NOME.getText():null),Tipo.FUNCAO); 
				setState(136);
				corpodafuncao();
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(137);
				match(T__42);
				setState(138);
				listadenomes();
				setState(142);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(139);
					operadorAtribuicao();
					setState(140);
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
		enterRule(_localctx, 12, RULE_retbreak);
		int _la;
		try {
			setState(151);
			switch (_input.LA(1)) {
			case T__43:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(T__43);
				setState(148);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__24) | (1L << T__26) | (1L << T__41) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << NOME) | (1L << CADEIA_NORMAL) | (1L << CADEIA_CHAR) | (1L << CADEIA_NUMERICA))) != 0)) {
					{
					setState(147);
					listaexp();
					}
				}

				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
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
		enterRule(_localctx, 14, RULE_trecho);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << NOME))) != 0)) {
				{
				{
				setState(153);
				comando();
				setState(155);
				_la = _input.LA(1);
				if (_la==T__29) {
					{
					setState(154);
					match(T__29);
					}
				}

				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			_la = _input.LA(1);
			if (_la==T__43 || _la==T__44) {
				{
				setState(162);
				retbreak();
				setState(164);
				_la = _input.LA(1);
				if (_la==T__29) {
					{
					setState(163);
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
		enterRule(_localctx, 16, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
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
		enterRule(_localctx, 18, RULE_nomedafuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(NOME);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(171);
				match(T__20);
				setState(172);
				match(NOME);
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(178);
				match(T__28);
				setState(179);
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
		enterRule(_localctx, 20, RULE_listadenomes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			((ListadenomesContext)_localctx).NOME = match(NOME);
			 TabelaDeSimbolos.adicionarSimbolo((((ListadenomesContext)_localctx).NOME!=null?((ListadenomesContext)_localctx).NOME.getText():null),Tipo.VARIAVEL); 
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(184);
					match(T__21);
					setState(185);
					((ListadenomesContext)_localctx).NOME = match(NOME);
					 TabelaDeSimbolos.adicionarSimbolo((((ListadenomesContext)_localctx).NOME!=null?((ListadenomesContext)_localctx).NOME.getText():null),Tipo.VARIAVEL); 
					}
					} 
				}
				setState(191);
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

	public static class ExpContext extends ParserRuleContext {
		public OperadorUnarioContext operadorUnario() {
			return getRuleContext(OperadorUnarioContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode CADEIA_NUMERICA() { return getToken(LuaParser.CADEIA_NUMERICA, 0); }
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
		public OperadorBinarioContext operadorBinario() {
			return getRuleContext(OperadorBinarioContext.class,0);
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
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			switch (_input.LA(1)) {
			case T__2:
			case T__15:
			case T__16:
			case T__17:
				{
				setState(193);
				operadorUnario();
				setState(194);
				exp(1);
				}
				break;
			case T__45:
				{
				setState(196);
				match(T__45);
				}
				break;
			case T__46:
				{
				setState(197);
				match(T__46);
				}
				break;
			case T__47:
				{
				setState(198);
				match(T__47);
				}
				break;
			case CADEIA_NUMERICA:
				{
				setState(199);
				match(CADEIA_NUMERICA);
				}
				break;
			case CADEIA_NORMAL:
			case CADEIA_CHAR:
				{
				setState(200);
				cadeia();
				}
				break;
			case T__19:
				{
				setState(201);
				match(T__19);
				}
				break;
			case T__41:
				{
				setState(202);
				funcao();
				}
				break;
			case T__24:
			case NOME:
				{
				setState(203);
				expprefixo();
				}
				break;
			case T__26:
				{
				setState(204);
				construtordetabelas();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(207);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(208);
					operadorBinario();
					setState(209);
					exp(3);
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		enterRule(_localctx, 24, RULE_listaexp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(216);
					exp(0);
					setState(217);
					match(T__21);
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(224);
			exp(0);
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
		enterRule(_localctx, 26, RULE_listavar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			((ListavarContext)_localctx).var = var();
			 TabelaDeSimbolos.adicionarSimbolo((((ListavarContext)_localctx).var!=null?_input.getText(((ListavarContext)_localctx).var.start,((ListavarContext)_localctx).var.stop):null),Tipo.VARIAVEL); 
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(228);
				match(T__21);
				setState(229);
				((ListavarContext)_localctx).var = var();
				 TabelaDeSimbolos.adicionarSimbolo((((ListavarContext)_localctx).var!=null?_input.getText(((ListavarContext)_localctx).var.start,((ListavarContext)_localctx).var.stop):null),Tipo.VARIAVEL); 
				}
				}
				setState(236);
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
		enterRule(_localctx, 28, RULE_expprefixo);
		try {
			setState(243);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				chamadadefuncao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				match(T__24);
				setState(240);
				exp(0);
				setState(241);
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
		enterRule(_localctx, 30, RULE_complementovar);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(NOME);
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(252);
					switch (_input.LA(1)) {
					case T__22:
						{
						setState(246);
						match(T__22);
						setState(247);
						exp(0);
						setState(248);
						match(T__23);
						}
						break;
					case T__20:
						{
						setState(250);
						match(T__20);
						setState(251);
						match(NOME);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		enterRule(_localctx, 32, RULE_var);
		try {
			setState(268);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				((VarContext)_localctx).NOME = match(NOME);
				 TabelaDeSimbolos.adicionarSimbolo((((VarContext)_localctx).NOME!=null?((VarContext)_localctx).NOME.getText():null),Tipo.VARIAVEL); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				complementovar();
				setState(260);
				match(T__22);
				setState(261);
				exp(0);
				setState(262);
				match(T__23);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				complementovar();
				setState(265);
				match(T__20);
				setState(266);
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
		enterRule(_localctx, 34, RULE_chamadadefuncao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			((ChamadadefuncaoContext)_localctx).complementovar = complementovar();
			setState(275);
			switch (_input.LA(1)) {
			case T__24:
			case T__26:
			case CADEIA_NORMAL:
			case CADEIA_CHAR:
				{
				setState(271);
				argumentos();
				}
				break;
			case T__28:
				{
				{
				setState(272);
				match(T__28);
				setState(273);
				match(NOME);
				setState(274);
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
		enterRule(_localctx, 36, RULE_argumentos);
		int _la;
		try {
			setState(286);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(T__24);
				setState(281);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__24) | (1L << T__26) | (1L << T__41) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << NOME) | (1L << CADEIA_NORMAL) | (1L << CADEIA_CHAR) | (1L << CADEIA_NUMERICA))) != 0)) {
					{
					setState(280);
					listaexp();
					}
				}

				setState(283);
				match(T__25);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				construtordetabelas();
				}
				break;
			case CADEIA_NORMAL:
			case CADEIA_CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
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
		enterRule(_localctx, 38, RULE_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(T__41);
			setState(289);
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
		enterRule(_localctx, 40, RULE_corpodafuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(T__24);
			setState(293);
			_la = _input.LA(1);
			if (_la==T__19 || _la==NOME) {
				{
				setState(292);
				listadeparametros();
				}
			}

			setState(295);
			match(T__25);
			setState(296);
			bloco();
			setState(297);
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
		enterRule(_localctx, 42, RULE_listadeparametros);
		int _la;
		try {
			setState(305);
			switch (_input.LA(1)) {
			case NOME:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				listadenomes();
				setState(302);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(300);
					match(T__21);
					setState(301);
					match(T__19);
					}
				}

				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
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
		enterRule(_localctx, 44, RULE_construtordetabelas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(T__26);
			setState(309);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__22) | (1L << T__24) | (1L << T__26) | (1L << T__41) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << NOME) | (1L << CADEIA_NORMAL) | (1L << CADEIA_CHAR) | (1L << CADEIA_NUMERICA))) != 0)) {
				{
				setState(308);
				listadecampos();
				}
			}

			setState(311);
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
		enterRule(_localctx, 46, RULE_listadecampos);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			campo();
			setState(319);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(314);
					separadordecampos();
					setState(315);
					campo();
					}
					} 
				}
				setState(321);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(323);
			_la = _input.LA(1);
			if (_la==T__21 || _la==T__29) {
				{
				setState(322);
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
		enterRule(_localctx, 48, RULE_campo);
		try {
			setState(336);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				match(T__22);
				setState(326);
				exp(0);
				setState(327);
				match(T__23);
				setState(328);
				operadorAtribuicao();
				setState(329);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				match(NOME);
				setState(332);
				operadorAtribuicao();
				setState(333);
				exp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
				exp(0);
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
		enterRule(_localctx, 50, RULE_separadordecampos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
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
		enterRule(_localctx, 52, RULE_cadeia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\39\u0159\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7`\n\7\f\7\16\7c\13\7"+
		"\3\7\3\7\5\7g\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7t\n\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0091\n\7\5\7\u0093\n\7\3\b"+
		"\3\b\5\b\u0097\n\b\3\b\5\b\u009a\n\b\3\t\3\t\5\t\u009e\n\t\7\t\u00a0\n"+
		"\t\f\t\16\t\u00a3\13\t\3\t\3\t\5\t\u00a7\n\t\5\t\u00a9\n\t\3\n\3\n\3\13"+
		"\3\13\3\13\7\13\u00b0\n\13\f\13\16\13\u00b3\13\13\3\13\3\13\5\13\u00b7"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\7\f\u00be\n\f\f\f\16\f\u00c1\13\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d0\n\r\3\r\3\r\3\r\3"+
		"\r\7\r\u00d6\n\r\f\r\16\r\u00d9\13\r\3\16\3\16\3\16\7\16\u00de\n\16\f"+
		"\16\16\16\u00e1\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00eb"+
		"\n\17\f\17\16\17\u00ee\13\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00f6"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00ff\n\21\f\21\16\21\u0102"+
		"\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u010f"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u0116\n\23\3\23\3\23\3\24\3\24\5\24"+
		"\u011c\n\24\3\24\3\24\3\24\5\24\u0121\n\24\3\25\3\25\3\25\3\26\3\26\5"+
		"\26\u0128\n\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u0131\n\27\3\27"+
		"\5\27\u0134\n\27\3\30\3\30\5\30\u0138\n\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\7\31\u0140\n\31\f\31\16\31\u0143\13\31\3\31\5\31\u0146\n\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0153\n\32\3\33"+
		"\3\33\3\34\3\34\3\34\2\3\30\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\66\2\7\3\2\3\21\4\2\5\5\22\24\3\2\26 \4\2\30\30  \3"+
		"\2\64\65\u0172\28\3\2\2\2\4:\3\2\2\2\6<\3\2\2\2\b>\3\2\2\2\n@\3\2\2\2"+
		"\f\u0092\3\2\2\2\16\u0099\3\2\2\2\20\u00a1\3\2\2\2\22\u00aa\3\2\2\2\24"+
		"\u00ac\3\2\2\2\26\u00b8\3\2\2\2\30\u00cf\3\2\2\2\32\u00df\3\2\2\2\34\u00e4"+
		"\3\2\2\2\36\u00f5\3\2\2\2 \u00f7\3\2\2\2\"\u010e\3\2\2\2$\u0110\3\2\2"+
		"\2&\u0120\3\2\2\2(\u0122\3\2\2\2*\u0125\3\2\2\2,\u0133\3\2\2\2.\u0135"+
		"\3\2\2\2\60\u013b\3\2\2\2\62\u0152\3\2\2\2\64\u0154\3\2\2\2\66\u0156\3"+
		"\2\2\289\t\2\2\29\3\3\2\2\2:;\t\3\2\2;\5\3\2\2\2<=\7\25\2\2=\7\3\2\2\2"+
		">?\t\4\2\2?\t\3\2\2\2@A\5\20\t\2A\13\3\2\2\2BC\5\34\17\2CD\5\6\4\2DE\5"+
		"\32\16\2E\u0093\3\2\2\2F\u0093\5$\23\2GH\7!\2\2HI\5\22\n\2IJ\7\"\2\2J"+
		"\u0093\3\2\2\2KL\7#\2\2LM\5\30\r\2MN\7!\2\2NO\5\22\n\2OP\7\"\2\2P\u0093"+
		"\3\2\2\2QR\7$\2\2RS\5\22\n\2ST\7%\2\2TU\5\30\r\2U\u0093\3\2\2\2VW\7&\2"+
		"\2WX\5\30\r\2XY\7\'\2\2Ya\5\22\n\2Z[\7(\2\2[\\\5\30\r\2\\]\7\'\2\2]^\5"+
		"\22\n\2^`\3\2\2\2_Z\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bf\3\2\2\2ca"+
		"\3\2\2\2de\7)\2\2eg\5\22\n\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7\"\2\2i"+
		"\u0093\3\2\2\2jk\7*\2\2kl\7\63\2\2lm\b\7\1\2mn\5\6\4\2no\5\30\r\2op\7"+
		"\30\2\2ps\5\30\r\2qr\7\30\2\2rt\5\30\r\2sq\3\2\2\2st\3\2\2\2tu\3\2\2\2"+
		"uv\7!\2\2vw\5\22\n\2wx\7\"\2\2x\u0093\3\2\2\2yz\7*\2\2z{\5\26\f\2{|\7"+
		"+\2\2|}\5\32\16\2}~\7!\2\2~\177\5\22\n\2\177\u0080\7\"\2\2\u0080\u0093"+
		"\3\2\2\2\u0081\u0082\7,\2\2\u0082\u0083\5\24\13\2\u0083\u0084\b\7\1\2"+
		"\u0084\u0085\5*\26\2\u0085\u0093\3\2\2\2\u0086\u0087\7-\2\2\u0087\u0088"+
		"\7,\2\2\u0088\u0089\7\63\2\2\u0089\u008a\b\7\1\2\u008a\u0093\5*\26\2\u008b"+
		"\u008c\7-\2\2\u008c\u0090\5\26\f\2\u008d\u008e\5\6\4\2\u008e\u008f\5\32"+
		"\16\2\u008f\u0091\3\2\2\2\u0090\u008d\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0093\3\2\2\2\u0092B\3\2\2\2\u0092F\3\2\2\2\u0092G\3\2\2\2\u0092K\3\2"+
		"\2\2\u0092Q\3\2\2\2\u0092V\3\2\2\2\u0092j\3\2\2\2\u0092y\3\2\2\2\u0092"+
		"\u0081\3\2\2\2\u0092\u0086\3\2\2\2\u0092\u008b\3\2\2\2\u0093\r\3\2\2\2"+
		"\u0094\u0096\7.\2\2\u0095\u0097\5\32\16\2\u0096\u0095\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u009a\7/\2\2\u0099\u0094\3\2\2\2\u0099"+
		"\u0098\3\2\2\2\u009a\17\3\2\2\2\u009b\u009d\5\f\7\2\u009c\u009e\7 \2\2"+
		"\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009b"+
		"\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a8\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a6\5\16\b\2\u00a5\u00a7\7"+
		" \2\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8"+
		"\u00a4\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\21\3\2\2\2\u00aa\u00ab\5\20\t"+
		"\2\u00ab\23\3\2\2\2\u00ac\u00b1\7\63\2\2\u00ad\u00ae\7\27\2\2\u00ae\u00b0"+
		"\7\63\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2"+
		"\u00b1\u00b2\3\2\2\2\u00b2\u00b6\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5"+
		"\7\37\2\2\u00b5\u00b7\7\63\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2"+
		"\u00b7\25\3\2\2\2\u00b8\u00b9\7\63\2\2\u00b9\u00bf\b\f\1\2\u00ba\u00bb"+
		"\7\30\2\2\u00bb\u00bc\7\63\2\2\u00bc\u00be\b\f\1\2\u00bd\u00ba\3\2\2\2"+
		"\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\27"+
		"\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\b\r\1\2\u00c3\u00c4\5\4\3\2\u00c4"+
		"\u00c5\5\30\r\3\u00c5\u00d0\3\2\2\2\u00c6\u00d0\7\60\2\2\u00c7\u00d0\7"+
		"\61\2\2\u00c8\u00d0\7\62\2\2\u00c9\u00d0\7\66\2\2\u00ca\u00d0\5\66\34"+
		"\2\u00cb\u00d0\7\26\2\2\u00cc\u00d0\5(\25\2\u00cd\u00d0\5\36\20\2\u00ce"+
		"\u00d0\5.\30\2\u00cf\u00c2\3\2\2\2\u00cf\u00c6\3\2\2\2\u00cf\u00c7\3\2"+
		"\2\2\u00cf\u00c8\3\2\2\2\u00cf\u00c9\3\2\2\2\u00cf\u00ca\3\2\2\2\u00cf"+
		"\u00cb\3\2\2\2\u00cf\u00cc\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2"+
		"\2\2\u00d0\u00d7\3\2\2\2\u00d1\u00d2\f\4\2\2\u00d2\u00d3\5\2\2\2\u00d3"+
		"\u00d4\5\30\r\5\u00d4\u00d6\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d6\u00d9\3"+
		"\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\31\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00da\u00db\5\30\r\2\u00db\u00dc\7\30\2\2\u00dc\u00de\3"+
		"\2\2\2\u00dd\u00da\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\5\30"+
		"\r\2\u00e3\33\3\2\2\2\u00e4\u00e5\5\"\22\2\u00e5\u00ec\b\17\1\2\u00e6"+
		"\u00e7\7\30\2\2\u00e7\u00e8\5\"\22\2\u00e8\u00e9\b\17\1\2\u00e9\u00eb"+
		"\3\2\2\2\u00ea\u00e6\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\35\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f6\5\"\22"+
		"\2\u00f0\u00f6\5$\23\2\u00f1\u00f2\7\33\2\2\u00f2\u00f3\5\30\r\2\u00f3"+
		"\u00f4\7\34\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00ef\3\2\2\2\u00f5\u00f0\3"+
		"\2\2\2\u00f5\u00f1\3\2\2\2\u00f6\37\3\2\2\2\u00f7\u0100\7\63\2\2\u00f8"+
		"\u00f9\7\31\2\2\u00f9\u00fa\5\30\r\2\u00fa\u00fb\7\32\2\2\u00fb\u00ff"+
		"\3\2\2\2\u00fc\u00fd\7\27\2\2\u00fd\u00ff\7\63\2\2\u00fe\u00f8\3\2\2\2"+
		"\u00fe\u00fc\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101"+
		"\3\2\2\2\u0101!\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\7\63\2\2\u0104"+
		"\u010f\b\22\1\2\u0105\u0106\5 \21\2\u0106\u0107\7\31\2\2\u0107\u0108\5"+
		"\30\r\2\u0108\u0109\7\32\2\2\u0109\u010f\3\2\2\2\u010a\u010b\5 \21\2\u010b"+
		"\u010c\7\27\2\2\u010c\u010d\7\63\2\2\u010d\u010f\3\2\2\2\u010e\u0103\3"+
		"\2\2\2\u010e\u0105\3\2\2\2\u010e\u010a\3\2\2\2\u010f#\3\2\2\2\u0110\u0115"+
		"\5 \21\2\u0111\u0116\5&\24\2\u0112\u0113\7\37\2\2\u0113\u0114\7\63\2\2"+
		"\u0114\u0116\5&\24\2\u0115\u0111\3\2\2\2\u0115\u0112\3\2\2\2\u0116\u0117"+
		"\3\2\2\2\u0117\u0118\b\23\1\2\u0118%\3\2\2\2\u0119\u011b\7\33\2\2\u011a"+
		"\u011c\5\32\16\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3"+
		"\2\2\2\u011d\u0121\7\34\2\2\u011e\u0121\5.\30\2\u011f\u0121\5\66\34\2"+
		"\u0120\u0119\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121\'\3"+
		"\2\2\2\u0122\u0123\7,\2\2\u0123\u0124\5*\26\2\u0124)\3\2\2\2\u0125\u0127"+
		"\7\33\2\2\u0126\u0128\5,\27\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2"+
		"\u0128\u0129\3\2\2\2\u0129\u012a\7\34\2\2\u012a\u012b\5\22\n\2\u012b\u012c"+
		"\7\"\2\2\u012c+\3\2\2\2\u012d\u0130\5\26\f\2\u012e\u012f\7\30\2\2\u012f"+
		"\u0131\7\26\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0134\3"+
		"\2\2\2\u0132\u0134\7\26\2\2\u0133\u012d\3\2\2\2\u0133\u0132\3\2\2\2\u0134"+
		"-\3\2\2\2\u0135\u0137\7\35\2\2\u0136\u0138\5\60\31\2\u0137\u0136\3\2\2"+
		"\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\7\36\2\2\u013a"+
		"/\3\2\2\2\u013b\u0141\5\62\32\2\u013c\u013d\5\64\33\2\u013d\u013e\5\62"+
		"\32\2\u013e\u0140\3\2\2\2\u013f\u013c\3\2\2\2\u0140\u0143\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2"+
		"\2\2\u0144\u0146\5\64\33\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\61\3\2\2\2\u0147\u0148\7\31\2\2\u0148\u0149\5\30\r\2\u0149\u014a\7\32"+
		"\2\2\u014a\u014b\5\6\4\2\u014b\u014c\5\30\r\2\u014c\u0153\3\2\2\2\u014d"+
		"\u014e\7\63\2\2\u014e\u014f\5\6\4\2\u014f\u0150\5\30\r\2\u0150\u0153\3"+
		"\2\2\2\u0151\u0153\5\30\r\2\u0152\u0147\3\2\2\2\u0152\u014d\3\2\2\2\u0152"+
		"\u0151\3\2\2\2\u0153\63\3\2\2\2\u0154\u0155\t\5\2\2\u0155\65\3\2\2\2\u0156"+
		"\u0157\t\6\2\2\u0157\67\3\2\2\2\"afs\u0090\u0092\u0096\u0099\u009d\u00a1"+
		"\u00a6\u00a8\u00b1\u00b6\u00bf\u00cf\u00d7\u00df\u00ec\u00f5\u00fe\u0100"+
		"\u010e\u0115\u011b\u0120\u0127\u0130\u0133\u0137\u0141\u0145\u0152";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}