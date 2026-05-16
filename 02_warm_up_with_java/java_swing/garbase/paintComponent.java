import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class paintComponent extends JPanel{
    public static void main(String[] args){
        JFrame frame= new JFrame("My APP");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new paintComponent());
        frame.setSize(600, 800);
        frame.setVisible(true);

    }
    public void paint(Graphics g){
        g.fillRect(0, 0, this.getWidth(), this.getHeight());

        Random random= new Random();
        int red= random.nextInt(256);
        int green= random.nextInt(256);
        int blue= random.nextInt(256);

        Color randomColor= new Color(red, green, blue);
        g.setColor(randomColor);
        g.fillOval(70, 70, 100, 100);
    }
}