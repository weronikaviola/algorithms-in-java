package test.sorting;

import java.util.Arrays;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

import main.sorting.InsertionSort;

public class InsertionSortTest {
  private InsertionSort insertionSort = new InsertionSort();

  @Test
  public void sort() {
    int[] toSort = {1,4,5,7,2};
    int[] result = insertionSort.sort(toSort);
    int[] anticipatedResult = new int[]{1,2,4,5,7};
    assertTrue(Arrays.equals(result, anticipatedResult));
  }
}
