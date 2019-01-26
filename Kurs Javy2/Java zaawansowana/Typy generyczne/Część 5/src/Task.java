import java.time.LocalDate;
import java.time.Period;

class Person {
  String name;
  LocalDate birth;
  public Person(String Name, LocalDate birth){
    this.name = name;
    this.birth = birth;
  }

  public int getAge(){
    return (Period.between(LocalDate.now(), birth)).getYears();
  }
}

class Worker extends Person{
  double salary;
  public Worker(String name, LocalDate date, double salary){
    super(name, date);
    this.salary = salary;
  }
}

class Duet<T extends Person>{
  Person[] team = new Person[2];
  public Duet(T p1, T p2){
    team[0] = p1;
    team[1] = p2;
  }

  public boolean isOlder(Duet<?> t){
    return team[0].getAge()+team[1].getAge() > t.team[0].getAge()+t.team[1].getAge();
  }
}

class Task {
  public static void main(String[] args) {
    Duet<Person> smurf = new Duet<>(new Person("Ważniak", LocalDate.of(2000,10,11)),
                        new Person("Osiłek", LocalDate.of(2001, 4, 23)));
    Duet<Worker> muchomorki = new Duet<>(new Worker("Turkuć", LocalDate.of(2000,10,11), 11),
          new Worker("Podjadek", LocalDate.of(2002, 4, 23),234));
  System.out.println(smurf.isOlder(muchomorki));
  }

}