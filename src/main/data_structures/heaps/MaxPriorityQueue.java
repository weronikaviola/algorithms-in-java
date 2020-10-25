package main.data_structures.heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class MaxPriorityQueue<T> extends PriorityQueue<T> {
  MaxHeap<PriorityQueueElement<T>> heap;

  public MaxPriorityQueue(T[] elements, int[] priorities) {
    AtomicInteger indexCounter = new AtomicInteger(0);
    ArrayList<PriorityQueueElement<T>> list =
        Arrays.stream(elements)
            .map((el) -> new PriorityQueueElement<>(
                el, priorities[indexCounter.getAndIncrement()]))
            .collect(Collectors.toCollection(ArrayList::new));

    heap = new MaxHeap<>(list);
  }

  @Override
  public PriorityQueue<T> insert(PriorityQueueElement<T> element) {
    heap.insert(element);
    return this;
  }

  public PriorityQueueElement<T> maximum() {
    return heap.peek();
  }

  public PriorityQueueElement<T> extractMax() throws Exception {
    if (heap.isEmpty()) {
      throw new Exception("Heap underflow.");
    }
    return heap.extract();
  }

  public void increaseKey(int idx, int newValue) throws Exception {
    if (heap.getAtIdx(idx).getKey() >= newValue) {
      throw new Exception("New key is smaller or equal to the current key.");
    }

    heap.getAtIdx(idx).setKey(newValue);
    heap.siftUp(idx);
  }
}
