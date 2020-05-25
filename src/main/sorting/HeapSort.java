package main.sorting;

import java.util.ArrayList;

import main.data_structures.heaps.MaxHeap;

import java.util.Arrays;
import java.util.stream.Collectors;

public class HeapSort implements SortingClass {
  @Override
  public int[] sort(int[] collection) {
    ArrayList<Integer> arrayList
        = new ArrayList(Arrays.stream(collection).boxed().collect(Collectors.toList()));
    MaxHeap<Integer> heap = new MaxHeap<>(arrayList);
    ArrayList<Integer> result = new ArrayList<>();
    for (int i = heap.size - 1; i >= 0; i--) {
      Integer element = heap.extract();
      result.add(0, element);
      heap.maxHeapify(0);
    }

    int[] intArr = result.stream().mapToInt(x -> x).toArray();
    return intArr;
  }
}
