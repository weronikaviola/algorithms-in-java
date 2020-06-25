package main.data_structures.stacks_and_queues;

public class Queue implements QueueInterface {
  Object[] queue;
  int headIdx;
  int tailIdx;
  int capacity;

  public Queue(int capacity) {
    queue = new Object[capacity];
    headIdx = 0;
    tailIdx = 0;
    this.capacity = capacity;
  }

  @Override
  public QueueInterface enqueue(Object element) {
    if (queue[tailIdx] != null) throw new Error("Queue overflow.");
    queue[tailIdx++] = element;
    tailIdx %= capacity;
    System.out.println("after enqueue, tail: " + tailIdx + ", head: " + headIdx);
    return this;
  }

  @Override
  public Object dequeue() {
    if (queue[headIdx] == null) throw new Error("Queue underflow.");
    Object element = queue[headIdx];
    queue[headIdx++] = null;
    headIdx %= capacity;
    return element;
  }
}
