package main.problems.generating_subsets;

import java.util.HashSet;

public class BinaryCountingSubsetGenerator<T> extends SubsetGenerator<T> {
  public BinaryCountingSubsetGenerator(HashSet<T> inputSet) {
    super(inputSet);
  }

  @Override
  public HashSet<HashSet<T>> getPowerset() {
    HashSet<HashSet<T>> output = new HashSet<>();

    for (int i = 0; i <= Math.pow(2, setAsList.size()) - 1; i++) {
      output.add(generateSubset(Integer.toBinaryString(i)));
    }

    output.add(new HashSet<>(setAsList));

    return output;
  }

  private HashSet<T> generateSubset(String binaryString) {
    int stringLength = binaryString.length();
    HashSet<T> subset = new HashSet<>();

    for (int i = 0; i <= binaryString.length(); i++) {
      if (binaryString.startsWith("1", stringLength - i)) {
        subset.add(setAsList.get(setAsList.size() - i));
      }
    }

    return subset;
  }
}
