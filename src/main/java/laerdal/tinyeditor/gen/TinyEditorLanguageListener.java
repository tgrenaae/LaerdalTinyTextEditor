// Generated from C:/Users/mymay/Dropbox/AAU/Programmering/Java/TextEditorLaerdal/src/main/java/dk/leardal/tinyeditor\TinyEditorLanguage.g4 by ANTLR 4.10.1
package laerdal.tinyeditor.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TinyEditorLanguageParser}.
 */
public interface TinyEditorLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TinyEditorLanguageParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(TinyEditorLanguageParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyEditorLanguageParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(TinyEditorLanguageParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyEditorLanguageParser#keystroke}.
	 * @param ctx the parse tree
	 */
	void enterKeystroke(TinyEditorLanguageParser.KeystrokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyEditorLanguageParser#keystroke}.
	 * @param ctx the parse tree
	 */
	void exitKeystroke(TinyEditorLanguageParser.KeystrokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyEditorLanguageParser#letter}.
	 * @param ctx the parse tree
	 */
	void enterLetter(TinyEditorLanguageParser.LetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyEditorLanguageParser#letter}.
	 * @param ctx the parse tree
	 */
	void exitLetter(TinyEditorLanguageParser.LetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyEditorLanguageParser#lowercaseletter}.
	 * @param ctx the parse tree
	 */
	void enterLowercaseletter(TinyEditorLanguageParser.LowercaseletterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyEditorLanguageParser#lowercaseletter}.
	 * @param ctx the parse tree
	 */
	void exitLowercaseletter(TinyEditorLanguageParser.LowercaseletterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyEditorLanguageParser#uppercaseletter}.
	 * @param ctx the parse tree
	 */
	void enterUppercaseletter(TinyEditorLanguageParser.UppercaseletterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyEditorLanguageParser#uppercaseletter}.
	 * @param ctx the parse tree
	 */
	void exitUppercaseletter(TinyEditorLanguageParser.UppercaseletterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SPACE}
	 * labeled alternative in {@link TinyEditorLanguageParser#whitespace}.
	 * @param ctx the parse tree
	 */
	void enterSPACE(TinyEditorLanguageParser.SPACEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SPACE}
	 * labeled alternative in {@link TinyEditorLanguageParser#whitespace}.
	 * @param ctx the parse tree
	 */
	void exitSPACE(TinyEditorLanguageParser.SPACEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NEWLINE}
	 * labeled alternative in {@link TinyEditorLanguageParser#whitespace}.
	 * @param ctx the parse tree
	 */
	void enterNEWLINE(TinyEditorLanguageParser.NEWLINEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NEWLINE}
	 * labeled alternative in {@link TinyEditorLanguageParser#whitespace}.
	 * @param ctx the parse tree
	 */
	void exitNEWLINE(TinyEditorLanguageParser.NEWLINEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ARROWRIGHT}
	 * labeled alternative in {@link TinyEditorLanguageParser#arrowkey}.
	 * @param ctx the parse tree
	 */
	void enterARROWRIGHT(TinyEditorLanguageParser.ARROWRIGHTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ARROWRIGHT}
	 * labeled alternative in {@link TinyEditorLanguageParser#arrowkey}.
	 * @param ctx the parse tree
	 */
	void exitARROWRIGHT(TinyEditorLanguageParser.ARROWRIGHTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ARROWLEFT}
	 * labeled alternative in {@link TinyEditorLanguageParser#arrowkey}.
	 * @param ctx the parse tree
	 */
	void enterARROWLEFT(TinyEditorLanguageParser.ARROWLEFTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ARROWLEFT}
	 * labeled alternative in {@link TinyEditorLanguageParser#arrowkey}.
	 * @param ctx the parse tree
	 */
	void exitARROWLEFT(TinyEditorLanguageParser.ARROWLEFTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ARROWUP}
	 * labeled alternative in {@link TinyEditorLanguageParser#arrowkey}.
	 * @param ctx the parse tree
	 */
	void enterARROWUP(TinyEditorLanguageParser.ARROWUPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ARROWUP}
	 * labeled alternative in {@link TinyEditorLanguageParser#arrowkey}.
	 * @param ctx the parse tree
	 */
	void exitARROWUP(TinyEditorLanguageParser.ARROWUPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ARROWDOWN}
	 * labeled alternative in {@link TinyEditorLanguageParser#arrowkey}.
	 * @param ctx the parse tree
	 */
	void enterARROWDOWN(TinyEditorLanguageParser.ARROWDOWNContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ARROWDOWN}
	 * labeled alternative in {@link TinyEditorLanguageParser#arrowkey}.
	 * @param ctx the parse tree
	 */
	void exitARROWDOWN(TinyEditorLanguageParser.ARROWDOWNContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyEditorLanguageParser#backspace}.
	 * @param ctx the parse tree
	 */
	void enterBackspace(TinyEditorLanguageParser.BackspaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyEditorLanguageParser#backspace}.
	 * @param ctx the parse tree
	 */
	void exitBackspace(TinyEditorLanguageParser.BackspaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyEditorLanguageParser#undo}.
	 * @param ctx the parse tree
	 */
	void enterUndo(TinyEditorLanguageParser.UndoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyEditorLanguageParser#undo}.
	 * @param ctx the parse tree
	 */
	void exitUndo(TinyEditorLanguageParser.UndoContext ctx);
}