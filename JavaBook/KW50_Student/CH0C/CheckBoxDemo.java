import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;

/** CheckBoxDemo generates a simple demonstration of check boxes.
*   @author Koffman & Wolfgang
* */

public class CheckBoxDemo
    extends JFrame {

  // Data Fields
  JCheckBox greenEggs;
  JCheckBox ham;

  // Main Method
  public static void main(String args[]) {
    // Create a CheckBoxDemo object.
    JFrame aFrame = new CheckBoxDemo();
    // Show it.
    aFrame.show();
  }

  // Constructor
  public CheckBoxDemo() {
    setTitle("CheckBoxDemo");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // Create a JPanel to be used as the content pane.
    JPanel aPanel = new JPanel();
    aPanel.setLayout(new BoxLayout(aPanel, BoxLayout.Y_AXIS));
    // Create two check boxes and add them to the panel.
    greenEggs = new JCheckBox("Green Eggs");
    greenEggs.addActionListener(new GreenEggsChanged());
    aPanel.add(greenEggs);
    ham = new JCheckBox("Ham");
    ham.addActionListener(new HamChanged());
    aPanel.add(ham);
    setContentPane(aPanel);
    pack();
  }

  // Action Listener Classes
  private class GreenEggsChanged
      implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      if (greenEggs.isSelected()) {
        System.out.println("Green Eggs is selected");
      }
      else {
        System.out.println("Green Eggs not selected");
      }
    }
  }

  private class HamChanged
      implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      if (ham.isSelected()) {
        System.out.println("Ham is selected");
      }
      else {
        System.out.println("Ham not selected");
      }
    }
  }
}
