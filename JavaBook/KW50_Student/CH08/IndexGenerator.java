import java.io.*;
import java.util.*;
import java.text.*;

/** Class to build an index.
*   @author Koffman and Wolfgang
* */

public class IndexGenerator {

  // Data Fields
  /** Tree for storing the index. */
  private TreeSet < String > index;

  // Methods
  public IndexGenerator() {
    index = new TreeSet < String > ();
  }

  /** Reads each word in data file bR and stores it in search tree
      along with its line number.
      post: Lowercase form of each word with line
            number stored in index.
      @param bR A reference to the data file
      @throws IOException
   */
  public void buildIndex(BufferedReader bR) throws IOException {
    DecimalFormat threeDigits = new DecimalFormat("000");
    int lineNum = 0; // Line number
    String nextLine; // Each data line
    // Keep reading lines until done.
    while ( (nextLine = bR.readLine()) != null) {
      lineNum++;
      // Create a StringTokenizer for the current data line
      // using punctuation and white space as delimiters.
      StringTokenizer tokens =
          new StringTokenizer(nextLine, " ,.:-!?/%");
      // Insert each token in the index.
      while (tokens.hasMoreTokens()) {
        String next = tokens.nextToken().toLowerCase();
        index.add(String.format("%s, %3d", next, lineNum));
      }
    }
  }

  /** Displays the index, one word per line. */
  public void showIndex() {
    // Use an iterator to access and display tree data.
    for (String next : index) {
      System.out.println(next);
    }
  }
}
