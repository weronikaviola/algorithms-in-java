package main.sorting;

public class MergeSort implements SortingClass {

  @Override
  public int[] sort(int[] collection) {
    return sort(collection, 0, collection.length - 1);
  }

  private int[] sort(int[] collection, int p, int r) {
    if (p < r) {
      int q = (p + r)/2;
      sort(collection, p, q);
      sort(collection, q + 1, r);
      merge(collection, p, q, r);
    }
    return collection;
  }

  private void merge(int [] collection, int p, int q, int r) {
    int len1 = q - p + 1;
    int len2 = r - q;

    int[] tmp1 = new int[len1 + 1];
    int[] tmp2 = new int[len2 + 1];

    for (int i = 0; i < len1; i++) {
      tmp1[i] = collection[p + i];
    }

    for (int j = 0; j < len2; j++) {
      tmp2[j] = collection[q + j + 1];
    }

    tmp1[len1] = Integer.MAX_VALUE;
    tmp2[len2] = Integer.MAX_VALUE;
    int i = 0;
    int j = 0;
    for (int k = p; k <= r; k++) {
      if (tmp1[i] <= tmp2[j]) {
        collection[k] = tmp1[i];
        i++;
      } else {
        collection[k] = tmp2[j];
        j++;
      }
    }
  }
}
