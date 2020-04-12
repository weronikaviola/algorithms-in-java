package main.heaps;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class Heap<T extends Comparable> {
  ArrayList<T> array;
  int size;

  public Heap(ArrayList<T> array) {
    this.array = array;
    size = array.size();
    buildHeap();
  }

  public ArrayList<T> getQueue() {
    return array;
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

}
