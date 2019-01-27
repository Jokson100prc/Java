import java.util.Scanner;

class FinallyDemo {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5, 9, 8, 7};
    int sum= 0;
    Scanner scan= new Scanner(System.in);
    System.out.println("Program obliczający sumę pierwszych n elementów tablicy");
    System.out.println("Wpisz indeks ostatniego sumowanego elementu:");
    int n = scan.nextInt();
    int element = 0;
    for (int i = 0; i < n; i++) {
      try {
        element = array[i];
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