package laerdal.tinyeditor;

import laerdal.tinyeditor.ast.abstracts.Node;
import laerdal.tinyeditor.gen.TinyEditorLanguageLexer;
import laerdal.tinyeditor.gen.TinyEditorLanguageParser;
import laerdal.tinyeditor.visitor.CSTToASTVisitor;
import laerdal.tinyeditor.visitor.CorrectingVisitor;
import laerdal.tinyeditor.visitor.PrintVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        //LEXER
        CharStream charStream = CharStreams.fromFileName("src/main/java/laerdal/tinyeditor/input/input1.txt");
        TinyEditorLanguageLexer tinyEditorLanguageLexer = new TinyEditorLanguageLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(tinyEditorLanguageLexer);

        //PARSER
        TinyEditorLanguageParser tinyEditorLanguageParser = new TinyEditorLanguageParser(commonTokenStream);
        ParseTree parseTree = tinyEditorLanguageParser.prog();

        //FROM CST TO AST
        CSTToASTVisitor cstToASTVisitor = new CSTToASTVisitor();
        Node astTree = cstToASTVisitor.visit(parseTree);


        //CORRECTING OUTPUT
        CorrectingVisitor correctingVisitor = new CorrectingVisitor();
        astTree.accept(correctingVisitor);

        //PRINTING OUTPUT
        astTree.accept(new PrintVisitor(correctingVisitor.getNodeStack()));



    }
}
