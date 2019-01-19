import java.time.LocalDate;

public class Employee extends Person{
  private String position;
  private double salary;

  public Employee(String firstName, String lastName, LocalDate birthDate, String position, double salary) {
    super(firstName, lastName, birthDate);
    this.position = position;
    this.salary = salary;
  }

  public double getSalary(){
    return salary;
  }

  @Override
  public String toString() {
    return "Employee{" +
            "position='" + position + '\'' +
            ", salary=" + salary +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", birthDate=" + birthDate +
            '}';
  }
}
