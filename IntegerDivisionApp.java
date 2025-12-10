
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IntegerDivisionApp {

    public static void main(String[] args) {

        // Frame
        JFrame frame = new JFrame("Integer Division");
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2, 10, 10));

        // Components
        JLabel label1 = new JLabel("Num1:");
        JTextField num1Field = new JTextField();

        JLabel label2 = new JLabel("Num2:");
        JTextField num2Field = new JTextField();

        JLabel resultLabel = new JLabel("Result:");
        JTextField resultField = new JTextField();
        resultField.setEditable(false);

        JButton divideButton = new JButton("Divide");

        // Add action listener
        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());

                    int result = num1 / num2;
                    resultField.setText(String.valueOf(result));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame,
                            "Please enter valid integers!",
                            "Number Format Error",
                            JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(frame,
                            "Cannot divide by ZERO!",
                            "Arithmetic Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Add components to frame
        frame.add(label1);
        frame.add(num1Field);

        frame.add(label2);
        frame.add(num2Field);

        frame.add(resultLabel);
        frame.add(resultField);

        frame.add(divideButton);

        frame.setVisible(true);
    }
}
