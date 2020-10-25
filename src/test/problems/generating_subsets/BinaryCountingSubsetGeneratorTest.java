package test.problems.generating_subsets;

import main.problems.generating_subsets.BinaryCountingSubsetGenerator;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class BinaryCountingSubsetGeneratorTest {
  @Test
  public void generatesPowerset() {
    HashSet<String> inputSet = new HashSet<>(
        Arrays.asList("one", "two", "three", "four"));
    BinaryCountingSubsetGenerator<String> generator =
        new BinaryCountingSubsetGenerator<>(inputSet);
    HashSet<HashSet<String>> output = generator.getPowerset();

    int expectedSize = 16;

    assertEquals(expectedSize, output.size());
  }

  @Test
  public void generatePowerset_emptyInput() {
    HashSet<HashSet<String>> result =
        new BinaryCountingSubsetGenerator<>(new HashSet<String>())
            .getPowerset();

    assertEquals(1, result.size());
  }
}
