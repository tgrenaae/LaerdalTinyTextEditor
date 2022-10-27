package laerdal.tinyeditor.visitor;

import laerdal.tinyeditor.ast.abstracts.Node;
import laerdal.tinyeditor.service.Cursor;
import laerdal.tinyeditor.ast.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class PrintVisitor extends ASTVisitor{

    Cursor cursor = new Cursor(0,0);

    Stack<Node> nodeStack;

    public PrintVisitor(Stack<Node> nodeStack) {
        this.nodeStack = nodeStack;
    }

    List<StringBuilder> output = new ArrayList<>();

    @Override
    public void visit(ProgNode ctx) {
        StringBuilder start = new StringBuilder();
        output.add(start);

        //visit all nodes of the AST-stack
        for (Node node: nodeStack) {
            visit(node);
        }

        //outputting the result
        for (StringBuilder line: output) {
            System.out.print(line);
        }
    }

    @Override
    public void visit(LowerCaseLetterNode ctx) {
        output.get(cursor.getLineNr()).insert(cursor.getCharIndex(), ctx.getLetter());
        cursor.setCharIndex(cursor.getCharIndex() +1);
    }

    @Override
    public void visit(UpperCaseLetterNode ctx) {
        output.get(cursor.getLineNr()).insert(cursor.getCharIndex(), ctx.getLetter());
        cursor.setCharIndex(cursor.getCharIndex() +1);
    }

    @Override
    public void visit(SpaceNode ctx) {
        output.get(cursor.getLineNr()).insert(cursor.getCharIndex(), " ");
        cursor.setCharIndex(cursor.getCharIndex() +1);
    }

    @Override
    public void visit(NewlineNode ctx) {
        output.get(cursor.getLineNr()).insert(cursor.getCharIndex(), "\n");
        StringBuilder newLine = new StringBuilder(output.get(cursor.getLineNr()).substring(cursor.getCharIndex()+1,
                                                  output.get(cursor.getLineNr()).length()));
        output.add(newLine);
        output.get(cursor.getLineNr()).delete(cursor.getCharIndex()+1, output.get(cursor.getLineNr()).length());
        cursor.setLineNr(cursor.getLineNr() +1);
        cursor.setCharIndex(0);
    }

    @Override
    public void visit(ArrowRightNode ctx) {
        if(cursor.getCharIndex() == output.get(cursor.getLineNr()).length()-1 && cursor.getLineNr() != output.size() -1){
            cursor.setLineNr(cursor.getLineNr() +1);
            cursor.setCharIndex(0);
        } else{
            cursor.setCharIndex(cursor.getCharIndex() +1);
        }
    }

    @Override
    public void visit(ArrowLeftNode ctx) {
        if(cursor.getCharIndex() == 0 && cursor.getLineNr() != 0){
                cursor.setLineNr(cursor.getLineNr() -1);
                cursor.setCharIndex(cursor.getCharIndex() -1);
        } else{
            cursor.setCharIndex(cursor.getCharIndex() -1);
        }
    }

    @Override
    public void visit(ArrowUpNode ctx) {
        //if not on the topmost line
        if(cursor.getLineNr() > 0){
            if(cursor.getCharIndex() > output.get(cursor.getLineNr()-1).length()-1){
                cursor.setCharIndex(output.get(cursor.getLineNr()-1).length()-1);
            }
            cursor.setLineNr(cursor.getLineNr()-1);
        }
    }

    @Override
    public void visit(ArrowDownNode ctx) {
        if(cursor.getLineNr() < output.size()-1){
            if(cursor.getCharIndex() > output.get(cursor.getLineNr()+1).length()-1){
                cursor.setCharIndex(output.get(cursor.getLineNr()+1).length()-1);
            }
            cursor.setLineNr(cursor.getLineNr() +1);
        }
    }

    @Override
    public void visit(BackspaceNode ctx) {
        //if cursor is at the start of a line, and not the top line
        if(cursor.getCharIndex() == 0 && cursor.getLineNr() != 0){
            //if stringBuilder is empty
            if(output.get(cursor.getLineNr()).isEmpty()){
                output.remove(cursor.getLineNr());
                cursor.setLineNr(cursor.getLineNr()-1);
                cursor.setCharIndex(output.get(cursor.getLineNr()).length() -1);

            }else{
                output.get(cursor.getLineNr()-1).deleteCharAt(output.get(cursor.getLineNr()-1).length()-1);
                cursor.setCharIndex(output.get(cursor.getLineNr()-1).length());
                output.get(cursor.getLineNr()-1).append(output.get(cursor.getLineNr()));
                output.remove(cursor.getLineNr());
                cursor.setLineNr(cursor.getLineNr()-1);
            }

        //if the cursor is somewhere within a line
        } else if(cursor.getCharIndex() > 0){
            output.get(cursor.getLineNr()).deleteCharAt(cursor.getCharIndex()-1);
            cursor.setCharIndex(cursor.getCharIndex() -1);
        }
    }

    @Override
    public void visit(UndoNode ctx) {

    }
}
