import javax.swing.*;

class ComboBoxExample{

    JFrame frame;

    ComboBoxExample(){
        frame = new JFrame(" ComboBox Example");

        String[] country={"India", "Bangladesh", "Srilanka", "Singapure","Libea"};
        JComboBox countries= new JComboBox(country);
        countries.setBounds(50, 50, 90, 20);
        frame.add(countries);
        frame.setLayout(null);
        frame.setSize(200, 300);
        frame.setVisible(true);
        
    }
}

public class Main {
    public static void main(String[] args){
        new ComboBoxExample();
    }
}
