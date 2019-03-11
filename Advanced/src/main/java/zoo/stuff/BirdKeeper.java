package zoo.stuff;

import zoo.animals.birds.AbstractBird;
import zoo.animals.birds.eggs.Egg;

import java.util.Collection;

public class BirdKeeper extends AbstractEmployee<AbstractBird, Egg> {

  public BirdKeeper(Collection<AbstractBird> animals, String name, int age) {
    super(animals, name, age);
  }

  @Override
  public Egg getNewAnimal(AbstractBird animal) {
    return animal.layEgg();
  }

  @Override
  public void feedAnimal(AbstractBird animal) {

  }

  @Override
  public void playWithAnimal(AbstractBird animal) {
    animal.sing();
  }

}
