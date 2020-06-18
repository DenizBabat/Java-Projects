import java.util.*;
import java.text.*;
import javax.swing.*;

/** Program to demonstrate different currency formats.
*   @author Koffman & Wolfgang
* */

public class CurrencyDemo {

  public static void main(String[] args) {
    NumberFormat usa =
        NumberFormat.getCurrencyInstance(Locale.US);
    NumberFormat uk =
        NumberFormat.getCurrencyInstance(Locale.UK);
    NumberFormat de =
        NumberFormat.getCurrencyInstance(Locale.GERMANY);
    NumberFormat fr =
        NumberFormat.getCurrencyInstance(Locale.FRANCE);

    double value = 12345.67;

    String result = "The value " + value
        + "\nAs US Currency " + usa.format(value)
        + "\nAs UK Currency " + uk.format(value)
        + "\nAs German Currency " + de.format(value)
        + "\nAs French Currency " + fr.format(value);

    JOptionPane.showMessageDialog(null, result);
    System.exit(0);
  }
}
