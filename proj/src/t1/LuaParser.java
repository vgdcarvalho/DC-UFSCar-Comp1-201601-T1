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
		T__45=46, T__46=47, T__47=48, T__48=49, NOME=50, INTEGER=51, FLOAT=52, 
		CADEIA_NORMAL=53, CADEIA_CHAR=54;
	public static final int
		RULE_programa = 0, RULE_trecho = 1, RULE_bloco = 2, RULE_comando = 3, 
		RULE_retbreak = 4, RULE_nomedafuncao = 5, RULE_listavar = 6, RULE_listadenomes = 7, 
		RULE_listaexp = 8, RULE_var = 9, RULE_exp = 10, RULE_varSufixo = 11, RULE_expPrefixo = 12, 
		RULE_chamadadefuncao = 13, RULE_varOuExp = 14, RULE_nomeArgumento = 15, 
		RULE_argumentos = 16, RULE_funcao = 17, RULE_corpodafuncao = 18, RULE_listadeparametros = 19, 
		RULE_tabela = 20, RULE_listadecampos = 21, RULE_campo = 22, RULE_separadordecampos = 23, 
		RULE_opLogicoOu = 24, RULE_opLogicoE = 25, RULE_opComparacao = 26, RULE_opConcat = 27, 
		RULE_opSomaSub = 28, RULE_opMulDivMod = 29, RULE_opUnario = 30, RULE_opPotencia = 31, 
		RULE_numero = 32, RULE_cadeia = 33;
	public static final String[] ruleNames = {
		"programa", "trecho", "bloco", "comando", "retbreak", "nomedafuncao", 
		"listavar", "listadenomes", "listaexp", "var", "exp", "varSufixo", "expPrefixo", 
		"chamadadefuncao", "varOuExp", "nomeArgumento", "argumentos", "funcao", 
		"corpodafuncao", "listadeparametros", "tabela", "listadecampos", "campo", 
		"separadordecampos", "opLogicoOu", "opLogicoE", "opComparacao", "opConcat", 
		"opSomaSub", "opMulDivMod", "opUnario", "opPotencia", "numero", "cadeia"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='", "'do'", "'end'", "'while'", "'repeat'", "'until'", 
		"'if'", "'then'", "'elseif'", "'else'", "'for'", "','", "'in'", "'funcion'", 
		"'local'", "'function'", "'return'", "'break'", "'.'", "':'", "'('", "')'", 
		"'nil'", "'false'", "'true'", "'...'", "'['", "']'", "'{'", "'}'", "'or'", 
		"'and'", "'<'", "'>'", "'<='", "'>='", "'~='", "'=='", "'..'", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'not'", "'#'", "'~'", "'^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "NOME", "INTEGER", "FLOAT", "CADEIA_NORMAL", "CADEIA_CHAR"
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


	   public static String grupo="551805 e 551945";

	public LuaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
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

	public static class TrechoContext extends ParserRuleContext {
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LuaParser.EOF, 0); }
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
		enterRule(_localctx, 2, RULE_trecho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			bloco();
			setState(71);
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

	public static class BlocoContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public RetbreakContext retbreak() {
			return getRuleContext(RetbreakContext.class,0);
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
		enterRule(_localctx, 4, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__21) | (1L << NOME))) != 0)) {
				{
				{
				setState(73);
				comando();
				setState(75);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(74);
					match(T__0);
					}
				}

				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			_la = _input.LA(1);
			if (_la==T__17 || _la==T__18) {
				{
				setState(82);
				retbreak();
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

	public static class ComandoContext extends ParserRuleContext {
		public ListavarContext listavar() {
			return getRuleContext(ListavarContext.class,0);
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
		enterRule(_localctx, 6, RULE_comando);
		int _la;
		try {
			setState(161);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				listavar();
				setState(86);
				match(T__1);
				setState(87);
				listaexp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				chamadadefuncao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				match(T__2);
				setState(91);
				bloco();
				setState(92);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				match(T__4);
				setState(95);
				exp(0);
				setState(96);
				match(T__2);
				setState(97);
				bloco();
				setState(98);
				match(T__3);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(100);
				match(T__5);
				setState(101);
				bloco();
				setState(102);
				match(T__6);
				setState(103);
				exp(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(105);
				match(T__7);
				setState(106);
				exp(0);
				setState(107);
				match(T__8);
				setState(108);
				bloco();
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(109);
					match(T__9);
					setState(110);
					exp(0);
					setState(111);
					match(T__8);
					setState(112);
					bloco();
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(121);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(119);
					match(T__10);
					setState(120);
					bloco();
					}
				}

				setState(123);
				match(T__3);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(125);
				match(T__11);
				setState(126);
				match(NOME);
				setState(127);
				match(T__1);
				setState(128);
				exp(0);
				setState(129);
				match(T__12);
				setState(130);
				exp(0);
				setState(133);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(131);
					match(T__12);
					setState(132);
					exp(0);
					}
				}

				setState(135);
				match(T__2);
				setState(136);
				bloco();
				setState(137);
				match(T__3);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(139);
				match(T__11);
				setState(140);
				listadenomes();
				setState(141);
				match(T__13);
				setState(142);
				listaexp();
				setState(143);
				match(T__2);
				setState(144);
				bloco();
				setState(145);
				match(T__3);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(147);
				match(T__14);
				setState(148);
				nomedafuncao();
				setState(149);
				corpodafuncao();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(151);
				match(T__15);
				setState(152);
				match(T__16);
				setState(153);
				match(NOME);
				setState(154);
				corpodafuncao();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(155);
				match(T__15);
				setState(156);
				listadenomes();
				setState(159);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(157);
					match(T__1);
					setState(158);
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
		enterRule(_localctx, 8, RULE_retbreak);
		int _la;
		try {
			setState(174);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(T__17);
				setState(165);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__41) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << NOME) | (1L << INTEGER) | (1L << FLOAT) | (1L << CADEIA_NORMAL) | (1L << CADEIA_CHAR))) != 0)) {
					{
					setState(164);
					listaexp();
					}
				}

				setState(168);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(167);
					match(T__0);
					}
				}

				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(T__18);
				setState(172);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(171);
					match(T__0);
					}
				}

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
		enterRule(_localctx, 10, RULE_nomedafuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(NOME);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(177);
				match(T__19);
				setState(178);
				match(NOME);
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(184);
				match(T__20);
				setState(185);
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

	public static class ListavarContext extends ParserRuleContext {
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
		enterRule(_localctx, 12, RULE_listavar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			var();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(189);
				match(T__12);
				setState(190);
				var();
				}
				}
				setState(195);
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

	public static class ListadenomesContext extends ParserRuleContext {
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
		enterRule(_localctx, 14, RULE_listadenomes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(NOME);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(197);
					match(T__12);
					setState(198);
					match(NOME);
					}
					} 
				}
				setState(203);
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
		enterRule(_localctx, 16, RULE_listaexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			exp(0);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(205);
				match(T__12);
				setState(206);
				exp(0);
				}
				}
				setState(211);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode NOME() { return getToken(LuaParser.NOME, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<VarSufixoContext> varSufixo() {
			return getRuleContexts(VarSufixoContext.class);
		}
		public VarSufixoContext varSufixo(int i) {
			return getRuleContext(VarSufixoContext.class,i);
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
		enterRule(_localctx, 18, RULE_var);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			switch (_input.LA(1)) {
			case NOME:
				{
				setState(212);
				match(NOME);
				}
				break;
			case T__21:
				{
				setState(213);
				match(T__21);
				setState(214);
				exp(0);
				setState(215);
				match(T__22);
				setState(216);
				varSufixo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(220);
					varSufixo();
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		public OpUnarioContext opUnario() {
			return getRuleContext(OpUnarioContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public CadeiaContext cadeia() {
			return getRuleContext(CadeiaContext.class,0);
		}
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public ExpPrefixoContext expPrefixo() {
			return getRuleContext(ExpPrefixoContext.class,0);
		}
		public OpPotenciaContext opPotencia() {
			return getRuleContext(OpPotenciaContext.class,0);
		}
		public OpMulDivModContext opMulDivMod() {
			return getRuleContext(OpMulDivModContext.class,0);
		}
		public OpSomaSubContext opSomaSub() {
			return getRuleContext(OpSomaSubContext.class,0);
		}
		public OpConcatContext opConcat() {
			return getRuleContext(OpConcatContext.class,0);
		}
		public OpComparacaoContext opComparacao() {
			return getRuleContext(OpComparacaoContext.class,0);
		}
		public OpLogicoEContext opLogicoE() {
			return getRuleContext(OpLogicoEContext.class,0);
		}
		public OpLogicoOuContext opLogicoOu() {
			return getRuleContext(OpLogicoOuContext.class,0);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			switch (_input.LA(1)) {
			case T__41:
			case T__45:
			case T__46:
			case T__47:
				{
				setState(227);
				opUnario();
				setState(228);
				exp(7);
				}
				break;
			case T__23:
				{
				setState(230);
				match(T__23);
				}
				break;
			case T__24:
				{
				setState(231);
				match(T__24);
				}
				break;
			case T__25:
				{
				setState(232);
				match(T__25);
				}
				break;
			case INTEGER:
			case FLOAT:
				{
				setState(233);
				numero();
				}
				break;
			case CADEIA_NORMAL:
			case CADEIA_CHAR:
				{
				setState(234);
				cadeia();
				}
				break;
			case T__26:
				{
				setState(235);
				match(T__26);
				}
				break;
			case T__16:
				{
				setState(236);
				funcao();
				}
				break;
			case T__21:
			case NOME:
				{
				setState(237);
				expPrefixo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(268);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(240);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(241);
						opPotencia();
						setState(242);
						exp(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(244);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(245);
						opMulDivMod();
						setState(246);
						exp(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(248);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(249);
						opSomaSub();
						setState(250);
						exp(6);
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(252);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(253);
						opConcat();
						setState(254);
						exp(4);
						}
						break;
					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(256);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(257);
						opComparacao();
						setState(258);
						exp(4);
						}
						break;
					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(260);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(261);
						opLogicoE();
						setState(262);
						exp(3);
						}
						break;
					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(264);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(265);
						opLogicoOu();
						setState(266);
						exp(2);
						}
						break;
					}
					} 
				}
				setState(272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class VarSufixoContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode NOME() { return getToken(LuaParser.NOME, 0); }
		public List<NomeArgumentoContext> nomeArgumento() {
			return getRuleContexts(NomeArgumentoContext.class);
		}
		public NomeArgumentoContext nomeArgumento(int i) {
			return getRuleContext(NomeArgumentoContext.class,i);
		}
		public VarSufixoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSufixo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterVarSufixo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitVarSufixo(this);
		}
	}

	public final VarSufixoContext varSufixo() throws RecognitionException {
		VarSufixoContext _localctx = new VarSufixoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varSufixo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__29) | (1L << CADEIA_NORMAL) | (1L << CADEIA_CHAR))) != 0)) {
				{
				{
				setState(273);
				nomeArgumento();
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
			switch (_input.LA(1)) {
			case T__27:
				{
				setState(279);
				match(T__27);
				setState(280);
				exp(0);
				setState(281);
				match(T__28);
				}
				break;
			case T__19:
				{
				setState(283);
				match(T__19);
				setState(284);
				match(NOME);
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

	public static class ExpPrefixoContext extends ParserRuleContext {
		public VarOuExpContext varOuExp() {
			return getRuleContext(VarOuExpContext.class,0);
		}
		public List<NomeArgumentoContext> nomeArgumento() {
			return getRuleContexts(NomeArgumentoContext.class);
		}
		public NomeArgumentoContext nomeArgumento(int i) {
			return getRuleContext(NomeArgumentoContext.class,i);
		}
		public ExpPrefixoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expPrefixo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExpPrefixo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExpPrefixo(this);
		}
	}

	public final ExpPrefixoContext expPrefixo() throws RecognitionException {
		ExpPrefixoContext _localctx = new ExpPrefixoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expPrefixo);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			varOuExp();
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(288);
					nomeArgumento();
					}
					} 
				}
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class ChamadadefuncaoContext extends ParserRuleContext {
		public VarOuExpContext varOuExp() {
			return getRuleContext(VarOuExpContext.class,0);
		}
		public List<NomeArgumentoContext> nomeArgumento() {
			return getRuleContexts(NomeArgumentoContext.class);
		}
		public NomeArgumentoContext nomeArgumento(int i) {
			return getRuleContext(NomeArgumentoContext.class,i);
		}
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
		enterRule(_localctx, 26, RULE_chamadadefuncao);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			varOuExp();
			setState(296); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(295);
					nomeArgumento();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(298); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class VarOuExpContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public VarOuExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varOuExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterVarOuExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitVarOuExp(this);
		}
	}

	public final VarOuExpContext varOuExp() throws RecognitionException {
		VarOuExpContext _localctx = new VarOuExpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_varOuExp);
		try {
			setState(305);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				match(T__21);
				setState(302);
				exp(0);
				setState(303);
				match(T__22);
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

	public static class NomeArgumentoContext extends ParserRuleContext {
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public TerminalNode NOME() { return getToken(LuaParser.NOME, 0); }
		public NomeArgumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomeArgumento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterNomeArgumento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitNomeArgumento(this);
		}
	}

	public final NomeArgumentoContext nomeArgumento() throws RecognitionException {
		NomeArgumentoContext _localctx = new NomeArgumentoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_nomeArgumento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(307);
				match(T__20);
				setState(308);
				match(NOME);
				}
			}

			setState(311);
			argumentos();
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
		public TabelaContext tabela() {
			return getRuleContext(TabelaContext.class,0);
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
		enterRule(_localctx, 32, RULE_argumentos);
		int _la;
		try {
			setState(320);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(T__21);
				setState(315);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__41) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << NOME) | (1L << INTEGER) | (1L << FLOAT) | (1L << CADEIA_NORMAL) | (1L << CADEIA_CHAR))) != 0)) {
					{
					setState(314);
					listaexp();
					}
				}

				setState(317);
				match(T__22);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				tabela();
				}
				break;
			case CADEIA_NORMAL:
			case CADEIA_CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
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
		enterRule(_localctx, 34, RULE_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(T__16);
			setState(323);
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
		public ListadeparametrosContext listadeparametros() {
			return getRuleContext(ListadeparametrosContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
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
		enterRule(_localctx, 36, RULE_corpodafuncao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(T__21);
			setState(326);
			listadeparametros();
			setState(327);
			match(T__22);
			setState(328);
			bloco();
			setState(329);
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
		enterRule(_localctx, 38, RULE_listadeparametros);
		int _la;
		try {
			setState(337);
			switch (_input.LA(1)) {
			case NOME:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				listadenomes();
				setState(334);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(332);
					match(T__12);
					setState(333);
					match(T__26);
					}
				}

				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				match(T__26);
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

	public static class TabelaContext extends ParserRuleContext {
		public ListadecamposContext listadecampos() {
			return getRuleContext(ListadecamposContext.class,0);
		}
		public TabelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterTabela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitTabela(this);
		}
	}

	public final TabelaContext tabela() throws RecognitionException {
		TabelaContext _localctx = new TabelaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tabela);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(T__29);
			setState(340);
			listadecampos();
			setState(341);
			match(T__30);
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
		enterRule(_localctx, 42, RULE_listadecampos);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			campo();
			setState(349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(344);
					separadordecampos();
					setState(345);
					campo();
					}
					} 
				}
				setState(351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(353);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__12) {
				{
				setState(352);
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
		enterRule(_localctx, 44, RULE_campo);
		try {
			setState(365);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				match(T__27);
				setState(356);
				exp(0);
				setState(357);
				match(T__28);
				setState(358);
				match(T__1);
				setState(359);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				match(NOME);
				setState(362);
				match(T__1);
				setState(363);
				exp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
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
		enterRule(_localctx, 46, RULE_separadordecampos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__12) ) {
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

	public static class OpLogicoOuContext extends ParserRuleContext {
		public OpLogicoOuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opLogicoOu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpLogicoOu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpLogicoOu(this);
		}
	}

	public final OpLogicoOuContext opLogicoOu() throws RecognitionException {
		OpLogicoOuContext _localctx = new OpLogicoOuContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_opLogicoOu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
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

	public static class OpLogicoEContext extends ParserRuleContext {
		public OpLogicoEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opLogicoE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpLogicoE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpLogicoE(this);
		}
	}

	public final OpLogicoEContext opLogicoE() throws RecognitionException {
		OpLogicoEContext _localctx = new OpLogicoEContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_opLogicoE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(T__32);
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

	public static class OpComparacaoContext extends ParserRuleContext {
		public OpComparacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opComparacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpComparacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpComparacao(this);
		}
	}

	public final OpComparacaoContext opComparacao() throws RecognitionException {
		OpComparacaoContext _localctx = new OpComparacaoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_opComparacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) ) {
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

	public static class OpConcatContext extends ParserRuleContext {
		public OpConcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opConcat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpConcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpConcat(this);
		}
	}

	public final OpConcatContext opConcat() throws RecognitionException {
		OpConcatContext _localctx = new OpConcatContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_opConcat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(T__39);
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

	public static class OpSomaSubContext extends ParserRuleContext {
		public OpSomaSubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opSomaSub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpSomaSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpSomaSub(this);
		}
	}

	public final OpSomaSubContext opSomaSub() throws RecognitionException {
		OpSomaSubContext _localctx = new OpSomaSubContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_opSomaSub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_la = _input.LA(1);
			if ( !(_la==T__40 || _la==T__41) ) {
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

	public static class OpMulDivModContext extends ParserRuleContext {
		public OpMulDivModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opMulDivMod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpMulDivMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpMulDivMod(this);
		}
	}

	public final OpMulDivModContext opMulDivMod() throws RecognitionException {
		OpMulDivModContext _localctx = new OpMulDivModContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_opMulDivMod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__42) | (1L << T__43) | (1L << T__44))) != 0)) ) {
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

	public static class OpUnarioContext extends ParserRuleContext {
		public OpUnarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opUnario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpUnario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpUnario(this);
		}
	}

	public final OpUnarioContext opUnario() throws RecognitionException {
		OpUnarioContext _localctx = new OpUnarioContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_opUnario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0)) ) {
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

	public static class OpPotenciaContext extends ParserRuleContext {
		public OpPotenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opPotencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpPotencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpPotencia(this);
		}
	}

	public final OpPotenciaContext opPotencia() throws RecognitionException {
		OpPotenciaContext _localctx = new OpPotenciaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_opPotencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(T__48);
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

	public static class NumeroContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(LuaParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(LuaParser.FLOAT, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitNumero(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==FLOAT) ) {
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
		enterRule(_localctx, 66, RULE_cadeia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
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
		case 10:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\38\u0188\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\3\3\4\3\4\5\4N\n\4\7\4P\n\4\f\4\16"+
		"\4S\13\4\3\4\5\4V\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7"+
		"\5u\n\5\f\5\16\5x\13\5\3\5\3\5\5\5|\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5\u0088\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a2\n\5\5\5\u00a4"+
		"\n\5\3\6\3\6\5\6\u00a8\n\6\3\6\5\6\u00ab\n\6\3\6\3\6\5\6\u00af\n\6\5\6"+
		"\u00b1\n\6\3\7\3\7\3\7\7\7\u00b6\n\7\f\7\16\7\u00b9\13\7\3\7\3\7\5\7\u00bd"+
		"\n\7\3\b\3\b\3\b\7\b\u00c2\n\b\f\b\16\b\u00c5\13\b\3\t\3\t\3\t\7\t\u00ca"+
		"\n\t\f\t\16\t\u00cd\13\t\3\n\3\n\3\n\7\n\u00d2\n\n\f\n\16\n\u00d5\13\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00dd\n\13\3\13\7\13\u00e0\n\13\f"+
		"\13\16\13\u00e3\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u00f1\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u010f\n\f"+
		"\f\f\16\f\u0112\13\f\3\r\7\r\u0115\n\r\f\r\16\r\u0118\13\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u0120\n\r\3\16\3\16\7\16\u0124\n\16\f\16\16\16\u0127"+
		"\13\16\3\17\3\17\6\17\u012b\n\17\r\17\16\17\u012c\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u0134\n\20\3\21\3\21\5\21\u0138\n\21\3\21\3\21\3\22\3\22\5"+
		"\22\u013e\n\22\3\22\3\22\3\22\5\22\u0143\n\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u0151\n\25\3\25\5\25\u0154\n"+
		"\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u015e\n\27\f\27\16\27"+
		"\u0161\13\27\3\27\5\27\u0164\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\5\30\u0170\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\2\3\26$\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\t"+
		"\4\2\3\3\17\17\3\2$)\3\2+,\3\2-/\4\2,,\60\62\3\2\65\66\3\2\678\u019f\2"+
		"F\3\2\2\2\4H\3\2\2\2\6Q\3\2\2\2\b\u00a3\3\2\2\2\n\u00b0\3\2\2\2\f\u00b2"+
		"\3\2\2\2\16\u00be\3\2\2\2\20\u00c6\3\2\2\2\22\u00ce\3\2\2\2\24\u00dc\3"+
		"\2\2\2\26\u00f0\3\2\2\2\30\u0116\3\2\2\2\32\u0121\3\2\2\2\34\u0128\3\2"+
		"\2\2\36\u0133\3\2\2\2 \u0137\3\2\2\2\"\u0142\3\2\2\2$\u0144\3\2\2\2&\u0147"+
		"\3\2\2\2(\u0153\3\2\2\2*\u0155\3\2\2\2,\u0159\3\2\2\2.\u016f\3\2\2\2\60"+
		"\u0171\3\2\2\2\62\u0173\3\2\2\2\64\u0175\3\2\2\2\66\u0177\3\2\2\28\u0179"+
		"\3\2\2\2:\u017b\3\2\2\2<\u017d\3\2\2\2>\u017f\3\2\2\2@\u0181\3\2\2\2B"+
		"\u0183\3\2\2\2D\u0185\3\2\2\2FG\5\4\3\2G\3\3\2\2\2HI\5\6\4\2IJ\7\2\2\3"+
		"J\5\3\2\2\2KM\5\b\5\2LN\7\3\2\2ML\3\2\2\2MN\3\2\2\2NP\3\2\2\2OK\3\2\2"+
		"\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RU\3\2\2\2SQ\3\2\2\2TV\5\n\6\2UT\3\2\2"+
		"\2UV\3\2\2\2V\7\3\2\2\2WX\5\16\b\2XY\7\4\2\2YZ\5\22\n\2Z\u00a4\3\2\2\2"+
		"[\u00a4\5\34\17\2\\]\7\5\2\2]^\5\6\4\2^_\7\6\2\2_\u00a4\3\2\2\2`a\7\7"+
		"\2\2ab\5\26\f\2bc\7\5\2\2cd\5\6\4\2de\7\6\2\2e\u00a4\3\2\2\2fg\7\b\2\2"+
		"gh\5\6\4\2hi\7\t\2\2ij\5\26\f\2j\u00a4\3\2\2\2kl\7\n\2\2lm\5\26\f\2mn"+
		"\7\13\2\2nv\5\6\4\2op\7\f\2\2pq\5\26\f\2qr\7\13\2\2rs\5\6\4\2su\3\2\2"+
		"\2to\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w{\3\2\2\2xv\3\2\2\2yz\7\r\2"+
		"\2z|\5\6\4\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7\6\2\2~\u00a4\3\2\2\2\177"+
		"\u0080\7\16\2\2\u0080\u0081\7\64\2\2\u0081\u0082\7\4\2\2\u0082\u0083\5"+
		"\26\f\2\u0083\u0084\7\17\2\2\u0084\u0087\5\26\f\2\u0085\u0086\7\17\2\2"+
		"\u0086\u0088\5\26\f\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008a\7\5\2\2\u008a\u008b\5\6\4\2\u008b\u008c\7\6\2\2\u008c"+
		"\u00a4\3\2\2\2\u008d\u008e\7\16\2\2\u008e\u008f\5\20\t\2\u008f\u0090\7"+
		"\20\2\2\u0090\u0091\5\22\n\2\u0091\u0092\7\5\2\2\u0092\u0093\5\6\4\2\u0093"+
		"\u0094\7\6\2\2\u0094\u00a4\3\2\2\2\u0095\u0096\7\21\2\2\u0096\u0097\5"+
		"\f\7\2\u0097\u0098\5&\24\2\u0098\u00a4\3\2\2\2\u0099\u009a\7\22\2\2\u009a"+
		"\u009b\7\23\2\2\u009b\u009c\7\64\2\2\u009c\u00a4\5&\24\2\u009d\u009e\7"+
		"\22\2\2\u009e\u00a1\5\20\t\2\u009f\u00a0\7\4\2\2\u00a0\u00a2\5\22\n\2"+
		"\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3W\3"+
		"\2\2\2\u00a3[\3\2\2\2\u00a3\\\3\2\2\2\u00a3`\3\2\2\2\u00a3f\3\2\2\2\u00a3"+
		"k\3\2\2\2\u00a3\177\3\2\2\2\u00a3\u008d\3\2\2\2\u00a3\u0095\3\2\2\2\u00a3"+
		"\u0099\3\2\2\2\u00a3\u009d\3\2\2\2\u00a4\t\3\2\2\2\u00a5\u00a7\7\24\2"+
		"\2\u00a6\u00a8\5\22\n\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00aa\3\2\2\2\u00a9\u00ab\7\3\2\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00b1\3\2\2\2\u00ac\u00ae\7\25\2\2\u00ad\u00af\7\3\2\2\u00ae"+
		"\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00a5\3\2"+
		"\2\2\u00b0\u00ac\3\2\2\2\u00b1\13\3\2\2\2\u00b2\u00b7\7\64\2\2\u00b3\u00b4"+
		"\7\26\2\2\u00b4\u00b6\7\64\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b9\3\2\2\2"+
		"\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bc\3\2\2\2\u00b9\u00b7"+
		"\3\2\2\2\u00ba\u00bb\7\27\2\2\u00bb\u00bd\7\64\2\2\u00bc\u00ba\3\2\2\2"+
		"\u00bc\u00bd\3\2\2\2\u00bd\r\3\2\2\2\u00be\u00c3\5\24\13\2\u00bf\u00c0"+
		"\7\17\2\2\u00c0\u00c2\5\24\13\2\u00c1\u00bf\3\2\2\2\u00c2\u00c5\3\2\2"+
		"\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\17\3\2\2\2\u00c5\u00c3"+
		"\3\2\2\2\u00c6\u00cb\7\64\2\2\u00c7\u00c8\7\17\2\2\u00c8\u00ca\7\64\2"+
		"\2\u00c9\u00c7\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cc\21\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d3\5\26\f\2\u00cf"+
		"\u00d0\7\17\2\2\u00d0\u00d2\5\26\f\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\3"+
		"\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\23\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d6\u00dd\7\64\2\2\u00d7\u00d8\7\30\2\2\u00d8\u00d9\5"+
		"\26\f\2\u00d9\u00da\7\31\2\2\u00da\u00db\5\30\r\2\u00db\u00dd\3\2\2\2"+
		"\u00dc\u00d6\3\2\2\2\u00dc\u00d7\3\2\2\2\u00dd\u00e1\3\2\2\2\u00de\u00e0"+
		"\5\30\r\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2"+
		"\u00e1\u00e2\3\2\2\2\u00e2\25\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5"+
		"\b\f\1\2\u00e5\u00e6\5> \2\u00e6\u00e7\5\26\f\t\u00e7\u00f1\3\2\2\2\u00e8"+
		"\u00f1\7\32\2\2\u00e9\u00f1\7\33\2\2\u00ea\u00f1\7\34\2\2\u00eb\u00f1"+
		"\5B\"\2\u00ec\u00f1\5D#\2\u00ed\u00f1\7\35\2\2\u00ee\u00f1\5$\23\2\u00ef"+
		"\u00f1\5\32\16\2\u00f0\u00e4\3\2\2\2\u00f0\u00e8\3\2\2\2\u00f0\u00e9\3"+
		"\2\2\2\u00f0\u00ea\3\2\2\2\u00f0\u00eb\3\2\2\2\u00f0\u00ec\3\2\2\2\u00f0"+
		"\u00ed\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\u0110\3\2"+
		"\2\2\u00f2\u00f3\f\n\2\2\u00f3\u00f4\5@!\2\u00f4\u00f5\5\26\f\n\u00f5"+
		"\u010f\3\2\2\2\u00f6\u00f7\f\b\2\2\u00f7\u00f8\5<\37\2\u00f8\u00f9\5\26"+
		"\f\t\u00f9\u010f\3\2\2\2\u00fa\u00fb\f\7\2\2\u00fb\u00fc\5:\36\2\u00fc"+
		"\u00fd\5\26\f\b\u00fd\u010f\3\2\2\2\u00fe\u00ff\f\6\2\2\u00ff\u0100\5"+
		"8\35\2\u0100\u0101\5\26\f\6\u0101\u010f\3\2\2\2\u0102\u0103\f\5\2\2\u0103"+
		"\u0104\5\66\34\2\u0104\u0105\5\26\f\6\u0105\u010f\3\2\2\2\u0106\u0107"+
		"\f\4\2\2\u0107\u0108\5\64\33\2\u0108\u0109\5\26\f\5\u0109\u010f\3\2\2"+
		"\2\u010a\u010b\f\3\2\2\u010b\u010c\5\62\32\2\u010c\u010d\5\26\f\4\u010d"+
		"\u010f\3\2\2\2\u010e\u00f2\3\2\2\2\u010e\u00f6\3\2\2\2\u010e\u00fa\3\2"+
		"\2\2\u010e\u00fe\3\2\2\2\u010e\u0102\3\2\2\2\u010e\u0106\3\2\2\2\u010e"+
		"\u010a\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\27\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0115\5 \21\2\u0114\u0113"+
		"\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u011f\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\7\36\2\2\u011a\u011b\5"+
		"\26\f\2\u011b\u011c\7\37\2\2\u011c\u0120\3\2\2\2\u011d\u011e\7\26\2\2"+
		"\u011e\u0120\7\64\2\2\u011f\u0119\3\2\2\2\u011f\u011d\3\2\2\2\u0120\31"+
		"\3\2\2\2\u0121\u0125\5\36\20\2\u0122\u0124\5 \21\2\u0123\u0122\3\2\2\2"+
		"\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\33"+
		"\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012a\5\36\20\2\u0129\u012b\5 \21\2"+
		"\u012a\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d"+
		"\3\2\2\2\u012d\35\3\2\2\2\u012e\u0134\5\24\13\2\u012f\u0130\7\30\2\2\u0130"+
		"\u0131\5\26\f\2\u0131\u0132\7\31\2\2\u0132\u0134\3\2\2\2\u0133\u012e\3"+
		"\2\2\2\u0133\u012f\3\2\2\2\u0134\37\3\2\2\2\u0135\u0136\7\27\2\2\u0136"+
		"\u0138\7\64\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3"+
		"\2\2\2\u0139\u013a\5\"\22\2\u013a!\3\2\2\2\u013b\u013d\7\30\2\2\u013c"+
		"\u013e\5\22\n\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3"+
		"\2\2\2\u013f\u0143\7\31\2\2\u0140\u0143\5*\26\2\u0141\u0143\5D#\2\u0142"+
		"\u013b\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0141\3\2\2\2\u0143#\3\2\2\2"+
		"\u0144\u0145\7\23\2\2\u0145\u0146\5&\24\2\u0146%\3\2\2\2\u0147\u0148\7"+
		"\30\2\2\u0148\u0149\5(\25\2\u0149\u014a\7\31\2\2\u014a\u014b\5\6\4\2\u014b"+
		"\u014c\7\6\2\2\u014c\'\3\2\2\2\u014d\u0150\5\20\t\2\u014e\u014f\7\17\2"+
		"\2\u014f\u0151\7\35\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"\u0154\3\2\2\2\u0152\u0154\7\35\2\2\u0153\u014d\3\2\2\2\u0153\u0152\3"+
		"\2\2\2\u0154)\3\2\2\2\u0155\u0156\7 \2\2\u0156\u0157\5,\27\2\u0157\u0158"+
		"\7!\2\2\u0158+\3\2\2\2\u0159\u015f\5.\30\2\u015a\u015b\5\60\31\2\u015b"+
		"\u015c\5.\30\2\u015c\u015e\3\2\2\2\u015d\u015a\3\2\2\2\u015e\u0161\3\2"+
		"\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0163\3\2\2\2\u0161"+
		"\u015f\3\2\2\2\u0162\u0164\5\60\31\2\u0163\u0162\3\2\2\2\u0163\u0164\3"+
		"\2\2\2\u0164-\3\2\2\2\u0165\u0166\7\36\2\2\u0166\u0167\5\26\f\2\u0167"+
		"\u0168\7\37\2\2\u0168\u0169\7\4\2\2\u0169\u016a\5\26\f\2\u016a\u0170\3"+
		"\2\2\2\u016b\u016c\7\64\2\2\u016c\u016d\7\4\2\2\u016d\u0170\5\26\f\2\u016e"+
		"\u0170\5\26\f\2\u016f\u0165\3\2\2\2\u016f\u016b\3\2\2\2\u016f\u016e\3"+
		"\2\2\2\u0170/\3\2\2\2\u0171\u0172\t\2\2\2\u0172\61\3\2\2\2\u0173\u0174"+
		"\7\"\2\2\u0174\63\3\2\2\2\u0175\u0176\7#\2\2\u0176\65\3\2\2\2\u0177\u0178"+
		"\t\3\2\2\u0178\67\3\2\2\2\u0179\u017a\7*\2\2\u017a9\3\2\2\2\u017b\u017c"+
		"\t\4\2\2\u017c;\3\2\2\2\u017d\u017e\t\5\2\2\u017e=\3\2\2\2\u017f\u0180"+
		"\t\6\2\2\u0180?\3\2\2\2\u0181\u0182\7\63\2\2\u0182A\3\2\2\2\u0183\u0184"+
		"\t\7\2\2\u0184C\3\2\2\2\u0185\u0186\t\b\2\2\u0186E\3\2\2\2%MQUv{\u0087"+
		"\u00a1\u00a3\u00a7\u00aa\u00ae\u00b0\u00b7\u00bc\u00c3\u00cb\u00d3\u00dc"+
		"\u00e1\u00f0\u010e\u0110\u0116\u011f\u0125\u012c\u0133\u0137\u013d\u0142"+
		"\u0150\u0153\u015f\u0163\u016f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}