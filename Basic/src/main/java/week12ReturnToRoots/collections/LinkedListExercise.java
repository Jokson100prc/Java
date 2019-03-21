package week12ReturnToRoots.collections;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListExercise {


  LinkedList<Integer> linkedList = new LinkedList<Integer>();
  Scanner scanner = new Scanner(System.in);

  int numberFromScanner = scanner.nextInt();
  int randomNumber = 0;

  public void addElementsToLinkedList() {
    for (int i = 0; i < numberFromScanner; i++) {
      randomNumber = (int) (Math.random() * 100) + 1;
      linkedList.add(randomNumber);
      System.out.println(randomNumber);
    }
  }

  public void showElementsOfLinkedList() {
    linkedList.forEach(elem -> System.out.println(elem));
  }

  public void showElementAndTryCatch() {

    try {
      for (int i = 0; i < linkedList.size() + 1; i++) {
        System.out.println("try: " + linkedList.get(i));
      }
    } catch (IndexOutOfBoundsException e) {
      System.out.println("'try' and 'catch' - it works!\n" +
              "IndexOutOfBoundsException from 'showElementAndTryCatch' method");
    }
  }
}


