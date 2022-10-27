package laerdal.tinyeditor.service;

public class Cursor {
    int charIndex;
    int lineNr;


    public Cursor(int charIndex, int lineNr) {
        this.charIndex = charIndex;
        this.lineNr = lineNr;
    }

    public int getCharIndex() {
        return charIndex;
    }

    public void setCharIndex(int charIndex) {
        this.charIndex = charIndex;
    }

    public int getLineNr() {
        return lineNr;
    }

    public void setLineNr(int lineNr) {
        this.lineNr = lineNr;
    }
}
