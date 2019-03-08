package zoo.animals.mammals;

public class Seal extends AbstractMammal {
  public Seal(int weight, String name) {
    super(weight, name);
  }

  @Override
  public AbstractMammal getNewAnimal(String name) {
    weight = 10;

    return new Seal(weight,name);
  }

  @Override
  public void sleep() {

  }
}
