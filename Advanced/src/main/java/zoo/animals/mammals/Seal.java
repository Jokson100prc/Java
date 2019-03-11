package zoo.animals.mammals;

public class Seal extends AbstractMammal {
  public Seal(int weight, String name) {
    super(weight, name);
  }

  @Override
  public int getInitialWeight() {
    return 1;
  }

  @Override
  public AbstractMammal getNewAnimal(String name, int weight) {
    return new Seal(weight,name);
  }

  @Override
  public void sleep() {

  }
}
