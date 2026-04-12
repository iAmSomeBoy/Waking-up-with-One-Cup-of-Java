import javax.swing.*;

class Example{
    Example(){
        JFrame frame= new JFrame();
        JTextArea t_area= new JTextArea("JText Area: Multi Line texts");
        t_area.setBounds(20, 20, 150, 100);
        frame.add(t_area);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}


public class JText {
    public static void main(String[] args){
        new Example();
    }
}
