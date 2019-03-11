package zoo;

import zoo.animals.birds.AbstractBird;
import zoo.animals.birds.Canary;
import zoo.animals.birds.Eagle;
import zoo.animals.birds.eggs.Color;
import zoo.animals.birds.eggs.Egg;
import zoo.animals.mammals.AbstractMammal;
import zoo.animals.mammals.Bear;
import zoo.animals.mammals.Goat;
import zoo.stuff.BirdKeeper;
import zoo.stuff.MammalKeeper;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ZooApplication {

  public static void main(String[] args) {
    Bear bear = new Bear(100, "Teddy");
    Goat greg = new Goat(55, "Greg");
    Bear yogi = new Bear(400, "Yogi");

    Eagle eagle1 = new Eagle(20, "Anne"); //ok
    Eagle eagle2 = new Eagle(20, "Alex"); //ok
    Canary rainha = new Canary(1, "Rainha");

    BirdKeeper john = new BirdKeeper(Arrays.asList(eagle1, eagle2, rainha), "John", 33);
    MammalKeeper anna = new MammalKeeper(Arrays.asList(yogi, greg, bear), "Anna", 25);

    //playtime
    john.getAnimals().forEach(john::playWithAnimal);

    Egg eagle1Egg = john.getNewAnimal(((List<AbstractBird>)john.getAnimals()).get(0));


//    List<AbstractBird> abstractBirds = john.getAnimals().stream()
//            .filter(animal -> eagle1.getName().equals(animal.getName()))
//            .collect(Collectors.toList());
   john.getNewAnimal(
           john.getAnimals().stream()
                   .filter(animal -> eagle1.getName().equals(animal.getName())).findFirst().orElseGet(null)
    );
   System.out.println(
           john.getAnimals().stream()
           .filter(animal -> animal.getWeight() >= 20)
           .map(an -> an.getName())
           .collect(Collectors.joining(","))
   );

   System.out.println(john.getAnimals().stream()
           .map(bird -> bird.layEgg())
           .map(egg -> {
           Color eggColor = egg.getColor();
           return eggColor.getColor();
           })
           .collect(Collectors.joining(","))
   );


    //the same as
//    for (AbstractBird animal : john.getAnimals()) {
//      john.playWithAnimal(animal);
//    }


    rainha.eat(9); // kanarek tyje dopiero od 10kg jedzenia, ale za to kilo od razu :D
    System.out.println(rainha.getWeight());


    anna.getAnimals().forEach(anna::feedAnimal);
    for (AbstractMammal mammal : anna.getAnimals()) {
      anna.playWithAnimal(mammal);
    }

//    for (AbstractMammal mammal : anna.getAnimals()) {
//anna.getAnimals().      // anna.getAnimals.getNewAnimal...
//    }

    /**TODO Stworzyć:
     *
     * Kanarek
     *
     * AbstractAnimal
     * AbstractMammal -> abstract getNewAnimal(name) ->
     *
     *  Koza
     *  Bear
     *  Foka
     *
     *  AnimalKeeper<AbstractMammal>
     *
     * Zatrudnij Anne ^ i każ jej karmić zwierzęta, oraz odbierać porody
     *
     */


    /** TODO : emploee gives meal to animal, animal growing  */

  }
}
