import java.awt.*;
import java.awt.event.*;

public class WindowAdapterExample {
    public static void main(String[] args) {
        Frame frame = new Frame("WindowAdapter Example");
        Label label = new Label("Close this window to terminate.", Label.CENTER);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println("Application terminates");
                frame.dispose();
                System.exit(0);
            }
        });

        frame.add(label);
        frame.setSize(350, 200);
        frame.setVisible(true);
    }
}
