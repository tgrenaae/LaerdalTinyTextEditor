package laerdal.tinyeditor.ast.abstracts;

import laerdal.tinyeditor.visitor.ASTVisitor;

public abstract class Node {

    public abstract void accept(ASTVisitor astVisitor);
}
