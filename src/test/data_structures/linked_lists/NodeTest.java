package test.data_structures.linked_lists;

import main.data_structures.linked_lists.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class NodeTest {
  @Test
  public void createsTheNode() {
    Node<String> node = new Node<>("test");
    assertNotNull(node);
    assertEquals("test", node.value);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void throwsErrorWhenInitializedWithNoData() {
    new Node<>();
  }
}
