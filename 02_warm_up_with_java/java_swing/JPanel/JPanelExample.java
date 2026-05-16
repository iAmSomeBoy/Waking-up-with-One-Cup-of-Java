import javax.swing.*;

class jPanel{
    jPanel(){
        JFrame frame= new JFrame("Panel is for Partition");
        JPanel panel= new JPanel();
        panel.setBounds(40, 20, 200, 200);
        JButtoN b= new JButtoN("panel Area");
        b.setBounds(50 ,60,20 , 10);
        panel.add(b);
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

public class JPanelExample {
    public static void main(String[] args){
        new jPanel();
    }
}
