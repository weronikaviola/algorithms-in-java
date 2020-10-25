package main.data_structures.linked_lists;

public class Node<T> {
  public T value;
  public Node<T> next;
  public Node<T> prev;

  public Node() {
    throw new UnsupportedOperationException("Node must have value.");
  }

  public Node(T element) {
    this.value = element;
  }

  @Override
  public String toString() {
    return value.toString();
  }
}
