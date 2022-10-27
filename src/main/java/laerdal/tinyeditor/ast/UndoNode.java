package laerdal.tinyeditor.ast;

import laerdal.tinyeditor.ast.abstracts.KeyStrokeNode;
import laerdal.tinyeditor.visitor.ASTVisitor;

public class UndoNode extends KeyStrokeNode {

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
