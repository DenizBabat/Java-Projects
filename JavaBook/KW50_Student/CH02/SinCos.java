/** This class computes the sine and cosine of an angle
    expressed in degrees. The result will be an integer representing
    the sine or cosine as ten-thousandths. For example, a result of
    7071 represents 7071e-4 or 0.7071.
    @author Koffman & Wolfgang
 */

public class SinCos {
  /** Compute the sine of an angle in degrees.
      @param x The angle in degrees
      @return The sine of x
   */
  public static int sin(int x) {
    if (x < 0) {
      x = -x;
    }
    x = x % 360;
    if (0 <= x && x <= 45) {
      return sin0to45(x);
    }
    else if (45 <= x && x <= 90) {
      return sin45to90(x);
    }
    else if (90 <= x && x <= 180) {
      return sin(180 - x);
    }
    else {
      return -sin(x - 180);
    }
  }

  /** Compute the cosine of an angle in degrees.
      @param x The angle in degrees
      @return The cosine of x
   */
  public static int cos(int x) {
    return sin(x + 90);
  }

  /** Compute the sine of an angle in degrees
      between 0 and 45.
      pre: 0 <= x < 45
      @param x The angle
      @return The sine of x
   */
  private static int sin0to45(int x) {
    // In a realistic program this method would
    // use a polynomial approximation that was
    // optimized for the input range.
    // Code to compute sin(x)for x between 0and 45degrees
/**** EXERCISE ****/
  }

  /** Compute the sine of an angle in degrees
      between 45 and 90.
      pre: 45 <= x <= 90
      @param x The angle
      @return The sine of x
   */
  private static int sin45to90(int x) {
    // In a realistic program this method would
    // use a polynomial approximation that was
    // optimized for the input range.
    // Code to compute sin(x)for x between 45and 90degrees
/**** EXERCISE ****/
  }

/**** EXERCISE ****/

}
