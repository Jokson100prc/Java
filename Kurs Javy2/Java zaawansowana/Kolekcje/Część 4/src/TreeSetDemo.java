import java.time.LocalDate;
import java.util.*;

public class TreeSetDemo {
  public static void main(String[] args) {
    //
    Set<Person> treeTeam = new TreeSet<>(new Person());
    treeTeam.add(new Person("ADAM","CAŁA", LocalDate.parse("1997-10-14")));
    treeTeam.add(new Person("BEATA","CAŁA", LocalDate.parse("1998-11-24")));
    treeTeam.add(new Person("KAROL","NOWAK", LocalDate.parse("1987-01-04")));
    //dodajemy dwa różne obiekty, które mają te same dane
    treeTeam.add(new Person("PAWEŁ","NOWAK", LocalDate.parse("1993-10-22")));
    treeTeam.add(new Person("PAWEŁ","NOWAK", LocalDate.parse("1993-10-22")));

    Person a = new Person("KONRAD", "BAS",LocalDate.parse("1986-08-13"));
    //dodajemy dwa razy ten sam obiekt a
    //obiekt a zostanie dodany tylko raz
    treeTeam.add(a);
    treeTeam.add(a);
    //elementy zbioru są wyświetlone w kolejności rosnącej
    Iterator<Person> i = treeTeam.iterator();
    while(i.hasNext()){
      System.out.println(i.next());
    }
  }
}
