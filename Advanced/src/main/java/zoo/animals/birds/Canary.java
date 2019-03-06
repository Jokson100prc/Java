package zoo.animals.birds;

import zoo.animals.birds.eggs.Color;
import zoo.animals.birds.eggs.Egg;

public class Canary extends AbstractBird {
  public Canary(int weight, String name) {
    super(weight, name);
  }

  @Override
  public void sing() {
    System.out.println(getName() + " is singing like Sinatra... " +
            "'...do be do be du...'");
  }

  @Override
  public void fly() {
    System.out.println(getName() + " is flying");
  }

  @Override
  public Egg layEgg() {
    return new Egg(Color.GREEN);
  }

  @Override
  public void sleep() {
    System.out.println("Tired " + getName() + " is sleeping now");
  }

}
