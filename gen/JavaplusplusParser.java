// Generated from D:/Y2 - Q3/CompilersIvo/project_files\Javaplusplus.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaplusplusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		MATH_OPERATORS=10, COMPARATORS=11, AND_OR=12, SEMICOLON=13, INT=14, BOOL=15, 
		COMMA=16, SBRACKET=17, EBRACKET=18, C_SBRACKET=19, C_EBRACKET=20, VAR_TYPE=21, 
		STRING=22, CHAR=23, WS=24;
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_variable_init = 2, RULE_variable_method_init = 3, 
		RULE_function_decl = 4, RULE_function_call = 5, RULE_function_call_method = 6, 
		RULE_loop = 7, RULE_print = 8, RULE_check = 9, RULE_ask = 10, RULE_comparable_statement = 11, 
		RULE_return_type = 12, RULE_comparables = 13, RULE_value = 14, RULE_var_name = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression", "variable_init", "variable_method_init", "function_decl", 
			"function_call", "function_call_method", "loop", "print", "check", "ask", 
			"comparable_statement", "return_type", "comparables", "value", "var_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'return'", "'loop'", "'++'", "'dump'", "'check'", "'otherwise'", 
			"'ask'", "'void'", null, null, null, "';'", null, null, "','", "'('", 
			"')'", "'<<'", "'>>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "MATH_OPERATORS", 
			"COMPARATORS", "AND_OR", "SEMICOLON", "INT", "BOOL", "COMMA", "SBRACKET", 
			"EBRACKET", "C_SBRACKET", "C_EBRACKET", "VAR_TYPE", "STRING", "CHAR", 
			"WS"
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
	public String getGrammarFileName() { return "Javaplusplus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaplusplusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JavaplusplusParser.EOF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaplusplusListener ) ((JavaplusplusListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaplusplusListener ) ((JavaplusplusListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << VAR_TYPE) | (1L << STRING))) != 0)) {
				{
				{
				setState(32);
				expression();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
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

	public static class ExpressionContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public Variable_initContext variable_init() {
			return getRuleContext(Variable_initContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public CheckContext check() {
			return getRuleContext(CheckContext.class,0);
		}
		public Function_declContext function_decl() {
			return getRuleContext(Function_declContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public AskContext ask() {
			return getRuleContext(AskContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaplusplusListener ) ((JavaplusplusListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaplusplusListener ) ((JavaplusplusListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				print();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				variable_init();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				function_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				check();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				function_decl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(45);
				loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(46);
				ask();
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

	public static class Variable_initContext extends ParserRuleContext {
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaplusplusParser.SEMICOLON, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public AskContext ask() {
			return getRuleContext(AskContext.class,0);
		}
		public TerminalNode VAR_TYPE() { return getToken(JavaplusplusParser.VAR_TYPE, 0); }
		public Variable_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaplusplusListener ) ((JavaplusplusListener)listener).enterVariable_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaplusplusListener ) ((JavaplusplusListener)listener).exitVariable_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitVariable_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_initContext variable_init() throws RecognitionException {
		Variable_initContext _localctx = new Variable_initContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable_init);
		int _la;
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR_TYPE) {
					{
					setState(49);
					match(VAR_TYPE);
					}
				}

				setState(52);
				var_name();
				setState(53);
				match(T__0);
				setState(59);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(54);
					value();
					setState(55);
					match(SEMICOLON);
					}
					break;
				case 2:
					{
					setState(57);
					function_call();
					}
					break;
				case 3:
					{
					setState(58);
					ask();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(VAR_TYPE);
				setState(62);
				var_name();
				setState(63);
				match(SEMICOLON);
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

	public static class Variable_method_initContext extends ParserRuleContext {
		public List<TerminalNode> VAR_TYPE() { return getTokens(JavaplusplusParser.VAR_TYPE); }
		public TerminalNode VAR_TYPE(int i) {
			return getToken(JavaplusplusParser.VAR_TYPE, i);
		}
		public List<Var_nameContext> var_name() {
			return getRuleContexts(Var_nameContext.class);
		}
		public Var_nameContext var_name(int i) {
			return getRuleContext(Var_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaplusplusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaplusplusParser.COMMA, i);
		}
		public Variable_method_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_method_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaplusplusListener ) ((JavaplusplusListener)listener).enterVariable_method_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaplusplusListener ) ((JavaplusplusListener)listener).exitVariable_method_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitVariable_method_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_method_initContext variable_method_init() throws RecognitionException {
		Variable_method_initContext _localctx = new Variable_method_initContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable_method_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(VAR_TYPE);
			setState(68);
			var_name();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(69);
				match(COMMA);
				setState(70);
				match(VAR_TYPE);
				setState(71);
				var_name();
				}
				}
				setState(76);
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

	public static class Function_declContext extends ParserRuleContext {
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public TerminalNode SBRACKET() { return getToken(JavaplusplusParser.SBRACKET, 0); }
		public TerminalNode EBRACKET() { return getToken(JavaplusplusParser.EBRACKET, 0); }
		public TerminalNode C_SBRACKET() { return getToken(JavaplusplusParser.C_SBRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaplusplusParser.SEMICOLON, 0); }
		public TerminalNode C_EBRACKET() { return getToken(JavaplusplusParser.C_EBRACKET, 0); }
		public List<Variable_method_initContext> variable_method_init() {
			return getRuleContexts(Variable_method_initContext.class);
		}
		public Variable_method_initContext variable_method_init(int i) {
			return getRuleContext(Variable_method_initContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Function_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaplusplusListener ) ((JavaplusplusListener)listener).enterFunction_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaplusplusListener ) ((JavaplusplusListener)listener).exitFunction_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitFunction_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declContext function_decl() throws RecognitionException {
		Function_declContext _localctx = new Function_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			return_type();
			setState(78);
			var_name();
			setState(79);
			match(SBRACKET);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR_TYPE) {
				{
				{
				setState(80);
				variable_method_init();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			match(EBRACKET);
			setState(87);
			match(C_SBRACKET);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << VAR_TYPE) | (1L << STRING))) != 0)) {
				{
				{
				setState(88);
				expression();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(94);
				match(T__1);
				setState(95);
				value();
				}
			}

			setState(98);
			match(SEMICOLON);
			setState(99);
			match(C_EBRACKET);
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

	public static class Function_callContext extends ParserRuleContext {
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public TerminalNode SBRACKET() { return getToken(JavaplusplusParser.SBRACKET, 0); }
		public TerminalNode EBRACKET() { return getToken(JavaplusplusParser.EBRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaplusplusParser.SEMICOLON, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaplusplusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaplusplusParser.COMMA, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaplusplusListener ) ((JavaplusplusListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaplusplusListener ) ((JavaplusplusListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			var_name();
			setState(102);
			match(SBRACKET);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << STRING))) != 0)) {
				{
				{
				setState(103);
				value();
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(104);
					match(COMMA);
					setState(105);
					value();
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			match(EBRACKET);
			setState(117);
			match(SEMICOLON);
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

	public static class Function_call_methodContext extends ParserRuleContext {
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public TerminalNode SBRACKET() { return getToken(JavaplusplusParser.SBRACKET, 0); }
		public TerminalNode EBRACKET() { return getToken(JavaplusplusParser.EBRACKET, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaplusplusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaplusplusParser.COMMA, i);
		}
		public Function_call_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaplusplusListener ) ((JavaplusplusListener)listener).enterFunction_call_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaplusplusListener ) ((JavaplusplusListener)listener).exitFunction_call_method(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitFunction_call_method(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_methodContext function_call_method() throws RecognitionException {
		Function_call_methodContext _localctx = new Function_call_methodContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_call_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			var_name();
			setState(120);
			match(SBRACKET);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << STRING))) != 0)) {
				{
				{
				setState(121);
				value();
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(122);
					match(COMMA);
					setState(123);
					value();
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			match(EBRACKET);
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode SBRACKET() { return getToken(JavaplusplusParser.SBRACKET, 0); }
		public Variable_initContext variable_init() {
			return getRuleContext(Variable_initContext.class,0);
		}
		public List<Var_nameContext> var_name() {
			return getRuleContexts(Var_nameContext.class);
		}
		public Var_nameContext var_name(int i) {
			return getRuleContext(Var_nameContext.class,i);
		}
		public List<TerminalNode> COMPARATORS() { return getTokens(JavaplusplusParser.COMPARATORS); }
		public TerminalNode COMPARATORS(int i) {
			return getToken(JavaplusplusParser.COMPARATORS, i);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaplusplusParser.SEMICOLON, 0); }
		public TerminalNode EBRACKET() { return getToken(JavaplusplusParser.EBRACKET, 0); }
		public TerminalNode C_SBRACKET() { return getToken(JavaplusplusParser.C_SBRACKET, 0); }
		public TerminalNode C_EBRACKET() { return getToken(JavaplusplusParser.C_EBRACKET, 0); }
		public List<TerminalNode> INT() { return getTokens(JavaplusplusParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(JavaplusplusParser.INT, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> AND_OR() { return getTokens(JavaplusplusParser.AND_OR); }
		public TerminalNode AND_OR(int i) {
			return getToken(JavaplusplusParser.AND_OR, i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaplusplusListener ) ((JavaplusplusListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaplusplusListener ) ((JavaplusplusListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__2);
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(137);
				match(SBRACKET);
				setState(138);
				variable_init();
				setState(139);
				var_name();
				setState(140);
				match(COMPARATORS);
				setState(143);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(141);
					var_name();
					}
					break;
				case INT:
					{
					setState(142);
					match(INT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(145);
				match(SEMICOLON);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(146);
					var_name();
					setState(147);
					match(T__3);
					}
				}

				setState(151);
				match(EBRACKET);
				setState(152);
				match(C_SBRACKET);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << VAR_TYPE) | (1L << STRING))) != 0)) {
					{
					{
					setState(153);
					expression();
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(159);
				match(C_EBRACKET);
				}
				break;
			case 2:
				{
				setState(161);
				match(SBRACKET);
				setState(162);
				var_name();
				setState(163);
				match(COMPARATORS);
				setState(166);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(164);
					var_name();
					}
					break;
				case INT:
					{
					setState(165);
					match(INT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND_OR) {
					{
					{
					setState(168);
					match(AND_OR);
					setState(169);
					var_name();
					setState(170);
					match(COMPARATORS);
					setState(173);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRING:
						{
						setState(171);
						var_name();
						}
						break;
					case INT:
						{
						setState(172);
						match(INT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(180);
				match(EBRACKET);
				setState(181);
				match(C_SBRACKET);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << VAR_TYPE) | (1L << STRING))) != 0)) {
					{
					{
					setState(182);
					expression();
					}
					}
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(188);
				match(C_EBRACKET);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode SBRACKET() { return getToken(JavaplusplusParser.SBRACKET, 0); }
		public TerminalNode EBRACKET() { return getToken(JavaplusplusParser.EBRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaplusplusParser.SEMICOLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Function_call_methodContext function_call_method() {
			return getRuleContext(Function_call_methodContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaplusplusListener ) ((JavaplusplusListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaplusplusListener ) ((JavaplusplusListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__4);
			setState(193);
			match(SBRACKET);
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(194);
				value();
				}
				break;
			case 2:
				{
				setState(195);
				function_call_method();
				}
				break;
			}
			setState(198);
			match(EBRACKET);
			setState(199);
			match(SEMICOLON);
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

	public static class CheckContext extends ParserRuleContext {
		public TerminalNode SBRACKET() { return getToken(JavaplusplusParser.SBRACKET, 0); }
		public List<Comparable_statementContext> comparable_statement() {
			return getRuleContexts(Comparable_statementContext.class);
		}
		public Comparable_statementContext comparable_statement(int i) {
			return getRuleContext(Comparable_statementContext.class,i);
		}
		public TerminalNode EBRACKET() { return getToken(JavaplusplusParser.EBRACKET, 0); }
		public List<TerminalNode> C_SBRACKET() { return getTokens(JavaplusplusParser.C_SBRACKET); }
		public TerminalNode C_SBRACKET(int i) {
			return getToken(JavaplusplusParser.C_SBRACKET, i);
		}
		public List<TerminalNode> C_EBRACKET() { return getTokens(JavaplusplusParser.C_EBRACKET); }
		public TerminalNode C_EBRACKET(int i) {
			return getToken(JavaplusplusParser.C_EBRACKET, i);
		}
		public List<TerminalNode> AND_OR() { return getTokens(JavaplusplusParser.AND_OR); }
		public TerminalNode AND_OR(int i) {
			return getToken(JavaplusplusParser.AND_OR, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaplusplusListener ) ((JavaplusplusListener)listener).enterCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaplusplusListener ) ((JavaplusplusListener)listener).exitCheck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitCheck(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckContext check() throws RecognitionException {
		CheckContext _localctx = new CheckContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_check);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__5);
			setState(202);
			match(SBRACKET);
			setState(203);
			comparable_statement();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND_OR) {
				{
				{
				setState(204);
				match(AND_OR);
				setState(205);
				comparable_statement();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			match(EBRACKET);
			setState(212);
			match(C_SBRACKET);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << VAR_TYPE) | (1L << STRING))) != 0)) {
				{
				{
				setState(213);
				expression();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			match(C_EBRACKET);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(220);
				match(T__6);
				setState(221);
				match(C_SBRACKET);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << VAR_TYPE) | (1L << STRING))) != 0)) {
					{
					{
					setState(222);
					expression();
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(228);
				match(C_EBRACKET);
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

	public static class AskContext extends ParserRuleContext {
		public TerminalNode SBRACKET() { return getToken(JavaplusplusParser.SBRACKET, 0); }
		public TerminalNode VAR_TYPE() { return getToken(JavaplusplusParser.VAR_TYPE, 0); }
		public TerminalNode EBRACKET() { return getToken(JavaplusplusParser.EBRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaplusplusParser.SEMICOLON, 0); }
		public AskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ask; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaplusplusListener ) ((JavaplusplusListener)listener).enterAsk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaplusplusListener ) ((JavaplusplusListener)listener).exitAsk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitAsk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AskContext ask() throws RecognitionException {
		AskContext _localctx = new AskContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ask);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__7);
			setState(232);
			match(SBRACKET);
			setState(233);
			match(VAR_TYPE);
			setState(234);
			match(EBRACKET);
			setState(235);
			match(SEMICOLON);
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

	public static class Comparable_statementContext extends ParserRuleContext {
		public List<ComparablesContext> comparables() {
			return getRuleContexts(ComparablesContext.class);
		}
		public ComparablesContext comparables(int i) {
			return getRuleContext(ComparablesContext.class,i);
		}
		public List<TerminalNode> COMPARATORS() { return getTokens(JavaplusplusParser.COMPARATORS); }
		public TerminalNode COMPARATORS(int i) {
			return getToken(JavaplusplusParser.COMPARATORS, i);
		}
		public Comparable_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparable_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaplusplusListener ) ((JavaplusplusListener)listener).enterComparable_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaplusplusListener ) ((JavaplusplusListener)listener).exitComparable_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitComparable_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparable_statementContext comparable_statement() throws RecognitionException {
		Comparable_statementContext _localctx = new Comparable_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comparable_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			comparables();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMPARATORS) {
				{
				{
				setState(238);
				match(COMPARATORS);
				{
				setState(239);
				comparables();
				}
				}
				}
				setState(244);
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

	public static class Return_typeContext extends ParserRuleContext {
		public TerminalNode VAR_TYPE() { return getToken(JavaplusplusParser.VAR_TYPE, 0); }
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaplusplusListener ) ((JavaplusplusListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaplusplusListener ) ((JavaplusplusListener)listener).exitReturn_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitReturn_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_return_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==VAR_TYPE) ) {
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

	public static class ComparablesContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public TerminalNode INT() { return getToken(JavaplusplusParser.INT, 0); }
		public ComparablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaplusplusListener ) ((JavaplusplusListener)listener).enterComparables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaplusplusListener ) ((JavaplusplusListener)listener).exitComparables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitComparables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparablesContext comparables() throws RecognitionException {
		ComparablesContext _localctx = new ComparablesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comparables);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				var_name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				match(INT);
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

	public static class ValueContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(JavaplusplusParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(JavaplusplusParser.INT, i);
		}
		public List<TerminalNode> STRING() { return getTokens(JavaplusplusParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(JavaplusplusParser.STRING, i);
		}
		public List<TerminalNode> BOOL() { return getTokens(JavaplusplusParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(JavaplusplusParser.BOOL, i);
		}
		public List<TerminalNode> MATH_OPERATORS() { return getTokens(JavaplusplusParser.MATH_OPERATORS); }
		public TerminalNode MATH_OPERATORS(int i) {
			return getToken(JavaplusplusParser.MATH_OPERATORS, i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaplusplusListener ) ((JavaplusplusListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaplusplusListener ) ((JavaplusplusListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_value);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(257);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MATH_OPERATORS:
						{
						setState(253);
						match(MATH_OPERATORS);
						setState(254);
						match(INT);
						}
						break;
					case STRING:
						{
						setState(255);
						match(STRING);
						}
						break;
					case BOOL:
						{
						setState(256);
						match(BOOL);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class Var_nameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JavaplusplusParser.STRING, 0); }
		public Var_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaplusplusListener ) ((JavaplusplusListener)listener).enterVar_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaplusplusListener ) ((JavaplusplusListener)listener).exitVar_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitVar_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_nameContext var_name() throws RecognitionException {
		Var_nameContext _localctx = new Var_nameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_var_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(STRING);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u010b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\7\2"+
		"$\n\2\f\2\16\2\'\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3"+
		"\4\5\4\65\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4>\n\4\3\4\3\4\3\4\3\4\5\4"+
		"D\n\4\3\5\3\5\3\5\3\5\3\5\7\5K\n\5\f\5\16\5N\13\5\3\6\3\6\3\6\3\6\7\6"+
		"T\n\6\f\6\16\6W\13\6\3\6\3\6\3\6\7\6\\\n\6\f\6\16\6_\13\6\3\6\3\6\5\6"+
		"c\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7m\n\7\f\7\16\7p\13\7\7\7r\n\7"+
		"\f\7\16\7u\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b\177\n\b\f\b\16\b\u0082"+
		"\13\b\7\b\u0084\n\b\f\b\16\b\u0087\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u0092\n\t\3\t\3\t\3\t\3\t\5\t\u0098\n\t\3\t\3\t\3\t\7\t\u009d"+
		"\n\t\f\t\16\t\u00a0\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a9\n\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u00b0\n\t\7\t\u00b2\n\t\f\t\16\t\u00b5\13\t\3\t\3"+
		"\t\3\t\7\t\u00ba\n\t\f\t\16\t\u00bd\13\t\3\t\3\t\5\t\u00c1\n\t\3\n\3\n"+
		"\3\n\3\n\5\n\u00c7\n\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13\u00d1"+
		"\n\13\f\13\16\13\u00d4\13\13\3\13\3\13\3\13\7\13\u00d9\n\13\f\13\16\13"+
		"\u00dc\13\13\3\13\3\13\3\13\3\13\7\13\u00e2\n\13\f\13\16\13\u00e5\13\13"+
		"\3\13\5\13\u00e8\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\7\r\u00f3\n"+
		"\r\f\r\16\r\u00f6\13\r\3\16\3\16\3\17\3\17\3\17\5\17\u00fd\n\17\3\20\3"+
		"\20\3\20\3\20\3\20\7\20\u0104\n\20\f\20\16\20\u0107\13\20\3\21\3\21\3"+
		"\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\4\4\2\13\13\27\27"+
		"\4\2\20\21\30\30\2\u0120\2%\3\2\2\2\4\61\3\2\2\2\6C\3\2\2\2\bE\3\2\2\2"+
		"\nO\3\2\2\2\fg\3\2\2\2\16y\3\2\2\2\20\u008a\3\2\2\2\22\u00c2\3\2\2\2\24"+
		"\u00cb\3\2\2\2\26\u00e9\3\2\2\2\30\u00ef\3\2\2\2\32\u00f7\3\2\2\2\34\u00fc"+
		"\3\2\2\2\36\u00fe\3\2\2\2 \u0108\3\2\2\2\"$\5\4\3\2#\"\3\2\2\2$\'\3\2"+
		"\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\7\2\2\3)\3\3\2\2\2*\62"+
		"\5\22\n\2+\62\5\6\4\2,\62\5\f\7\2-\62\5\24\13\2.\62\5\n\6\2/\62\5\20\t"+
		"\2\60\62\5\26\f\2\61*\3\2\2\2\61+\3\2\2\2\61,\3\2\2\2\61-\3\2\2\2\61."+
		"\3\2\2\2\61/\3\2\2\2\61\60\3\2\2\2\62\5\3\2\2\2\63\65\7\27\2\2\64\63\3"+
		"\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\66\67\5 \21\2\67=\7\3\2\289\5\36\20"+
		"\29:\7\17\2\2:>\3\2\2\2;>\5\f\7\2<>\5\26\f\2=8\3\2\2\2=;\3\2\2\2=<\3\2"+
		"\2\2>D\3\2\2\2?@\7\27\2\2@A\5 \21\2AB\7\17\2\2BD\3\2\2\2C\64\3\2\2\2C"+
		"?\3\2\2\2D\7\3\2\2\2EF\7\27\2\2FL\5 \21\2GH\7\22\2\2HI\7\27\2\2IK\5 \21"+
		"\2JG\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\t\3\2\2\2NL\3\2\2\2OP\5\32"+
		"\16\2PQ\5 \21\2QU\7\23\2\2RT\5\b\5\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3"+
		"\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7\24\2\2Y]\7\25\2\2Z\\\5\4\3\2[Z\3\2\2\2"+
		"\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^b\3\2\2\2_]\3\2\2\2`a\7\4\2\2ac\5\36\20"+
		"\2b`\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7\17\2\2ef\7\26\2\2f\13\3\2\2\2gh\5"+
		" \21\2hs\7\23\2\2in\5\36\20\2jk\7\22\2\2km\5\36\20\2lj\3\2\2\2mp\3\2\2"+
		"\2nl\3\2\2\2no\3\2\2\2or\3\2\2\2pn\3\2\2\2qi\3\2\2\2ru\3\2\2\2sq\3\2\2"+
		"\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7\24\2\2wx\7\17\2\2x\r\3\2\2\2yz\5"+
		" \21\2z\u0085\7\23\2\2{\u0080\5\36\20\2|}\7\22\2\2}\177\5\36\20\2~|\3"+
		"\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0084"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0083{\3\2\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0088\u0089\7\24\2\2\u0089\17\3\2\2\2\u008a\u00c0\7\5\2\2\u008b\u008c"+
		"\7\23\2\2\u008c\u008d\5\6\4\2\u008d\u008e\5 \21\2\u008e\u0091\7\r\2\2"+
		"\u008f\u0092\5 \21\2\u0090\u0092\7\20\2\2\u0091\u008f\3\2\2\2\u0091\u0090"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0097\7\17\2\2\u0094\u0095\5 \21\2"+
		"\u0095\u0096\7\6\2\2\u0096\u0098\3\2\2\2\u0097\u0094\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\24\2\2\u009a\u009e\7\25\2\2"+
		"\u009b\u009d\5\4\3\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1"+
		"\u00a2\7\26\2\2\u00a2\u00c1\3\2\2\2\u00a3\u00a4\7\23\2\2\u00a4\u00a5\5"+
		" \21\2\u00a5\u00a8\7\r\2\2\u00a6\u00a9\5 \21\2\u00a7\u00a9\7\20\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00b3\3\2\2\2\u00aa\u00ab\7\16"+
		"\2\2\u00ab\u00ac\5 \21\2\u00ac\u00af\7\r\2\2\u00ad\u00b0\5 \21\2\u00ae"+
		"\u00b0\7\20\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b2\3"+
		"\2\2\2\u00b1\u00aa\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\7\24"+
		"\2\2\u00b7\u00bb\7\25\2\2\u00b8\u00ba\5\4\3\2\u00b9\u00b8\3\2\2\2\u00ba"+
		"\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2"+
		"\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7\26\2\2\u00bf\u00c1\3\2\2\2\u00c0"+
		"\u008b\3\2\2\2\u00c0\u00a3\3\2\2\2\u00c1\21\3\2\2\2\u00c2\u00c3\7\7\2"+
		"\2\u00c3\u00c6\7\23\2\2\u00c4\u00c7\5\36\20\2\u00c5\u00c7\5\16\b\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7\24"+
		"\2\2\u00c9\u00ca\7\17\2\2\u00ca\23\3\2\2\2\u00cb\u00cc\7\b\2\2\u00cc\u00cd"+
		"\7\23\2\2\u00cd\u00d2\5\30\r\2\u00ce\u00cf\7\16\2\2\u00cf\u00d1\5\30\r"+
		"\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3"+
		"\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7\24\2\2"+
		"\u00d6\u00da\7\25\2\2\u00d7\u00d9\5\4\3\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc"+
		"\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dd\u00e7\7\26\2\2\u00de\u00df\7\t\2\2\u00df\u00e3\7"+
		"\25\2\2\u00e0\u00e2\5\4\3\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e6\u00e8\7\26\2\2\u00e7\u00de\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\25\3\2\2\2\u00e9\u00ea\7\n\2\2\u00ea\u00eb\7\23\2\2\u00eb\u00ec\7\27"+
		"\2\2\u00ec\u00ed\7\24\2\2\u00ed\u00ee\7\17\2\2\u00ee\27\3\2\2\2\u00ef"+
		"\u00f4\5\34\17\2\u00f0\u00f1\7\r\2\2\u00f1\u00f3\5\34\17\2\u00f2\u00f0"+
		"\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\31\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\t\2\2\2\u00f8\33\3\2\2\2\u00f9"+
		"\u00fd\5\f\7\2\u00fa\u00fd\5 \21\2\u00fb\u00fd\7\20\2\2\u00fc\u00f9\3"+
		"\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\35\3\2\2\2\u00fe"+
		"\u0105\t\3\2\2\u00ff\u0100\7\f\2\2\u0100\u0104\7\20\2\2\u0101\u0104\7"+
		"\30\2\2\u0102\u0104\7\21\2\2\u0103\u00ff\3\2\2\2\u0103\u0101\3\2\2\2\u0103"+
		"\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\37\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\7\30\2\2\u0109!"+
		"\3\2\2\2 %\61\64=CLU]bns\u0080\u0085\u0091\u0097\u009e\u00a8\u00af\u00b3"+
		"\u00bb\u00c0\u00c6\u00d2\u00da\u00e3\u00e7\u00f4\u00fc\u0103\u0105";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}