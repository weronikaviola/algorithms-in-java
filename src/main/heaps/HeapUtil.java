package main.heaps;

public class HeapUtil {
  static public int left(int idx) {
    return idx * 2 + 1;
  }

  static public int right(int idx) {
    return idx * 2 + 2;
  }
}