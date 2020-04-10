package test.sorting;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import main.sorting.MergeSort;

public class MergeSortTest {
  MergeSort mergeSort = new MergeSort();

  @Test
  public void sort() {
    int[] collection = {2,5,3,1,7,6,8,4,9,0};
    int[] result = mergeSort.sort(collection);
    assertEquals(result[0], 0);
    assertEquals(result[1], 1);
    assertEquals(result[2], 2);
    assertEquals(result[3], 3);
    assertEquals(result[4], 4);
    assertEquals(result[5], 5);
    assertEquals(result[6], 6);
    assertEquals(result[7], 7);
    assertEquals(result[8], 8);
    assertEquals(result[9], 9);
  }
}
