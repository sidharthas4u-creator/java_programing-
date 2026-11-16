import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseListenerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MouseListener Example");
        JPanel panel = new JPanel();
        Color defaultColor = panel.getBackground();

        panel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                panel.setBackground(Color.CYAN);
            }

            public void mouseExited(MouseEvent e) {
                panel.setBackground(defaultColor);
            }
        });

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
