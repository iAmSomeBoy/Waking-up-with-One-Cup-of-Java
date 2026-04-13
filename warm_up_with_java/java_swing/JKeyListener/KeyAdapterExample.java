import javax.swing.*;
import java.awt.event.*;

public class KeyAdapterExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("KeyAdapter Example");
        JTextField textField = new JTextField();

        textField.setBounds(50, 50, 200, 30);

        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed: " + e.getKeyChar());
            }
        });

        frame.add(textField);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}