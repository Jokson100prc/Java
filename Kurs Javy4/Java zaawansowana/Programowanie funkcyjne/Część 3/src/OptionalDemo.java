import java.time.LocalDate;
import java.util.Optional;

class Person{
  String name;
  LocalDate birthDate;

  public Optional<String> getName() {
    return Optional.ofNullable(name);
  }

  public Optional<LocalDate> getBirthDate() {
    return Optional.ofNullable(birthDate);
  }
}

public class OptionalDemo {
  public static void main(String[] args) {
    Person manager = new Person();
    System.out.println("birth date and name are null");
    manager.getBirthDate().ifPresent(a->System.out.println(a));
    System.out.println(manager.getName().orElse("Brak nazwiska").toUpperCase());
    System.out.println(manager.getBirthDate().orElseGet(()->LocalDate.now()));
    manager.birthDate = LocalDate.now();
    manager.name = "OCHÓCKI";
    System.out.println("birth date and name are not null");
    manager.getBirthDate().ifPresent(a->System.out.println(a));
    System.out.println(manager.getName().orElse("Brak nazwiska"));
  }
}
