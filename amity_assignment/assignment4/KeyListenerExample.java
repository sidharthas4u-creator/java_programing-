import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyListenerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("KeyListener Example");
        JLabel label = new JLabel("Press any key...", SwingConstants.CENTER);

        frame.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                label.setText("Key Pressed: " + e.getKeyChar());
            }
        });

        frame.add(label);
        frame.setSize(300, 200);
        frame.setFocusable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
