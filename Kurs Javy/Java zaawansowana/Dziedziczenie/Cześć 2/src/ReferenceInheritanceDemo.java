import java.time.LocalDate;

class ReferenceInheritanceDemo {
  public static void main(String[] args) {
    Person employee = new Worker(
            "Adam",
            "Kowalski",
            LocalDate.of(1978, 10,19),
            "magazynier",
            2400.0);
    Person wife = new Person(
            "Zofia",
            "Nowak",
            LocalDate.of(1978, 10,19));
    System.out.println(employee);
    System.out.println(wife);
    Worker w = (Worker) employee;
    System.out.println(employee);
  }
}