package test.data_structures.heaps;

import main.data_structures.heaps.PriorityQueueElement;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PriorityQueueElementTest {
  @Test
  public void constructor() {
    String testString = "testString_1";
    PriorityQueueElement element = new PriorityQueueElement(testString, 1);
    assertEquals(1, element.getKey());
    assertEquals(testString, element.getElement());
  }

  @Test
  public void setters() {
    String testString = "testString_1";
    PriorityQueueElement element = new PriorityQueueElement(testString, 1);
    element.setElement("testString_2");
    element.setKey(100);
    assertEquals(100, element.getKey());
    assertEquals("testString_2", element.getElement());
  }

  @Test
  public void compareTo_KeysAreTheSame() {
    String testString1 = "testString1";
    String testString2 = "testString2";
    PriorityQueueElement element1 = new PriorityQueueElement(testString1, 1);
    PriorityQueueElement element2 = new PriorityQueueElement(testString2, 1);
    assertEquals(0, element1.compareTo(element2));
  }

  @Test()
  public void compare_WrappedElementsAreTheSameButKeysAreDifferent() {
    String testString1 = "testString1";
    PriorityQueueElement element1 = new PriorityQueueElement(testString1, 1);
    PriorityQueueElement element2 = new PriorityQueueElement(testString1, 2);
    assertEquals(-1, element1.compareTo(element2));
  }
}
