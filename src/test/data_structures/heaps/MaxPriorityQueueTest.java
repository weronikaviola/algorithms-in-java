package test.data_structures.heaps;

import main.data_structures.heaps.MaxPriorityQueue;
import main.data_structures.heaps.PriorityQueueElement;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MaxPriorityQueueTest {
  @Test
  public void constructor() {
    String[] values = {"strawberry", "cherry", "banana", "lemon"};
    int[] priorities = {2,3,1,0};

    MaxPriorityQueue<String> myQueue = new MaxPriorityQueue<String>(values, priorities);
    assertEquals("cherry", myQueue.maximum().getElement());
  }

  @Test
  public void insert() {
    String[] initialValues = {"coffee", "tea"};
    int[] initialPriority = {1, 2};
    MaxPriorityQueue<String> myQueue = new MaxPriorityQueue<>(initialValues, initialPriority);
    assertEquals("tea", myQueue.maximum().getElement());

    PriorityQueueElement<String> newElement = new PriorityQueueElement<>("lemonade", 5);
    myQueue.insert(newElement);

    assertEquals("lemonade", myQueue.maximum().getElement());
  }

  @Test
  public void maximum() {
    String[] initialValues = {"one", "two"};
    int[] initialPriority = {1, 2};
    MaxPriorityQueue<String> myQueue = new MaxPriorityQueue<>(initialValues, initialPriority);
    assertEquals("two", myQueue.maximum().getElement());
  }

  @Test
  public void extractMax() {
    String[] initialValues = {"one", "two"};
    int[] initialPriority = {1, 2};
    MaxPriorityQueue<String> myQueue = new MaxPriorityQueue<>(initialValues, initialPriority);
    myQueue.extractMax();
    assertEquals("one", myQueue.maximum().getElement());
  }

  @Test
  public void increaseKey() {
    String[] initialValues = {"one", "two", "three"};
    int[] initialPriority = {1, 2, 3};
    MaxPriorityQueue<String> myQueue = new MaxPriorityQueue<>(initialValues, initialPriority);
    myQueue.increaseKey(2, 7);
    assertEquals("one", myQueue.maximum().getElement());
    assertEquals(7, myQueue.maximum().getKey());
  }
}
