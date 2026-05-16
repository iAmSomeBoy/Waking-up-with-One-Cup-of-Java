import javax.swing.*;

public class JButtonExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("JButton");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        JButton button = new JButton("Button");
        button.setBounds(50, 50, 100, 50);
        frame.add(button);
        
        frame.setVisible(true);
    }
}
