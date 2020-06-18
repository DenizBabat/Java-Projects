import java.util.*;

/** A hash table for storing set elements using open addressing.
*   @author Koffman and Wolfgang
* */

public class HashSetOpen {
  private KWHashMap<K, V> setMap = new HashtableOpen<K, V>();

  /** Adapter method contains.
      @return true if the key is found in setMap
   */
  public boolean contains(Object key) {
    // HashtableOpen.get returns null if the key is not found.
    return (setMap.get(key) != null);
  }

  /** Adapter method add.
      post: Adds a new Entry object (key, key)
            if key is not a duplicate.
      @return true if the key is not a duplicate
   */
  public boolean add(K key) {
    /* HashtableOpen.put returns null if the
       key is not a duplicate. */
    return (setMap.put(key, key) == null);
  }

  /** Adapter method remove.
      post: Removes the key-value pair (key, key).
      @return true if the key is found and removed
   */
  public boolean remove(Object key) {
    /* HashtableOpen.remove returns null if the
       key is not removed. */
    return (setMap.remove() != null);
  }
}
