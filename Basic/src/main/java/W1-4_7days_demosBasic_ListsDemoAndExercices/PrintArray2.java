package ListsDemoAndExercices;

public class PrintArray2 {


  public static String printArray2(int[] myParametr) {
    String result = "";
    result = "{ ";

    for (int i = 0; i < myParametr.length; i++) {
      if (myParametr.length - 2 >= i) {
        result = result + myParametr[i] + ",";
      } else {
        result = result + myParametr[i];
      }
    }

    result = result + "} ";
    return result;
  }

}
