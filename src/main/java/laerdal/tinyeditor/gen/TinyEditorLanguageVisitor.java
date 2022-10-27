// Generated from C:/Users/mymay/Dropbox/AAU/Programmering/Java/TextEditorLaerdal/src/main/java/dk/leardal/tinyeditor\TinyEditorLanguage.g4 by ANTLR 4.10.1
package laerdal.tinyeditor.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TinyEditorLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TinyEditorLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TinyEditorLanguageParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(TinyEditorLanguageParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyEditorLanguageParser#keystroke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeystroke(TinyEditorLanguageParser.KeystrokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyEditorLanguageParser#letter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetter(TinyEditorLanguageParser.LetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyEditorLanguageParser#lowercaseletter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLowercaseletter(TinyEditorLanguageParser.LowercaseletterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyEditorLanguageParser#uppercaseletter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUppercaseletter(TinyEditorLanguageParser.UppercaseletterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SPACE}
	 * labeled alternative in {@link TinyEditorLanguageParser#whitespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSPACE(TinyEditorLanguageParser.SPACEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NEWLINE}
	 * labeled alternative in {@link TinyEditorLanguageParser#whitespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNEWLINE(TinyEditorLanguageParser.NEWLINEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ARROWRIGHT}
	 * labeled alternative in {@link TinyEditorLanguageParser#arrowkey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitARROWRIGHT(TinyEditorLanguageParser.ARROWRIGHTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ARROWLEFT}
	 * labeled alternative in {@link TinyEditorLanguageParser#arrowkey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitARROWLEFT(TinyEditorLanguageParser.ARROWLEFTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ARROWUP}
	 * labeled alternative in {@link TinyEditorLanguageParser#arrowkey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitARROWUP(TinyEditorLanguageParser.ARROWUPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ARROWDOWN}
	 * labeled alternative in {@link TinyEditorLanguageParser#arrowkey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitARROWDOWN(TinyEditorLanguageParser.ARROWDOWNContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyEditorLanguageParser#backspace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackspace(TinyEditorLanguageParser.BackspaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyEditorLanguageParser#undo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUndo(TinyEditorLanguageParser.UndoContext ctx);
}