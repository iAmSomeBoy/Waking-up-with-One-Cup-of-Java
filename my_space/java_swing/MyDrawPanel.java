import javax.swing.*;
import java.awt.*;

class MyDrawPanel extends JPanel {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Draw Panel");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(new MyDrawPanel());
            frame.setSize(300, 300);
            frame.setVisible(true);
        });
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.orange);
        g.fillRect(20, 50, 100, 100);
    }
}