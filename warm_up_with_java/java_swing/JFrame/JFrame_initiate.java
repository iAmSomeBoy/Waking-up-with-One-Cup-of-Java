import javax.swing.*;

public class JFrame_initiate {
    public static void main(String[] args){
        JFrame f= new JFrame("JFrame Instance");
        JButtoN b= new JButtoN("JFrame Button");
        b.setBounds(100, 50, 100, 40);
        f.add(b);
        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);

    }
}
