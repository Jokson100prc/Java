package ListsDemoAndExercices;

public class PrintArray {

  public static void printArray(int[] myArr) {
    System.out.print("{ ");
    for (int i = 0; i < myArr.length; i++) {
      int num = myArr[i];
      if (i <= myArr.length - 2) {
        System.out.print("e" + num + ",");
      } else {
        System.out.print("e" + num);
      }
    }
    System.out.println(" }");
  }
}
