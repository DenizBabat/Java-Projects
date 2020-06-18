import javax.swing.*;

/** Class to provide input routines
 *  @author Koffman & Wolfgang
 */

public class MyInput {

  /** Method to return an integer data value.
    @param prompt Message
    @return The data value read as an int
   */
  public static int readInt(String prompt) {
    while (true) { // Loop until valid number is read.
      try {
        String numStr = JOptionPane.showInputDialog(prompt);
        return Integer.parseInt(numStr);
      }
      catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(
            null,
            "Bad numeric string — Try again",
            "Error", JOptionPane.ERROR_MESSAGE);
      }
    }
  }

  /** Method to return an integer data value between two
    specified end points.
    pre: minN <= maxN.
    @param prompt Message
    @param minN Smallest value in range
    @param maxN Largest value in range
    @throws IllegalArgumentException
    @return The first data value that is in range
   */
  public static int readInt(String prompt, int minN, int maxN) {
    if (minN > maxN) {
      throw new IllegalArgumentException(
          "In readInt, minN " + minN
          + " not <= maxN " + maxN);
    }
    // Arguments are valid, read a number.
    boolean inRange = false; // Assume no valid number read.
    int n = 0;
    while (!inRange) { // Repeat until valid number read.
      try {
        String line = JOptionPane.showInputDialog(
            prompt + "\nEnter an integer between "
            + minN + " and " + maxN);
        n = Integer.parseInt(line);
        inRange = (minN <= n && n <= maxN);
      }
      catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(
            null,
            "Bad numeric string — Try again",
            "Error", JOptionPane.ERROR_MESSAGE);
      }
    } // End while
    return n; // n is in range
  }
}
