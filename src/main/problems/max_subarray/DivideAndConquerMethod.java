package main.problems.max_subarray;

public class DivideAndConquerMethod implements MaxSubarray {

  @Override
  public int[] findMaxSubarray(int[] array) {
    return findMaxSubarray(array, 0, array.length - 1);
  }

  private int[] findMaxSubarray(int[] arr, int low, int high) {
    if (high == low) {
      return new int[]{low, high, arr[low]};
    }
    else {
      int mid = (low + high)/2;
      int[] leftResult = findMaxSubarray(arr, low, mid);
      int[] rightResult = findMaxSubarray(arr, mid + 1, high);
      int[] crossResult = findMaxCrossingSubarray(arr, low, mid, high);

      int sumResultIdx = 2;
      if (leftResult[sumResultIdx] >= rightResult[sumResultIdx]
          && leftResult[sumResultIdx] >= crossResult[sumResultIdx]) {
        return leftResult;
      } else if (rightResult[sumResultIdx] >= leftResult[sumResultIdx]
          && rightResult[sumResultIdx] >= crossResult[sumResultIdx]) {
        return rightResult;
      } else {
        return crossResult;
      }
    }
  }

  private int[] findMaxCrossingSubarray(int[] arr, int l, int m, int h) {
    int leftSum = Integer.MIN_VALUE;
    int sum = 0;
    int maxL = Integer.MIN_VALUE;
    int maxR = Integer.MIN_VALUE;
    for (int i = m; i >= l; i--) {
      sum = sum + arr[i];
      if (sum > leftSum) {
        leftSum = sum;
        maxL = i;
      }
    }

    int rightSum = Integer.MIN_VALUE;
    sum = 0;
    for (int j = m + 1; j <= h; j++) {
      sum += arr[j];
      if (sum > rightSum) {
        rightSum = sum;
        maxR = j;
      }
    }
    return new int[]{maxL, maxR, leftSum + rightSum};
  }
}
