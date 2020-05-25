package main.data_structures.heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class MaxPriorityQueue<T> implements PriorityQueue {
  MaxHeap<PriorityQueueElement> heap;

  public MaxPriorityQueue(T[] elements, int[] priorities) {
    AtomicInteger indexCounter = new AtomicInteger(0);
    ArrayList<PriorityQueueElement> list =
        new ArrayList(
            Arrays.stream(elements).map(
                (el) -> new PriorityQueueElement(el, priorities[indexCounter.getAndIncrement()])).collect(
                    Collectors.toList()));
    heap = new MaxHeap<PriorityQueueElement>(list);
  }

  @Override
  public PriorityQueue insert(PriorityQueueElement element) {
    heap.insert(element);
    return this;
  }

  public PriorityQueueElement maximum() {
    return heap.peek();
  }

  public PriorityQueueElement extractMax() {
    if (heap.isEmpty()) throw new Error("Heap underflow.");
    return heap.extract();
  }

  public void increaseKey(int idx, int newValue) {
    if (heap.getAtIdx(idx).getKey() >= newValue) throw new Error("New key is smaller or equal to the current key.");
    heap.getAtIdx(idx).setKey(newValue);
    heap.siftUp(idx);
  }
}
