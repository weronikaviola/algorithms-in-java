package test.data_structures.heaps;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import main.data_structures.heaps.HeapUtil;

public class HeapUtilTest {
  @Test
  public void left() {
    int number = 12;
    int expectedLeft = 25;
    int actualLeft = HeapUtil.left(number);
    assertEquals(expectedLeft, actualLeft);
  }

  @Test
  public void right() {
    int number = 29;
    int expectedRight = 60;
    int actualRight = HeapUtil.right(number);
    assertEquals(expectedRight, actualRight);
  }

  @Test
  public void parent() {
    int index = 2;
    int expectedParentIdx = 0;
    int actualParentIdx = HeapUtil.parent(index);
    assertEquals(expectedParentIdx, actualParentIdx );
  }
}
