package test.sorting;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import main.sorting.InsertionSort;

public class InsertionSortTest {
  private InsertionSort insertionSort = new InsertionSort();

  @Test
  public void sort() {
    int[] toSort = {1,4,5,7,2};
    int[] result = insertionSort.sort(toSort);
    assertEquals(result[0], 1);
    assertEquals(result[1], 2);
    assertEquals(result[2], 4);
    assertEquals(result[3], 5);
    assertEquals(result[4], 7);
  }
}
