package test.sorting;

import java.util.Arrays;

import main.sorting.QuickSort;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

import main.sorting.SortingClass;

public class QuickSortTest {
  SortingClass sort = new QuickSort();

  @Test
  public void sort() {
    int[] collection = {2,5,3,1,7,6,8,4,9,0};
    int[] result = sort.sort(collection);
    int[] anticipatedResult = new int[]{0,1,2,3,4,5,6,7,8,9};
    assertTrue(Arrays.equals(result, anticipatedResult));
  }

  @Test
  public void sortEmpty() {
    int[] collection = {};
    int[] result = sort.sort(collection);
    int[] anticipatedResult = new int[]{};
    assertTrue(Arrays.equals(result, anticipatedResult));
  }

  @Test
  public void sortOne() {
    int[] collection = {1};
    int[] result = sort.sort(collection);
    int[] anticipatedResult = new int[]{1};
    assertTrue(Arrays.equals(result, anticipatedResult));
  }
}
