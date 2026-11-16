import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingButtonLabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button and Label");
        JButton button = new JButton("Press Me");
        JLabel label = new JLabel("Waiting for click...");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Pressed");
            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.add(label);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
