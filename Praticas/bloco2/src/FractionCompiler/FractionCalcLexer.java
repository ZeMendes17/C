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
		WS=17, COMMENT=18, ERROR=19;
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
			"COMMENT", "ERROR"
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
			null, null, "Integer", "String", "Var", "WS", "COMMENT", "ERROR"
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
		"\u0004\u0000\u0013|\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0004\rP\b\r\u000b\r\f\rQ\u0001\u000e\u0001\u000e\u0005\u000eV\b\u000e"+
		"\n\u000e\f\u000eY\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0005\u000f_\b\u000f\n\u000f\f\u000fb\t\u000f\u0001\u0010\u0004\u0010"+
		"e\b\u0010\u000b\u0010\f\u0010f\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0005\u0011o\b\u0011\n\u0011\f\u0011r\t"+
		"\u0011\u0001\u0011\u0003\u0011u\b\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0002Wp\u0000\u0013\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\u0001\u0000\u0004\u0001\u000009\u0003"+
		"\u0000AZ__az\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  \u0081\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0001"+
		"\'\u0001\u0000\u0000\u0000\u0003)\u0001\u0000\u0000\u0000\u0005/\u0001"+
		"\u0000\u0000\u0000\u00072\u0001\u0000\u0000\u0000\t4\u0001\u0000\u0000"+
		"\u0000\u000b6\u0001\u0000\u0000\u0000\r8\u0001\u0000\u0000\u0000\u000f"+
		":\u0001\u0000\u0000\u0000\u0011<\u0001\u0000\u0000\u0000\u0013C\u0001"+
		"\u0000\u0000\u0000\u0015H\u0001\u0000\u0000\u0000\u0017J\u0001\u0000\u0000"+
		"\u0000\u0019L\u0001\u0000\u0000\u0000\u001bO\u0001\u0000\u0000\u0000\u001d"+
		"S\u0001\u0000\u0000\u0000\u001f\\\u0001\u0000\u0000\u0000!d\u0001\u0000"+
		"\u0000\u0000#j\u0001\u0000\u0000\u0000%z\u0001\u0000\u0000\u0000\'(\u0005"+
		";\u0000\u0000(\u0002\u0001\u0000\u0000\u0000)*\u0005p\u0000\u0000*+\u0005"+
		"r\u0000\u0000+,\u0005i\u0000\u0000,-\u0005n\u0000\u0000-.\u0005t\u0000"+
		"\u0000.\u0004\u0001\u0000\u0000\u0000/0\u0005-\u0000\u000001\u0005>\u0000"+
		"\u00001\u0006\u0001\u0000\u0000\u000023\u0005(\u0000\u00003\b\u0001\u0000"+
		"\u0000\u000045\u0005)\u0000\u00005\n\u0001\u0000\u0000\u000067\u0005^"+
		"\u0000\u00007\f\u0001\u0000\u0000\u000089\u0005-\u0000\u00009\u000e\u0001"+
		"\u0000\u0000\u0000:;\u0005/\u0000\u0000;\u0010\u0001\u0000\u0000\u0000"+
		"<=\u0005r\u0000\u0000=>\u0005e\u0000\u0000>?\u0005d\u0000\u0000?@\u0005"+
		"u\u0000\u0000@A\u0005c\u0000\u0000AB\u0005e\u0000\u0000B\u0012\u0001\u0000"+
		"\u0000\u0000CD\u0005r\u0000\u0000DE\u0005e\u0000\u0000EF\u0005a\u0000"+
		"\u0000FG\u0005d\u0000\u0000G\u0014\u0001\u0000\u0000\u0000HI\u0005*\u0000"+
		"\u0000I\u0016\u0001\u0000\u0000\u0000JK\u0005:\u0000\u0000K\u0018\u0001"+
		"\u0000\u0000\u0000LM\u0005+\u0000\u0000M\u001a\u0001\u0000\u0000\u0000"+
		"NP\u0007\u0000\u0000\u0000ON\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000"+
		"\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000R\u001c\u0001"+
		"\u0000\u0000\u0000SW\u0005\"\u0000\u0000TV\t\u0000\u0000\u0000UT\u0001"+
		"\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"WU\u0001\u0000\u0000\u0000XZ\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000"+
		"\u0000Z[\u0005\"\u0000\u0000[\u001e\u0001\u0000\u0000\u0000\\`\u0007\u0001"+
		"\u0000\u0000]_\u0007\u0002\u0000\u0000^]\u0001\u0000\u0000\u0000_b\u0001"+
		"\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000"+
		"a \u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000ce\u0007\u0003\u0000"+
		"\u0000dc\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fd\u0001\u0000"+
		"\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0006"+
		"\u0010\u0000\u0000i\"\u0001\u0000\u0000\u0000jk\u0005/\u0000\u0000kl\u0005"+
		"/\u0000\u0000lp\u0001\u0000\u0000\u0000mo\t\u0000\u0000\u0000nm\u0001"+
		"\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000"+
		"pn\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000"+
		"\u0000su\u0005\r\u0000\u0000ts\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000"+
		"\u0000uv\u0001\u0000\u0000\u0000vw\u0005\n\u0000\u0000wx\u0001\u0000\u0000"+
		"\u0000xy\u0006\u0011\u0000\u0000y$\u0001\u0000\u0000\u0000z{\t\u0000\u0000"+
		"\u0000{&\u0001\u0000\u0000\u0000\u0007\u0000QW`fpt\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}