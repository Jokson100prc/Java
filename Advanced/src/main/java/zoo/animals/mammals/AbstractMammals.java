package zoo.animals.mammals;

import zoo.animals.AbstractAnimal;
import zoo.animals.Animal;

public abstract class AbstractMammals extends AbstractAnimal {
  public AbstractMammals(int weight, String name) {
    super(weight, name);
  }


  abstract AbstractMammals getNewAnimal(AbstractMammals name);
}

