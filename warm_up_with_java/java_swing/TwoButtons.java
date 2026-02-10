import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TwoButtons {
    private JFrame frame;
    private JLabel label;

    public static void main(String[] args){
        TwoButtons gui= new TwoButtons();
        gui.go();
    }
    public void go(){
        frame= new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton= new JButton("Change Label");
        labelButton.addActionListener(new LabelListener());

        label= new JLabel("I'm a label");
        MyDrawPanel drawPanel = new MyDrawPanel();

        JButton colorButton = new JButton("Change Color");
        colorButton.addActionListener(new ColorListener());

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER,drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);
        frame.setVisible(true);

        frame.setSize(500, 400);
    }

    class LabelListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            label.setText("Ouch!");
        }
    }

    class ColorListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            frame.repaint();
        }
    }

}
