package zoo.animals.mammals;

public class Goat extends AbstractMammals{
  public Goat(int weight, String name) {
    super(weight, name);
  }

  @Override
  public void sleep() {

  }

  @Override
  AbstractMammals getNewAnimal(AbstractMammals name) {
    return new Goat(5,"Goo");
  }
}
