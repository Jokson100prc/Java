package zoo.animals.mammals;

import zoo.animals.Animal;

public class Seal extends AbstractMammals{
  public Seal(int weight, String name) {
    super(weight, name);
  }

  @Override
  public AbstractMammals getNewAnimal(int weight, String name) {
    return new Seal(weight,name);
  }

  @Override
  public void sleep() {

  }
}
