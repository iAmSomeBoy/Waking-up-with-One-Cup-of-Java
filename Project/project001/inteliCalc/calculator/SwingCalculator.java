import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingCalculator extends JFrame {
    private JTextField display;
    private double num1 = 0, num2 = 0, result = 0;
    private char operator = ' ';
    private boolean isNewInput = true;

    public SwingCalculator() {
        setTitle("Java Swing Calculator");
        setSize(320, 420);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));
        ((JPanel) getContentPane()).setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Display Field
        display = new JTextField();
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(new Font("Monospaced", Font.BOLD, 28));
        display.setBackground(Color.WHITE);
        display.setMargin(new Insets(5, 10, 5, 10));
        add(display, BorderLayout.NORTH);

        // Button Panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 8, 8));

        // Standard calculator layout
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", ".", "+"
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.setFont(new Font("Arial", Font.BOLD, 22));
            btn.setFocusPainted(false);
            btn.addActionListener(new ButtonClickListener());
            
            // Style operators differently
            if (text.matches("[/\\*\\-+]")) {
                btn.setBackground(new Color(255, 200, 100));
            } else if (text.equals("C")) {
                btn.setBackground(new Color(255, 100, 100));
                btn.setForeground(Color.WHITE);
            }
            buttonPanel.add(btn);
        }

        // Add equals button spanning the bottom (using a wrapper for simplicity)
        JPanel bottomPanel = new JPanel(new BorderLayout());
        JButton equalsBtn = new JButton("=");
        equalsBtn.setFont(new Font("Arial", Font.BOLD, 22));
        equalsBtn.setFocusPainted(false);
        equalsBtn.setBackground(new Color(100, 200, 100));
        equalsBtn.addActionListener(new ButtonClickListener());
        bottomPanel.add(buttonPanel, BorderLayout.CENTER);
        bottomPanel.add(equalsBtn, BorderLayout.EAST);

        add(bottomPanel, BorderLayout.CENTER);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            // Digit pressed
            if (command.matches("\\d")) {
                if (isNewInput) {
                    display.setText(command);
                    isNewInput = false;
                } else {
                    display.setText(display.getText() + command);
                }
            } 
            // Decimal pressed
            else if (command.equals(".")) {
                if (isNewInput) {
                    display.setText("0.");
                    isNewInput = false;
                } else if (!display.getText().contains(".")) {
                    display.setText(display.getText() + ".");
                }
            } 
            // Clear pressed
            else if (command.equals("C")) {
                display.setText("");
                num1 = 0; num2 = 0; result = 0;
                operator = ' ';
                isNewInput = true;
            } 
            // Equals pressed
            else if (command.equals("=")) {
                if (display.getText().isEmpty()) return;
                num2 = Double.parseDouble(display.getText());
                if (operator == ' ') {
                    result = num2;
                } else {
                    result = calculate(num1, num2, operator);
                    if (result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY) {
                        display.setText("Error");
                        isNewInput = true;
                        operator = ' ';
                        return;
                    }
                }
                display.setText(formatResult(result));
                isNewInput = true;
                operator = ' ';
            } 
            // Operator pressed
            else {
                if (display.getText().isEmpty()) return;
                double current = Double.parseDouble(display.getText());

                // Handle chaining (e.g., 5 + 3 + 2)
                if (operator != ' ') {
                    result = calculate(num1, current, operator);
                    if (result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY) {
                        display.setText("Error");
                        isNewInput = true;
                        operator = ' ';
                        return;
                    }
                    display.setText(formatResult(result));
                    num1 = result;
                } else {
                    num1 = current;
                }
                operator = command.charAt(0);
                isNewInput = true;
            }
        }

        private double calculate(double a, double b, char op) {
            switch (op) {
                case '+': return a + b;
                case '-': return a - b;
                case '*': return a * b;
                case '/': 
                    if (b == 0) return Double.POSITIVE_INFINITY;
                    return a / b;
                default: return b;
            }
        }

        private String formatResult(double res) {
            // Removes unnecessary trailing zeros (e.g., 5.0 -> 5)
            if (res == (long) res) return String.valueOf((long) res);
            return String.valueOf(res);
        }
    }

    public static void main(String[] args) {
        // Ensure thread safety for Swing components
        SwingUtilities.invokeLater(() -> {
            new SwingCalculator().setVisible(true);
        });
    }
}