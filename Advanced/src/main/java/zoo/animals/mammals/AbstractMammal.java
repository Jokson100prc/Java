package zoo.animals.mammals;

import zoo.animals.AbstractAnimal;

public abstract class AbstractMammal extends AbstractAnimal {

  public static int weight;


  public AbstractMammal(int weight, String name) {
    super(weight, name);
  }

  public abstract AbstractMammal getNewAnimal(String name);

}

