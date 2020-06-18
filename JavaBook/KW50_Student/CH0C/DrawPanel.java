import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import drawableShapes.*;

/** The DrawPanel is the canvas on which the figures are drawn.
*   @author Koffman & Wolfgang
* */

public class DrawPanel
    extends JPanel {

  /** The maximum number of figures */
  private static final int MAX_FIG = 25;

  /** The list of figures */
  private Drawable[] figsList = new Drawable[MAX_FIG];

  /** The number of figures that have been drawn */
  private int numFigs = 0;

  /** Currently selected figure prototype */
  private Drawable currentFig = null;

  /** Reference to parent frame to access selectedFigure */
  private DrawApp parent;

  /** Construct a DrawPanel object. The constructor registers
      the mouse listeners.
      @param p Reference to parent DrawApp
   */
  public DrawPanel(DrawApp p) {
    // Save reference to parent.
    parent = p;
    // Add the mouse listeners.
    addMouseListener(new CreateNewFigure());
    addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseDragged(MouseEvent e) {
        if (currentFig != null) {
          currentFig.stretchMe(getGraphics(),
                               e.getPoint(),
                               getBackground());
        }
      }
    });
  }

  /** Method to paint the component. This method is called
      by Swing and should not be called directly.
      @param g The graphics object to do the painting
   */
  public void paintComponent(Graphics g) {
    // Always call super.paintComponent first.
    super.paintComponent(g);
    // Draw the figures.
    for (int i = 0; i < numFigs; i++) {
      figsList[i].drawMe(g);
    }
  }

  // Inner Class
  /** Class to create a new figure when the mouse button is pressed
      and released. */
  private class CreateNewFigure
      extends MouseAdapter {
    /** When the mouse is pressed and the figures array
        is not full, a new figure is created
        with its orgin at the current point.
        @param e MouseEvent
     */
    public void mousePressed(MouseEvent e) {
      if (parent.getSelectedFig() != null && numFigs < MAX_FIG) {
        currentFig =
            parent.getSelectedFig().newInstance();
        currentFig.setPoint(e.getPoint());
      }
      else {
        currentFig = null;
      }
    }

    /** When the mouse is released, the current figure is
        redrawn as a final figure by calling its drawMe method.
        @param e MouseEvent
     */
    public void mouseReleased(MouseEvent e) {
      if (currentFig != null) {
        figsList[numFigs++] = currentFig;
        currentFig.drawMe(getGraphics());
        currentFig = null;
      }
      else {
        JOptionPane.showMessageDialog
            (null, "Sorry too many figures");
      }
    }
  }
}
