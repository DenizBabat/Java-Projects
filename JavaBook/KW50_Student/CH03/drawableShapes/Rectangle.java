package drawableShapes;
import javax.swing.*;

/** Represents a rectangle.
*   Implements ShapeInt.
*   @author Koffman & Wolfgang
*/

public class Rectangle
    implements ShapeInt {

  // Data Fields
  /** The width of the rectangle. */
  private int width = 0;

  /** The height of the rectangle. */
  private int height = 0;

  // Constructors
  /** Constructs a rectangle of the specified size.
      @param wid the width
      @param hei the height
   */
  public Rectangle(int wid, int hei) {
    width = wid;
    height = hei;
  }
  /** Construct a default Rectangle.
   */
  public Rectangle() {}


  // Methods
  /** Get the width.
      @return The width
   */
  public int getWidth() {
    return width;
  }

  /** Get the height.
      @return The height
   */
  public int getHeight() {
    return height;
  }

  /** Compute the area.
      @return The area of the rectangle
   */
  public double computeArea() {
    return height * width;
  }

  /** Compute the perimeter.
      @return The perimeter of the rectangle
   */
  public double computePerimeter() {
    return 2 * (height + width);
  }

  /** Read the parameters of the rectangle. */
  public void readShapeData() {
    String widthStr = JOptionPane.showInputDialog
        ("Enter the width of the Rectangle");
    width = Integer.parseInt(widthStr);
    String heightStr = JOptionPane.showInputDialog
        ("Enter the height of the Rectangle");
    height = Integer.parseInt(heightStr);
  }

  /** Create a string representaion of the rectangle.
      @return A string representation of the rectangle
   */
  public String toString() {
    return "Rectangle: width is " + width + ", height is " + height;
  }

}
