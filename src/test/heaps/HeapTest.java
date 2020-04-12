package test.heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import main.heaps.Heap;

public class HeapTest {
  @Test
  public void constructor() {
    int[] intArray = new int[]{6, 7, 8, 9, 10};
    ArrayList<Integer> intList
        = new ArrayList<>(Arrays.stream(intArray).boxed().collect(Collectors.toList()));
    Heap myHeap = new Heap(intList);
    ArrayList<Integer> afterHeapification = myHeap.getQueue();
    assertEquals(10, (long) (afterHeapification.get(0)));
  }

}
