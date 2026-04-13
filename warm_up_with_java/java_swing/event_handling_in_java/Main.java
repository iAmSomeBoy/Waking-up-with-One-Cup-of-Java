import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args){
        JFrame frame= new JFrame("Button Click Example");
        final JTextField text_field= new JTextField();
        text_field.setBounds(50, 100, 200, 30); // Set position and size for the text field
        // No need to set bounds when using a layout manager

        JButton click_button = new JButton("Click Me");
        click_button.setBounds(50, 50, 100, 30);
        click_button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                text_field.setText("You Have Clicked Me, bro!!");
            }
        });

        frame.add(click_button);
        frame.add(text_field);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
