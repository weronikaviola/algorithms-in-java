package main.data_structures.linked_lists;

import java.util.ArrayList;

abstract class LinkedList<T> {
  Node<T> head;
  // Insert an element at the end of the list.
  abstract void insert(Node<T> element);

  // Insert an element at the given position.
  abstract void insertAt(Node<T> element, int idx);

  // Delete an element at a given position.
  abstract Node<T> deleteAt(int idx);

  @Override
  public String toString() {
    ArrayList<T> elements = new ArrayList<>();
    while (head != null) {
      elements.add(head.value);
      head = head.next;
    }
    return elements.toString();
  }
}
