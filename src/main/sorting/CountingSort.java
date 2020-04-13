package main.sorting;

import java.util.Arrays;

public class CountingSort implements SortingClass {
  @Override
  public int[] sort(int[] collection) {
    if (collection.length == 0) return collection;

    int[] returnArr = new int[collection.length];
    int k = findMax(collection);
    countingSort(collection, returnArr, k);
    return returnArr;
  }

  private void countingSort(int[] collection, int[] r, int k ) {
    int[] c = new int[k + 1];
    for (int i = 0; i <= k; i++) {
      c[i] = 0;
    }
    for (int j = 0; j < collection.length; j++) {
      c[collection[j]]++;
    }
    for (int i = 1; i <= k; i++) {
      c[i] = c[i] + c[i - 1];
    }
    for (int j = collection.length - 1; j >= 0; j--) {
      r[c[collection[j]] - 1] = collection[j];
      c[collection[j]] = c[collection[j]] - 1;
    }
  }

  private int findMax(int[] collection) {
    int max = Arrays.stream(collection).max().getAsInt();
    return max + 1;
  }
}
