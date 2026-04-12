import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.net.URL;

public class _2_2_JLabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50, 50, 500, 400);
        frame.setLayout(null);

        JLabel label = new JLabel("Image");
        URL imageUrl = _2_2_JLabel.class.getResource("icon1.jpg");
        ImageIcon image;
        if (imageUrl != null) {
            image = new ImageIcon(imageUrl);
        } else {
            String path = System.getProperty("user.dir") + System.getProperty("file.separator") + "warm_up_with_java" + System.getProperty("file.separator") + "java_swing" + System.getProperty("file.separator") + "icon1.jpg";
            System.err.println("Loading icon from file path: " + path);
            image = new ImageIcon(path);
        }
        label.setIcon(image);
        label.setBounds(0, 0, 500, 200);

        JLabel label2 = new JLabel("Text");
        label2.setBounds(0, 220, 500, 100);

        frame.add(label);
        frame.add(label2);
        frame.setVisible(true);
    }
}
