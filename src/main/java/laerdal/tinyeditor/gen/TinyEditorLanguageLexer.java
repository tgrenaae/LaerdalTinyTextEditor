// Generated from C:/Users/mymay/Dropbox/AAU/Programmering/Java/TextEditorLaerdal/src/main/java/dk/leardal/tinyeditor\TinyEditorLanguage.g4 by ANTLR 4.10.1
package laerdal.tinyeditor.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TinyEditorLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, NEWLINE=2, ARROWRIGHT=3, ARROWLEFT=4, ARROWUP=5, ARROWDOWN=6, 
		BACKSPACE=7, UNDO=8, LOWERCASELETTER=9, UPPERCASELETTER=10, COMMA=11, 
		WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SPACE", "NEWLINE", "ARROWRIGHT", "ARROWLEFT", "ARROWUP", "ARROWDOWN", 
			"BACKSPACE", "UNDO", "LOWERCASELETTER", "UPPERCASELETTER", "COMMA", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'SPACE'", "'NEWLINE'", "'RIGHT'", "'LEFT'", "'UP'", "'DOWN'", 
			"'BACKSPACE'", "'UNDO'", null, null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACE", "NEWLINE", "ARROWRIGHT", "ARROWLEFT", "ARROWUP", "ARROWDOWN", 
			"BACKSPACE", "UNDO", "LOWERCASELETTER", "UPPERCASELETTER", "COMMA", "WS"
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


	public TinyEditorLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TinyEditorLanguage.g4"; }

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
		"\u0004\u0000\fX\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0004\u000bS\b\u000b\u000b\u000b\f\u000bT\u0001\u000b\u0001"+
		"\u000b\u0000\u0000\f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f"+
		"\u0001\u0000\u0003\u0001\u0000az\u0001\u0000AZ\u0003\u0000\t\n\f\r  X"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0001\u0019"+
		"\u0001\u0000\u0000\u0000\u0003\u001f\u0001\u0000\u0000\u0000\u0005\'\u0001"+
		"\u0000\u0000\u0000\u0007-\u0001\u0000\u0000\u0000\t2\u0001\u0000\u0000"+
		"\u0000\u000b5\u0001\u0000\u0000\u0000\r:\u0001\u0000\u0000\u0000\u000f"+
		"D\u0001\u0000\u0000\u0000\u0011I\u0001\u0000\u0000\u0000\u0013K\u0001"+
		"\u0000\u0000\u0000\u0015M\u0001\u0000\u0000\u0000\u0017R\u0001\u0000\u0000"+
		"\u0000\u0019\u001a\u0005S\u0000\u0000\u001a\u001b\u0005P\u0000\u0000\u001b"+
		"\u001c\u0005A\u0000\u0000\u001c\u001d\u0005C\u0000\u0000\u001d\u001e\u0005"+
		"E\u0000\u0000\u001e\u0002\u0001\u0000\u0000\u0000\u001f \u0005N\u0000"+
		"\u0000 !\u0005E\u0000\u0000!\"\u0005W\u0000\u0000\"#\u0005L\u0000\u0000"+
		"#$\u0005I\u0000\u0000$%\u0005N\u0000\u0000%&\u0005E\u0000\u0000&\u0004"+
		"\u0001\u0000\u0000\u0000\'(\u0005R\u0000\u0000()\u0005I\u0000\u0000)*"+
		"\u0005G\u0000\u0000*+\u0005H\u0000\u0000+,\u0005T\u0000\u0000,\u0006\u0001"+
		"\u0000\u0000\u0000-.\u0005L\u0000\u0000./\u0005E\u0000\u0000/0\u0005F"+
		"\u0000\u000001\u0005T\u0000\u00001\b\u0001\u0000\u0000\u000023\u0005U"+
		"\u0000\u000034\u0005P\u0000\u00004\n\u0001\u0000\u0000\u000056\u0005D"+
		"\u0000\u000067\u0005O\u0000\u000078\u0005W\u0000\u000089\u0005N\u0000"+
		"\u00009\f\u0001\u0000\u0000\u0000:;\u0005B\u0000\u0000;<\u0005A\u0000"+
		"\u0000<=\u0005C\u0000\u0000=>\u0005K\u0000\u0000>?\u0005S\u0000\u0000"+
		"?@\u0005P\u0000\u0000@A\u0005A\u0000\u0000AB\u0005C\u0000\u0000BC\u0005"+
		"E\u0000\u0000C\u000e\u0001\u0000\u0000\u0000DE\u0005U\u0000\u0000EF\u0005"+
		"N\u0000\u0000FG\u0005D\u0000\u0000GH\u0005O\u0000\u0000H\u0010\u0001\u0000"+
		"\u0000\u0000IJ\u0007\u0000\u0000\u0000J\u0012\u0001\u0000\u0000\u0000"+
		"KL\u0007\u0001\u0000\u0000L\u0014\u0001\u0000\u0000\u0000MN\u0005,\u0000"+
		"\u0000NO\u0001\u0000\u0000\u0000OP\u0006\n\u0000\u0000P\u0016\u0001\u0000"+
		"\u0000\u0000QS\u0007\u0002\u0000\u0000RQ\u0001\u0000\u0000\u0000ST\u0001"+
		"\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000"+
		"UV\u0001\u0000\u0000\u0000VW\u0006\u000b\u0000\u0000W\u0018\u0001\u0000"+
		"\u0000\u0000\u0002\u0000T\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}