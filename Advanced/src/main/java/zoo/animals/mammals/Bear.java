package zoo.animals.mammals;

import zoo.animals.Animal;

public class Bear extends AbstractMammals {

  public Bear(int weight, String name) {
    super(weight, name);
  }

  @Override
  public void sleep() {
    System.out.println(this.getName() + " is sleeping");
  }

  @Override
  public AbstractMammals getNewAnimal(int weight, String name) {
    return new Bear(weight, name);
  }

}
