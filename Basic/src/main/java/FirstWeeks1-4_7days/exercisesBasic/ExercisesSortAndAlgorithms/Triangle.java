package ExercisesSortAndAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Triangle {
  public static void main(String[] args) {


    int[] triangle = new int[3];
    Scanner scan = new Scanner(System.in);
    System.out.println("podaj 3 liczby:");

    for (int i = 0; i < 3; i++) {
      triangle[i] = scan.nextInt();
    }

    System.out.println(triangle[0]);
    System.out.println(triangle[1]);
    System.out.println(triangle[2]);

    Arrays.sort(triangle);

    System.out.println(triangle[0]);
    System.out.println(triangle[1]);
    System.out.println(triangle[2]);

    boolean result = (triangle[0] + triangle[1])<triangle[2]?false: true;

    System.out.println(result);
  }
}