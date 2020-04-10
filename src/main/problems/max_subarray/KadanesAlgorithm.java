package main.problems.max_subarray;

public class KadanesAlgorithm implements MaxSubarray {

  @Override
  public int[] findMaxSubarray(int[] array) {
    int maxSum = array[0];
    int maxI = 0;
    int maxJ = 0;

    int currMax = array[0];
    int currI = 0;
    int currJ = 0;

    for (int i = 1; i < array.length; i++) {
      if (currMax <= 0) {
        currI = i;
        currMax = array[i];
      } else {
        currMax += array[i];
      }
      currJ = i;
      if (currMax > maxSum) {
        maxSum = currMax;
        maxJ = currJ;
        maxI = currI;
      }
    }

    return new int[]{maxI, maxJ, maxSum};
  }
}
