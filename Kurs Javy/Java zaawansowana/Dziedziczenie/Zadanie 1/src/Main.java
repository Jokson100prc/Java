import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    Customer harry = new Customer("Harry", "Potter", LocalDate.of(1988, 7, 11));

    System.out.println(harry);
  }
}
