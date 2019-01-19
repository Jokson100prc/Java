import java.time.LocalDate;

class Manager extends Worker{
String department;
  public Manager(String firstName, String lastName, LocalDate birthDate, String position, double salary, String department) {
    super(firstName, lastName, birthDate, position, salary);
    this.department = department;
  }

  @Override
  public String toString() {
    return "Manager{" +
            "department='" + department + '\'' +
            ", position='" + position + '\'' +
            ", salary=" + salary +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", birthDate=" + birthDate +
            '}';
  }
}
