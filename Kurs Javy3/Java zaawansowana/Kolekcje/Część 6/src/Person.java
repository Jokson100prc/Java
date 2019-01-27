import java.time.LocalDate;
import java.util.Comparator;

class Person{
  private String firstName;
  private String lastName;
  public LocalDate birthDate;

  public Person(){
  }

  public Person(String firstName, String lastName, LocalDate birthDate) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthDate = birthDate;
  }

  @Override
  public String toString() {
    return firstName+" "+lastName+" "+birthDate;
  }


  static public int compareLstName(Person o1, Person o2) {
    //jeśli nazwiska nie są identyczne to zwracamy wynik porównania nazwisk
    if (o1.lastName.compareTo(o2.lastName) != 0){
      return o1.lastName.compareTo(o2.lastName);
    }
    //gdy identyczne nazwiska i rózne imiona to zwracamy wynik porównania imion
    if (o1.firstName.compareTo(o2.firstName) != 0){
      return o1.firstName.compareTo(o2.firstName);
    }
    //gdy nazwiska i imiona identyczne zwracamy wynik porównania dat urodzenia
    return o1.birthDate.compareTo(o2.birthDate);
  }

  static public int compareFirstName(Person o1, Person o2) {
    //jeśli imiona nie są identyczne to zwracamy wynik porównania imion
    if (o1.firstName.compareTo(o2.firstName) != 0){
      return o1.firstName.compareTo(o2.firstName);
    }
    //gdy identyczne nazwiska i rózne imiona to zwracamy wynik porównania imion
    if (o1.lastName.compareTo(o2.lastName) != 0){
      return o1.lastName.compareTo(o2.lastName);
    }
    //gdy nazwiska i imiona identyczne zwracamy wynik porównania dat urodzenia
    return o1.birthDate.compareTo(o2.birthDate);
  }

  static public int compareBirthDateAsc(Person o1, Person o2) {
    return o1.birthDate.compareTo(o2.birthDate);
  }

  static public int compareBirthDateDesc(Person o1, Person o2) {
    return o2.birthDate.compareTo(o1.birthDate);
  }
}