// Generated from C:/Users/mymay/Dropbox/AAU/Programmering/Java/TextEditorLaerdal/src/main/java/dk/leardal/tinyeditor\TinyEditorLanguage.g4 by ANTLR 4.10.1
package laerdal.tinyeditor.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TinyEditorLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, NEWLINE=2, ARROWRIGHT=3, ARROWLEFT=4, ARROWUP=5, ARROWDOWN=6, 
		BACKSPACE=7, UNDO=8, LOWERCASELETTER=9, UPPERCASELETTER=10, COMMA=11, 
		WS=12;
	public static final int
		RULE_prog = 0, RULE_keystroke = 1, RULE_letter = 2, RULE_lowercaseletter = 3, 
		RULE_uppercaseletter = 4, RULE_whitespace = 5, RULE_arrowkey = 6, RULE_backspace = 7, 
		RULE_undo = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "keystroke", "letter", "lowercaseletter", "uppercaseletter", 
			"whitespace", "arrowkey", "backspace", "undo"
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

	@Override
	public String getGrammarFileName() { return "TinyEditorLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TinyEditorLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<KeystrokeContext> keystroke() {
			return getRuleContexts(KeystrokeContext.class);
		}
		public KeystrokeContext keystroke(int i) {
			return getRuleContext(KeystrokeContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyEditorLanguageListener ) ((TinyEditorLanguageListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyEditorLanguageListener ) ((TinyEditorLanguageListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyEditorLanguageVisitor ) return ((TinyEditorLanguageVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << NEWLINE) | (1L << ARROWRIGHT) | (1L << ARROWLEFT) | (1L << ARROWUP) | (1L << ARROWDOWN) | (1L << BACKSPACE) | (1L << UNDO) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER))) != 0)) {
				{
				{
				setState(18);
				keystroke();
				}
				}
				setState(23);
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

	public static class KeystrokeContext extends ParserRuleContext {
		public LetterContext letter() {
			return getRuleContext(LetterContext.class,0);
		}
		public WhitespaceContext whitespace() {
			return getRuleContext(WhitespaceContext.class,0);
		}
		public ArrowkeyContext arrowkey() {
			return getRuleContext(ArrowkeyContext.class,0);
		}
		public BackspaceContext backspace() {
			return getRuleContext(BackspaceContext.class,0);
		}
		public UndoContext undo() {
			return getRuleContext(UndoContext.class,0);
		}
		public KeystrokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keystroke; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyEditorLanguageListener ) ((TinyEditorLanguageListener)listener).enterKeystroke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyEditorLanguageListener ) ((TinyEditorLanguageListener)listener).exitKeystroke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyEditorLanguageVisitor ) return ((TinyEditorLanguageVisitor<? extends T>)visitor).visitKeystroke(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeystrokeContext keystroke() throws RecognitionException {
		KeystrokeContext _localctx = new KeystrokeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_keystroke);
		try {
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERCASELETTER:
			case UPPERCASELETTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				letter();
				}
				break;
			case SPACE:
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				whitespace();
				}
				break;
			case ARROWRIGHT:
			case ARROWLEFT:
			case ARROWUP:
			case ARROWDOWN:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				arrowkey();
				}
				break;
			case BACKSPACE:
				enterOuterAlt(_localctx, 4);
				{
				setState(27);
				backspace();
				}
				break;
			case UNDO:
				enterOuterAlt(_localctx, 5);
				{
				setState(28);
				undo();
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

	public static class LetterContext extends ParserRuleContext {
		public LowercaseletterContext lowercaseletter() {
			return getRuleContext(LowercaseletterContext.class,0);
		}
		public UppercaseletterContext uppercaseletter() {
			return getRuleContext(UppercaseletterContext.class,0);
		}
		public LetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyEditorLanguageListener ) ((TinyEditorLanguageListener)listener).enterLetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyEditorLanguageListener ) ((TinyEditorLanguageListener)listener).exitLetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyEditorLanguageVisitor ) return ((TinyEditorLanguageVisitor<? extends T>)visitor).visitLetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetterContext letter() throws RecognitionException {
		LetterContext _localctx = new LetterContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_letter);
		try {
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERCASELETTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				lowercaseletter();
				}
				break;
			case UPPERCASELETTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				uppercaseletter();
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

	public static class LowercaseletterContext extends ParserRuleContext {
		public TerminalNode LOWERCASELETTER() { return getToken(TinyEditorLanguageParser.LOWERCASELETTER, 0); }
		public LowercaseletterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lowercaseletter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyEditorLanguageListener ) ((TinyEditorLanguageListener)listener).enterLowercaseletter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyEditorLanguageListener ) ((TinyEditorLanguageListener)listener).exitLowercaseletter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyEditorLanguageVisitor ) return ((TinyEditorLanguageVisitor<? extends T>)visitor).visitLowercaseletter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LowercaseletterContext lowercaseletter() throws RecognitionException {
		LowercaseletterContext _localctx = new LowercaseletterContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lowercaseletter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(LOWERCASELETTER);
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

	public static class UppercaseletterContext extends ParserRuleContext {
		public TerminalNode UPPERCASELETTER() { return getToken(TinyEditorLanguageParser.UPPERCASELETTER, 0); }
		public UppercaseletterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uppercaseletter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyEditorLanguageListener ) ((TinyEditorLanguageListener)listener).enterUppercaseletter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyEditorLanguageListener ) ((TinyEditorLanguageListener)listener).exitUppercaseletter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyEditorLanguageVisitor ) return ((TinyEditorLanguageVisitor<? extends T>)visitor).visitUppercaseletter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UppercaseletterContext uppercaseletter() throws RecognitionException {
		UppercaseletterContext _localctx = new UppercaseletterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_uppercaseletter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(UPPERCASELETTER);
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

	public static class WhitespaceContext extends ParserRuleContext {
		public WhitespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whitespace; }
	 
		public WhitespaceContext() { }
		public void copyFrom(WhitespaceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SPACEContext extends WhitespaceContext {
		public TerminalNode SPACE() { return getToken(TinyEditorLanguageParser.SPACE, 0); }
		public SPACEContext(WhitespaceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyEditorLanguageListener ) ((TinyEditorLanguageListener)listener).enterSPACE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyEditorLanguageListener ) ((TinyEditorLanguageListener)listener).exitSPACE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyEditorLanguageVisitor ) return ((TinyEditorLanguageVisitor<? extends T>)visitor).visitSPACE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NEWLINEContext extends WhitespaceContext {
		public TerminalNode NEWLINE() { return getToken(TinyEditorLanguageParser.NEWLINE, 0); }
		public NEWLINEContext(WhitespaceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyEditorLanguageListener ) ((TinyEditorLanguageListener)listener).enterNEWLINE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyEditorLanguageListener ) ((TinyEditorLanguageListener)listener).exitNEWLINE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyEditorLanguageVisitor ) return ((TinyEditorLanguageVisitor<? extends T>)visitor).visitNEWLINE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhitespaceContext whitespace() throws RecognitionException {
		WhitespaceContext _localctx = new WhitespaceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whitespace);
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SPACE:
				_localctx = new SPACEContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				match(SPACE);
				}
				break;
			case NEWLINE:
				_localctx = new NEWLINEContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				match(NEWLINE);
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

	public static class ArrowkeyContext extends ParserRuleContext {
		public ArrowkeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowkey; }
	 
		public ArrowkeyContext() { }
		public void copyFrom(ArrowkeyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ARROWDOWNContext extends ArrowkeyContext {
		public TerminalNode ARROWDOWN() { return getToken(TinyEditorLanguageParser.ARROWDOWN, 0); }
		public ARROWDOWNContext(ArrowkeyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyEditorLanguageListener ) ((TinyEditorLanguageListener)listener).enterARROWDOWN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyEditorLanguageListener ) ((TinyEditorLanguageListener)listener).exitARROWDOWN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyEditorLanguageVisitor ) return ((TinyEditorLanguageVisitor<? extends T>)visitor).visitARROWDOWN(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ARROWRIGHTContext extends ArrowkeyContext {
		public TerminalNode ARROWRIGHT() { return getToken(TinyEditorLanguageParser.ARROWRIGHT, 0); }
		public ARROWRIGHTContext(ArrowkeyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyEditorLanguageListener ) ((TinyEditorLanguageListener)listener).enterARROWRIGHT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyEditorLanguageListener ) ((TinyEditorLanguageListener)listener).exitARROWRIGHT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyEditorLanguageVisitor ) return ((TinyEditorLanguageVisitor<? extends T>)visitor).visitARROWRIGHT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ARROWLEFTContext extends ArrowkeyContext {
		public TerminalNode ARROWLEFT() { return getToken(TinyEditorLanguageParser.ARROWLEFT, 0); }
		public ARROWLEFTContext(ArrowkeyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyEditorLanguageListener ) ((TinyEditorLanguageListener)listener).enterARROWLEFT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyEditorLanguageListener ) ((TinyEditorLanguageListener)listener).exitARROWLEFT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyEditorLanguageVisitor ) return ((TinyEditorLanguageVisitor<? extends T>)visitor).visitARROWLEFT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ARROWUPContext extends ArrowkeyContext {
		public TerminalNode ARROWUP() { return getToken(TinyEditorLanguageParser.ARROWUP, 0); }
		public ARROWUPContext(ArrowkeyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyEditorLanguageListener ) ((TinyEditorLanguageListener)listener).enterARROWUP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyEditorLanguageListener ) ((TinyEditorLanguageListener)listener).exitARROWUP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyEditorLanguageVisitor ) return ((TinyEditorLanguageVisitor<? extends T>)visitor).visitARROWUP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowkeyContext arrowkey() throws RecognitionException {
		ArrowkeyContext _localctx = new ArrowkeyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arrowkey);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARROWRIGHT:
				_localctx = new ARROWRIGHTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				match(ARROWRIGHT);
				}
				break;
			case ARROWLEFT:
				_localctx = new ARROWLEFTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(ARROWLEFT);
				}
				break;
			case ARROWUP:
				_localctx = new ARROWUPContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				match(ARROWUP);
				}
				break;
			case ARROWDOWN:
				_localctx = new ARROWDOWNContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				match(ARROWDOWN);
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

	public static class BackspaceContext extends ParserRuleContext {
		public TerminalNode BACKSPACE() { return getToken(TinyEditorLanguageParser.BACKSPACE, 0); }
		public BackspaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backspace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyEditorLanguageListener ) ((TinyEditorLanguageListener)listener).enterBackspace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyEditorLanguageListener ) ((TinyEditorLanguageListener)listener).exitBackspace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyEditorLanguageVisitor ) return ((TinyEditorLanguageVisitor<? extends T>)visitor).visitBackspace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BackspaceContext backspace() throws RecognitionException {
		BackspaceContext _localctx = new BackspaceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_backspace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(BACKSPACE);
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

	public static class UndoContext extends ParserRuleContext {
		public TerminalNode UNDO() { return getToken(TinyEditorLanguageParser.UNDO, 0); }
		public UndoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_undo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyEditorLanguageListener ) ((TinyEditorLanguageListener)listener).enterUndo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyEditorLanguageListener ) ((TinyEditorLanguageListener)listener).exitUndo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyEditorLanguageVisitor ) return ((TinyEditorLanguageVisitor<? extends T>)visitor).visitUndo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UndoContext undo() throws RecognitionException {
		UndoContext _localctx = new UndoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_undo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(UNDO);
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
		"\u0004\u0001\f6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000\u0017"+
		"\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u001e\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002\"\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003"+
		"\u0005*\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u00060\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0000"+
		"\u0000\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u00006\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0002\u001d\u0001\u0000\u0000\u0000\u0004"+
		"!\u0001\u0000\u0000\u0000\u0006#\u0001\u0000\u0000\u0000\b%\u0001\u0000"+
		"\u0000\u0000\n)\u0001\u0000\u0000\u0000\f/\u0001\u0000\u0000\u0000\u000e"+
		"1\u0001\u0000\u0000\u0000\u00103\u0001\u0000\u0000\u0000\u0012\u0014\u0003"+
		"\u0002\u0001\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014\u0017\u0001"+
		"\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001"+
		"\u0000\u0000\u0000\u0016\u0001\u0001\u0000\u0000\u0000\u0017\u0015\u0001"+
		"\u0000\u0000\u0000\u0018\u001e\u0003\u0004\u0002\u0000\u0019\u001e\u0003"+
		"\n\u0005\u0000\u001a\u001e\u0003\f\u0006\u0000\u001b\u001e\u0003\u000e"+
		"\u0007\u0000\u001c\u001e\u0003\u0010\b\u0000\u001d\u0018\u0001\u0000\u0000"+
		"\u0000\u001d\u0019\u0001\u0000\u0000\u0000\u001d\u001a\u0001\u0000\u0000"+
		"\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001c\u0001\u0000\u0000"+
		"\u0000\u001e\u0003\u0001\u0000\u0000\u0000\u001f\"\u0003\u0006\u0003\u0000"+
		" \"\u0003\b\u0004\u0000!\u001f\u0001\u0000\u0000\u0000! \u0001\u0000\u0000"+
		"\u0000\"\u0005\u0001\u0000\u0000\u0000#$\u0005\t\u0000\u0000$\u0007\u0001"+
		"\u0000\u0000\u0000%&\u0005\n\u0000\u0000&\t\u0001\u0000\u0000\u0000\'"+
		"*\u0005\u0001\u0000\u0000(*\u0005\u0002\u0000\u0000)\'\u0001\u0000\u0000"+
		"\u0000)(\u0001\u0000\u0000\u0000*\u000b\u0001\u0000\u0000\u0000+0\u0005"+
		"\u0003\u0000\u0000,0\u0005\u0004\u0000\u0000-0\u0005\u0005\u0000\u0000"+
		".0\u0005\u0006\u0000\u0000/+\u0001\u0000\u0000\u0000/,\u0001\u0000\u0000"+
		"\u0000/-\u0001\u0000\u0000\u0000/.\u0001\u0000\u0000\u00000\r\u0001\u0000"+
		"\u0000\u000012\u0005\u0007\u0000\u00002\u000f\u0001\u0000\u0000\u0000"+
		"34\u0005\b\u0000\u00004\u0011\u0001\u0000\u0000\u0000\u0005\u0015\u001d"+
		"!)/";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}