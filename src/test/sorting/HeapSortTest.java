package test.sorting;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

import main.sorting.HeapSort;

import java.util.Arrays;

public class HeapSortTest {
  HeapSort heapSort = new HeapSort();
  @Test
  public void sort() {
    final int[] toSort = {1,4,5,7,2};
    int[] result = heapSort.sort(toSort);
    int[] anticipatedResult = new int[]{1,2,4,5,7};
    assertArrayEquals(anticipatedResult, result);
  }

  @Test
  public void sortEmptyArray() {
    int[] collection = {};
    int[] result = heapSort.sort(collection);
    int[] anticipatedResult = new int[]{};
    assertArrayEquals(anticipatedResult, result);
  }

  @Test
  public void sortWhenOnlyOneElementPresent() {
    int[] collection = {1};
    int[] result = heapSort.sort(collection);
    int[] anticipatedResult = new int[]{1};
    assertArrayEquals(anticipatedResult, result);
  }
}
