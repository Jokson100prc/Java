package zoo.animals.mammals;


public class Goat extends AbstractMammals {
  public Goat(int weight, String name) {
    super(weight, name);
  }

  @Override
  public void sleep() {

  }

  @Override
  public AbstractMammals getNewAnimal(int weight, String name) {
    return new Goat(weight, name);
  }



}
