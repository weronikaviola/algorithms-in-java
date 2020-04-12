package test.sorting;

import java.util.Arrays;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

import main.sorting.MergeSort;

public class MergeSortTest {
  MergeSort mergeSort = new MergeSort();

  @Test
  public void sort() {
    int[] collection = {2,5,3,1,7,6,8,4,9,0};
    int[] result = mergeSort.sort(collection);
    int[] anticipatedResult = new int[]{0,1,2,3,4,5,6,7,8,9};
    assertTrue(Arrays.equals(result, anticipatedResult));
  }
}
