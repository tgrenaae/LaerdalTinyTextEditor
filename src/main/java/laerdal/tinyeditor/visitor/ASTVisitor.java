package laerdal.tinyeditor.visitor;

import laerdal.tinyeditor.ast.abstracts.Node;
import laerdal.tinyeditor.ast.*;

public abstract class ASTVisitor {

    public void visit(Node ctx){
        ctx.accept(this);
    }

    public abstract void visit(ProgNode ctx);

    public abstract void visit(LowerCaseLetterNode ctx);

    public abstract void visit(UpperCaseLetterNode ctx);

    public abstract void visit(SpaceNode ctx);

    public abstract void visit(NewlineNode ctx);

    public abstract void visit(ArrowRightNode ctx);

    public abstract void visit(ArrowLeftNode ctx);

    public abstract void visit(ArrowUpNode ctx);

    public abstract void visit(ArrowDownNode ctx);

    public abstract void visit(BackspaceNode ctx);

    public abstract void visit(UndoNode ctx);

}
