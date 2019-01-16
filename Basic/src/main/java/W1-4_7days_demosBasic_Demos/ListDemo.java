package Demos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
  public static void main(String[] args) {

    List<String> list = new ArrayList<>();

         // .add - dodaj
    list.add("Marcin");
        // indexOF  wyszukiwanie indexu podanego obiektu
    int x = list.indexOf("Marcin");
        // .get pobierz element
    String listGet = list.get(0);
        // .size  - Listowy odpowiednik length
    int listSize = list.size();
        // .remove usuwanie
    list.remove(0);


    List<String> listA = new LinkedList<>();
    listA.add("Joker");
    listA.get(0);
    list.size();
    ((LinkedList<String>) listA).remove(0);
  }
}
