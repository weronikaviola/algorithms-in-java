package test.problems.max_subarray;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import main.problems.max_subarray.KadanesAlgorithm;
import main.problems.max_subarray.MaxSubarray;


public class KadanesAlgorithmTest {
  MaxSubarray kadanes = new KadanesAlgorithm();

  @Test
  public void maxSubarray() {
    int[] testArray = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
    int[] maxSubarrayBoundries = kadanes.findMaxSubarray(testArray);
    assertEquals(7, maxSubarrayBoundries[0]);
    assertEquals(10, maxSubarrayBoundries[1]);
    assertEquals(43, maxSubarrayBoundries[2]);
  }
}
