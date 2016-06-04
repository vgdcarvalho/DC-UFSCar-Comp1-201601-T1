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
		T__45=46, T__46=47, T__47=48, T__48=49, NOME=50, CADEIA_NORMAL=51, CADEIA_CHAR=52, 
		INTEGER=53, FLOAT=54, COMENTARIO=55, WS=56, IGNORADOS=57;
	public static final int
		RULE_programa = 0, RULE_comando = 1, RULE_retbreak = 2, RULE_trecho = 3, 
		RULE_bloco = 4, RULE_nomedafuncao = 5, RULE_listadenomes = 6, RULE_exp = 7, 
		RULE_listaexp = 8, RULE_listavar = 9, RULE_expprefixo = 10, RULE_complementovar = 11, 
		RULE_var = 12, RULE_chamadadefuncao = 13, RULE_argumentos = 14, RULE_funcao = 15, 
		RULE_corpodafuncao = 16, RULE_listadeparametros = 17, RULE_construtordetabelas = 18, 
		RULE_listadecampos = 19, RULE_campo = 20, RULE_separadordecampos = 21, 
		RULE_opLogicoOu = 22, RULE_opLogicoE = 23, RULE_opComparacao = 24, RULE_opConcat = 25, 
		RULE_opSomaSub = 26, RULE_opMulDivMod = 27, RULE_opUnario = 28, RULE_opPotencia = 29, 
		RULE_numero = 30, RULE_cadeia = 31;
	public static final String[] ruleNames = {
		"programa", "comando", "retbreak", "trecho", "bloco", "nomedafuncao", 
		"listadenomes", "exp", "listaexp", "listavar", "expprefixo", "complementovar", 
		"var", "chamadadefuncao", "argumentos", "funcao", "corpodafuncao", "listadeparametros", 
		"construtordetabelas", "listadecampos", "campo", "separadordecampos", 
		"opLogicoOu", "opLogicoE", "opComparacao", "opConcat", "opSomaSub", "opMulDivMod", 
		"opUnario", "opPotencia", "numero", "cadeia"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='", "'do'", "'end'", "'while'", "'repeat'", "'until'", 
		"'if'", "'then'", "'elseif'", "'else'", "'for'", "','", "'in'", "'funcion'", 
		"'local'", "'function'", "'return'", "'break'", "'.'", "':'", "'nil'", 
		"'false'", "'true'", "'...'", "'('", "')'", "'['", "']'", "'{'", "'}'", 
		"'or'", "'and'", "'<'", "'>'", "'<='", "'>='", "'~='", "'=='", "'..'", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'not'", "'#'", "'~'", "'^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "NOME", "CADEIA_NORMAL", "CADEIA_CHAR", "INTEGER", "FLOAT", 
		"COMENTARIO", "WS", "IGNORADOS"
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
			setState(64);
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
		enterRule(_localctx, 2, RULE_comando);
		int _la;
		try {
			setState(146);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				listavar();
				setState(68);
				match(T__1);
				setState(69);
				listaexp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				chamadadefuncao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				match(T__2);
				setState(73);
				bloco();
				setState(74);
				match(T__3);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				match(T__4);
				setState(77);
				exp(0);
				setState(78);
				match(T__2);
				setState(79);
				bloco();
				setState(80);
				match(T__3);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(82);
				match(T__5);
				setState(83);
				bloco();
				setState(84);
				match(T__6);
				setState(85);
				exp(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(87);
				match(T__7);
				setState(88);
				exp(0);
				setState(89);
				match(T__8);
				setState(90);
				bloco();
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(91);
					match(T__9);
					setState(92);
					exp(0);
					setState(93);
					match(T__8);
					setState(94);
					bloco();
					}
					}
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(103);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(101);
					match(T__10);
					setState(102);
					bloco();
					}
				}

				setState(105);
				match(T__3);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(107);
				match(T__11);
				setState(108);
				((ComandoContext)_localctx).NOME = match(NOME);
				 TabelaDeSimbolos.adicionarSimbolo((((ComandoContext)_localctx).NOME!=null?((ComandoContext)_localctx).NOME.getText():null),Tipo.VARIAVEL); 
				setState(110);
				match(T__1);
				setState(111);
				exp(0);
				setState(112);
				match(T__12);
				setState(113);
				exp(0);
				setState(116);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(114);
					match(T__12);
					setState(115);
					exp(0);
					}
				}

				setState(118);
				match(T__2);
				setState(119);
				bloco();
				setState(120);
				match(T__3);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(122);
				match(T__11);
				setState(123);
				listadenomes();
				setState(124);
				match(T__13);
				setState(125);
				listaexp();
				setState(126);
				match(T__2);
				setState(127);
				bloco();
				setState(128);
				match(T__3);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(130);
				match(T__14);
				setState(131);
				((ComandoContext)_localctx).nomedafuncao = nomedafuncao();
				 TabelaDeSimbolos.adicionarSimbolo((((ComandoContext)_localctx).nomedafuncao!=null?_input.getText(((ComandoContext)_localctx).nomedafuncao.start,((ComandoContext)_localctx).nomedafuncao.stop):null),Tipo.FUNCAO); 
				setState(133);
				corpodafuncao();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(135);
				match(T__15);
				{
				setState(136);
				match(T__16);
				setState(137);
				((ComandoContext)_localctx).NOME = match(NOME);
				 TabelaDeSimbolos.adicionarSimbolo((((ComandoContext)_localctx).NOME!=null?((ComandoContext)_localctx).NOME.getText():null),Tipo.FUNCAO); 
				setState(139);
				corpodafuncao();
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(140);
				match(T__15);
				setState(141);
				listadenomes();
				setState(144);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(142);
					match(T__1);
					setState(143);
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
		enterRule(_localctx, 4, RULE_retbreak);
		int _la;
		try {
			setState(159);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(T__17);
				setState(150);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__41) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << NOME) | (1L << CADEIA_NORMAL) | (1L << CADEIA_CHAR) | (1L << INTEGER) | (1L << FLOAT))) != 0)) {
					{
					setState(149);
					listaexp();
					}
				}

				setState(153);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(152);
					match(T__0);
					}
				}

				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(T__18);
				setState(157);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(156);
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
		enterRule(_localctx, 6, RULE_trecho);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << NOME))) != 0)) {
				{
				{
				setState(161);
				comando();
				setState(163);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(162);
					match(T__0);
					}
					break;
				}
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			_la = _input.LA(1);
			if (_la==T__17 || _la==T__18) {
				{
				setState(170);
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
		enterRule(_localctx, 8, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
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
		enterRule(_localctx, 10, RULE_nomedafuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(NOME);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(176);
				match(T__19);
				setState(177);
				match(NOME);
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(183);
				match(T__20);
				setState(184);
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
		enterRule(_localctx, 12, RULE_listadenomes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			((ListadenomesContext)_localctx).NOME = match(NOME);
			 TabelaDeSimbolos.adicionarSimbolo((((ListadenomesContext)_localctx).NOME!=null?((ListadenomesContext)_localctx).NOME.getText():null),Tipo.VARIAVEL); 
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(189);
					match(T__12);
					setState(190);
					((ListadenomesContext)_localctx).NOME = match(NOME);
					 TabelaDeSimbolos.adicionarSimbolo((((ListadenomesContext)_localctx).NOME!=null?((ListadenomesContext)_localctx).NOME.getText():null),Tipo.VARIAVEL); 
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		public ExpprefixoContext expprefixo() {
			return getRuleContext(ExpprefixoContext.class,0);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			switch (_input.LA(1)) {
			case T__41:
			case T__45:
			case T__46:
			case T__47:
				{
				setState(198);
				opUnario();
				setState(199);
				exp(7);
				}
				break;
			case T__21:
				{
				setState(201);
				match(T__21);
				}
				break;
			case T__22:
				{
				setState(202);
				match(T__22);
				}
				break;
			case T__23:
				{
				setState(203);
				match(T__23);
				}
				break;
			case INTEGER:
			case FLOAT:
				{
				setState(204);
				numero();
				}
				break;
			case CADEIA_NORMAL:
			case CADEIA_CHAR:
				{
				setState(205);
				cadeia();
				}
				break;
			case T__24:
				{
				setState(206);
				match(T__24);
				}
				break;
			case T__16:
				{
				setState(207);
				funcao();
				}
				break;
			case T__25:
			case NOME:
				{
				setState(208);
				expprefixo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(239);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(211);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(212);
						opPotencia();
						setState(213);
						exp(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(215);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(216);
						opMulDivMod();
						setState(217);
						exp(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(219);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(220);
						opSomaSub();
						setState(221);
						exp(6);
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(223);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(224);
						opConcat();
						setState(225);
						exp(4);
						}
						break;
					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(227);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(228);
						opComparacao();
						setState(229);
						exp(4);
						}
						break;
					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(231);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(232);
						opLogicoE();
						setState(233);
						exp(3);
						}
						break;
					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(235);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(236);
						opLogicoOu();
						setState(237);
						exp(2);
						}
						break;
					}
					} 
				}
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		enterRule(_localctx, 16, RULE_listaexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			exp(0);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(245);
				match(T__12);
				setState(246);
				exp(0);
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
		enterRule(_localctx, 18, RULE_listavar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			((ListavarContext)_localctx).var = var();
			 TabelaDeSimbolos.adicionarSimbolo((((ListavarContext)_localctx).var!=null?_input.getText(((ListavarContext)_localctx).var.start,((ListavarContext)_localctx).var.stop):null),Tipo.VARIAVEL); 
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(254);
				match(T__12);
				setState(255);
				((ListavarContext)_localctx).var = var();
				 TabelaDeSimbolos.adicionarSimbolo((((ListavarContext)_localctx).var!=null?_input.getText(((ListavarContext)_localctx).var.start,((ListavarContext)_localctx).var.stop):null),Tipo.VARIAVEL); 
				}
				}
				setState(262);
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
		enterRule(_localctx, 20, RULE_expprefixo);
		try {
			setState(269);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				chamadadefuncao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				match(T__25);
				setState(266);
				exp(0);
				setState(267);
				match(T__26);
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
		enterRule(_localctx, 22, RULE_complementovar);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(NOME);
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(278);
					switch (_input.LA(1)) {
					case T__27:
						{
						setState(272);
						match(T__27);
						setState(273);
						exp(0);
						setState(274);
						match(T__28);
						}
						break;
					case T__19:
						{
						setState(276);
						match(T__19);
						setState(277);
						match(NOME);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		enterRule(_localctx, 24, RULE_var);
		try {
			setState(294);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				((VarContext)_localctx).NOME = match(NOME);
				 TabelaDeSimbolos.adicionarSimbolo((((VarContext)_localctx).NOME!=null?((VarContext)_localctx).NOME.getText():null),Tipo.VARIAVEL); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				complementovar();
				setState(286);
				match(T__27);
				setState(287);
				exp(0);
				setState(288);
				match(T__28);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
				complementovar();
				setState(291);
				match(T__19);
				setState(292);
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
		enterRule(_localctx, 26, RULE_chamadadefuncao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			((ChamadadefuncaoContext)_localctx).complementovar = complementovar();
			setState(301);
			switch (_input.LA(1)) {
			case T__25:
			case T__29:
			case CADEIA_NORMAL:
			case CADEIA_CHAR:
				{
				setState(297);
				argumentos();
				}
				break;
			case T__20:
				{
				{
				setState(298);
				match(T__20);
				setState(299);
				match(NOME);
				setState(300);
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
		enterRule(_localctx, 28, RULE_argumentos);
		int _la;
		try {
			setState(312);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(T__25);
				setState(307);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__41) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << NOME) | (1L << CADEIA_NORMAL) | (1L << CADEIA_CHAR) | (1L << INTEGER) | (1L << FLOAT))) != 0)) {
					{
					setState(306);
					listaexp();
					}
				}

				setState(309);
				match(T__26);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				construtordetabelas();
				}
				break;
			case CADEIA_NORMAL:
			case CADEIA_CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
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
		enterRule(_localctx, 30, RULE_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(T__16);
			setState(315);
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
		enterRule(_localctx, 32, RULE_corpodafuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(T__25);
			setState(319);
			_la = _input.LA(1);
			if (_la==T__24 || _la==NOME) {
				{
				setState(318);
				listadeparametros();
				}
			}

			setState(321);
			match(T__26);
			setState(322);
			bloco();
			setState(323);
			match(T__3);
			setState(325);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(324);
				match(T__0);
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
		enterRule(_localctx, 34, RULE_listadeparametros);
		int _la;
		try {
			setState(333);
			switch (_input.LA(1)) {
			case NOME:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				listadenomes();
				setState(330);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(328);
					match(T__12);
					setState(329);
					match(T__24);
					}
				}

				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				match(T__24);
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
		enterRule(_localctx, 36, RULE_construtordetabelas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(T__29);
			setState(336);
			listadecampos();
			setState(337);
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
		enterRule(_localctx, 38, RULE_listadecampos);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			campo();
			setState(345);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(340);
					separadordecampos();
					setState(341);
					campo();
					}
					} 
				}
				setState(347);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(349);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__12) {
				{
				setState(348);
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
		enterRule(_localctx, 40, RULE_campo);
		try {
			setState(361);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				match(T__27);
				setState(352);
				exp(0);
				setState(353);
				match(T__28);
				setState(354);
				match(T__1);
				setState(355);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				match(NOME);
				setState(358);
				match(T__1);
				setState(359);
				exp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
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
		enterRule(_localctx, 42, RULE_separadordecampos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
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
		enterRule(_localctx, 44, RULE_opLogicoOu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
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
		enterRule(_localctx, 46, RULE_opLogicoE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
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
		enterRule(_localctx, 48, RULE_opComparacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
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
		enterRule(_localctx, 50, RULE_opConcat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
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
		enterRule(_localctx, 52, RULE_opSomaSub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
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
		enterRule(_localctx, 54, RULE_opMulDivMod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
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
		enterRule(_localctx, 56, RULE_opUnario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
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
		enterRule(_localctx, 58, RULE_opPotencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
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
		enterRule(_localctx, 60, RULE_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
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
		enterRule(_localctx, 62, RULE_cadeia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
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
		case 7:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3;\u0184\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3c\n"+
		"\3\f\3\16\3f\13\3\3\3\3\3\5\3j\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3w\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0093\n\3\5\3"+
		"\u0095\n\3\3\4\3\4\5\4\u0099\n\4\3\4\5\4\u009c\n\4\3\4\3\4\5\4\u00a0\n"+
		"\4\5\4\u00a2\n\4\3\5\3\5\5\5\u00a6\n\5\7\5\u00a8\n\5\f\5\16\5\u00ab\13"+
		"\5\3\5\5\5\u00ae\n\5\3\6\3\6\3\7\3\7\3\7\7\7\u00b5\n\7\f\7\16\7\u00b8"+
		"\13\7\3\7\3\7\5\7\u00bc\n\7\3\b\3\b\3\b\3\b\3\b\7\b\u00c3\n\b\f\b\16\b"+
		"\u00c6\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00d4"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00f2\n\t\f\t\16\t"+
		"\u00f5\13\t\3\n\3\n\3\n\7\n\u00fa\n\n\f\n\16\n\u00fd\13\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\7\13\u0105\n\13\f\13\16\13\u0108\13\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u0110\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0119\n\r\f"+
		"\r\16\r\u011c\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u0129\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u0130\n\17\3\17\3\17"+
		"\3\20\3\20\5\20\u0136\n\20\3\20\3\20\3\20\5\20\u013b\n\20\3\21\3\21\3"+
		"\21\3\22\3\22\5\22\u0142\n\22\3\22\3\22\3\22\3\22\5\22\u0148\n\22\3\23"+
		"\3\23\3\23\5\23\u014d\n\23\3\23\5\23\u0150\n\23\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\7\25\u015a\n\25\f\25\16\25\u015d\13\25\3\25\5\25\u0160"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u016c\n\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\2\3\20\"\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\t\4\2\3\3\17\17\3\2$)\3\2+,\3"+
		"\2-/\4\2,,\60\62\3\2\678\3\2\65\66\u019f\2B\3\2\2\2\4\u0094\3\2\2\2\6"+
		"\u00a1\3\2\2\2\b\u00a9\3\2\2\2\n\u00af\3\2\2\2\f\u00b1\3\2\2\2\16\u00bd"+
		"\3\2\2\2\20\u00d3\3\2\2\2\22\u00f6\3\2\2\2\24\u00fe\3\2\2\2\26\u010f\3"+
		"\2\2\2\30\u0111\3\2\2\2\32\u0128\3\2\2\2\34\u012a\3\2\2\2\36\u013a\3\2"+
		"\2\2 \u013c\3\2\2\2\"\u013f\3\2\2\2$\u014f\3\2\2\2&\u0151\3\2\2\2(\u0155"+
		"\3\2\2\2*\u016b\3\2\2\2,\u016d\3\2\2\2.\u016f\3\2\2\2\60\u0171\3\2\2\2"+
		"\62\u0173\3\2\2\2\64\u0175\3\2\2\2\66\u0177\3\2\2\28\u0179\3\2\2\2:\u017b"+
		"\3\2\2\2<\u017d\3\2\2\2>\u017f\3\2\2\2@\u0181\3\2\2\2BC\5\b\5\2C\3\3\2"+
		"\2\2D\u0095\7\3\2\2EF\5\24\13\2FG\7\4\2\2GH\5\22\n\2H\u0095\3\2\2\2I\u0095"+
		"\5\34\17\2JK\7\5\2\2KL\5\n\6\2LM\7\6\2\2M\u0095\3\2\2\2NO\7\7\2\2OP\5"+
		"\20\t\2PQ\7\5\2\2QR\5\n\6\2RS\7\6\2\2S\u0095\3\2\2\2TU\7\b\2\2UV\5\n\6"+
		"\2VW\7\t\2\2WX\5\20\t\2X\u0095\3\2\2\2YZ\7\n\2\2Z[\5\20\t\2[\\\7\13\2"+
		"\2\\d\5\n\6\2]^\7\f\2\2^_\5\20\t\2_`\7\13\2\2`a\5\n\6\2ac\3\2\2\2b]\3"+
		"\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2ei\3\2\2\2fd\3\2\2\2gh\7\r\2\2hj\5"+
		"\n\6\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\6\2\2l\u0095\3\2\2\2mn\7\16\2"+
		"\2no\7\64\2\2op\b\3\1\2pq\7\4\2\2qr\5\20\t\2rs\7\17\2\2sv\5\20\t\2tu\7"+
		"\17\2\2uw\5\20\t\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\7\5\2\2yz\5\n\6\2z"+
		"{\7\6\2\2{\u0095\3\2\2\2|}\7\16\2\2}~\5\16\b\2~\177\7\20\2\2\177\u0080"+
		"\5\22\n\2\u0080\u0081\7\5\2\2\u0081\u0082\5\n\6\2\u0082\u0083\7\6\2\2"+
		"\u0083\u0095\3\2\2\2\u0084\u0085\7\21\2\2\u0085\u0086\5\f\7\2\u0086\u0087"+
		"\b\3\1\2\u0087\u0088\5\"\22\2\u0088\u0095\3\2\2\2\u0089\u008a\7\22\2\2"+
		"\u008a\u008b\7\23\2\2\u008b\u008c\7\64\2\2\u008c\u008d\b\3\1\2\u008d\u0095"+
		"\5\"\22\2\u008e\u008f\7\22\2\2\u008f\u0092\5\16\b\2\u0090\u0091\7\4\2"+
		"\2\u0091\u0093\5\22\n\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0095\3\2\2\2\u0094D\3\2\2\2\u0094E\3\2\2\2\u0094I\3\2\2\2\u0094J\3\2"+
		"\2\2\u0094N\3\2\2\2\u0094T\3\2\2\2\u0094Y\3\2\2\2\u0094m\3\2\2\2\u0094"+
		"|\3\2\2\2\u0094\u0084\3\2\2\2\u0094\u0089\3\2\2\2\u0094\u008e\3\2\2\2"+
		"\u0095\5\3\2\2\2\u0096\u0098\7\24\2\2\u0097\u0099\5\22\n\2\u0098\u0097"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u009c\7\3\2\2\u009b"+
		"\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00a2\3\2\2\2\u009d\u009f\7\25"+
		"\2\2\u009e\u00a0\7\3\2\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a2\3\2\2\2\u00a1\u0096\3\2\2\2\u00a1\u009d\3\2\2\2\u00a2\7\3\2\2\2"+
		"\u00a3\u00a5\5\4\3\2\u00a4\u00a6\7\3\2\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ac\u00ae\5\6\4\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\t\3\2\2\2\u00af\u00b0\5\b\5\2\u00b0\13\3\2\2\2\u00b1\u00b6\7\64\2\2\u00b2"+
		"\u00b3\7\26\2\2\u00b3\u00b5\7\64\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b8\3"+
		"\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00bb\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b9\u00ba\7\27\2\2\u00ba\u00bc\7\64\2\2\u00bb\u00b9\3"+
		"\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\r\3\2\2\2\u00bd\u00be\7\64\2\2\u00be"+
		"\u00c4\b\b\1\2\u00bf\u00c0\7\17\2\2\u00c0\u00c1\7\64\2\2\u00c1\u00c3\b"+
		"\b\1\2\u00c2\u00bf\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\17\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\b\t\1"+
		"\2\u00c8\u00c9\5:\36\2\u00c9\u00ca\5\20\t\t\u00ca\u00d4\3\2\2\2\u00cb"+
		"\u00d4\7\30\2\2\u00cc\u00d4\7\31\2\2\u00cd\u00d4\7\32\2\2\u00ce\u00d4"+
		"\5> \2\u00cf\u00d4\5@!\2\u00d0\u00d4\7\33\2\2\u00d1\u00d4\5 \21\2\u00d2"+
		"\u00d4\5\26\f\2\u00d3\u00c7\3\2\2\2\u00d3\u00cb\3\2\2\2\u00d3\u00cc\3"+
		"\2\2\2\u00d3\u00cd\3\2\2\2\u00d3\u00ce\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d3"+
		"\u00d0\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00f3\3\2"+
		"\2\2\u00d5\u00d6\f\n\2\2\u00d6\u00d7\5<\37\2\u00d7\u00d8\5\20\t\n\u00d8"+
		"\u00f2\3\2\2\2\u00d9\u00da\f\b\2\2\u00da\u00db\58\35\2\u00db\u00dc\5\20"+
		"\t\t\u00dc\u00f2\3\2\2\2\u00dd\u00de\f\7\2\2\u00de\u00df\5\66\34\2\u00df"+
		"\u00e0\5\20\t\b\u00e0\u00f2\3\2\2\2\u00e1\u00e2\f\6\2\2\u00e2\u00e3\5"+
		"\64\33\2\u00e3\u00e4\5\20\t\6\u00e4\u00f2\3\2\2\2\u00e5\u00e6\f\5\2\2"+
		"\u00e6\u00e7\5\62\32\2\u00e7\u00e8\5\20\t\6\u00e8\u00f2\3\2\2\2\u00e9"+
		"\u00ea\f\4\2\2\u00ea\u00eb\5\60\31\2\u00eb\u00ec\5\20\t\5\u00ec\u00f2"+
		"\3\2\2\2\u00ed\u00ee\f\3\2\2\u00ee\u00ef\5.\30\2\u00ef\u00f0\5\20\t\4"+
		"\u00f0\u00f2\3\2\2\2\u00f1\u00d5\3\2\2\2\u00f1\u00d9\3\2\2\2\u00f1\u00dd"+
		"\3\2\2\2\u00f1\u00e1\3\2\2\2\u00f1\u00e5\3\2\2\2\u00f1\u00e9\3\2\2\2\u00f1"+
		"\u00ed\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\21\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00fb\5\20\t\2\u00f7\u00f8"+
		"\7\17\2\2\u00f8\u00fa\5\20\t\2\u00f9\u00f7\3\2\2\2\u00fa\u00fd\3\2\2\2"+
		"\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\23\3\2\2\2\u00fd\u00fb"+
		"\3\2\2\2\u00fe\u00ff\5\32\16\2\u00ff\u0106\b\13\1\2\u0100\u0101\7\17\2"+
		"\2\u0101\u0102\5\32\16\2\u0102\u0103\b\13\1\2\u0103\u0105\3\2\2\2\u0104"+
		"\u0100\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107\25\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u0110\5\32\16\2\u010a"+
		"\u0110\5\34\17\2\u010b\u010c\7\34\2\2\u010c\u010d\5\20\t\2\u010d\u010e"+
		"\7\35\2\2\u010e\u0110\3\2\2\2\u010f\u0109\3\2\2\2\u010f\u010a\3\2\2\2"+
		"\u010f\u010b\3\2\2\2\u0110\27\3\2\2\2\u0111\u011a\7\64\2\2\u0112\u0113"+
		"\7\36\2\2\u0113\u0114\5\20\t\2\u0114\u0115\7\37\2\2\u0115\u0119\3\2\2"+
		"\2\u0116\u0117\7\26\2\2\u0117\u0119\7\64\2\2\u0118\u0112\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011b\31\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011e\7\64\2\2\u011e\u0129"+
		"\b\16\1\2\u011f\u0120\5\30\r\2\u0120\u0121\7\36\2\2\u0121\u0122\5\20\t"+
		"\2\u0122\u0123\7\37\2\2\u0123\u0129\3\2\2\2\u0124\u0125\5\30\r\2\u0125"+
		"\u0126\7\26\2\2\u0126\u0127\7\64\2\2\u0127\u0129\3\2\2\2\u0128\u011d\3"+
		"\2\2\2\u0128\u011f\3\2\2\2\u0128\u0124\3\2\2\2\u0129\33\3\2\2\2\u012a"+
		"\u012f\5\30\r\2\u012b\u0130\5\36\20\2\u012c\u012d\7\27\2\2\u012d\u012e"+
		"\7\64\2\2\u012e\u0130\5\36\20\2\u012f\u012b\3\2\2\2\u012f\u012c\3\2\2"+
		"\2\u0130\u0131\3\2\2\2\u0131\u0132\b\17\1\2\u0132\35\3\2\2\2\u0133\u0135"+
		"\7\34\2\2\u0134\u0136\5\22\n\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2"+
		"\u0136\u0137\3\2\2\2\u0137\u013b\7\35\2\2\u0138\u013b\5&\24\2\u0139\u013b"+
		"\5@!\2\u013a\u0133\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u0139\3\2\2\2\u013b"+
		"\37\3\2\2\2\u013c\u013d\7\23\2\2\u013d\u013e\5\"\22\2\u013e!\3\2\2\2\u013f"+
		"\u0141\7\34\2\2\u0140\u0142\5$\23\2\u0141\u0140\3\2\2\2\u0141\u0142\3"+
		"\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\7\35\2\2\u0144\u0145\5\n\6\2\u0145"+
		"\u0147\7\6\2\2\u0146\u0148\7\3\2\2\u0147\u0146\3\2\2\2\u0147\u0148\3\2"+
		"\2\2\u0148#\3\2\2\2\u0149\u014c\5\16\b\2\u014a\u014b\7\17\2\2\u014b\u014d"+
		"\7\33\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u0150\3\2\2\2"+
		"\u014e\u0150\7\33\2\2\u014f\u0149\3\2\2\2\u014f\u014e\3\2\2\2\u0150%\3"+
		"\2\2\2\u0151\u0152\7 \2\2\u0152\u0153\5(\25\2\u0153\u0154\7!\2\2\u0154"+
		"\'\3\2\2\2\u0155\u015b\5*\26\2\u0156\u0157\5,\27\2\u0157\u0158\5*\26\2"+
		"\u0158\u015a\3\2\2\2\u0159\u0156\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159"+
		"\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015e"+
		"\u0160\5,\27\2\u015f\u015e\3\2\2\2\u015f\u0160\3\2\2\2\u0160)\3\2\2\2"+
		"\u0161\u0162\7\36\2\2\u0162\u0163\5\20\t\2\u0163\u0164\7\37\2\2\u0164"+
		"\u0165\7\4\2\2\u0165\u0166\5\20\t\2\u0166\u016c\3\2\2\2\u0167\u0168\7"+
		"\64\2\2\u0168\u0169\7\4\2\2\u0169\u016c\5\20\t\2\u016a\u016c\5\20\t\2"+
		"\u016b\u0161\3\2\2\2\u016b\u0167\3\2\2\2\u016b\u016a\3\2\2\2\u016c+\3"+
		"\2\2\2\u016d\u016e\t\2\2\2\u016e-\3\2\2\2\u016f\u0170\7\"\2\2\u0170/\3"+
		"\2\2\2\u0171\u0172\7#\2\2\u0172\61\3\2\2\2\u0173\u0174\t\3\2\2\u0174\63"+
		"\3\2\2\2\u0175\u0176\7*\2\2\u0176\65\3\2\2\2\u0177\u0178\t\4\2\2\u0178"+
		"\67\3\2\2\2\u0179\u017a\t\5\2\2\u017a9\3\2\2\2\u017b\u017c\t\6\2\2\u017c"+
		";\3\2\2\2\u017d\u017e\7\63\2\2\u017e=\3\2\2\2\u017f\u0180\t\7\2\2\u0180"+
		"?\3\2\2\2\u0181\u0182\t\b\2\2\u0182A\3\2\2\2$div\u0092\u0094\u0098\u009b"+
		"\u009f\u00a1\u00a5\u00a9\u00ad\u00b6\u00bb\u00c4\u00d3\u00f1\u00f3\u00fb"+
		"\u0106\u010f\u0118\u011a\u0128\u012f\u0135\u013a\u0141\u0147\u014c\u014f"+
		"\u015b\u015f\u016b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}