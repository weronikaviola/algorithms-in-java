package main.array_helpers;

import java.util.Arrays;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * A helper class used to convert arrays of values for the purposes of some
 * algorithms.
 * @author weronikamiller
 */

public class ArrayTypeConverter {
  /**
   * Converts an array of int's to the array of {@link java.lang.String}s.
   *
   * Transforms each of the elements into their String representation.
   * @param array an array of int's
   * @return array of Strings
   */
  public static String[] convertIntsToStrings(int[] array) {
    return Arrays.stream(array)
              .mapToObj(Integer::toString)
              .toArray(String[]::new);
  }

  /**
   * Converts an array of int's to the array of equal length
   * {@link java.lang.String}s.
   *
   * Transforms each of the elements into their {@link java.lang.String}
   * representations and adds padding of "0"s to match the desired length.
   *
   * Throws an Exception if some of the input elements would exceed the
   * specified length.
   *
   * Example:
   * input: [1, 12, 123], 3
   * output: ["001", "012", "123"]
   *
   * @param array of int's
   * @param len desired length of each generated string
   * @return array of equal length Strings
   */
  public static String[] convertIntsToSameLenStrings(int[] array, int len)
      throws Exception{
    int largestNumberLength =
        Integer.toString(Arrays.stream(array).max().orElse(0)).length();

    if (largestNumberLength > len) {
      throw new Exception("Specified length must be greater or equal the " +
          "length of the greatest integer converted to string");
    }

    return convertIntsToSameLenStringsUnchecked(array, len);
  }

  /**
   * Converts an array of int's to the array of equal length
   * {@link java.lang.String}s.
   *
   * Transforms each of the elements into their {@link java.lang.String}
   * representations and adds padding of "0"'s to match the length of the
   * largest number.
   *
   * @param array array of int's
   * @return array of equal length strings
   */
  public static String[] convertIntsToSameLenStrings(int[] array) {
    try {
      return convertIntsToSameLenStringsUnchecked(
          array,
          Integer.toString(Arrays.stream(array).max().getAsInt()).length());
    } catch (Exception e) {
      return new String[]{};
    }
  }

  /**
   * Converts an array of Strings to the array of int's.
   *
   * Interprets each element in the array using
   * {@link java.lang.Integer#parseInt(String)} method.
   *
   * @param array an array of Strings
   * @return an array of int's
   */
  public static int[] convertStringsToInts(String[] array) {
    return Arrays.stream(array).mapToInt(Integer::parseInt).toArray();
  }

  /**
   * Converts an array of int's to the array of {@link java.lang.Integer}s.
   *
   * @param array array of int's
   * @return an array of {@link java.lang.Integer}s
   */
  public static Integer[] convertIntsToIntegers(int[] array) {
    return Arrays.stream(array).boxed().toArray(Integer[]::new);
  }

  /**
   * Converts an array of {@link java.lang.Integer}s to the array of int's.
   *
   * @param array array of {@link java.lang.Integer}s
   * @return an array of int's
   */
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

  private static String[] convertIntsToSameLenStringsUnchecked(int[] array, int len) {
    return Arrays.stream(array)
        .mapToObj(Integer::toString)
        .map(el -> padStringLeft(el, len))
        .toArray(String[]::new);
  }
}
