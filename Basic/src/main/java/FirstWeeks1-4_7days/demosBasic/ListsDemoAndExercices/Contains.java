package ListsDemoAndExercices;

public class Contains {

  public static boolean contains(int[] array, int key) {
    boolean resultOfTruthOrNot = false;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == key) {
        resultOfTruthOrNot = true;
        break;
      }
    }
//    boolean retrKey = Arrays.stream(array).anyMatch(x -> x == key);
//    System.out.println(retrKey);
//    System.out.println(key);
//    System.out.println(array);
//    System.out.println(resultOfTruthOrNot);

    return resultOfTruthOrNot;
  }


}
