
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntegerDivisionApp {

    public static void main(String[] args) {
        // Create a frame for the user interface
        JFrame frame = new JFrame("Integer Division");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        // Create text fields for entering numbers
        JTextField num1Field = new JTextField(10);
        JTextField num2Field = new JTextField(10);

        // Create a label to display the result
        JLabel resultLabel = new JLabel("Result: ");

        // Create a button to perform division
        JButton divideButton = new JButton("Divide");

        // Add components to the frame
        frame.add(new JLabel("Num1:"));
        frame.add(num1Field);
        frame.add(new JLabel("Num2:"));
        frame.add(num2Field);
        frame.add(divideButton);
        frame.add(resultLabel);

        // Add action listener for the divide button
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Parse the input numbers as integers
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());

                    // Perform the division and update the result label
                    int result = num1 / num2;
                    resultLabel.setText("Result: " + result);

                } catch (NumberFormatException ex) {
                    // Handle non-integer input
                    JOptionPane.showMessageDialog(frame, "Error: Please enter valid integers.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ex) {
                    // Handle division by zero
                    JOptionPane.showMessageDialog(frame, "Error: Division by zero is not allowed.", "Arithmetic Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
