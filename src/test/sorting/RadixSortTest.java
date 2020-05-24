package test.sorting;

import main.sorting.RadixSort;
import main.sorting.SortingClass;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class RadixSortTest {
  SortingClass sort = new RadixSort();

  @Test
  public void sortSameLengthNumbers() {
    int[] collection = {120,221,223,101,300};
    int[] result = sort.sort(collection);
    int[] anticipatedResult = new int[]{101,120,221,223,300};
    assertArrayEquals(anticipatedResult, result);
  }

  @Test
  public void sortDfferentLengthNumbers() {
    int[] collection = {120, 30, 2, 55, 500};
    int[] result = sort.sort(collection);
    int[] anticipatedResult = new int[]{2, 30, 55, 120, 500};
    assertArrayEquals(anticipatedResult, result);
  }
}
