package ExercisesArray;

import java.util.ArrayList;
import java.util.List;

//***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ******   ***   ***   ***   ***   ***
//        2. Utwórz listę ArrayList przechowującą liczby całkowite.
//        a. Dodaj 3 dowolne liczby, a następnie wyświetl długość tablicy.
//        b. Wyświetl pierwszy element zapisany w liście.
//        c. Wyświetl ostatni element zapisany w liście
//***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ******   ***   ***   ***   ***   ***

public class SecondExerciseArrayList {

  ArrayList<Integer> addToArrayList() {
    List<Integer> id = new ArrayList<Integer>() {
    };
    id.add(0, 44);
    id.add(1, 3);
    id.add(2, 95);
    System.out.println(id.size());
    System.out.println("first element is: " + id.get(0));
    System.out.println("last element is: " + id.get(2));
    System.out.println("if ther is number 3 show me index: " + id.indexOf(3));
    System.out.println("if ther is number 2 show me index: " + id.indexOf(2));
    System.out.println("if ther is number 44 show me index of last one: " + id.lastIndexOf(44));

    int index2 = id.get(2);
    index2 *= 3;
    System.out.println("95 multiplication by 3, action on id.get(2): "+index2);
    return (ArrayList<Integer>) id;
  }
}