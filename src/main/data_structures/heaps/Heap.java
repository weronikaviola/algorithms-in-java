package main.data_structures.heaps;

import java.util.ArrayList;
import java.util.Collections;

/**
 * An abstract class defining a Heap holding elements of the specified type.
 *
 * @param <T> type of the elements
 */
abstract class Heap<T extends Comparable<T>> {
  ArrayList<T> array;

  /**
   * Returns a list of elements in sorted order specified by the implementation.
   *
   * @return list of elements in sorted order
   */
  abstract public ArrayList<T> getSorted();

  /**
   * Inserts the specified element into the heap.
   *
   * @param element element to insert
   */
  abstract public void insert(T element);

  /**
   * Removes and returns an element that is currently at the root of the heap.
   *
   * @return current root element
   */
  abstract public T extract();

  /**
   * Returns the value of the current root element.
   *
   * @return current root element
   */
  abstract public T peek();

  /**
   * Replaces the element at the specified index.
   *
   * @param idx index
   * @param newElement element to insert
   */
  abstract public void change(int idx, T newElement);

  /**
   * Returns the value of the element at the specified index.
   *
   * @param idx index
   * @return value of the element
   */
  abstract public T getAtIdx(int idx);

  /**
   * Returns whether the heap is empty.
   *
   * @return true or false
   */
  abstract public boolean isEmpty();

  /**
   * Recursively compares element at the given index with it's parent element
   * and sifts it up to the correct position.
   *
   * @param idx index of the element to adjust
   */
  abstract public void siftUp(int idx);
}
