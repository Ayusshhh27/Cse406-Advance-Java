import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonExample {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Button Example");
    JButton button = new JButton("Click Me");

    // Using anonymous class
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Button Clicked!");
      }
    });

    // Using lambda expression (Java 8+)
    // button.addActionListener(e -> JOptionPane.showMessageDialog(null, "Button
    // Clicked!"));

    frame.add(button);
    frame.setSize(300, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
