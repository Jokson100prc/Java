import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchDemo {
  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5};
    Scanner scan = new Scanner(System.in);
    boolean isValid = false;
    int n = 0;
    int element = 0;
    System.out.println("Wpisz indeks od 0 do 4.");
    do {
      try {
        n = scan.nextInt();
        element = array[n];
        isValid = true;
      } catch (InputMismatchException e1) {
        System.out.println("Wpisz indeks jako liczbę całkowitą!!! Spróbuj jeszcze raz.");
        String tmp = scan.nextLine();
      } catch (ArrayIndexOutOfBoundsException e2) {
        System.out.println("Indeks musi być nieujemny i mniejszy od 5!!! Spróbuj jeszcze raz.");
      }
    }while (!isValid);
    System.out.println("Liczba w tablicy o indeksie "+n+" = "+element);
  }
}
