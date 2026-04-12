import java.awt.Color;
import java.awt.Container;

import javax.swing.*;
import javax.swing.ImageIcon;

public class _1_JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //frame.setLocation(100, 100);
    //frame.setSize(700, 500);    
    frame.setBounds(100, 100, 700, 500);
    frame.setTitle("My Frame");
    
    ImageIcon icon= new ImageIcon("icon1.jpg");
    frame.setIconImage(icon.getImage());

    Container c = frame.getContentPane();
    //Color c= new Color(255, 0, 0);
    c.setBackground(Color.red);
    frame.setResizable(false);
    


    }
}
