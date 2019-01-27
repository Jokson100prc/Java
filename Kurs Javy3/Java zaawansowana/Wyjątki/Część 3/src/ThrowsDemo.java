import java.util.Scanner;

class ThrowsDemo {

  static int getElement(int []arr, int i) throws ArrayIndexOutOfBoundsException{
    return arr[i];
  }

  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5, 9, 8, 7};
    int sum= 0;
    Scanner scan= new Scanner(System.in);
    System.out.println("Wpisz indeks elementu tablicy:");
    int n = scan.nextInt();
    int element = 0;
    for (int i = 0; i < n; i++) {
      try {
        element = getElement(array, i);
      } catch (ArrayIndexOutOfBoundsException e) {
        element = 0;
      }
      finally {
        sum += element;
      }
    }
    System.out.println("Suma elementów: "+sum);
  }
}