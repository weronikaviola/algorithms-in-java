package main.problems.generating_subsets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SimpleSubsetGenerator<T> extends SubsetGenerator<T> {
  public SimpleSubsetGenerator(HashSet<T> inputSet) {
    super(inputSet);
  }

  @Override
  public HashSet<HashSet<T>> getPowerset() {
    return new HashSet<>(getAllCombinations(setAsList));
  }

  private HashSet<HashSet<T>> getAllCombinations(ArrayList<T> list) {
    HashSet<HashSet<T>> result = new HashSet<>();

    if (list.isEmpty()) {
      result.add(new HashSet<>());
      return result;
    }

    T firstElement = list.get(0);

    result.add(new HashSet<>(Collections.singletonList(firstElement)));

    HashSet<HashSet<T>> partialResult =
        getAllCombinations(new ArrayList<>(list.subList(1, list.size())));

    result.addAll(partialResult);

    partialResult.forEach(subset -> {
      HashSet<T> subsetCopy = new HashSet<>(subset);
      subsetCopy.add(firstElement);
      result.add(subsetCopy);
    });

    return result;
  }
}
