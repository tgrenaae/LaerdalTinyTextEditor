package laerdal.tinyeditor.ast;

import laerdal.tinyeditor.ast.abstracts.KeyStrokeNode;
import laerdal.tinyeditor.visitor.ASTVisitor;


public class BackspaceNode extends KeyStrokeNode {

    @Override
    public String toString() {
        return "BackSpace";
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
