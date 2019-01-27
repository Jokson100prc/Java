package tarr.app.exercises;

import java.time.LocalDate;
import java.util.LinkedList;

public class BoxDemo {
  public static void main(String[] args) {

    GenericBox<String> stringBox = new GenericBox<>("Łańcuch", "A");

    GenericBox<Person> personBox = new GenericBox<>(new Person("Ryszard", LocalDate.now()),"B");

    int number = 5;
    GenericBox<Integer> intBox = new GenericBox<>(number,"C");

    GenericBox<Boolean> logicBox = new GenericBox<>( true,"D");

    GenericBox<User> userBox = new GenericBox<>(new User("Name", "Password"), "E");

    System.out.println(stringBox);
    System.out.println(personBox);
    System.out.println(intBox);
    System.out.println(logicBox);
    System.out.println(userBox);


    boolean l = Boolean.valueOf("true");
    if (l){
      System.out.println("w l jest true");
    }else {
      System.out.println("w l jest false");
    }

    GenericBox[] boxes = new GenericBox[5];
    boxes[0] = stringBox;
    boxes[1] = personBox;
    boxes[2] = intBox;
    boxes[3] = logicBox;
    boxes[4] = userBox;

    for (GenericBox box: boxes){
      System.out.println(box);
    }
  }
}
