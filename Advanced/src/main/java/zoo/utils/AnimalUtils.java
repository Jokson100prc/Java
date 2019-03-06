package zoo.utils;

import zoo.animals.Animal;

public class AnimalUtils {

  public static int calculateNewWeight(Animal animal, int mealWeight) {
    return animal.getWeight() + (mealWeight / 10);
  }
}
