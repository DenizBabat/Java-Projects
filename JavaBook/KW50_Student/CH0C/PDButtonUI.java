import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;

/** Class to display and modify a simple phone directory.
*   @author Koffman & Wolfgang
* */

public class PDButtonUI
    extends JFrame
    implements PDUserInterface {

  // Data Field
  private PhoneDirectory theDirectory;

  // Constructor
  public PDButtonUI() {
    // Set the title on the top of the frame.
    super("Phone Directory");
    // Define the window close action.
    addWindowListener(new WindowClosing());
    // Create a panel to hold the buttons.
    JPanel panel = new JPanel();
    // Create buttons and add them to the panel.
    // Add/Change Entry
    JButton addEntryButton = new JButton("Add/Change Entry");
    addEntryButton.addActionListener(new DoAddChangeEntry());
    panel.add(addEntryButton);
    // Look Up Entry
    JButton lookupEntryButton = new JButton("Look Up Entry");
    lookupEntryButton.addActionListener(new DoLookupEntry());
    panel.add(lookupEntryButton);
    // Remove Entry
    JButton removeEntryButton = new JButton("Remove Entry");
    removeEntryButton.addActionListener(new DoRemoveEntry());
    panel.add(removeEntryButton);
    // Save Directory
    JButton saveDirectoryButton = new JButton("Save Directory");
    saveDirectoryButton.addActionListener(new DoSave());
    panel.add(saveDirectoryButton);
    // Exit
    JButton exitButton = new JButton("Exit");
    exitButton.addActionListener(new DoSaveAndExit());
    panel.add(exitButton);
    // Put the panel into the frame.
    getContentPane().add(panel);
    // Size the frame to hold the panel.
    pack();
  }

  public void processCommands(PhoneDirectory thePhoneDirectory) {
    theDirectory = thePhoneDirectory;
    show();
  }

  // Action Event Listener Classes
  /** Class to respond to the Look Up Entry Button. */
  private class DoLookupEntry
      implements ActionListener {
    /** Method to look up an entry.
        pre:  The directory has been loaded with data.
        post: No changes made to the directory.
     */
    public void actionPerformed(ActionEvent e) {
      // Request the name.
      String theName =
          JOptionPane.showInputDialog("Enter name");
      if (theName == null)return; // Dialog was canceled.
      // Look up the name.
      String theNumber = theDirectory.lookupEntry(theName);
      String message = null;
      if (theNumber != null) { // Name was found.
        message =
            "The number for " + theName + " is " + theNumber;
      }
      else { // Name was not found.
        message =
            theName + " is not listed in the directory";
      }
      // Display the result.
      JOptionPane.showMessageDialog(null, message);
    }
  }

  // Insert listener classes for other buttons.

  /** Class to respond to the WindowClosing event. */
  private class WindowClosing
      extends WindowAdapter {
    /** Method to save the directory to the data file and close
        the data file.
        pre:  The directory has been loaded with data.
        post: The current contents of the directory have been
        saved to the data file, and the data file is closed.
     */
    public void windowClosing(WindowEvent e) {
      theDirectory.save();
      System.exit(0);
    }
  }
}
