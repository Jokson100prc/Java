package zoo.animals.birds;

import zoo.animals.AbstractAnimal;
import zoo.animals.birds.eggs.Egg;

public abstract class AbstractBird extends AbstractAnimal {

  public AbstractBird(int weight, String name) {
    super(weight, name);

  }

  public abstract void sing();

  public abstract void fly();

  public abstract Egg layEgg();
}
