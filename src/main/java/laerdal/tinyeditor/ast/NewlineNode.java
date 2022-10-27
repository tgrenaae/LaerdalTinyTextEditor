package laerdal.tinyeditor.ast;

import laerdal.tinyeditor.ast.abstracts.WhiteSpaceNode;
import laerdal.tinyeditor.visitor.ASTVisitor;

public class NewlineNode extends WhiteSpaceNode {

    @Override
    public String toString() {
        return "NewLine";
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
