package main.data_structures.heaps;

public class HeapUtil {
  static public int left(int idx) {
    return idx * 2 + 1;
  }

  static public int right(int idx) {
    return idx * 2 + 2;
  }

  static public int parent(int idx) {
    return (idx - 1)/2;
  }
}
