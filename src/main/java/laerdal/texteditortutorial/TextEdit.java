package laerdal.texteditortutorial;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public final class TextEdit extends JFrame implements ActionListener {
    private static JTextArea area;
    private static JFrame frame;
    private static int returnValue = 0;

    public TextEdit(){
        run();
    }

    public void run(){

            frame = new JFrame("Text Editor");

            // Set attributes of the app window
            area = new JTextArea();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(area);
            frame.setSize(640, 480);
            frame.setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
