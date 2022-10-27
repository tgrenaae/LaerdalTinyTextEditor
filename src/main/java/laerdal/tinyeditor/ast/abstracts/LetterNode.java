package laerdal.tinyeditor.ast.abstracts;

public abstract class LetterNode extends KeyStrokeNode {

    String letter;

    public LetterNode(String letter) {
        this.letter = letter;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    @Override
    public String toString() {
        return this.letter;
    }
}
