package week12ReturnToRoots.collections;

import week12ReturnToRoots.collections.LinkedListExercise;
import week12ReturnToRoots.collections.priorityQuequeExerciseMonster.QuequeExercises;

import java.util.PriorityQueue;


// ***  ***  ***  ***  ***  ***  ***  *** QUEUE Exercise * * *

//public class Main {
//
//  public static void main(String[] args) {
//
//    System.out.println("How many numbers you'd like to have?");
//
//    LinkedListExercise linkedListExercise = new LinkedListExercise();
//    linkedListExercise.addElementsToLinkedList();
//    linkedListExercise.showElementsOfLinkedList();
//    linkedListExercise.showElementAndTryCatch();
//  }
//
//}


// ***  ***  ***  ***  ***  ***  ***  *** QUEUE Exercise * * *

//public class Main {
//  public static void main(String[] args) {
//
//    System.out.println("How many numbers you'd like to have?");
//
//
//    PriorityQueue priorityQueque = new PriorityQueue();
//
//    QuequeExercises quequeExercises = new QuequeExercises(priorityQueque);
//
//    quequeExercises.amountOfNumbers();
//
//    quequeExercises.addToQueque();
//
//    quequeExercises.showRandomNumbers();
//  }
//}


// ***  ***  ***  ***  ***  ***  ***  *** ARRAYList Exercise  * * *

//public class Main {
//
//  public static void main(String[] args) {
//
//    ArrayExercises test = new ArrayExercises();
//
//    test.add10numbers();
//
//    test.showSize();
//
//    test.multiplicationOfArrayElements();
//
//
//    List<Double> isReallyDoubleList = new ArrayList<>();
//    ArrayListExerrcises <Double> arrayDoubleListExerrcises = new ArrayListExerrcises(isReallyDoubleList);
//
//    arrayDoubleListExerrcises.addJokerElements(11.77);
//    arrayDoubleListExerrcises.addJokerElements(22.66);
//    arrayDoubleListExerrcises.addJokerElements(33.55);
//    arrayDoubleListExerrcises.addJokerElements(44.44);
//    arrayDoubleListExerrcises.addJokerElements(55.33);
//    arrayDoubleListExerrcises.addJokerElements(66.22);
//    arrayDoubleListExerrcises.addJokerElements(77.11);
//
//    arrayDoubleListExerrcises.showRevertCollectElements();
//
//    List<Integer> isReallyIntegerList = new ArrayList<>();
//    ArrayListExerrcises <Integer> arrayIntegerListExerrcises = new ArrayListExerrcises(isReallyIntegerList);
//
//    arrayIntegerListExerrcises.addJokerElements(11);
//    arrayIntegerListExerrcises.addJokerElements(22);
//    arrayIntegerListExerrcises.addJokerElements(33);
//    arrayIntegerListExerrcises.addJokerElements(44);
//    arrayIntegerListExerrcises.addJokerElements(55);
//    arrayIntegerListExerrcises.addJokerElements(66);
//    arrayIntegerListExerrcises.addJokerElements(77);
//
//    arrayIntegerListExerrcises.showRevertCollectElements();
//
//
//    List<String> isReallyStringList = new ArrayList<>();
//    ArrayListExerrcises <String> arrayListExerrcises = new ArrayListExerrcises(isReallyStringList);
//
//    arrayListExerrcises.addJokerElements("1");
//    arrayListExerrcises.addJokerElements("2");
//    arrayListExerrcises.addJokerElements("3");
//    arrayListExerrcises.addJokerElements("4");
//    arrayListExerrcises.addJokerElements("5");
//    arrayListExerrcises.addJokerElements("6");
//    arrayListExerrcises.addJokerElements("7");
//
//    arrayListExerrcises.showRevertCollectElements();
//
//
//    List<ArrayListExerrcises> listEveryTypes = new ArrayList<>();
//    ArrayListExerrcises newTestTypes = new ArrayListExerrcises(listEveryTypes);
//    newTestTypes.addJokerElements('A');
//    newTestTypes.addJokerElements(null);
//    newTestTypes.addJokerElements(true);
//    newTestTypes.addJokerElements(false);
//    newTestTypes.addJokerElements((byte)0xe0);
//    newTestTypes.addJokerElements(2147483648.0);
//    newTestTypes.addJokerElements("and String");
//
//    newTestTypes.showCollectElements();
//  }
//}


// ***  ***  ***  ***  ***  ***  ***  *** ARRAY Exercise  * * *
// args and prarams wasn't needed here

public class Main {

  public static void main(String[] args) {

    ArrayExercises test = new ArrayExercises();

    int[] intNumbers = new int[10];
    int[] duplicate = new int[10];

    test.add10numbers();
    test.showSize();

    test.multiplicationOfArrayElements();
  }
}
