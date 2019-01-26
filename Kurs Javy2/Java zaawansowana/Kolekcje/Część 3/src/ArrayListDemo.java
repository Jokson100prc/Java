import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ArrayListDemo {
  public static void main(String[] args) {
    List<Person> arrayTeam = new ArrayList<>();
    arrayTeam.add(new Person("ADAM","CAŁA", LocalDate.parse("1997-10-14")));
    arrayTeam.add(new Person("BEATA","CAŁA", LocalDate.parse("1998-11-24")));
    arrayTeam.add(new Person("KAROL","NOWAK", LocalDate.parse("1987-01-04")));
    //dodajemy dwa różne obiekty, które mają te same dane
    arrayTeam.add(new Person("PAWEŁ","NOWAK", LocalDate.parse("1993-10-22")));
    arrayTeam.add(new Person("PAWEŁ","NOWAK", LocalDate.parse("1993-10-22")));

    Person a = new Person("KONRAD", "BAS",LocalDate.parse("1986-08-13"));
    //dodajemy dwa razy ten sam obiekt a
    arrayTeam.add(a);
    arrayTeam.add(a);
    Iterator<Person> i = arrayTeam.iterator();
    while(i.hasNext()){
      System.out.println(i.next());
    }
    //usunięcie
    arrayTeam.remove(4);
    arrayTeam.remove(a);
    i = arrayTeam.iterator();

    while(i.hasNext()){
      System.out.println(i.next());
    }
  }
}