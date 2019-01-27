import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

class IteratorDemo {
  public static void main(String[] args) {
    Collection<String> members = new ArrayList<String>();

    members.add("ALA");
    members.add("BEATA");
    members.add("KAROLINA");
    members.add("MONIKA");
    //pobranie iteratora
    ListIterator<String> iterator = ((ArrayList<String>) members).listIterator();
    //przeglądanie kolekcji
    while(iterator.hasNext()){
      String currentMember = iterator.next();
      //usuwamy element
      if (currentMember.length() == 3) {
        iterator.remove();
        continue;
      }
      //wstawiamy nowy element za bieżącym
      if (currentMember.length() < 7) {
        iterator.add("KAROL");
        continue;
      }
    }
    iterator = ((ArrayList<String>) members).listIterator();
    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }

  }


}