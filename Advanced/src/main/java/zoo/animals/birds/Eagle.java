package zoo.animals.birds;

import zoo.animals.birds.eggs.Color;
import zoo.animals.birds.eggs.Egg;

public class Eagle extends AbstractBird {

  public Eagle(int weight, String name) {
    super(weight, name);
  }

  @Override
  public void sing() {
    System.out.println("trala la kra kra");
  }

  @Override
  public void fly() {
    System.out.println(getName() + " is flying");
  }

  @Override
  public Egg layEgg() {
    return new Egg(Color.BLUE);
  }

  @Override
  public void sleep() {
    System.out.println(getName() + " is sleeping");
  }
}
