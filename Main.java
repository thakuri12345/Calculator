package awt;
import java.awt.*;
import java.awt.event.*;

public class Calculator{
    public static void main(String[] args) {
        Frame frame = new Frame("Calculator");
        Panel panel = new Panel();
        panel.setLayout(new GridLayout(10, 2));

//         Create components
        Label num1Label = new Label("Enter First Number");
        TextField num1Field = new TextField(10);

        Label num2Label = new Label("Enter Second Number");
        TextField num2Field = new TextField(10);

        Button addPlusButton = new Button("+");
        Button addMinusButton = new Button("-");
        Button addMulButton = new Button("*");
        Button addDivButton = new Button("/");
        Button addEqualButton = new Button("=");
        Label resultLabel = new Label("Result:");

        Label empty = new Label("");

        TextField resultField = new TextField(10);
        TextField resultField1 = new TextField(10);
        TextField resultField2 = new TextField(10);
        TextField resultField3 = new TextField(10);

        resultField.setEditable(false);
        resultField1.setEditable(false);
        resultField2.setEditable(false);
        resultField3.setEditable(false);

//Add components to the panel
        panel.add(num1Label);
        panel.add(num1Field);
        panel.add(num2Label);
        panel.add(num2Field);
        panel.add(addPlusButton);
        panel.add(addMinusButton);
        panel.add(addMulButton);
        panel.add(addDivButton);
        panel.add(addEqualButton);
        panel.add(empty);
        panel.add(resultLabel);
        panel.add(resultField);
        // Add panel to the frame
        frame.add(panel);
        frame.setSize(10, 5);
        frame.setVisible(true);

        // Add action listener to the button
        addEqualButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());

                    addPlusButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            try {
                                double result = num1 + num2;
                                resultField.setText(String.valueOf(result));
                            }
                            catch(NumberFormatException ex){
                                resultField.setText("Invalid input!");
                            }
                        }
                    });

                    addMinusButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            try {
                                double result = num1 - num2;
                                resultField.setText(String.valueOf(result));
                            }
                            catch (NumberFormatException ex) {
                                resultField.setText("Invalid input!");
                            }
                        }

                    });
                    addMulButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            try {
                                double result = num1 * num2;
                                resultField.setText(String.valueOf(result));
                            }
                            catch(NumberFormatException ex){
                                resultField.setText("Invalid input!");
                            }
                        }

                    });
                    addDivButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            try {
                                double result = num1 / num2;
                                resultField.setText(String.valueOf(result));
                            }
                            catch(NumberFormatException ex){
                                resultField.setText("Invalid input!");
                            }
                        }

                    });

                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid input!");
                }
            }
        });

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });
    }
}