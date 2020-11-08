package main.problems.generating_subsets;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * SubsetGenerator is used to perform subset operations on the input set.
 */

abstract class SubsetGenerator<T> {
  protected final ArrayList<T> setAsList;

  SubsetGenerator(HashSet<T> inputSet) {
    setAsList = new ArrayList<>(inputSet);
  }

  /**
   * Returns the power set of the input set.
   *
   * The power set of any set S is the set of all subsets of S, including the
   * empty set and S itself.
   */
  abstract public HashSet<HashSet<T>> getPowerset();
}
