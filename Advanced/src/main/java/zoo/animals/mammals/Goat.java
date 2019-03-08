package zoo.animals.mammals;

public class Goat extends AbstractMammal {

  public Goat(int weight, String name) {
    super(weight, name);
  }

  @Override
  public AbstractMammal getNewAnimal(String name) {
    weight = 5;
    return new Goat(weight, name);
  }

  @Override
  public void sleep() {

  }
}
