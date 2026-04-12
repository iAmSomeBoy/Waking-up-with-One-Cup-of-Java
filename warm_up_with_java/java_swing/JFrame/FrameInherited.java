import javax.swing.*;

class framE extends JFrame{
    JFrame f;
    framE(){
        JButton b= new JButton("JFrame Button");
        b.setBounds(50, 20, 100, 25);

        add(b);
        setSize(300, 200);
        setLayout(null);
        setVisible(true);
    }
}


public class FrameInherited {
    public static void main(String[] args){
        new framE();
    }
    
}
