import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
  public static void main(String[] args) {
    Set<Person> sortedTeam = new LinkedHashSet<>();
    sortedTeam.add(new Person("ADAM","CAŁA", LocalDate.parse("1997-10-14")));
    sortedTeam.add(new Person("BEATA","CAŁA", LocalDate.parse("1998-11-24")));
    sortedTeam.add(new Person("KAROL","NOWAK", LocalDate.parse("1987-01-04")));
    //dodajemy dwa różne obiekty, które mają te same dane
    sortedTeam.add(new Person("PAWEŁ","NOWAK", LocalDate.parse("1993-10-22")));
    sortedTeam.add(new Person("PAWEŁ","NOWAK", LocalDate.parse("1993-10-22")));

    Person a = new Person("KONRAD", "BAS",LocalDate.parse("1986-08-13"));
    //dodajemy dwa razy ten sam obiekt a
    //obiekt a zostanie dodany tylko raz
    sortedTeam.add(a);
    sortedTeam.add(a);
    //elementy zbioru są wyświetlone w tej samej kolejności jak podczas wstawiania
    Iterator<Person> i = sortedTeam.iterator();
    while(i.hasNext()){
      System.out.println(i.next());
    }
  }
}
