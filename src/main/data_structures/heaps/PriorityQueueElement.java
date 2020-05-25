package main.data_structures.heaps;

public class PriorityQueueElement<T> implements Comparable<PriorityQueueElement> {
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

  public T getElement() {
    return element;
  }

  public void setElement(T element) {
    this.element = element;
  }

  public int getKey() {
    return key;
  }

  public void setKey(int key) {
    this.key = key;
  }
}
