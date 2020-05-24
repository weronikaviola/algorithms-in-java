package main.sorting;

import com.sun.jdi.InvalidTypeException;
import main.array_helpers.ArrayTypeConverter;

import java.util.Arrays;
import java.util.Comparator;

public class RadixSort extends Sort implements SortingClass {
  @Override
  public int[] sort(int[] collection) {
    if (collection.length > 0) {
      return sortStringsByRadix(ArrayTypeConverter.convertIntsToSameLenStrings(collection));
    }
    return collection;
  }

  private int[] sortStringsByRadix(String[] array) {
    int numDigits = array[0].length();
    for (int i = numDigits - 1; i >= 0; i--) {
      sortByDigit(i, array);
    }
    return ArrayTypeConverter.convertStringsToInts(array);
  }

  private void sortByDigit(int digit, String[] array) {
    Arrays.sort(array, (o1, o2) -> {
      if (o1.length() > digit) {
        try {
          String char1 = o1.substring(digit, digit + 1);
          String char2 = o2.substring(digit, digit + 1);
          return compareValues(char1, char2);
        } catch (InvalidTypeException ex) {
          System.out.print("Invalid type");
        }
      }
      return 0;
    });
  }
}
