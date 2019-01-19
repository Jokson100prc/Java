import java.time.LocalDate;


class ReferenceInheritanceDemo {
  public static void main(String[] args) {
    Person employee = new Worker(
            "Adam",
            "Kowalski",
            LocalDate.of(1978, 10, 19),
            "magazynier",
            2400.0);
    Person wife = new Person(
            "Zofia",
            "Nowak",
            LocalDate.of(1978, 10, 19));


//    System.out.println(employee);
//    System.out.println(wife);


    //rzutowanie na 2 sposoby
//    System.out.println(((Worker) employee).salary+"\n");

    Worker w = (Worker) employee;


//    System.out.println(employee);
//    System.out.println(w.salary);


    Person[] firm = new Person[4];
    firm[0] = employee;
    firm[1] = wife;
    firm[2] = new Worker("Ryszard", "Ochcócki", LocalDate.now(), "prezes", 10000);
    firm[3] = new Manager("Irena", "Ochócka", LocalDate.now(), "żona prezesa", 10000, "Klub Tęcza");

    for (int i = 0; i < firm.length; i++) {
      System.out.println("\n" + firm[i]);
    }
  }
}