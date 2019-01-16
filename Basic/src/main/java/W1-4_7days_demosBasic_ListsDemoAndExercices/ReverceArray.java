package ListsDemoAndExercices;

public class ReverceArray {


  public static void reverse(int[] array){
    int newInt;
    int[] arrRevert = new int[array.length];

    for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
      newInt = array[i];
      arrRevert[j] = newInt;

    }

    String arrRevStringPattern = PrintArray2.printArray2(arrRevert);
    System.out.println(arrRevStringPattern);
  }
}
