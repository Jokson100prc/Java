package tarr.app.exercises;

import java.time.LocalDate;

class Person{
  String name;
  LocalDate birth;

  public Person(String name, LocalDate birth) {
    this.name = name;
    this.birth = birth;
  }

  @Override
  public String toString() {
    return "Person{ " +
            " name=' " + name + '\'' +
            ", birth = " + birth + " " +
            '}';
  }
}

public class BoxDemo {
  public static void main(String[] args) {

    GenericBox<String> stringBox = new GenericBox<>("Łańcuch", "A");

    GenericBox<Person> personBox = new GenericBox<>(new Person("Ryszard", LocalDate.now()),"B");

    int number = 5;
    GenericBox<Integer> intBox = new GenericBox<>(number,"C");

    GenericBox<Boolean> logicBox = new GenericBox<>( true,"D");

    System.out.println(stringBox);
    System.out.println(personBox);
    System.out.println(intBox);
    System.out.println(logicBox);

//    boolean l = Boolean.valueOf("true");
//    if (l){
//      System.out.println("w l jest true");
//    }else {
//      System.out.println("w l jest false");
//    }

    GenericBox[] boxes = new GenericBox[4];
    boxes[0] = stringBox;
    boxes[1] = personBox;
    boxes[2] = intBox;
    boxes[3] = logicBox;

    for (GenericBox box: boxes){
      System.out.println(box);
    }
  }
}
