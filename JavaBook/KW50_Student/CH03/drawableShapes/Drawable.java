package drawableShapes;
import java.awt.*;

/** This class encapsulates the common attributes of drawable objects.
*   Concrete subclasses must define method drawMe.
*   @author Koffman & Wolfgang
*/
public abstract class Drawable {
    // Data Fields
    /** The position of the origin of the shape. */
    protected Point pos = new Point(0, 0);
    /** The border color. */
    protected Color borderColor = Color.black;
    /** The interior color. */
    protected Color interiorColor = Color.white;

    // Abstract Method
    public abstract void drawMe(Graphics g);

    // Constructors
    /** Construct a Drawable with the specified parameters.
        @param poi The position of the origin
        @param border The border color
        @param inter The interior color
    */
    public Drawable(Point poi, Color border, Color inter) {
        pos = poi;
        borderColor = border;
        interiorColor = inter;
    }

    // Methods
    /** Create a string representation of this class.
        @return A string representation of this class
    */
    public String toString() {
        return "\nx coordinate is " + pos.x
               + ", y coordinate is " + pos.y
               + "\nborder color is " + borderColor
               + "\ninterior color is " + interiorColor;
    }
}
