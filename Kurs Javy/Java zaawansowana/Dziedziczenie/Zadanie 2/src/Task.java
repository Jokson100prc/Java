import java.time.LocalDate;

public class Task {
  public static Person team[] = new Person[2];
  public static Employee wife;

  public static void main(String[] args) {
    team[0] = new Person("ADAM", "KOŁEK", LocalDate.of(2000, 10, 10));
    team[1] = new Employee("IRENA", "OCHÓCKA", LocalDate.of(1960, 11, 23), "żona prezesa", 20000);
    System.out.println(team[0]);
    System.out.println(team[1]);
    wife = (Employee) team[1];

    System.out.println("Irena u męża zarabia " + wife.getSalary() + " PLN'ów");
  }
}
