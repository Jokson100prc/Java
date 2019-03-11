package zoo.animals.mammals;

import zoo.animals.AbstractAnimal;

public abstract class AbstractMammal extends AbstractAnimal {

  public abstract int getInitialWeight();

  public abstract AbstractMammal getNewAnimal(String name, int weigh);


  public AbstractMammal getNewAnimal(String name){
   return getNewAnimal(name, getInitialWeight());
  }

  public AbstractMammal(int weight, String name) {
    super(weight, name);
  }
}

