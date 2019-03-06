package zoo.stuff;

import zoo.animals.birds.AbstractBird;

import java.util.Collection;

public class BirdKeeper extends AbstractEmployee<AbstractBird> {

  public BirdKeeper(Collection<AbstractBird> animals, String name, int age) {
    super(animals, name, age);
  }

  @Override
  public void feedAnimal(AbstractBird animal) {

  }

  @Override
  public void playWithAnimal(AbstractBird animal) {
    animal.sing();
  }
}
