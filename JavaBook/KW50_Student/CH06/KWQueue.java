import java.util.*;

/** Implements the Queue interface using a LinkedList component.
*   @author Koffman & Wolfgang
* */

public class KWQueue < E >
    implements Queue < E > {

  // Data Field
  private LinkedList < E > theQueue
      = new LinkedList < E > (); // LinkedList that is the queue.

  /** Inserts an item at the rear of the queue.
      @param item The element to add
      @return true (always successful)
   */
  public boolean offer(E item) {
    theQueue.addLast(item);
    return true;
  }

  /** Removes the entry at the front of the queue and returns it.
      @return The item removed if successful, or null if not
   */
  public E poll() {
    if (size() == 0)
      return null;
    else
      return theQueue.remove(0);
  }

  /** Returns the item at the front of the queue without removing it.
      @return The item at the front if successful; null if not
   */
  public E peek() {
    if (size() == 0)
      return null;
    else
      return theQueue.getFirst();
  }

/**** EXERCISE ****/
}
