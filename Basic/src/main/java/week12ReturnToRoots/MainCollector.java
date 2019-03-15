package week12ReturnToRoots;

import week12ReturnToRoots.collections.ArrayExercises;
import week12ReturnToRoots.collections.ArrayListExerrcises;

import java.util.ArrayList;
import java.util.List;

public class MainCollector {

  public static void main(String[] args) {

    ArrayExercises test = new ArrayExercises();

    test.add10numbers();

    test.showSize();

    test.multiplicationOfArrayElements();


    List<Double> isReallyDoubleList = new ArrayList<>();
    ArrayListExerrcises arrayDoubleListExerrcises = new ArrayListExerrcises(isReallyDoubleList);

    arrayDoubleListExerrcises.addJokerElements("11,77");
    arrayDoubleListExerrcises.addJokerElements("22,66");
    arrayDoubleListExerrcises.addJokerElements("33,55");
    arrayDoubleListExerrcises.addJokerElements("44,44");
    arrayDoubleListExerrcises.addJokerElements("55,33");
    arrayDoubleListExerrcises.addJokerElements("66,22");
    arrayDoubleListExerrcises.addJokerElements("77,11");

    arrayDoubleListExerrcises.showRevertCollectElements();

    List<Integer> isReallyIntegerList = new ArrayList<>();
    ArrayListExerrcises arrayIntegerListExerrcises = new ArrayListExerrcises(isReallyIntegerList);

    arrayIntegerListExerrcises.addJokerElements(11);
    arrayIntegerListExerrcises.addJokerElements(22);
    arrayIntegerListExerrcises.addJokerElements(33);
    arrayIntegerListExerrcises.addJokerElements(44);
    arrayIntegerListExerrcises.addJokerElements(55);
    arrayIntegerListExerrcises.addJokerElements(66);
    arrayIntegerListExerrcises.addJokerElements(77);

    arrayIntegerListExerrcises.showRevertCollectElements();


    List<String> isReallyStringList = new ArrayList<>();
    ArrayListExerrcises arrayListExerrcises = new ArrayListExerrcises(isReallyStringList);

    arrayListExerrcises.addJokerElements("1");
    arrayListExerrcises.addJokerElements("2");
    arrayListExerrcises.addJokerElements("3");
    arrayListExerrcises.addJokerElements("4");
    arrayListExerrcises.addJokerElements("5");
    arrayListExerrcises.addJokerElements("6");
    arrayListExerrcises.addJokerElements("7");

    arrayListExerrcises.showRevertCollectElements();
  }
}

// args and prarams wasn't needed here

//public class MainCollector {
//
//  public static void main(String[] args) {
//
//    ArrayExercises test = new ArrayExercises();
//
//    int[] intNumbers = new int[10];
//    int[] duplicate = new int[10];
//
//    test.add10numbers(intNumbers, duplicate);
//    test.showSize(intNumbers);
//
//    test.multiplicationOfArrayElements();
//  }
//}
