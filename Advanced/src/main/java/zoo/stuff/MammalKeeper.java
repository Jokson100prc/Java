package zoo.stuff;

import zoo.animals.Animal;
import zoo.animals.mammals.AbstractMammals;

import java.util.Collection;

public class MammalKeeper extends AbstractEmployee<AbstractMammals>{

  public MammalKeeper(Collection <AbstractMammals> animals, String name, int age) {
    super(animals, name, age);
  }

  @Override
  public void feedAnimal(AbstractMammals animal) {
System.out.println(animal.getName() + " eat now");
  }

  @Override
  public void playWithAnimal(AbstractMammals animal) {
System.out.println(animal.getName() + " have fun now");
  }
}
