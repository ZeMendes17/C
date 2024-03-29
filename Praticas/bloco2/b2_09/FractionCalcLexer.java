// Generated from FractionCalc.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FractionCalcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, Integer=14, String=15, Var=16, 
		WS=17, COMMENT=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "Integer", "String", "Var", "WS", 
			"COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'print'", "'->'", "'('", "')'", "'^'", "'-'", "'/'", "'reduce'", 
			"'read'", "'*'", "':'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "Integer", "String", "Var", "WS", "COMMENT"
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


	public FractionCalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FractionCalc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0012v\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0004\rN\b\r\u000b"+
		"\r\f\rO\u0001\u000e\u0001\u000e\u0005\u000eT\b\u000e\n\u000e\f\u000eW"+
		"\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0004\u000f\\\b\u000f\u000b"+
		"\u000f\f\u000f]\u0001\u0010\u0004\u0010a\b\u0010\u000b\u0010\f\u0010b"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011k\b\u0011\n\u0011\f\u0011n\t\u0011\u0001\u0011\u0003\u0011"+
		"q\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0002Ul\u0000"+
		"\u0012\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012\u0001\u0000\u0003\u0001\u00000"+
		"9\u0003\u0000AZ__az\u0003\u0000\t\n\r\r  {\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0001%\u0001\u0000\u0000\u0000\u0003\'\u0001\u0000"+
		"\u0000\u0000\u0005-\u0001\u0000\u0000\u0000\u00070\u0001\u0000\u0000\u0000"+
		"\t2\u0001\u0000\u0000\u0000\u000b4\u0001\u0000\u0000\u0000\r6\u0001\u0000"+
		"\u0000\u0000\u000f8\u0001\u0000\u0000\u0000\u0011:\u0001\u0000\u0000\u0000"+
		"\u0013A\u0001\u0000\u0000\u0000\u0015F\u0001\u0000\u0000\u0000\u0017H"+
		"\u0001\u0000\u0000\u0000\u0019J\u0001\u0000\u0000\u0000\u001bM\u0001\u0000"+
		"\u0000\u0000\u001dQ\u0001\u0000\u0000\u0000\u001f[\u0001\u0000\u0000\u0000"+
		"!`\u0001\u0000\u0000\u0000#f\u0001\u0000\u0000\u0000%&\u0005;\u0000\u0000"+
		"&\u0002\u0001\u0000\u0000\u0000\'(\u0005p\u0000\u0000()\u0005r\u0000\u0000"+
		")*\u0005i\u0000\u0000*+\u0005n\u0000\u0000+,\u0005t\u0000\u0000,\u0004"+
		"\u0001\u0000\u0000\u0000-.\u0005-\u0000\u0000./\u0005>\u0000\u0000/\u0006"+
		"\u0001\u0000\u0000\u000001\u0005(\u0000\u00001\b\u0001\u0000\u0000\u0000"+
		"23\u0005)\u0000\u00003\n\u0001\u0000\u0000\u000045\u0005^\u0000\u0000"+
		"5\f\u0001\u0000\u0000\u000067\u0005-\u0000\u00007\u000e\u0001\u0000\u0000"+
		"\u000089\u0005/\u0000\u00009\u0010\u0001\u0000\u0000\u0000:;\u0005r\u0000"+
		"\u0000;<\u0005e\u0000\u0000<=\u0005d\u0000\u0000=>\u0005u\u0000\u0000"+
		">?\u0005c\u0000\u0000?@\u0005e\u0000\u0000@\u0012\u0001\u0000\u0000\u0000"+
		"AB\u0005r\u0000\u0000BC\u0005e\u0000\u0000CD\u0005a\u0000\u0000DE\u0005"+
		"d\u0000\u0000E\u0014\u0001\u0000\u0000\u0000FG\u0005*\u0000\u0000G\u0016"+
		"\u0001\u0000\u0000\u0000HI\u0005:\u0000\u0000I\u0018\u0001\u0000\u0000"+
		"\u0000JK\u0005+\u0000\u0000K\u001a\u0001\u0000\u0000\u0000LN\u0007\u0000"+
		"\u0000\u0000ML\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OM\u0001"+
		"\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000P\u001c\u0001\u0000\u0000"+
		"\u0000QU\u0005\"\u0000\u0000RT\t\u0000\u0000\u0000SR\u0001\u0000\u0000"+
		"\u0000TW\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000US\u0001\u0000"+
		"\u0000\u0000VX\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000XY\u0005"+
		"\"\u0000\u0000Y\u001e\u0001\u0000\u0000\u0000Z\\\u0007\u0001\u0000\u0000"+
		"[Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000][\u0001\u0000\u0000"+
		"\u0000]^\u0001\u0000\u0000\u0000^ \u0001\u0000\u0000\u0000_a\u0007\u0002"+
		"\u0000\u0000`_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b`\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000"+
		"de\u0006\u0010\u0000\u0000e\"\u0001\u0000\u0000\u0000fg\u0005/\u0000\u0000"+
		"gh\u0005/\u0000\u0000hl\u0001\u0000\u0000\u0000ik\t\u0000\u0000\u0000"+
		"ji\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000"+
		"\u0000lj\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000"+
		"\u0000\u0000oq\u0005\r\u0000\u0000po\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0005\n\u0000\u0000st\u0001\u0000"+
		"\u0000\u0000tu\u0006\u0011\u0000\u0000u$\u0001\u0000\u0000\u0000\u0007"+
		"\u0000OU]blp\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}