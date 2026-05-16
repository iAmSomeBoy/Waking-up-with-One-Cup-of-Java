import javax.swing.*;
import java.awt.*;

public class login_screen {
    public static void main(String[] args) {
        JFrame frame= new JFrame("My Login Page");
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel= new JPanel();
        placeComponents(panel);
        frame.add( panel);

        
        frame.setVisible(true);

    }

    private static void placeComponents(JPanel panel){
        panel.setLayout(null);

        JLabel userLabel= new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        JTextField userText= new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);    
/////--------------------------------------------------------/////
        JLabel passwordLabel= new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);
            
        JPasswordField passwordField= new JPasswordField(20);
        passwordField.setBounds(100, 50, 165, 25);
        panel.add(passwordField);

        //login button
        JButton loginButton= new JButton("Login");
        loginButton.setBounds(130, 110, 80, 25);
        panel.add(loginButton);
    }
}
