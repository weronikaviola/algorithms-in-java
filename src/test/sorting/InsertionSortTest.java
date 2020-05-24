package test.sorting;

import java.util.Arrays;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

import main.sorting.InsertionSort;

public class InsertionSortTest {
  private InsertionSort insertionSort = new InsertionSort();

  @Test
  public void sortIntegers() {
    int[] toSort = {5,2,4,6,1,3};
    int[] result = insertionSort.sort(toSort);
    int[] anticipatedResult = new int[]{1,2,3,4,5,6};
    assertArrayEquals(anticipatedResult, result);
  }

  @Test
  public void sortShortStrings() {
    String[] toSort = {"2", "1", "3", "0"};
    String[] result = insertionSort.sort(toSort);
    String[] anticipatedResult = new String[]{"0", "1", "2", "3"};
    assertArrayEquals(anticipatedResult, result);
  }

  @Test
  public void sortLongStringsByPositionalValues() {
    String[] toSort = {"15", "24", "200", "1", "3"};
    String[] result = insertionSort.sort(toSort);
    String[] anticipatedResult = new String[]{"1", "15", "200", "24", "3"};
    assertArrayEquals(anticipatedResult, result);
  }
}
