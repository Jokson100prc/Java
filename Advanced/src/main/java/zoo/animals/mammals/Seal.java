package zoo.animals.mammals;

public class Seal extends AbstractMammals {
  public Seal(int weight, String name) {
    super(weight, name);
  }

  @Override
  public AbstractMammals getNewAnimal(String name) {
    weight = 10;

    return new Seal(weight,name);
  }

  @Override
  public void sleep() {

  }
}
