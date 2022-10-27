package laerdal.tinyeditor.ast;

import laerdal.tinyeditor.ast.abstracts.ArrowkeyNode;
import laerdal.tinyeditor.visitor.ASTVisitor;

public class ArrowDownNode extends ArrowkeyNode {

    @Override
    public String toString() {
        return "ArrowDown";
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
