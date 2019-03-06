package zoo.stuff;


import zoo.animals.Animal;

import java.util.Collection;

public interface Employee<A extends Animal> {

  Collection<A> getAnimals();

  void feedAnimal(A animal);

  void playWithAnimal(A animal);
}
