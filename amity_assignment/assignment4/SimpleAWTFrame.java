import java.awt.*;
import java.awt.event.*;

public class SimpleAWTFrame {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Frame Example");
        Label label = new Label("Welcome to Java GUI", Label.CENTER);

        frame.add(label);
        frame.setSize(300, 200);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
