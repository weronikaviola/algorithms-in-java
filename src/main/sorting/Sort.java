package main.sorting;

import com.sun.jdi.InvalidTypeException;

public class Sort {
  protected <T>int compareValues(T el1, T el2) throws InvalidTypeException {
    if (el1 instanceof Integer && el2 instanceof Integer) {
      return compareInts((int) el1, (int) el2);
    }
    if (el1 instanceof String && el2 instanceof String) {
      return compareStrings((String) el1, (String) el2);
    }
    throw new InvalidTypeException("Type not supported.");
  }

  private int compareStrings(String str1, String str2) {
    return str1.compareTo(str2);
  }

  protected int compareInts(int int1, int int2) {
    return Integer.compare(int1, int2);
  }
}
