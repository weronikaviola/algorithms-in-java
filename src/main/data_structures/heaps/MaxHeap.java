package main.data_structures.heaps;

import java.util.Collections;
import java.util.ArrayList;

public class MaxHeap<T extends Comparable> implements Heap<T>{
  ArrayList<T> array;
  public int size;

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
    swap(0, size - 1);
    T element = array.remove(size - 1);
    size--;
    maxHeapify(0);
    return element;
  }

  @Override
  public T peek() {
    return array.get(0);
  }

  @Override
  public void change(int idx, T newElement) {
    if (idx < 0 || idx >= size) return;

    array.set(idx, newElement);

    int parentIdx = HeapUtil.parent(idx);

    int compareToParent = array.get(idx).compareTo(array.get(parentIdx));
    if (parentIdx >= 0 && compareToParent > 0) {
      siftUp(idx);
    } else {
      maxHeapify(idx);
    }
  }

  @Override
  public T getAtIdx(int idx) {
    return array.get(idx);
  }

  @Override
  public boolean isEmpty() {
    return array.isEmpty();
  }

  private void swap(int idx1, int idx2) {
    Collections.swap(array, idx1, idx2);
  }

  public void maxHeapify(int idx) {
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

  private void buildHeap() {
    System.out.println("building");
    for (int i = size/2 - 1; i >= 0; i--) {
      maxHeapify(i);
    }
  }

  public void siftUp(int idx) {
    int parent = HeapUtil.parent(idx);
    while (parent >= 0 && array.get(parent).compareTo(array.get(idx)) < 0) {
      Collections.swap(array, idx, parent);
      idx = parent;
      parent = HeapUtil.parent(idx);
    }
  }
}
