package test.sorting;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

import main.sorting.CountingSort;
import main.sorting.SortingClass;

public class CountingSortTest {
  SortingClass sort = new CountingSort();
  @Test
  public void sort() {
    int[] collection = {2,5,3,1,7,6,8,4,9,0};
    int[] result = sort.sort(collection);
    int[] anticipatedResult = new int[]{0,1,2,3,4,5,6,7,8,9};
    assertArrayEquals(anticipatedResult, result);
  }

  @Test
  public void sortEmpty() {
    int[] collection = {};
    int[] result = sort.sort(collection);
    int[] anticipatedResult = new int[]{};
    assertArrayEquals(anticipatedResult, result);
  }

  @Test
  public void sortOne() {
    int[] collection = {1};
    int[] result = sort.sort(collection);
    int[] anticipatedResult = new int[]{1};
    assertArrayEquals(anticipatedResult, result);
  }
}
