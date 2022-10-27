package laerdal.tinyeditor.ast;

import laerdal.tinyeditor.ast.abstracts.LetterNode;
import laerdal.tinyeditor.visitor.ASTVisitor;

public class LowerCaseLetterNode extends LetterNode {

    public LowerCaseLetterNode(String letter) {
        super(letter);
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
