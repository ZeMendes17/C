// Generated from Distance.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DistanceParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, Number=9, 
		WS=10;
	public static final int
		RULE_main = 0, RULE_stat = 1, RULE_expr = 2, RULE_distance = 3, RULE_point = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "stat", "expr", "distance", "point"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'+'", "'-'", "'('", "')'", "'distance'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "Number", "WS"
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
	public String getGrammarFileName() { return "Distance.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DistanceParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DistanceParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DistanceListener ) ((DistanceListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DistanceListener ) ((DistanceListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DistanceVisitor ) return ((DistanceVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 672L) != 0)) {
				{
				{
				setState(10);
				stat();
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(16);
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
	public static class StatContext extends ParserRuleContext {
		public Double res;
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
			this.res = ctx.res;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatExprContext extends StatContext {
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatExprContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DistanceListener ) ((DistanceListener)listener).enterStatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DistanceListener ) ((DistanceListener)listener).exitStatExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DistanceVisitor ) return ((DistanceVisitor<? extends T>)visitor).visitStatExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			_localctx = new StatExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			((StatExprContext)_localctx).expr = expr(0);

			  if(((StatExprContext)_localctx).expr.res != null)
			    System.out.println("Result (A): " + ((StatExprContext)_localctx).expr.res);

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
	public static class ExprContext extends ParserRuleContext {
		public Double res = null;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.res = ctx.res;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAddSubContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public ExprContext expr;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprAddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DistanceListener ) ((DistanceListener)listener).enterExprAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DistanceListener ) ((DistanceListener)listener).exitExprAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DistanceVisitor ) return ((DistanceVisitor<? extends T>)visitor).visitExprAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprParentsContext extends ExprContext {
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprParentsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DistanceListener ) ((DistanceListener)listener).enterExprParents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DistanceListener ) ((DistanceListener)listener).exitExprParents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DistanceVisitor ) return ((DistanceVisitor<? extends T>)visitor).visitExprParents(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprDistanceContext extends ExprContext {
		public DistanceContext distance;
		public DistanceContext distance() {
			return getRuleContext(DistanceContext.class,0);
		}
		public ExprDistanceContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DistanceListener ) ((DistanceListener)listener).enterExprDistance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DistanceListener ) ((DistanceListener)listener).exitExprDistance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DistanceVisitor ) return ((DistanceVisitor<? extends T>)visitor).visitExprDistance(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprNumberContext extends ExprContext {
		public Token Number;
		public TerminalNode Number() { return getToken(DistanceParser.Number, 0); }
		public ExprNumberContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DistanceListener ) ((DistanceListener)listener).enterExprNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DistanceListener ) ((DistanceListener)listener).exitExprNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DistanceVisitor ) return ((DistanceVisitor<? extends T>)visitor).visitExprNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprMultDivContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public ExprContext expr;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprMultDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DistanceListener ) ((DistanceListener)listener).enterExprMultDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DistanceListener ) ((DistanceListener)listener).exitExprMultDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DistanceVisitor ) return ((DistanceVisitor<? extends T>)visitor).visitExprMultDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				_localctx = new ExprParentsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(22);
				match(T__4);
				setState(23);
				((ExprParentsContext)_localctx).expr = expr(0);
				setState(24);
				match(T__5);

				        ((ExprParentsContext)_localctx).res =  ((ExprParentsContext)_localctx).expr.res;
				      
				}
				break;
			case T__6:
				{
				_localctx = new ExprDistanceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(27);
				((ExprDistanceContext)_localctx).distance = distance();

				        ((ExprDistanceContext)_localctx).res =  ((ExprDistanceContext)_localctx).distance.res;
				      
				}
				break;
			case Number:
				{
				_localctx = new ExprNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(30);
				((ExprNumberContext)_localctx).Number = match(Number);

				        ((ExprNumberContext)_localctx).res =  Double.parseDouble(((ExprNumberContext)_localctx).Number().getText());
				      
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(44);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMultDivContext(new ExprContext(_parentctx, _parentState));
						((ExprMultDivContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(34);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(35);
						((ExprMultDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__1) ) {
							((ExprMultDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(36);
						((ExprMultDivContext)_localctx).e2 = ((ExprMultDivContext)_localctx).expr = expr(6);

						                    Double res = null;
						                    Double e1 = ((ExprMultDivContext)_localctx).e1.res;
						                    Double e2 = ((ExprMultDivContext)_localctx).e2.res;
						                    if(e1 != null && e2 != null) {
						                      switch(((ExprMultDivContext)_localctx).op.getText()){
						                        case "*":
						                          res = e1 * e2;
						                          break;
						                        case "/":
						                          if(e2 == 0)
						                            System.err.println("ERROR: Divide by Zero");
						                          else
						                            res = e1 / e2;
						                          break;
						                      }
						                    }
						                    ((ExprMultDivContext)_localctx).res =  res;
						                  
						}
						break;
					case 2:
						{
						_localctx = new ExprAddSubContext(new ExprContext(_parentctx, _parentState));
						((ExprAddSubContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(39);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(40);
						((ExprAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__2 || _la==T__3) ) {
							((ExprAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(41);
						((ExprAddSubContext)_localctx).e2 = ((ExprAddSubContext)_localctx).expr = expr(5);

						                  Double res = null;
						                  Double e1 = ((ExprAddSubContext)_localctx).e1.res;
						                  Double e2 = ((ExprAddSubContext)_localctx).e2.res;
						                  if(e1 != null && e2 != null) {
						                    switch(((ExprAddSubContext)_localctx).op.getText()){
						                      case "+":
						                        res = e1 + e2;
						                        break;
						                      case "-":
						                        res = e1 - e2;
						                        break;
						                    }
						                  }
						                  ((ExprAddSubContext)_localctx).res =  res;
						                
						}
						break;
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DistanceContext extends ParserRuleContext {
		public Double res;
		public PointContext p1;
		public PointContext p2;
		public List<PointContext> point() {
			return getRuleContexts(PointContext.class);
		}
		public PointContext point(int i) {
			return getRuleContext(PointContext.class,i);
		}
		public DistanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DistanceListener ) ((DistanceListener)listener).enterDistance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DistanceListener ) ((DistanceListener)listener).exitDistance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DistanceVisitor ) return ((DistanceVisitor<? extends T>)visitor).visitDistance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistanceContext distance() throws RecognitionException {
		DistanceContext _localctx = new DistanceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_distance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__6);
			setState(50);
			((DistanceContext)_localctx).p1 = point();
			setState(51);
			((DistanceContext)_localctx).p2 = point();

			  Double p1x = ((DistanceContext)_localctx).p1.x;
			  Double p2x = ((DistanceContext)_localctx).p2.x;
			  Double p1y = ((DistanceContext)_localctx).p1.y;
			  Double p2y = ((DistanceContext)_localctx).p2.y;
			  if(p1x != null && p2x != null && p1y != null && p2y != null){
			      ((DistanceContext)_localctx).res =  Math.sqrt(Math.pow(p1x - p2x, 2) + Math.pow(p1y - p2y, 2));
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
	public static class PointContext extends ParserRuleContext {
		public Double x;
		public Double y;
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_point; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DistanceListener ) ((DistanceListener)listener).enterPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DistanceListener ) ((DistanceListener)listener).exitPoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DistanceVisitor ) return ((DistanceVisitor<? extends T>)visitor).visitPoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointContext point() throws RecognitionException {
		PointContext _localctx = new PointContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__4);
			setState(55);
			((PointContext)_localctx).e1 = expr(0);
			setState(56);
			match(T__7);
			setState(57);
			((PointContext)_localctx).e2 = expr(0);
			setState(58);
			match(T__5);

			  ((PointContext)_localctx).x =  ((PointContext)_localctx).e1.res;
			  ((PointContext)_localctx).y =  ((PointContext)_localctx).e2.res;

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
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\n>\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0005\u0000\f\b\u0000\n\u0000\f\u0000\u000f\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002!\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002-\b\u0002\n\u0002\f\u0002"+
		"0\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0000\u0001\u0004\u0005\u0000\u0002\u0004\u0006"+
		"\b\u0000\u0002\u0001\u0000\u0001\u0002\u0001\u0000\u0003\u0004=\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0002\u0012\u0001\u0000\u0000\u0000\u0004 "+
		"\u0001\u0000\u0000\u0000\u00061\u0001\u0000\u0000\u0000\b6\u0001\u0000"+
		"\u0000\u0000\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001\u0000\u0000\u0000"+
		"\f\u000f\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e"+
		"\u0001\u0000\u0000\u0000\u000e\u0010\u0001\u0000\u0000\u0000\u000f\r\u0001"+
		"\u0000\u0000\u0000\u0010\u0011\u0005\u0000\u0000\u0001\u0011\u0001\u0001"+
		"\u0000\u0000\u0000\u0012\u0013\u0003\u0004\u0002\u0000\u0013\u0014\u0006"+
		"\u0001\uffff\uffff\u0000\u0014\u0003\u0001\u0000\u0000\u0000\u0015\u0016"+
		"\u0006\u0002\uffff\uffff\u0000\u0016\u0017\u0005\u0005\u0000\u0000\u0017"+
		"\u0018\u0003\u0004\u0002\u0000\u0018\u0019\u0005\u0006\u0000\u0000\u0019"+
		"\u001a\u0006\u0002\uffff\uffff\u0000\u001a!\u0001\u0000\u0000\u0000\u001b"+
		"\u001c\u0003\u0006\u0003\u0000\u001c\u001d\u0006\u0002\uffff\uffff\u0000"+
		"\u001d!\u0001\u0000\u0000\u0000\u001e\u001f\u0005\t\u0000\u0000\u001f"+
		"!\u0006\u0002\uffff\uffff\u0000 \u0015\u0001\u0000\u0000\u0000 \u001b"+
		"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000!.\u0001\u0000"+
		"\u0000\u0000\"#\n\u0005\u0000\u0000#$\u0007\u0000\u0000\u0000$%\u0003"+
		"\u0004\u0002\u0006%&\u0006\u0002\uffff\uffff\u0000&-\u0001\u0000\u0000"+
		"\u0000\'(\n\u0004\u0000\u0000()\u0007\u0001\u0000\u0000)*\u0003\u0004"+
		"\u0002\u0005*+\u0006\u0002\uffff\uffff\u0000+-\u0001\u0000\u0000\u0000"+
		",\"\u0001\u0000\u0000\u0000,\'\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000"+
		"\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/\u0005\u0001"+
		"\u0000\u0000\u00000.\u0001\u0000\u0000\u000012\u0005\u0007\u0000\u0000"+
		"23\u0003\b\u0004\u000034\u0003\b\u0004\u000045\u0006\u0003\uffff\uffff"+
		"\u00005\u0007\u0001\u0000\u0000\u000067\u0005\u0005\u0000\u000078\u0003"+
		"\u0004\u0002\u000089\u0005\b\u0000\u00009:\u0003\u0004\u0002\u0000:;\u0005"+
		"\u0006\u0000\u0000;<\u0006\u0004\uffff\uffff\u0000<\t\u0001\u0000\u0000"+
		"\u0000\u0004\r ,.";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}