package zoo.animals.mammals;

public class Bear extends AbstractMammal {

  @Override
  public int getInitialWeight() {
    return 5;
  }

  public Bear(int weight, String name) {
    super(weight, name);
  }

  @Override
  public AbstractMammal getNewAnimal(String name, int weight) {
    return new Bear(weight, name);
  }

  public AbstractMammal getNewAnimal(String name) {
    return getNewAnimal(name, weight);
  }

  @Override
  public void sleep() {
    System.out.println(this.getName() + " is sleeping");
  }


}
