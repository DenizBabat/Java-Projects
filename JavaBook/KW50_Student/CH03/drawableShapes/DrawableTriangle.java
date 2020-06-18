package drawableShapes;
import java.awt.*;

/** Represents a drawable triangle.
*   Implements ShapeInt.
*   @author Koffman & Wolfgang
*/

public class DrawableTriangle
    extends DrawableShape {

  // Constructor
  /** Construct a DrawableTriangle with the given color
      and position.
      @param bas The base
      @param hei The height
      @param poi The location of the lower left corner
      @param border The border color
      @param inter The interior color
   */
  public DrawableTriangle(int bas, int hei,
                          Point poi, Color border, Color inter) {
    super(poi, border, inter, new RtTriangle(bas, hei));
  }

  // Methods
  /** Draw the triangle using the given graphics context.
      @param g The graphics context
   */
  public void drawMe(Graphics g) {
    Polygon rtTri = new Polygon();
    RtTriangle triangle = (RtTriangle) theShape;
    rtTri.addPoint(pos.x, pos.y);
    rtTri.addPoint(pos.x, pos.y - triangle.getHeight());
    rtTri.addPoint(pos.x + triangle.getBase(), pos.y);
    g.setColor(interiorColor);
    g.fillPolygon(rtTri);
    g.setColor(borderColor);
    g.drawPolygon(rtTri);
  }

  /** Return a string representation of the triangle.
      @return A string representation of the triangle
   */
  public String toString() {
    return "Drawable " + theShape + super.toString();
  }
}
