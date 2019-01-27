import java.time.LocalDate;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Task {
  public static void main(String[] args) {
    //Zbiór osób sortowanych wg imion
    Set<Person> treeTeam = new TreeSet<>(new Comparator<Person>() {
      @Override
      public int compare(Person o1, Person o2) {
        return Person.compareFirstName(o1, o2);
      }
    });

    treeTeam.add(new Person("ADAM","KOWALSKI", LocalDate.parse("1998-04-23")));
    treeTeam.add(new Person("KAROL","NOWAK", LocalDate.parse("1994-08-13")));
    treeTeam.add(new Person("EWA" +
            "","ADAMSKI", LocalDate.parse("1991-12-09")));

    Iterator<Person> iterator = treeTeam.iterator();
    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }
    //Zbiór osób sortowanych wg nazwisk
    Set<Person> treeStaff = new TreeSet<>(new Comparator<Person>() {
      @Override
      public int compare(Person o1, Person o2) {
        return Person.compareBirthDateAsc(o1, o2);
      }
    });

    treeStaff.add(new Person("ADAM","KOWALSKI", LocalDate.parse("1998-04-23")));
    treeStaff.add(new Person("KAROL","NOWAK", LocalDate.parse("1994-08-13")));
    treeStaff.add(new Person("EWA" +
            "","ADAMSKI", LocalDate.parse("1991-12-09")));
    iterator = treeStaff.iterator();
    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }
  }
}