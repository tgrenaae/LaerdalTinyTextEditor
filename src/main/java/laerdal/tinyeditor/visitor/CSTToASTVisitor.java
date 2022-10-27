package laerdal.tinyeditor.visitor;

import laerdal.tinyeditor.ast.*;
import laerdal.tinyeditor.ast.abstracts.LetterNode;
import laerdal.tinyeditor.ast.abstracts.Node;
import laerdal.tinyeditor.gen.TinyEditorLanguageBaseVisitor;
import laerdal.tinyeditor.gen.TinyEditorLanguageParser;
import java.util.*;

public class CSTToASTVisitor extends TinyEditorLanguageBaseVisitor<Node> {

    @Override public ProgNode visitProg(TinyEditorLanguageParser.ProgContext ctx) {
        ProgNode prog = new ProgNode();
        for(int i = 0; i < ctx.keystroke().size(); i++){
            prog.keyStroke.add(visit(ctx.keystroke().get(i)));
        }

        return prog;
    }

    @Override public Node visitKeystroke(TinyEditorLanguageParser.KeystrokeContext ctx) {
        if (ctx.letter() != null) {
            return visit(ctx.letter());
        } else if (ctx.arrowkey() != null) {
            return visit(ctx.arrowkey());
        } else if (ctx.whitespace() != null) {
            return visit(ctx.whitespace());
        }  else if (ctx.backspace() != null) {
            return visit(ctx.backspace());
        }  else if (ctx.undo() != null) {
            return visit(ctx.undo());
        }
        throw new RuntimeException("Keystroke not valid.");
    }

    @Override public LetterNode visitLetter(TinyEditorLanguageParser.LetterContext ctx) {
        if(ctx.lowercaseletter() != null){
            return new LowerCaseLetterNode(ctx.lowercaseletter().LOWERCASELETTER().getText());
        } else if(ctx.uppercaseletter() != null){
            return new UpperCaseLetterNode(ctx.uppercaseletter().UPPERCASELETTER().getText());
        }
        throw new RuntimeException("Letter not valid.");
    }
    @Override public SpaceNode visitSPACE(TinyEditorLanguageParser.SPACEContext ctx) {
        return new SpaceNode();
    }
    @Override public NewlineNode visitNEWLINE(TinyEditorLanguageParser.NEWLINEContext ctx) {
        return new NewlineNode();
    }
    @Override public ArrowRightNode visitARROWRIGHT(TinyEditorLanguageParser.ARROWRIGHTContext ctx) {
        return new ArrowRightNode();
    }
    @Override public ArrowLeftNode visitARROWLEFT(TinyEditorLanguageParser.ARROWLEFTContext ctx) {
        return new ArrowLeftNode();
    }
    @Override public ArrowUpNode visitARROWUP(TinyEditorLanguageParser.ARROWUPContext ctx) {
        return new ArrowUpNode();
    }
    @Override public ArrowDownNode visitARROWDOWN(TinyEditorLanguageParser.ARROWDOWNContext ctx) {
        return new ArrowDownNode();
    }
    @Override public BackspaceNode visitBackspace(TinyEditorLanguageParser.BackspaceContext ctx) {
        return new BackspaceNode();
    }
    @Override public UndoNode visitUndo(TinyEditorLanguageParser.UndoContext ctx) {

        return new UndoNode();
    }

}
