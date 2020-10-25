package main.data_structures.heaps;

/**
 * Wrapper class for priority queue elements.
 *
 * @param <T>
 */
public class PriorityQueueElement<T>
    implements Comparable<PriorityQueueElement<T>> {
  private T element;
  private int key;

  public PriorityQueueElement(T element, int key) {
    this.element = element;
    this.key = key;
  }

  @Override
  public int compareTo(PriorityQueueElement o) {
    if (key < o.getKey()) return -1;
    if (key > o.getKey()) return 1;
    return 0;
  }

  /**
   * Returns the raw value of the element.
   *
   * @return value of the element
   */
  public T getElement() {
    return element;
  }

  /**
   * Sets the value of the element.
   *
   * @param element value to be set
   */
  public void setElement(T element) {
    this.element = element;
  }

  /**
   * Returns the key of the queue element.
   *
   * @return key of the element
   */
  public int getKey() {
    return key;
  }

  /**
   * Sets the key of the element
   *
   * @param key key to be set
   */
  public void setKey(int key) {
    this.key = key;
  }
}
