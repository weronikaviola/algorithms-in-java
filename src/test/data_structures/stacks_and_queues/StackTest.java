package test.data_structures.stacks_and_queues;

import main.data_structures.stacks_and_queues.Stack;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StackTest {
  Stack myStack;
  @Before public void initialize() {
    myStack = new Stack(3);
  }

  @Test
  public void isEmpty() {
    assertEquals(true, myStack.empty());
  }

  @Test
  public void push() {
    myStack.push(11);
    myStack.push(3);
    assertEquals(3, myStack.top());
  }

  @Test
  public void pop() {
    myStack.push(11);
    myStack.push(3);
    int element = (int) myStack.pop();
    assertEquals(3, element);
    assertEquals(11, myStack.top());
  }

  @Test(expected = Error.class)
  public void throwErrorWhenStackOverflow() {
    myStack.push(11);
    myStack.push(3);
    myStack.push(5);
    myStack.push(11);
  }

  @Test(expected = Error.class)
  public void throwErrorWhenStackUnderflow() {
    myStack.pop();
  }
}
