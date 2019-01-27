import java.time.LocalDate;

class Person{
  private String firstName;
  private String lastName;
  public LocalDate birthDate;

  public Person(String firstName, String lastName, LocalDate birthDate) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthDate = birthDate;
  }

  @Override
  public String toString() {
    return firstName+" "+lastName+" "+birthDate;
  }
}