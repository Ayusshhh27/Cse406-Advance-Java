import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 2. Class extends JFrame
public class PaintApplication extends JFrame {
    private JComboBox<String> shapeComboBox;
    private JTextField parametersField;
    private JButton drawButton;
    private DrawPanel drawPanel;

    public PaintApplication() {
        initializeComponents(); // 3. Initialize components
        setFrameProperties(); // 6. Set JFrame properties
    }

    private void initializeComponents() {
        JLabel shapeLabel = new JLabel("Select shape:");
        shapeComboBox = new JComboBox<>(new String[] { "Rectangle", "Oval", "Line" });
        JLabel parametersLabel = new JLabel("Enter 4 space-separated integers:");
        parametersField = new JTextField();
        drawButton = new JButton("Draw");

        JPanel controlPanel = new JPanel(new GridLayout(3, 2));
        controlPanel.add(shapeLabel);
        controlPanel.add(shapeComboBox);
        controlPanel.add(parametersLabel);
        controlPanel.add(parametersField);
        controlPanel.add(new JLabel()); // Empty label for spacing
        controlPanel.add(drawButton);

        drawPanel = new DrawPanel();

        // 5. Define ActionListeners
        drawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawPanel.repaint();
            }
        });

        setLayout(new BorderLayout());
        add(controlPanel, BorderLayout.NORTH);
        add(drawPanel, BorderLayout.CENTER); // 4. Add components to frame
    }

    private void setFrameProperties() {
        setTitle("Paint Application");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // 7. Main drawing logic
    private class DrawPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            String shape = (String) shapeComboBox.getSelectedItem();
            String[] params = parametersField.getText().split(" ");
            if (params.length != 4) {
                return; // Do nothing if the input is not exactly 4 integers
            }

            try {
                int x1 = Integer.parseInt(params[0]);
                int y1 = Integer.parseInt(params[1]);
                int x2 = Integer.parseInt(params[2]);
                int y2 = Integer.parseInt(params[3]);

                switch (shape) {
                    case "Rectangle":
                        g.drawRect(x1, y1, x2 - x1, y2 - y1);
                        break;
                    case "Oval":
                        g.drawOval(x1, y1, x2 - x1, y2 - y1);
                        break;
                    case "Line":
                        g.drawLine(x1, y1, x2, y2);
                        break;
                }
            } catch (NumberFormatException e) {
                // Handle invalid input
                JOptionPane.showMessageDialog(PaintApplication.this,
                        "Invalid input. Please enter 4 space-separated integers.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // 8. Class/object invocation
    public static void main(String[] args) {
        new PaintApplication();
    }
}
