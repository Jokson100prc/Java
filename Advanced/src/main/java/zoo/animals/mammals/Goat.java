package zoo.animals.mammals;

public class Goat extends AbstractMammal {


  public Goat(int weight, String name) {
    super(weight, name);
  }

  @Override
  public AbstractMammal getNewAnimal(String name, int weight) {
    return new Goat(weight, name);
  }

  @Override
  public int getInitialWeight() {
    return 2;
  }

  @Override
  public void sleep() {

  }
}
