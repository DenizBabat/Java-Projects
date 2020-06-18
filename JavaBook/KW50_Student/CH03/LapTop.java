/** Class that represents a laptop computer.
 *  @author Koffman & Wolfgang
 * */

public class LapTop extends Computer {
  // Data Fields
  private static final String DEFAULT_LT_MAN = "MyBrand";
  private double screenSize;
  private double weight;

  /** Initializes a LapTop object with all properties specified.
      @param man The computer manufacturer
      @param proc The processor type
      @param ram The RAM size
      @param disk The disk size
      @param screen The screen size
      @param wei The weight
   */
  public LapTop(String man, String proc, int ram, int disk,
                double screen, double wei) {
    super(man, proc, ram, disk);
    screenSize = screen;
    weight = wei;
  }

  /** Initializes a LapTop object with 5 properties specified. */
  public LapTop(String proc, int ram, int disk,
                double screen, double wei) {
    this(DEFAULT_LT_MAN, proc, ram, disk, screen, wei);
  }

  public String toString() {
    String result = super.toString()
        + "\nScreen size: " + screenSize + " inches"
        + "\nWeight: " + weight + " pounds";
    return result;
  }

  // Insert other accessor and modifier methods here.
/**** EXERCISE ****/
}
