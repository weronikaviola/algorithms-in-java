package main.sorting;

import com.sun.jdi.InvalidTypeException;
import main.array_helpers.ArrayTypeConverter;

public class InsertionSort extends Sort implements SortingClass {

  @Override
  public int[] sort(int[] array) {
    Integer[] sorted = sortAnyType(ArrayTypeConverter.convertIntsToIntegers(array));
    return ArrayTypeConverter.convertIntegersToInts(sorted);
  }

  public String[] sort(String[] array) {
    sortAnyType(array);
    return array;
  }

  private <T>T[] sortAnyType(T[] array) {
    try {
      for (int j = 1; j < array.length; j++) {
        T key = array[j];
        int i = j - 1;
        while (i >= 0 && compareValues(array[i], key) > 0) {
          array[i + 1] = array[i];
          i = i - 1;
        }
        array[i + 1] = key;
      }
    } catch (InvalidTypeException ex) {
      System.out.println("The type you are trying to sort is not supported.");
    }
    return array;
  }
}
