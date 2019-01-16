package ListsDemoAndExercices;

public class CopyArray {

  public static int[] copyArray(int[] array) {

    int[] newArr = new int[array.length];

    for (int i = 0; i < array.length; i++) {
      newArr[i] = array[i];
//      System.out.println(newArr[i]);
    }

    return newArr;
  }
}
