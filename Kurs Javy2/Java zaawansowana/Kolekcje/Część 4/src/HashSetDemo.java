import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class HashSetDemo {
  public static void main(String[] args) {
    Set<Person> team = new HashSet<>(10);
    team.add(new Person("ADAM","CAŁA", LocalDate.parse("1997-10-14")));
    team.add(new Person("BEATA","CAŁA", LocalDate.parse("1998-11-24")));
    team.add(new Person("KAROL","NOWAK", LocalDate.parse("1987-01-04")));
    //dodajemy dwa różne obiekty, które mają te same dane
    team.add(new Person("PAWEŁ","NOWAK", LocalDate.parse("1993-10-22")));
    team.add(new Person("PAWEŁ","NOWAK", LocalDate.parse("1993-10-22")));

    Person a = new Person("KONRAD", "BAS",LocalDate.parse("1986-08-13"));
    //dodajemy dwa razy ten sam obiekt a
    //obiekt a zostanie dodany tylko raz
    team.add(a);
    team.add(a);
    //elememnty są wyświetlone w innej, przypadkowej kolejności niż podczas wstawiania
    Iterator<Person> i = team.iterator();
    while(i.hasNext()){
      System.out.println(i.next());
    }
  }
}