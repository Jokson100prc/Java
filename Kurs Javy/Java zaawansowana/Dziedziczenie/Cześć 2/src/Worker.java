import java.time.LocalDate;

public class Worker extends Person{
  public String position;
  public double salary;

  public Worker(String firstName, String lastName, LocalDate birthDate, String position, double salary) {
    super(firstName, lastName, birthDate);
    this.position = position;
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Worker{" +
            "salary=" + salary +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", birthDate=" + birthDate +
            '}';
  }
}
