import java.io.*;

/** A class to represent a string of bits. This class is like
*   the String and StringBuilder classes except that the contents
*   is a sequence of 0's and 1's. BitSrings are are varying length.
*   @author Koffman and Wolfgang
*/

public class BitString
    implements Cloneable, Serializable {

  /** Array of bytes to hold the data */
  private byte[] theData;

  /** Current capacity (size of the byte array) */
  private int capacity;

  /** Current number of meaningful bits */
  private int size;

  /** Construct an empty BitString with the specified
      initial capacity
      @param capacity The initial capacity
   */
  public BitString(int capacity) {
    theData = new byte[capacity];
    size = 0;
    this.capacity = capacity;
  }

  /** Construct an empty BitString with the initial
      capacity of 1.
   */
  public BitString() {
    this(1);
  }

  /** Create a mask for the selected bit
      @param i The index of the selected bit
      @return A mask with a 1 bit set in the
      appropriate bit
   */
  private int mask(int i) {
    int r = i % 8;
    return 1 << r;
  }

  /** Determine the index of the byte that contains
      the selected bit
      @param i The index of the selected bit
      @return The index of the byte that contains the
      selected bit.
   */
  private int index(int i) {
    return i / 8;
  }

  /** Access a selected bit
      @param i The index of the selected bit
      @return true if the selected bit is a 1
   */
  public boolean get(int i) {
    if (i < 0 || i >= size) {
      throw new IndexOutOfBoundsException();
    }
    return (theData[index(i)] & mask(i)) != 0;
  }

  /** Set a selected bit to a one
      @param i The index of the selected bit
      @throws IndexOutOfBoundsException if the index
      is less than 0.
   */
  public void set(int i) {
    if (i < 0) {
      throw new IndexOutOfBoundsException();
    }
    if (i >= size) {
      if (i / 8 >= capacity) {
        ensureCapacity(i / 8);
      }
      size = i + 1;
    }
    theData[index(i)] |= mask(i);
  }

  /** Reset a selected bit to a zero
      @param i The index of the selected bit
      @throws IndexOutOfBoundsException if the index
      is less than 0
   */
  public void clear(int i) {
    if (i < 0) {
      throw new IndexOutOfBoundsException();
    }
    if (i >= size) {
      if (i / 8 >= capacity) {
        ensureCapacity(i / 8);
      }
      size = i + 1;
    }
    theData[index(i)] &= ~mask(i);
  }

  /** Ensure that the capacity is at least as large
      as the specified value. If the desired capacity
      is larger than the current capacity, but smaller
      than twice the current capacity, then the current
      capacity is doubled
      @param c The desired capacity
   */
  private void ensureCapacity(int c) {
    int newCapacity = Math.max(c, Math.max(2 * capacity, 1));
    byte[] newData = new byte[newCapacity];
    System.arraycopy(theData, 0, newData, 0, capacity);
    theData = newData;
    capacity = newCapacity;
  }

  /** Trim the capacity to the minimum size necessary to
      hold the current string size
   */
  public void trimCapacity() {
    int newCapacity = Math.max( (size + 7) / 8, 1);
    byte[] newData = new byte[newCapacity];
    System.arraycopy(theData, 0, newData, 0, newCapacity);
    theData = newData;
    capacity = newCapacity;
  }

  /** Append a value to the end of the string
      @param newBit The value to append true for 1 and
      false for zero
   */
  public BitString append(boolean newBit) {
    if (newBit) {
      set(size);
    }
    else {
      clear(size);
    }
    return this;
  }

  /** A method to append one BitString onto another
      @param left BitString
      @param right The righ BitString
      @post The left BitString is modified to the
      result
   */
  public BitString append(BitString right) {
    for (int i = 0; i < right.size(); i++) {
      append(right.get(i));
    }
    return this;
  }

  /** Make a copy of this BitString
      @return A copy of this BitString
   */
  public Object clone() {
    try {
      BitString theClone = (BitString)super.clone();
      int newCapacity = Math.max( (size + 7) / 8, 1);
      theClone.theData = new byte[newCapacity];
      System.arraycopy(theData, 0, theClone.theData, 0, newCapacity);
      theClone.capacity = newCapacity;
      return theClone;
    }
    catch (CloneNotSupportedException ex) {
      throw new InternalError();
    }
  }

  /** Return a String representation of this BitString
      where each 1 is a '1' and each 0 is a '0'
      @return A String representation of this BitString.
   */
  public String toString() {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < size; i++) {
      if (get(i)) {
        result.append("1");
      }
      else {
        result.append("0");
      }
    }
    return result.toString();
  }

  /** Determine if two bitStrings are equal
      @param other The other BitString
      @return true If other is a BitString with the same
      contents as this BitString
   */
  public boolean equals(Object other) {
    if (other instanceof BitString) {
      BitString otherBitString =
          (BitString) other;
      for (int i = 0; i < capacity; i++) {
        if (theData[i] != otherBitString.theData[i]) {
          return false;
        }
      }
      return true;
    }
    else {
      return false;
    }
  }

  /** A method to append one BitString onto another
      @param left BitString
      @param right The righ BitString
      @post The left BitString is modified to the
      result
   */
  public static void append(BitString left, BitString right) {
    left.append(right);
  }

  /** Return a hashCode for this BitString
      @return The hashCode for this BitString
   */
  public int hashCode() {
    int result = 0;
    for (int i = 0; i < capacity; i++) {
      result = (result << 1) | (result >> 31);
      result ^= theData[i];
    }
    return result;
  }

  /** Return the size of this BitString
      @return The size of this BitString
   */
  public int size() {
    return size;
  }
}
