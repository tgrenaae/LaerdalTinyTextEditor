package laerdal.tinyeditor.visitor;

import laerdal.tinyeditor.ast.*;
import laerdal.tinyeditor.ast.abstracts.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CorrectingVisitor extends ASTVisitor{

    Stack<Node> nodeStack = new Stack<>();

    public Stack<Node> getNodeStack() {
        return nodeStack;
    }

    @Override
    public void visit(ProgNode ctx) {
        for (Node node: ctx.keyStroke) {
            visit(node);
        }
        //System.out.println(nodeStack);
    }

    @Override
    public void visit(LowerCaseLetterNode ctx) {
        nodeStack.push(ctx);

    }

    @Override
    public void visit(UpperCaseLetterNode ctx) {
        nodeStack.push(ctx);
    }

    @Override
    public void visit(SpaceNode ctx) {
        nodeStack.push(ctx);
    }

    @Override
    public void visit(NewlineNode ctx) {
        nodeStack.push(ctx);
    }

    @Override
    public void visit(ArrowRightNode ctx) {
        nodeStack.push(ctx);
    }

    @Override
    public void visit(ArrowLeftNode ctx) {
        nodeStack.push(ctx);
    }

    @Override
    public void visit(ArrowUpNode ctx) {
        nodeStack.push(ctx);
    }

    @Override
    public void visit(ArrowDownNode ctx) {
        nodeStack.push(ctx);
    }

    @Override
    public void visit(BackspaceNode ctx) {
        nodeStack.push(ctx);
    }

    @Override
    public void visit(UndoNode ctx) {
        nodeStack.pop();
    }
}
