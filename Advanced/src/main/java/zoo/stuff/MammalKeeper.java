package zoo.stuff;

import zoo.animals.mammals.AbstractMammal;

import java.util.Collection;

public class MammalKeeper extends AbstractEmployee<AbstractMammal>{

  public MammalKeeper(Collection <AbstractMammal> animals, String name, int age) {
    super(animals, name, age);
  }

  @Override
  public void feedAnimal(AbstractMammal animal) {
System.out.println(animal.getName() + " eat now");
  }

  @Override
  public void playWithAnimal(AbstractMammal animal) {
System.out.println(animal.getName() + " have fun now");
  }
}
