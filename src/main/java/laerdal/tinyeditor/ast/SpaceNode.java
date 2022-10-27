package laerdal.tinyeditor.ast;

import laerdal.tinyeditor.ast.abstracts.WhiteSpaceNode;
import laerdal.tinyeditor.visitor.ASTVisitor;

public class SpaceNode extends WhiteSpaceNode {
    @Override
    public String toString() {
        return " ";
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
