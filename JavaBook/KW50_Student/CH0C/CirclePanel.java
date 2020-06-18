import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/** A CirclePanel will contain a circle and a button.
*   @author Koffman & Wolfgang
* */

public class CirclePanel
    extends JPanel {

  // Data Fields
  /** The button object */
  JButton onOffButton;
  /** The Circle object */
  MyCircle theCircle;

  // Constructor
  /** Construct a CirclePanel object. */
  public CirclePanel(int size) {
    setLayout(new BorderLayout());
    theCircle = new MyCircle(size);
    onOffButton = new JButton("On / Off");
    onOffButton.addActionListener(new ToggleState());
    add(theCircle, BorderLayout.CENTER);
    add(onOffButton, BorderLayout.SOUTH);
  }

  // Inner Class
  /** The action listener for the button. */
  private class ToggleState
      implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      theCircle.toggleState();
    }
  }
}
