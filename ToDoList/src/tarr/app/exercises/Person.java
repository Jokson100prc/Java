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