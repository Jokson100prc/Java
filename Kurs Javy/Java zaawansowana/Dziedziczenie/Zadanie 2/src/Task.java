import java.time.LocalDate;

public class Task {
  public static typ tablicy team[] = utwórz tablicę dwuelementową;
  public static Employee wife;

  public static void main(String[] args) {
    team[0] = new Person("ADAM","KOŁEK", LocalDate.of(2000,10,10));
    team[1] = new Employee("IRENA","OCHÓCKA", LocalDate.of(1960,11,23),"żona prezesa",20000);
    System.out.println(team[0]);
    System.out.println(team[1]);
    przypisz do zmiennej wife drugi element z tablicy team

    System.out.println(wife.getSalary());
  }
}
