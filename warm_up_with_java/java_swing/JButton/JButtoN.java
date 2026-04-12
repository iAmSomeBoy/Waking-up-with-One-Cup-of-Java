import javax.swing.*;

public class JButtonExample {
    public static void main(String[] args){

        JFrame frame= new JFrame("JButton");
        JButton button= new JButton("Button");
        button.setBounds(50, 50, 100, 50);
        frame.add(button);
        frame.setSize(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
