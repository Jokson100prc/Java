package zoo.animals.mammals;

public class Bear extends AbstractMammal {

//  public static int weight;

  public Bear(int weight, String name) {
    super(weight, name);
  }

  @Override
  public AbstractMammal getNewAnimal(String name) {
    weight = 15;
    return new Bear(weight, name);
  }

  @Override
  public void sleep() {
    System.out.println(this.getName() + " is sleeping");
  }


}
