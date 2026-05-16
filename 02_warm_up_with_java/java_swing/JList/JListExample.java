import javax.swing.*;
import java.awt.*;

public class JListExample {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("JList Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Data for the list
        String[] items = {"Apple", "Banana", "Orange", "Mango", "Grapes"};

        // Create JList
        JList<String> list = new JList<>(items);

        // Allow single selection
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add scroll pane
        JScrollPane scrollPane = new JScrollPane(list);

        // Add to frame
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}