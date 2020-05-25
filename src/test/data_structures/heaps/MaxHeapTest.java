package test.data_structures.heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import main.data_structures.heaps.MaxHeap;

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
    ArrayList<Integer> myList = getInitialList();
    MaxHeap<Integer> myHeap = new MaxHeap<>(myList);
    myHeap.insert(5);
    int firstElement = myHeap.peek();
    assertEquals(5, firstElement);
  }

  @Test
  public void extract() {
    ArrayList<Integer> myList = getInitialList();
    MaxHeap<Integer> myHeap = new MaxHeap<>(myList);
    int removed = myHeap.extract();
    assertEquals(4, removed);
  }

  @Test
  public void change() {
    ArrayList<Integer> myList = getInitialList();
    MaxHeap<Integer> myHeap = new MaxHeap<>(myList);
    myHeap.change(3, 15);
    assertTrue(myHeap.peek().equals(15));
  }

  private ArrayList<Integer> getInitialList() {
    ArrayList<Integer> myList = new ArrayList<>();
    myList.add(1);
    myList.add(2);
    myList.add(3);
    myList.add(4);
    return myList;
  }
}
