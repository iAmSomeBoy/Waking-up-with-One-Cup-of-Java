import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame frame= new JFrame("SetBounds Method Test");
        frame.setSize(375, 250);
        frame.setLayout(null);

        JButton button= new JButton("ButtonWithSetBounds");
        button.setBounds(80, 30, 200, 40);
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
