package zoo.animals.mammals;

import zoo.animals.AbstractAnimal;

public class Bear extends AbstractMammals {

  public Bear(int weight, String name) {
    super(weight, name);
  }

  @Override
  public void sleep() {
    System.out.println(this.getName() + " is sleeping");
  }

  @Override
  AbstractMammals getNewAnimal(AbstractMammals name) {
    return new Bear(20,"Tedy");
  }
}
