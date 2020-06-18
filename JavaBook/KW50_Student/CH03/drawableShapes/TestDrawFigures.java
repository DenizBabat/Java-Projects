package drawableShapes;
import java.awt.*;
import javax.swing.*;

/** Draws a collection of drawable objects stored in an array.
*   Uses DrawableRectangle, DrawableCircle,
*   DrawableTriangle, and awt.
*   @author Koffman & Wolfgang
*/

public class TestDrawFigures
    extends JPanel {

  /** An array of DrawableShapes. */
  private DrawableShape[] drawableShapes;

  /** Create some drawable shapes and compute their areas and
      perimeters.
   */
  private TestDrawFigures() {
    DrawableShape[] drawableShapes = {
        new DrawableCircle(50, new Point(50, 50),
                           Color.BLUE, Color.GREEN),
        new DrawableRectangle(100, 200, new Point(100, 100),
                              Color.RED, Color.YELLOW),
        new DrawableTriangle(50, 100, new Point(250, 300),
                             Color.BLACK, Color.RED),
        new DrawableRectangle(60, 50, new Point(300, 200),
                              Color.ORANGE, Color.GRAY),
        new DrawableCircle(0, new Point(0, 0),
                           Color.BLACK, Color.WHITE),
        new DrawableRectangle(0, 0, new Point(0, 0),
                              Color.BLACK, Color.WHITE),
        new DrawableTriangle(0, 0, new Point(0, 0),
                             Color.BLACK, Color.WHITE),
        new DrawableCircle( -100, new Point(300, 350),
                           Color.BLACK, Color.WHITE),
        new DrawableRectangle( -50, 50, new Point(50, 400),
                              Color.GREEN, Color.RED)
    };

    // Save a reference to this array of objects.
    this.drawableShapes = drawableShapes;

    // Display three attributes of the drawable objects.
    for (int i = 0; i < drawableShapes.length; i++) {
      System.out.println("\n" + drawableShapes[i]);
      System.out.println
          ("Area: "
           + drawableShapes[i].computeArea()
           + ", perimeter: "
           + drawableShapes[i].computePerimeter());
    }
  }

  /** Main method. Create a frame and a TestDrawFigures object
      and place the TestDrawFigures into the frame.
      @param args The command line arguments — not used
   */
  public static void main(String[] args) {
    // Create a frame to display the figures.
    JFrame frame = new JFrame("Test Draw Figures");
    frame.setSize(400, 450);
    // Create a collection of figures in the content pane.
    frame.setContentPane(new TestDrawFigures());
    // Display the frame and draw the figures.
    frame.show();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  /** Paint the drawable shapes.
      @param g The graphics environment
   */
  public void paintComponent(Graphics g) {
    // Paint the background.
    super.paintComponent(g);

    // Draw the drawable objects.
    for (int i = 0; i < drawableShapes.length; i++) {
      drawableShapes[i].drawMe(g);
    }
  }
}
