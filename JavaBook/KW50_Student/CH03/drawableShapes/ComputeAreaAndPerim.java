package drawableShapes;
import javax.swing.JOptionPane;

/**
*  Computes the area and perimeter of selected figures.
*  @author Koffman and Wolfgang
*/

public class ComputeAreaAndPerim {

  /** The main program performs the following steps.
      1. It asks the user for the type of figure.
      2. It asks the user for the characteristics of that figure.
      3. It computes the perimeter.
      4. It computes the area.
      5. It displays the result.
      @param args The command line arguments -- not used
   */
  public static void main(String args[]) {
    ShapeInt myShape;
    double perimeter;
    double area;
    myShape = getShape(); // Ask for figure type
    myShape.readShapeData(); // Read the shape data
    perimeter = myShape.computePerimeter(); // Compute perimeter
    area = myShape.computeArea(); // Compute the area
    displayResult(area, perimeter); // Display the result
    System.exit(0); // Exit the program
  }

  /** Ask the user for the type of figure.
      @return An instance of the selected shape
   */
  public static ShapeInt getShape() {
    String figType = JOptionPane.showInputDialog(
        "Enter C for circle\nEnter R for Rectangle\n"
        + "Enter T for rightTriangle");
    if (figType.equalsIgnoreCase("c")) {
      return new Circle();
    }
    else if (figType.equalsIgnoreCase("r")) {
      return new Rectangle();
    }
    else if (figType.equalsIgnoreCase("t")) {
      return new RtTriangle();
    }
    else {
      return null;
    }
  }

  /** Display the result of the computation.
      @param area The area of the figure
      @param perim The perimeter of the figures
   */
  private static void displayResult(double area, double perim) {
    JOptionPane.showMessageDialog(null, "The area is " + area
                                  + "\nThe perimeter is " + perim);
  }
}
