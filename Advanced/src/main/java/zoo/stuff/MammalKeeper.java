package zoo.stuff;

import zoo.animals.mammals.AbstractMammal;
import zoo.utils.AnimalUtils;

import java.util.Collection;

public class MammalKeeper extends AbstractEmployee<AbstractMammal, AbstractMammal> {

  public MammalKeeper(Collection<AbstractMammal> animals, String name, int age) {
    super(animals, name, age);
  }

  @Override
  public void feedAnimal(AbstractMammal animal) {
    animal.eat(1);
  }

  @Override
  public AbstractMammal getNewAnimal(AbstractMammal animal) {
    return animal.getNewAnimal(AnimalUtils.generateNewName());
  }

  @Override
  public void playWithAnimal(AbstractMammal animal) {
    animal.sleep();
  }
}
