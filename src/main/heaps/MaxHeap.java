package main.heaps;

import java.util.Collections;
import java.util.ArrayList;

public class MaxHeap<T extends Comparable> implements Heap<T>{
  ArrayList<T> array;
  int size;

  public MaxHeap(ArrayList<T> array) {
    this.array = array;
    size = array.size();
    buildHeap();
  }

  @Override
  public ArrayList<T> getQueue() {
    return array;
  }

  @Override
  public void insert(T element) {
    array.add(element);
    size++;
    siftUp(size - 1);
  }

  @Override
  public T extract() {
    T element = array.remove(0);
    size--;
    return element;
  }

  @Override
  public T peek() {
    return array.get(0);
  }

  private void buildHeap() {
    System.out.println("building");
    for (int i = size/2 - 1; i >= 0; i--) {
      maxHeapify(i);
    }
  }

  private void maxHeapify(int idx) {
    int l = HeapUtil.left(idx);
    int r = HeapUtil.right(idx);
    int largest = idx;
    if (l < size) {
      int firstCompare = array.get(l).compareTo(array.get(idx));
      if (firstCompare > 0) {
        largest = l;
      }
    }
    if (r < size) {
      int secondCompare = array.get(r).compareTo(array.get(largest));
      if (secondCompare > 0) {
        largest = r;
      }
    }
    if (largest != idx) {
      Collections.swap(array, idx, largest);
      maxHeapify(largest);
    }
  }

  private void siftUp(int idx) {
    int parent = HeapUtil.parent(idx);
    while (idx > 0 && array.get(parent).compareTo(array.get(idx)) < 0) {
      Collections.swap(array, idx, parent);
      idx = parent;
    }
  }

}
