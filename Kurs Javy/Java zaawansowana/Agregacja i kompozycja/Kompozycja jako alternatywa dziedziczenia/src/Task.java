import java.time.LocalDate;

class Person {
  protected String firstName;
  protected String lastName;

  public Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }
}

class Worker extends Person{
  protected String position;
  protected double salary;

  public Worker(String firstName, String lastName, String position, double salary){
    super(firstName, lastName);
    this.position = position;
    this.salary = salary;
  }
}


class Task {
  public static void main(String[] args) {
  Person adam = new Worker("ADAM", "KOWAL", "magazynier", 2000);
  System.out.println(adam.firstName);
  }
}