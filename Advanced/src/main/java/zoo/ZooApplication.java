package zoo;

import zoo.animals.Animal;
import zoo.animals.birds.*;
//import zoo.animals.birds.Canary;
//import zoo.animals.birds.Eagle;
import zoo.animals.mammals.*;
//import zoo.animals.mammals.Bear;
//import zoo.animals.mammals.Goat;
import zoo.stuff.BirdKeeper;
import zoo.stuff.MammalKeeper;

import java.util.Arrays;

public class ZooApplication {

  public static void main(String[] args) {
    Bear bear = new Bear(100, "Teddy");

    Eagle eagle1 = new Eagle(20, "Anne");
    Eagle eagle2 = new Eagle(20, "Alex");

    BirdKeeper john = new BirdKeeper(Arrays.asList(eagle1, eagle2), "John", 33);

    //playtime
    john.getAnimals().forEach(john::playWithAnimal);

    //the same as
    for (AbstractBird animal : john.getAnimals()) {
      john.playWithAnimal(animal);
    }

    Canary rainha = new Canary(1, "Rainha");

    rainha.eat(9); // kanarek tyje dopiero od 10kg jedzenia, ale za to kilo od razu :D
    System.out.println(rainha.getWeight());

    Goat greg = new Goat(55, "Greg");

    Bear yogi = new Bear(400, "Yogi");

    // barry is for delete!
    Animal barry = null;
    yogi.getNewAnimal2(barry);
//    barry.eat(33);
//    System.out.println(barry.getWeight());
    Animal marry = greg.getNewAnimal(5, "Marry");
    System.out.println(yogi.getName() + " & " + marry.getName() + " & " + barry);


    MammalKeeper anna = new MammalKeeper(Arrays.asList((AbstractMammals)marry,yogi,greg), "Anna",25);
    anna.feedAnimal((AbstractMammals) marry);

    anna.getAnimals().forEach(anna::feedAnimal);
    for (AbstractMammals mammal : anna.getAnimals()) {
      anna.playWithAnimal(mammal);
    }
    System.out.println(marry.getWeight());

//    for (AbstractMammals mammal : anna.getAnimals()) {
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


    /** TODO : barry - object from ZooAplication - is to delete */
  }
}
