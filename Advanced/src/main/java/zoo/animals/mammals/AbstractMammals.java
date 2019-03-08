package zoo.animals.mammals;


import zoo.animals.AbstractAnimal;

public abstract class AbstractMammals extends AbstractAnimal {


  public AbstractMammals(int weight, String name) {
    super(weight, name);
  }

  public abstract AbstractMammals getNewAnimal(int weight, String name);

}

