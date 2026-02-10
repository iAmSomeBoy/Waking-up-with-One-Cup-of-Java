import javax.swing.*;

public class SimpleGui1 {
    public static void main(String[] args){
        JFrame frame = new JFrame("My App");
        JButton button= new JButton("Click Me");
    
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300, 600);
        frame.setVisible(true);

    }
}
