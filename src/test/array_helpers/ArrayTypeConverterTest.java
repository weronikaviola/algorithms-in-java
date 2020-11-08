package test.array_helpers;

import main.utilities.array_helpers.ArrayTypeConverter;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayTypeConverterTest {
  @Test
  public void convertIntsToStrings() {
    int[] ints = {1,21,321};
    String[] result = ArrayTypeConverter.convertIntsToStrings(ints);
    String[] expectedStrings = {"1", "21", "321"};

    assertArrayEquals(expectedStrings, result);
  }

  @Test
  public void convertIntsToSameLenStrings() throws Exception{
    int[] ints = {0, 12345, 44};
    String[] result = ArrayTypeConverter.convertIntsToSameLenStrings(ints, 5);
    String[] expectedStrings = {"00000", "12345", "00044"};

    assertArrayEquals(expectedStrings, result);
  }

  @Test(expected = Exception.class)
  public void convertIntsToSameLenStrings_exceptionWhenIncorrectLength()
      throws Exception{
    int[] ints = {1, 11, 111};
    ArrayTypeConverter.convertIntsToSameLenStrings(ints, 2);
  }

  @Test
  public void convertIntsToSameLenStrings_noLengthSpecified() {
    int[] ints = {0, 123456, 1};
    String[] result = ArrayTypeConverter.convertIntsToSameLenStrings(ints);
    String[] expectedStrings = {"000000", "123456", "000001"};

    assertArrayEquals(expectedStrings, result);
  }

  @Test
  public void convertIntsToSameLenStrings_emptyArray() {
    int[] ints = {};
    String[] result = ArrayTypeConverter.convertIntsToSameLenStrings(ints);
    String[] expectedStrings = {};

    assertArrayEquals(expectedStrings, result);
  }

  @Test
  public void convertStringsToInts() {
    String[] strings = {"1", "11", "02", "13"};
    int[] result = ArrayTypeConverter.convertStringsToInts(strings);
    int[] expectedResult = {1, 11, 2, 13};

    assertArrayEquals(expectedResult, result);
  }

  @Test
  public void convertIntsToIntegers() {
    int[] ints = {1, 2, 3};
    Integer[] result = ArrayTypeConverter.convertIntsToIntegers(ints);
    Integer[] expectedResult = {1, 2, 3};

    assertArrayEquals(expectedResult, result);
  }

  @Test
  public void convertIntegersToInts() {
    Integer[] integers = {1, 2, 3};
    int[] result = ArrayTypeConverter.convertIntegersToInts(integers);
    int[] expectedResult = {1, 2, 3};

    assertArrayEquals(expectedResult, result);
  }
}
