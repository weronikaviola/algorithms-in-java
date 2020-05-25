package main.data_structures.stacks_and_queues;

import java.util.Stack;

public interface StackInterface {
  boolean empty();
  StackInterface push(Object element);
  Object pop();
  Object top();
}
