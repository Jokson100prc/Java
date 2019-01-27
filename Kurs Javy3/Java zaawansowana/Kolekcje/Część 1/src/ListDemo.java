import java.util.ArrayList;
import java.util.Collection;

class ListDemo{
  public static void main(String[] args) {
    //Tworzymy kolekcję elementów typu String na podstawie klasy ArrayList
    Collection<String> membersA = new ArrayList<String>();
    //dodajemy elementy do kolekcji
    membersA.add("ELA");
    membersA.add("ALA");
    membersA.add("OLA");
    //rozmiar kolekcji
    System.out.println(membersA.size());
    //usuwamy wszystkie elementy z kolekcji
    membersA.clear();
    //rozmiar kolekcji
    System.out.println(membersA.size());
  }
}