package drawableShapes;
import java.awt.*;

/** Abstract class for drawable shapes.
 *  @author Koffman & Wolfgang
 * */

public abstract class DrawableShape
    extends Drawable
    implements ShapeInt {
  // Data Fields
  /** Reference to the shape object. */
  protected ShapeInt theShape;

  // Constructor
  /** Construct a DrawableShape with the given parameters.
      @param poi The position of the origin
      @param border The border color
      @param inter The interior color
      @param aShape The shape
   */
  public DrawableShape(Point poi, Color border, Color inter,
                       ShapeInt aShape) {
    super(poi, border, inter);
    theShape = aShape;
  }

  // Delegated Methods
  /** Compute the area.
      @return The area
   */
  public double computeArea() {
    return theShape.computeArea();
  }

  /** Compute the perimeter.
      @return The perimeter
   */
  public double computePerimeter() {
    return theShape.computePerimeter();
  }

  /** Read the size parameters from the user. */
  public void readShapeData() {
    theShape.readShapeData();
  }
}

