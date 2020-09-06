// Generated from C:/Users/IvoTasev/Desktop/CnOS/src\Javaplusplus.g4 by ANTLR 4.8
package nl.saxion.cos;
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
		T__9=10, T__10=11, T__11=12, SPACE=13, MATH_OPERATORS=14, COMPARATORS=15, 
		AND_OR=16, SEMICOLON=17, INT=18, BOOL=19, COMMA=20, SBRACKET=21, EBRACKET=22, 
		C_SBRACKET=23, C_EBRACKET=24, VAR_TYPE=25, STRING=26, IDENTIFIER=27, CHAR=28, 
		INC_DEC=29;
	public static final int
		RULE_program = 0, RULE_class_declaration = 1, RULE_body = 2, RULE_var_init = 3, 
		RULE_func_init = 4, RULE_expression = 5, RULE_func_vars = 6, RULE_block = 7, 
		RULE_statement = 8, RULE_func_type = 9, RULE_return_statement = 10, RULE_func_var = 11, 
		RULE_ask = 12, RULE_check = 13, RULE_loop = 14, RULE_print = 15, RULE_func_call = 16, 
		RULE_params = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "class_declaration", "body", "var_init", "func_init", "expression", 
			"func_vars", "block", "statement", "func_type", "return_statement", "func_var", 
			"ask", "check", "loop", "print", "func_call", "params"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'='", "'*'", "'/'", "'+'", "'-'", "'void'", "'return'", 
			"'ask'", "'check'", "'loop'", "'dump'", null, null, null, null, "';'", 
			null, null, "','", "'('", "')'", "'<<'", "'>>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "SPACE", "MATH_OPERATORS", "COMPARATORS", "AND_OR", "SEMICOLON", 
			"INT", "BOOL", "COMMA", "SBRACKET", "EBRACKET", "C_SBRACKET", "C_EBRACKET", 
			"VAR_TYPE", "STRING", "IDENTIFIER", "CHAR", "INC_DEC"
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
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JavaplusplusParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			class_declaration();
			setState(37);
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

	public static class Class_declarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaplusplusParser.IDENTIFIER, 0); }
		public TerminalNode C_SBRACKET() { return getToken(JavaplusplusParser.C_SBRACKET, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode C_EBRACKET() { return getToken(JavaplusplusParser.C_EBRACKET, 0); }
		public Class_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitClass_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_declarationContext class_declaration() throws RecognitionException {
		Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__0);
			setState(40);
			match(IDENTIFIER);
			setState(41);
			match(C_SBRACKET);
			setState(42);
			body();
			setState(43);
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

	public static class BodyContext extends ParserRuleContext {
		public List<Var_initContext> var_init() {
			return getRuleContexts(Var_initContext.class);
		}
		public Var_initContext var_init(int i) {
			return getRuleContext(Var_initContext.class,i);
		}
		public List<Func_initContext> func_init() {
			return getRuleContexts(Func_initContext.class);
		}
		public Func_initContext func_init(int i) {
			return getRuleContext(Func_initContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==VAR_TYPE) {
				{
				setState(47);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(45);
					var_init();
					}
					break;
				case 2:
					{
					setState(46);
					func_init();
					}
					break;
				}
				}
				setState(51);
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

	public static class Var_initContext extends ParserRuleContext {
		public TerminalNode VAR_TYPE() { return getToken(JavaplusplusParser.VAR_TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaplusplusParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaplusplusParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Var_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_init; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitVar_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_initContext var_init() throws RecognitionException {
		Var_initContext _localctx = new Var_initContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(VAR_TYPE);
			setState(53);
			match(IDENTIFIER);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(54);
				match(T__1);
				setState(55);
				expression(0);
				}
			}

			setState(58);
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

	public static class Func_initContext extends ParserRuleContext {
		public Func_typeContext func_type() {
			return getRuleContext(Func_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaplusplusParser.IDENTIFIER, 0); }
		public TerminalNode SBRACKET() { return getToken(JavaplusplusParser.SBRACKET, 0); }
		public TerminalNode EBRACKET() { return getToken(JavaplusplusParser.EBRACKET, 0); }
		public TerminalNode C_SBRACKET() { return getToken(JavaplusplusParser.C_SBRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode C_EBRACKET() { return getToken(JavaplusplusParser.C_EBRACKET, 0); }
		public Func_varsContext func_vars() {
			return getRuleContext(Func_varsContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaplusplusParser.SEMICOLON, 0); }
		public Func_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_init; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitFunc_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_initContext func_init() throws RecognitionException {
		Func_initContext _localctx = new Func_initContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_func_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			func_type();
			setState(61);
			match(IDENTIFIER);
			setState(62);
			match(SBRACKET);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR_TYPE) {
				{
				setState(63);
				func_vars();
				}
			}

			setState(66);
			match(EBRACKET);
			setState(67);
			match(C_SBRACKET);
			setState(68);
			block();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(69);
				return_statement();
				setState(70);
				match(SEMICOLON);
				}
			}

			setState(74);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExEqualsExpressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaplusplusParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExEqualsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitExEqualsExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AdditiveExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExIdentifierContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaplusplusParser.IDENTIFIER, 0); }
		public ExIdentifierContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitExIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token binary;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND_OR() { return getToken(JavaplusplusParser.AND_OR, 0); }
		public BinaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitBinaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparatorExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token comp;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMPARATORS() { return getToken(JavaplusplusParser.COMPARATORS, 0); }
		public ComparatorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitComparatorExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AskExpressionContext extends ExpressionContext {
		public AskContext ask() {
			return getRuleContext(AskContext.class,0);
		}
		public AskExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitAskExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExStrLiteralContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(JavaplusplusParser.STRING, 0); }
		public ExStrLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitExStrLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExMethodInvocationContext extends ExpressionContext {
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public ExMethodInvocationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitExMethodInvocation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExpressionContext extends ExpressionContext {
		public Token op;
		public TerminalNode IDENTIFIER() { return getToken(JavaplusplusParser.IDENTIFIER, 0); }
		public TerminalNode INC_DEC() { return getToken(JavaplusplusParser.INC_DEC, 0); }
		public UnaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExIntLiteralContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(JavaplusplusParser.INT, 0); }
		public ExIntLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitExIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicativeExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultiplicativeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExpressionContext extends ExpressionContext {
		public TerminalNode BOOL() { return getToken(JavaplusplusParser.BOOL, 0); }
		public BoolExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitBoolExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new ExMethodInvocationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(77);
				func_call();
				}
				break;
			case 2:
				{
				_localctx = new AskExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78);
				ask();
				}
				break;
			case 3:
				{
				_localctx = new ExIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				match(IDENTIFIER);
				}
				break;
			case 4:
				{
				_localctx = new ExEqualsExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				match(IDENTIFIER);
				setState(81);
				match(T__1);
				setState(82);
				expression(5);
				}
				break;
			case 5:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				match(IDENTIFIER);
				setState(84);
				((UnaryExpressionContext)_localctx).op = match(INC_DEC);
				}
				break;
			case 6:
				{
				_localctx = new BoolExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				match(BOOL);
				}
				break;
			case 7:
				{
				_localctx = new ExIntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(86);
				match(INT);
				}
				break;
			case 8:
				{
				_localctx = new ExStrLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(102);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MultiplicativeExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(90);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(91);
						((MultiplicativeExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__2 || _la==T__3) ) {
							((MultiplicativeExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(92);
						((MultiplicativeExpressionContext)_localctx).right = expression(13);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AdditiveExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(93);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(94);
						((AdditiveExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__5) ) {
							((AdditiveExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(95);
						((AdditiveExpressionContext)_localctx).right = expression(12);
						}
						break;
					case 3:
						{
						_localctx = new ComparatorExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ComparatorExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(96);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(97);
						((ComparatorExpressionContext)_localctx).comp = match(COMPARATORS);
						setState(98);
						((ComparatorExpressionContext)_localctx).right = expression(11);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(99);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(100);
						((BinaryExpressionContext)_localctx).binary = match(AND_OR);
						setState(101);
						((BinaryExpressionContext)_localctx).right = expression(10);
						}
						break;
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class Func_varsContext extends ParserRuleContext {
		public List<Func_varContext> func_var() {
			return getRuleContexts(Func_varContext.class);
		}
		public Func_varContext func_var(int i) {
			return getRuleContext(Func_varContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaplusplusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaplusplusParser.COMMA, i);
		}
		public Func_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_vars; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitFunc_vars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_varsContext func_vars() throws RecognitionException {
		Func_varsContext _localctx = new Func_varsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_func_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			func_var();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(108);
				match(COMMA);
				setState(109);
				func_var();
				}
				}
				setState(114);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << INT) | (1L << BOOL) | (1L << VAR_TYPE) | (1L << STRING) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(115);
				statement();
				}
				}
				setState(120);
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

	public static class StatementContext extends ParserRuleContext {
		public Var_initContext var_init() {
			return getRuleContext(Var_initContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaplusplusParser.SEMICOLON, 0); }
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public CheckContext check() {
			return getRuleContext(CheckContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				var_init();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				func_call();
				setState(123);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				print();
				setState(127);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(129);
				check();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(130);
				expression(0);
				setState(131);
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

	public static class Func_typeContext extends ParserRuleContext {
		public TerminalNode VAR_TYPE() { return getToken(JavaplusplusParser.VAR_TYPE, 0); }
		public Func_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitFunc_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_typeContext func_type() throws RecognitionException {
		Func_typeContext _localctx = new Func_typeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_func_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==VAR_TYPE) ) {
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

	public static class Return_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(137);
			match(T__7);
			setState(138);
			expression(0);
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

	public static class Func_varContext extends ParserRuleContext {
		public TerminalNode VAR_TYPE() { return getToken(JavaplusplusParser.VAR_TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaplusplusParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Func_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_var; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitFunc_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_varContext func_var() throws RecognitionException {
		Func_varContext _localctx = new Func_varContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_func_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(VAR_TYPE);
			setState(141);
			match(IDENTIFIER);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(142);
				match(T__1);
				setState(143);
				expression(0);
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
		public AskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ask; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitAsk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AskContext ask() throws RecognitionException {
		AskContext _localctx = new AskContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ask);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__8);
			setState(147);
			match(SBRACKET);
			setState(148);
			match(VAR_TYPE);
			setState(149);
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

	public static class CheckContext extends ParserRuleContext {
		public TerminalNode SBRACKET() { return getToken(JavaplusplusParser.SBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EBRACKET() { return getToken(JavaplusplusParser.EBRACKET, 0); }
		public TerminalNode C_SBRACKET() { return getToken(JavaplusplusParser.C_SBRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode C_EBRACKET() { return getToken(JavaplusplusParser.C_EBRACKET, 0); }
		public CheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitCheck(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckContext check() throws RecognitionException {
		CheckContext _localctx = new CheckContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_check);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__9);
			setState(152);
			match(SBRACKET);
			setState(153);
			expression(0);
			setState(154);
			match(EBRACKET);
			setState(155);
			match(C_SBRACKET);
			setState(156);
			block();
			setState(157);
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode SBRACKET() { return getToken(JavaplusplusParser.SBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EBRACKET() { return getToken(JavaplusplusParser.EBRACKET, 0); }
		public TerminalNode C_SBRACKET() { return getToken(JavaplusplusParser.C_SBRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode C_EBRACKET() { return getToken(JavaplusplusParser.C_EBRACKET, 0); }
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__10);
			setState(160);
			match(SBRACKET);
			setState(161);
			expression(0);
			setState(162);
			match(EBRACKET);
			setState(163);
			match(C_SBRACKET);
			setState(164);
			block();
			setState(165);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode SBRACKET() { return getToken(JavaplusplusParser.SBRACKET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaplusplusParser.IDENTIFIER, 0); }
		public TerminalNode EBRACKET() { return getToken(JavaplusplusParser.EBRACKET, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__11);
			setState(168);
			match(SBRACKET);
			setState(169);
			match(IDENTIFIER);
			setState(170);
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

	public static class Func_callContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaplusplusParser.IDENTIFIER, 0); }
		public TerminalNode SBRACKET() { return getToken(JavaplusplusParser.SBRACKET, 0); }
		public TerminalNode EBRACKET() { return getToken(JavaplusplusParser.EBRACKET, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(IDENTIFIER);
			setState(173);
			match(SBRACKET);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(174);
				params();
				}
			}

			setState(177);
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

	public static class ParamsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaplusplusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaplusplusParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaplusplusVisitor ) return ((JavaplusplusVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(179);
			expression(0);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(180);
				match(COMMA);
				setState(181);
				expression(0);
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00be\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\7\4\62\n\4\f\4"+
		"\16\4\65\13\4\3\5\3\5\3\5\3\5\5\5;\n\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6C\n"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6K\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7[\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\7\7i\n\7\f\7\16\7l\13\7\3\b\3\b\3\b\7\bq\n\b\f\b\16\bt\13\b"+
		"\3\t\7\tw\n\t\f\t\16\tz\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u0088\n\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u0093\n"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\5\22\u00b2\n\22\3\22\3\22\3\23\3\23\3\23\7\23\u00b9\n\23\f\23"+
		"\16\23\u00bc\13\23\3\23\2\3\f\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$\2\5\3\2\5\6\3\2\7\b\4\2\t\t\33\33\2\u00c5\2&\3\2\2\2\4)\3\2\2\2\6"+
		"\63\3\2\2\2\b\66\3\2\2\2\n>\3\2\2\2\fZ\3\2\2\2\16m\3\2\2\2\20x\3\2\2\2"+
		"\22\u0087\3\2\2\2\24\u0089\3\2\2\2\26\u008b\3\2\2\2\30\u008e\3\2\2\2\32"+
		"\u0094\3\2\2\2\34\u0099\3\2\2\2\36\u00a1\3\2\2\2 \u00a9\3\2\2\2\"\u00ae"+
		"\3\2\2\2$\u00b5\3\2\2\2&\'\5\4\3\2\'(\7\2\2\3(\3\3\2\2\2)*\7\3\2\2*+\7"+
		"\35\2\2+,\7\31\2\2,-\5\6\4\2-.\7\32\2\2.\5\3\2\2\2/\62\5\b\5\2\60\62\5"+
		"\n\6\2\61/\3\2\2\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2"+
		"\2\2\64\7\3\2\2\2\65\63\3\2\2\2\66\67\7\33\2\2\67:\7\35\2\289\7\4\2\2"+
		"9;\5\f\7\2:8\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\7\23\2\2=\t\3\2\2\2>?\5\24"+
		"\13\2?@\7\35\2\2@B\7\27\2\2AC\5\16\b\2BA\3\2\2\2BC\3\2\2\2CD\3\2\2\2D"+
		"E\7\30\2\2EF\7\31\2\2FJ\5\20\t\2GH\5\26\f\2HI\7\23\2\2IK\3\2\2\2JG\3\2"+
		"\2\2JK\3\2\2\2KL\3\2\2\2LM\7\32\2\2M\13\3\2\2\2NO\b\7\1\2O[\5\"\22\2P"+
		"[\5\32\16\2Q[\7\35\2\2RS\7\35\2\2ST\7\4\2\2T[\5\f\7\7UV\7\35\2\2V[\7\37"+
		"\2\2W[\7\25\2\2X[\7\24\2\2Y[\7\34\2\2ZN\3\2\2\2ZP\3\2\2\2ZQ\3\2\2\2ZR"+
		"\3\2\2\2ZU\3\2\2\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[j\3\2\2\2\\]\f\16\2\2"+
		"]^\t\2\2\2^i\5\f\7\17_`\f\r\2\2`a\t\3\2\2ai\5\f\7\16bc\f\f\2\2cd\7\21"+
		"\2\2di\5\f\7\ref\f\13\2\2fg\7\22\2\2gi\5\f\7\fh\\\3\2\2\2h_\3\2\2\2hb"+
		"\3\2\2\2he\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\r\3\2\2\2lj\3\2\2\2"+
		"mr\5\30\r\2no\7\26\2\2oq\5\30\r\2pn\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2"+
		"\2\2s\17\3\2\2\2tr\3\2\2\2uw\5\22\n\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy"+
		"\3\2\2\2y\21\3\2\2\2zx\3\2\2\2{\u0088\5\b\5\2|}\5\"\22\2}~\7\23\2\2~\u0088"+
		"\3\2\2\2\177\u0088\5\36\20\2\u0080\u0081\5 \21\2\u0081\u0082\7\23\2\2"+
		"\u0082\u0088\3\2\2\2\u0083\u0088\5\34\17\2\u0084\u0085\5\f\7\2\u0085\u0086"+
		"\7\23\2\2\u0086\u0088\3\2\2\2\u0087{\3\2\2\2\u0087|\3\2\2\2\u0087\177"+
		"\3\2\2\2\u0087\u0080\3\2\2\2\u0087\u0083\3\2\2\2\u0087\u0084\3\2\2\2\u0088"+
		"\23\3\2\2\2\u0089\u008a\t\4\2\2\u008a\25\3\2\2\2\u008b\u008c\7\n\2\2\u008c"+
		"\u008d\5\f\7\2\u008d\27\3\2\2\2\u008e\u008f\7\33\2\2\u008f\u0092\7\35"+
		"\2\2\u0090\u0091\7\4\2\2\u0091\u0093\5\f\7\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\31\3\2\2\2\u0094\u0095\7\13\2\2\u0095\u0096\7\27"+
		"\2\2\u0096\u0097\7\33\2\2\u0097\u0098\7\30\2\2\u0098\33\3\2\2\2\u0099"+
		"\u009a\7\f\2\2\u009a\u009b\7\27\2\2\u009b\u009c\5\f\7\2\u009c\u009d\7"+
		"\30\2\2\u009d\u009e\7\31\2\2\u009e\u009f\5\20\t\2\u009f\u00a0\7\32\2\2"+
		"\u00a0\35\3\2\2\2\u00a1\u00a2\7\r\2\2\u00a2\u00a3\7\27\2\2\u00a3\u00a4"+
		"\5\f\7\2\u00a4\u00a5\7\30\2\2\u00a5\u00a6\7\31\2\2\u00a6\u00a7\5\20\t"+
		"\2\u00a7\u00a8\7\32\2\2\u00a8\37\3\2\2\2\u00a9\u00aa\7\16\2\2\u00aa\u00ab"+
		"\7\27\2\2\u00ab\u00ac\7\35\2\2\u00ac\u00ad\7\30\2\2\u00ad!\3\2\2\2\u00ae"+
		"\u00af\7\35\2\2\u00af\u00b1\7\27\2\2\u00b0\u00b2\5$\23\2\u00b1\u00b0\3"+
		"\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7\30\2\2\u00b4"+
		"#\3\2\2\2\u00b5\u00ba\5\f\7\2\u00b6\u00b7\7\26\2\2\u00b7\u00b9\5\f\7\2"+
		"\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb%\3\2\2\2\u00bc\u00ba\3\2\2\2\20\61\63:BJZhjrx\u0087\u0092"+
		"\u00b1\u00ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}