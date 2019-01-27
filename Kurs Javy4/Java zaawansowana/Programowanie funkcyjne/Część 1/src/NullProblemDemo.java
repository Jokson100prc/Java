import java.time.LocalDate;

class Person{
  private String name;
  private LocalDate birthDate;

  public Person(String name, LocalDate birthDate) {
    this.name = name;
    this.birthDate = birthDate;
  }

  public String getName() {
    return name;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }
}

class NullProblemDemo {
  public static void main(String[] args) {
    Person prezes = new Person("Jarosław", LocalDate.of(1970, 1, 1));
    //pole birthDate i name może mieć wartość null, gdy ktoś zmieni oba pola setterem
    //musimy testować przed odwołaniem się do pola
    prezes.setBirthDate(null);
    if (prezes.getBirthDate() != null){
      System.out.println(prezes.getBirthDate());
      prezes.getBirthDate().compareTo(LocalDate.of(19070,1,2));
    } else {
      System.out.println("Brak daty urodzin, porównanie niemożliwe");
    }
  }
}