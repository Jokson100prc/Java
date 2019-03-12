package zoo.utils;

import com.github.javafaker.Faker;
import zoo.animals.Animal;

public class AnimalUtils {

  public static int calculateNewWeight(Animal animal, int mealWeight) {
    return animal.getWeight() + (mealWeight / 10);
  }

  public static String generateNewName() {
    Faker faker = new Faker();
    return faker.name().firstName();
  }
}
