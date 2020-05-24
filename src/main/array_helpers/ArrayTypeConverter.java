package main.array_helpers;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayTypeConverter {
  public static String[] convertIntsToStrings(int[] array) {
    String[] strings = new String[array.length];
    for (int i = 0; i < array.length; i++) {
      strings[i] = Integer.toString(array[i]);
    }
    return strings;
  }

  public static String[] convertIntsToSameLenStrings(int[] array, int len) {
    String[] strings = convertIntsToStrings(array);
    return Arrays.stream(strings).map((el) -> padStringLeft(el, len)).toArray(String[]::new);
  }

  public static String[] convertIntsToSameLenStrings(int[] array) {
    int len = Arrays.stream(array).max().getAsInt();
    return convertIntsToSameLenStrings(array, len);
  }

  public static int[] convertStringsToInts(String[] array) {
    int[] integers = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      integers[i] = Integer.parseInt(array[i]);
    }
    return integers;
  }

  public static Integer[] convertIntsToIntegers(int[] array) {
    return Arrays.stream(array).boxed().toArray(Integer[]::new);
  }

  public static int[] convertIntegersToInts(Integer[] array) {
    return Arrays.stream(array).mapToInt(Integer::intValue).toArray();
  }

  private static String padStringLeft(String inputString, int length) {
    if (inputString.length() >= length) {
      return inputString;
    }

    StringBuilder sb = new StringBuilder();
    while (sb.length() < length - inputString.length()) {
      sb.append('0');
    }
    sb.append(inputString);

    return sb.toString();
  }
}
