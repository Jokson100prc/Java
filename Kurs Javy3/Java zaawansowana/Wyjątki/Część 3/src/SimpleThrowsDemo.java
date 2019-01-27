import java.util.Scanner;

public class SimpleThrowsDemo {
  static int getElement(int []arr, int i) throws ArrayIndexOutOfBoundsException{
    return arr[i];
  }

  public static void main(String[] args) {
    int[] array = {1, 2, 3};
    int sum= 0;
    for (int i = 0; i < 5; i++) {
      try {
        sum += getElement(array, i);
      } catch (ArrayIndexOutOfBoundsException e) {
      }
    }
    System.out.println("Suma elementów: "+sum);
  }
}
