package zoo.animals.mammals;

public class Goat extends AbstractMammals {

  public Goat(int weight, String name) {
    super(weight, name);
  }

  @Override
  public AbstractMammals getNewAnimal(String name) {
    weight = 5;
    return new Goat(weight, name);
  }

  @Override
  public void sleep() {

  }
}
