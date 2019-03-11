package zoo.stuff;

import zoo.animals.Animal;

import java.util.ArrayList;
import java.util.Collection;

public abstract class AbstractEmployee<A extends Animal, N> implements Employee<A> {

  private Collection<A> animals;

  private String name;

  private int age;

  public AbstractEmployee(Collection<A> animals, String name, int age) {
    this.animals = animals;
    this.name = name;
    this.age = age;
  }

  public AbstractEmployee(String name, int age) {
    this(new ArrayList<>(), name, age);
  }

  @Override
  public Collection<A> getAnimals() {
    return animals;
  }

  public abstract N getNewAnimal(A animal);
}
