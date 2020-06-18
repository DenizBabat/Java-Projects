package drawableShapes;
import java.awt.*;

/** Represents a drawable circle
*   Implements ShapeInt.
*   @author Koffman & Wolfgang
*/

public class DrawableCircle
    extends DrawableShape {

  // Constructor
  /** Construct a DrawableCircle of the given radius,
      position, and color.
      @param rad The radius
      @param poi The coordinates of the center
      @param border The background color
      @param inter The interior color
   */
  public DrawableCircle(int rad,
                        Point poi, Color border, Color inter) {
    super(poi, border, inter, new Circle(rad));
  }

  // Methods
  /** Draw the circle.
      @param g The graphics context (screen)
   */
  public void drawMe(Graphics g) {
    g.setColor(interiorColor);
    Circle circle = (Circle) theShape;
    g.fillOval(pos.x - circle.getRadius(),
               pos.y - circle.getRadius(),
               2 * circle.getRadius(), 2 * circle.getRadius());
    g.setColor(borderColor);
    g.drawOval(pos.x - circle.getRadius(),
               pos.y - circle.getRadius(),
               2 * circle.getRadius(), 2 * circle.getRadius());
  }

  /** Return a string representation of the circle.
      @return A string representation
   */
  public String toString() {
    return "Drawable " + theShape + super.toString();
  }
}
