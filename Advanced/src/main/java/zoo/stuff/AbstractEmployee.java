package zoo.stuff;

import zoo.animals.Animal;

import java.util.Collection;

public abstract class AbstractEmployee<A extends Animal> implements Employee<A> {

  private Collection<A> animals;

  private String name;

  private int age;

  public AbstractEmployee(Collection<A> animals, String name, int age) {
    this.animals = animals;
    this.name = name;
    this.age = age;
  }

  @Override
  public Collection<A> getAnimals() {
    return animals;
  }
}
