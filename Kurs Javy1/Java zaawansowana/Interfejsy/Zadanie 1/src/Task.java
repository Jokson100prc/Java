import java.time.LocalDate;

interface Flyable {
  LocalDate takeOff();
  LocalDate land();
}
class Duck implements Flyable{
  @Override
  public LocalDate takeOff() {
    return LocalDate.now();
  }

  @Override
  public LocalDate land() {
    return LocalDate.now();
  }


}
