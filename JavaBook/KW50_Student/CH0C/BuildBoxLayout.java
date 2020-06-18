import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/** Demonstration of the Box Layout.
*   @author Koffman & Wolfgang
* */

public class BuildBoxLayout
    extends JFrame {
  public static void main(String[] args) {
    JFrame frame = new BuildBoxLayout();
  }

  public BuildBoxLayout() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    // Create a panel to hold the buttons.
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    // Create buttons and add them to the panel.
    // Add/Change Entry
    JButton addEntryButton = new JButton("Add/Change Entry");
    panel.add(addEntryButton);
    // Look Up Entry
    JButton lookupEntryButton = new JButton("Look Up Entry");
    panel.add(lookupEntryButton);
    // Remove Entry
    JButton removeEntryButton = new JButton("Remove Entry");
    panel.add(removeEntryButton);
    // Save Directory
    JButton saveDirectoryButton =
        new JButton("Save Directory");
    panel.add(saveDirectoryButton);
    // Exit
    JButton exitButton = new JButton("Exit");
    panel.add(exitButton);
    // Put the panel into the frame.
    getContentPane().add(panel);
    // Size the frame to hold the panel.
    pack();
    show();
  }
}
