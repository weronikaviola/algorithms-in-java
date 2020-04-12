package test.heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import main.heaps.MaxHeap;

public class MaxHeapTest {
  @Test
  public void constructor() {
    int[] intArray = new int[]{6, 7, 8, 9, 10};
    ArrayList<Integer> intList
        = new ArrayList<>(Arrays.stream(intArray).boxed().collect(Collectors.toList()));
    MaxHeap<Integer> myHeap = new MaxHeap<>(intList);
    ArrayList<Integer> afterHeapification = myHeap.getQueue();
    assertEquals(10, (long) (afterHeapification.get(0)));
  }

  @Test
  public void insert() {
    ArrayList<Integer> myList = new ArrayList<>();
    myList.add(1);
    myList.add(2);
    MaxHeap<Integer> myHeap = new MaxHeap<>(myList);
    myHeap.insert(3);
    int firstElement = myHeap.peek();
    assertEquals(3, firstElement);
  }

  @Test
  public void extract() {
    ArrayList<Integer> myList = new ArrayList<>();
    myList.add(1);
    myList.add(2);
    MaxHeap<Integer> myHeap = new MaxHeap<>(myList);
    int removed = myHeap.extract();
    assertEquals(2, removed);
  }
}
