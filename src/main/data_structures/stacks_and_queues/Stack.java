package main.data_structures.stacks_and_queues;

import java.util.ArrayList;

public class Stack implements StackInterface {
  private Object[] stack;
  private int currentPointer;
  private int capacity;

  public Stack(int capacity) {
    stack = new Object[capacity];
    currentPointer = 0;
    this.capacity = capacity;
  }

  @Override
  public boolean empty() {
    return currentPointer == 0;
  }

  @Override
  public Stack push(Object element) {
    if (currentPointer == capacity) throw new Error("Stack overflow");
    stack[currentPointer++] = element;
    return this;
  }

  @Override
  public Object pop() {
    if (currentPointer == 0) throw new Error("Stack underflow");
    Object returnValue = stack[currentPointer-1];
    stack[currentPointer--] = null;
    return returnValue;
  }

  @Override
  public Object top() {
    if (currentPointer == 0) throw new Error("Stack underflow");
    return stack[currentPointer-1];
  }
}
