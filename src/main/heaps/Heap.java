package main.heaps;

import java.util.ArrayList;

public interface Heap<T> {
  ArrayList<T> getQueue();
  void insert(T element);
  T extract();
  T peek();
}
