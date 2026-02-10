import javax.swing.*;
import java.awt.*;

class MyDrawPanel2 extends JPanel {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Draw Panel");
        //JButton button= new JButton();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new MyDrawPanel());        
        frame.setSize(750, 800);
        frame.setVisible(true);

    }

    public void paintComponent(Graphics g) {
        Image image= new ImageIcon("littleanimal2.jpg").getImage();
        g.drawImage(image, 0, 0, this);
        g.setColor(Color.orange);
        g.fillRect(20, 30, 100, 200);
    }
}