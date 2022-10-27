package laerdal.tinyeditor.ast;

import laerdal.tinyeditor.ast.abstracts.Node;
import laerdal.tinyeditor.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class ProgNode extends Node {
    public List<Node> keyStroke = new ArrayList<>();

    @Override
    public String toString() {
        return "ProgNode{" +
                "keyStroke=" + keyStroke +
                '}';
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
