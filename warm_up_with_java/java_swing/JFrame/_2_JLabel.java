import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

public class _2_JLabel {
    public static void main(String[] args) {
        JFrame frame= new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 500);

        Container c= frame.getContentPane();
        JLabel label= new JLabel("Username");
        label.setBounds(120, 120, 100, 50);
        label.setText("Password");
        
        Font font= new Font("Arial",Font.PLAIN,25);
        label.setFont(font);

        c.add(label);

    }
}
