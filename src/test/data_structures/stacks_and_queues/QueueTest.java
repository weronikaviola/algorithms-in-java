package test.data_structures.stacks_and_queues;

import main.data_structures.stacks_and_queues.Queue;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QueueTest {
  Queue myQueue;

  @Before
  public void initialize() {
    myQueue = new Queue(3);
  }

  @Test
  public void enqueueAndDequeue() {
    myQueue.enqueue(4).enqueue(2);
    assertEquals(4, myQueue.dequeue());
  }

  @Test
  public void enqueueAndDequeueMultipleTimes() {
    myQueue.enqueue(1).enqueue(2).dequeue();
    myQueue.enqueue(3).enqueue(4).dequeue();
    myQueue.dequeue();
    assertEquals(4, myQueue.dequeue());
    myQueue.enqueue(5).dequeue();
    myQueue.enqueue(6);
    assertEquals(6, myQueue.dequeue());
  }

  @Test(expected = Error.class)
  public void throwErrorWhenQueueUnderflow() {
    myQueue.dequeue();
  }

  @Test(expected = Error.class)
  public void throwErrorWhenQueueOverflow() {
    myQueue.enqueue(1).enqueue(2).enqueue(3).enqueue(4);
  }
}
