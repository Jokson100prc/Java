package zoo.animals.mammals;

import zoo.animals.AbstractAnimal;

public abstract class AbstractMammals extends AbstractAnimal {

  public static int weight;


  public AbstractMammals(int weight, String name) {
    super(weight, name);
  }

  public abstract AbstractMammals getNewAnimal(String name);

}

