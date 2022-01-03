package main.sorting;

public class QuickSort implements SortingClass {
  @Override
  public int[] sort(int[] collection) {
    quicksort(collection, 0, collection.length - 1);
    return collection;
  }

  private void quicksort(int[] collection, int p, int r) {
    if (p < r) {
      int q = partition(collection, p, r);
      quicksort(collection, p, q - 1);
      quicksort(collection, q + 1, r);
    }
  }

  private int partition(int[] collection, int p, int r) {
    int x = collection[r];
    int i = p - 1;
    for (int j = p; j < r; j++) {
      if (collection[j] <= x) {
        i++;
        swap(collection, i, j);
      }
    }
    swap(collection, i + 1, r);
    return i + 1;
  }

  private void swap(int[] collection, int i, int j) {
    int tmp = collection[i];
    collection[i] = collection[j];
    collection[j] = tmp;
  }
}
