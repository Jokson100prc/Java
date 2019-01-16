package ListsDemoAndExercices;

public class Equals {

  public static boolean equals(int[] array1, int[] array2) {

    boolean equalsArrs = true;

    int arrLength1 = array1.length;
    int arrLength2 = array2.length;

    if (arrLength2 == arrLength1) {
      for (int i = 0; i < arrLength1; i++) {
        if (array1[i] != array2[i]) {
          equalsArrs = false;
        }
      }
    }

    return equalsArrs;
  }

}
