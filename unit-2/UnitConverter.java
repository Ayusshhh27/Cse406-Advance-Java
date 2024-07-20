
// Imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// 2. Create a Class that Extends JFrame
public class UnitConverter extends JFrame {
    private JComboBox<String> unitComboBox;
    private JTextField inputField;
    private JTextField resultField;

    // 2. Create a Class that Extends JFrame
    public UnitConverter() {
        initializeComponents(); // 3. Initialize Components
        setFrameProperties(); // 4. Set Frame Properties
    }

    // 3. Initialize Components
    private void initializeComponents() {
        JLabel unitLabel = new JLabel("Select unit:");
        unitComboBox = new JComboBox<>(new String[] { "Centimetre", "Metre" });
        JLabel inputLabel = new JLabel("Enter value:");
        inputField = new JTextField();
        JLabel resultLabel = new JLabel("Result in feet:");
        resultField = new JTextField();
        resultField.setEditable(false);

        // 4. Add components to frame
        setLayout(new GridLayout(3, 2));
        add(unitLabel);
        add(unitComboBox);
        add(inputLabel);
        add(inputField);
        add(resultLabel);
        add(resultField);

        // 5. Define ActionListeners
        inputField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertUnits();
            }
        });

        unitComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertUnits();
            }
        });
    }

    // 6. Set Frame Properties
    private void setFrameProperties() {
        setTitle("Unit Converter");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // 7. Main drawing logic
    private void convertUnits() {
        try {
            double inputValue = Double.parseDouble(inputField.getText());

            String selectedUnit = (String) unitComboBox.getSelectedItem();
            double resultValue = 0;

            if (selectedUnit.equals("Centimetre")) {
                resultValue = inputValue / 30.48;
            } else if (selectedUnit.equals("Metre")) {
                resultValue = inputValue * 3.28084;
            }

            resultField.setText(String.format("%.2f", resultValue));
        } catch (NumberFormatException e) {
            resultField.setText("Invalid input");
        }
    }

    // 8. Class/object invocation
    public static void main(String[] args) {
        new UnitConverter();
    }
}