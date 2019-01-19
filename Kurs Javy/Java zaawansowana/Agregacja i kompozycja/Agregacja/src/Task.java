import java.time.LocalDate;

class Person {
  public String firstName;
  public String lastName;
  public LocalDate birthDate;

  public Person(String firstName, String lastName, LocalDate birthDate) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthDate = birthDate;
  }

  public String toString(){
    return firstName +" "+lastName+" "+birthDate;
  }
}
class Task {
  public static void main(String[] args) {
      System.out.println(new Person("RYSZAR", "OCHÓCKI", LocalDate.now()));
  }
}