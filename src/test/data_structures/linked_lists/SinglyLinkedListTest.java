package test.data_structures.linked_lists;

import main.data_structures.linked_lists.SinglyLinkedList;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class SinglyLinkedListTest {
  @Test
  public void createsAnEmptyList() {
    SinglyLinkedList<String> myList = new SinglyLinkedList<>();

    assertNotNull(myList);
  }
}
