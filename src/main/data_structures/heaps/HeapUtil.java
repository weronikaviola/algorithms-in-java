package main.data_structures.heaps;

public class HeapUtil {
  /**
   * Returns the index of a left child of an element with specified index.
   *
   * @param idx index of the element
   * @return index of the left child element
   */
  static public int left(int idx) {
    return idx * 2 + 1;
  }

  /**
   * Returns the index of a right child of an element with specified index.
   *
   * @param idx index of the element
   * @return index of the right child element
   */
  static public int right(int idx) {
    return idx * 2 + 2;
  }

  /**
   * Returns the index of the parent of an element with specified index.
   *
   * @param idx index of the element
   * @return index of the parent element
   */
  static public int parent(int idx) {
    return (idx - 1) / 2;
  }
}
