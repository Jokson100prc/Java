package zoo.animals.mammals;


import zoo.animals.AbstractAnimal;
import zoo.animals.Animal;

public abstract class AbstractMammals extends AbstractAnimal {


  public AbstractMammals(int weight, String name) {
    super(weight, name);
  }

  public abstract AbstractMammals getNewAnimal(int weight, String name);

  // this method is not usefull - always gives null
  public abstract Animal getNewAnimal2(Animal name);

}

