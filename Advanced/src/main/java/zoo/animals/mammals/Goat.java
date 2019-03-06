package zoo.animals.mammals;

import zoo.animals.Animal;

public class Goat extends AbstractMammals {
  public Goat(int weight, String name) {
    super(weight, name);
  }

  @Override
  public void sleep() {

  }

  @Override
  public AbstractMammals getNewAnimal(int weight, String name) {
    return new Goat(weight, name);
  }

  @Override
  public Animal getNewAnimal2(Animal name) {
    return new Animal() {
      @Override
      public void eat(int mealWeight) {

      }

      @Override
      public void sleep() {

      }

      @Override
      public int getWeight() {
        return 0;
      }

      @Override
      public String getName() {
        return null;
      }
    };
  }
}
