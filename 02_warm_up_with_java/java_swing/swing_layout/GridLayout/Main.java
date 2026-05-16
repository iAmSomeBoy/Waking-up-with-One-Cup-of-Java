import javax.swing.*;
import java.awt.*;


class GridLayoutClass{
    JFrame frame;

    GridLayoutClass(){
        frame= new JFrame("Grid Layout Example");

        JButton b1= new JButton("A");
        JButton b2= new JButton("B");
        JButton b3= new JButton("C");
        JButton b4= new JButton("P");
        JButton b5= new JButton("Q");
        JButton b6= new JButton("R");
        JButton b7= new JButton("X");
        JButton b8= new JButton("Y");
        JButton b9= new JButton("Z");

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);

        //GridLayout: row, col
        frame.setLayout(new GridLayout(3, 3));
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}

public class Main {
    public static void main(String[] args){
        new GridLayoutClass();
    }
}
