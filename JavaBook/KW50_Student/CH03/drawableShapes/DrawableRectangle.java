package drawableShapes;
import java.awt.*;

/** Represents a drawable rectangle.
*   Implements ShapeInt.
*   @author Koffman & Wolfgang
*/

public class DrawableRectangle
    extends DrawableShape {

  // Constructor
  /** Construct a rectangle of the given size, position, and color.
      @param wid The width
      @param hei The height
      @param poi The coordinates of the upper left corner
      @param border The border color
      @param inter The interior color
   */
  public DrawableRectangle(int wid, int hei,
                           Point poi, Color border, Color inter) {
    super(poi, border, inter, new Rectangle(wid, hei));
  }

  /** Draw the rectangle.
      @param g The graphics context (screen)
   */
  public void drawMe(Graphics g) {
    g.setColor(interiorColor);
    Rectangle rectangle = (Rectangle) theShape;
    g.fillRect(pos.x, pos.y,
               rectangle.getWidth(), rectangle.getHeight());
    g.setColor(borderColor);
    g.drawRect(pos.x, pos.y,
               rectangle.getWidth(), rectangle.getHeight());
  }

  public String toString() {
    return "Drawable " + theShape + super.toString();
  }
}
