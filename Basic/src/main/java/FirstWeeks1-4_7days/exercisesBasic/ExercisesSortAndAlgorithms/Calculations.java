package ExercisesSortAndAlgorithms;

import java.util.List;

public class Calculations {

  /**
   * Find Maximal elements in provided list
   *
   * @param elements
   * @return
   */

  public Integer findMax(List<Integer> elements) {
    Integer maxValue = Integer.MIN_VALUE;
    for (Integer element : elements) {
      if (element > maxValue) {
        maxValue = element;
      }
    }
    return maxValue;
  }

  /**
   * Find Minimal elements in provided list
   *
   * @param elements
   * @return
   */

  public Integer findMin(List<Integer> elements) {

    Integer minValue = Integer.MAX_VALUE;
    for (Integer element : elements) {
      if (element < minValue) {
        minValue = element;
      }
    }
    return minValue;
  }

  public float findArithmeticAvg(List<Integer> elements) {
    Integer sum = 0;
    for (Integer element : elements) {
      sum += element;
    }
    return (float) sum / elements.size();
  }

  public float findGeometricAvg(List<Integer> elements) {
    Integer product = 1;
    for (Integer element : elements) {
      product *= element;
    }
    return (float) Math.pow(Math.E, Math.log(product) / elements.size());
  }

}

