package test.problems.generating_subsets;

import main.problems.generating_subsets.SimpleSubsetGenerator;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class SimpleSubsetGeneratorTest {
  @Test
  public void generatesPowerset() {
    HashSet<String> inputSet = new HashSet<>(
        Arrays.asList("one", "two", "three", "four"));
    SimpleSubsetGenerator<String> generator =
        new SimpleSubsetGenerator<>(inputSet);
    HashSet<HashSet<String>> output = generator.getPowerset();

    int expectedSize = 16;

    assertEquals(expectedSize, output.size());
  }

  @Test
  public void generatePowerset_emptyInput() {
    SimpleSubsetGenerator<String> generator = new SimpleSubsetGenerator<>(new HashSet<>());
    HashSet<HashSet<String>> result = generator.getPowerset();

    assertEquals(1, result.size());
  }
}
