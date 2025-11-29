import javax.swing.*;
import java.awt.*;

class MyDrawPanel extends JPanel {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Draw Panel");
        JButton button= new JButton();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.getContentPane().add(new MyDrawPanel());        
        frame.setSize(750, 800);
        frame.setVisible(true);

    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect(5, 5, 100, 200);
    }
}