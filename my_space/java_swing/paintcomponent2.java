import java.awt.*;
import java.util.Random;

import javax.swing.*;

public class paintcomponent2 extends JPanel {
    public static void main(String[] args) {
        JFrame frame= new JFrame("My App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new paintcomponent2());
        frame.setSize(600, 800);
        frame.setVisible(true);
    }

    public void paintComponent(Graphics g){
        Graphics2D g2d= (Graphics2D) g;

        Random random= new Random();
        int red= random.nextInt(256);
        int green= random.nextInt(256);
        int blue= random.nextInt(256);
        Color startColor= new Color(red, green, blue);

        red= random.nextInt(256);
        green= random.nextInt(256);
        blue= random.nextInt(256);
        Color endColor= new Color(red, green, blue);

        GradientPaint gradient= new GradientPaint(70, 70, startColor, 150, 150, endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(70, 70, 100, 100);

    }
}
