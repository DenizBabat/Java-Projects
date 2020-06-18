import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/** TextFieldDemo provides a simple demonstration of data input
*   from a JTextField.
*   @author Koffman & Wolfgang
* */

public class TextFieldDemo
    extends JFrame {

  // Data Field
  JTextField textField;

  // Main Method
  public static void main(String[] args) {
    JFrame aFrame = new TextFieldDemo();
    aFrame.show();
  }

  // Constructor
  private TextFieldDemo() {
    setTitle("Text Field Demo");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // Create a panel for the content pane.
    JPanel aPanel = new JPanel();
    // Add a label.
    aPanel.add(new JLabel("Enter a number"));
    // Create a text field.
    textField = new JTextField(10);
    // Register action listener.
    textField.addActionListener(new NumberEntered());
    // Add it to the panel.
    aPanel.add(textField);
    // Set the panel to be the content pane.
    setContentPane(aPanel);
    // Size the frame.
    pack();
  }

  // Inner Action Listener Class
  private class NumberEntered
      implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      String text = textField.getText();
      int value = 0;
      try {
        value = Integer.parseInt(text);
        System.out.println("Number entered: " + value);
      }
      catch (NumberFormatException ex) {
        System.err.println("Invalid entry " + text);
      }
    }
  }
}
