package zoo.animals;

import zoo.utils.AnimalUtils;

public abstract class AbstractAnimal implements Animal {

  final protected String name;
  protected int weight;

  public AbstractAnimal(int weight, String name) {
    this.weight = weight;
    this.name = name;
  }

  @Override
  public void eat(int mealWeight) {
    this.weight = AnimalUtils.calculateNewWeight(this, mealWeight);
  }

  @Override
  public int getWeight() {
    return weight;
  }

  @Override
  public String getName() {
    return name;
  }
}
