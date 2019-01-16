package Demos;

public class Exercises {
  public static void main(String[] args) {


    for (int i = 0; i < 100; i++)
      if (i % 2 == 0) {
        System.out.print(i);
        continue;
      }


    System.out.println("\n");


    int sum = 0;
    int[] numbers = {61, 52, 35, 65, 26, 26, 21, 51, 101};
    for (int i = 0; i < numbers.length; i++) {
      sum = sum + numbers[i];
    }
    System.out.println(sum);

    for (int once : numbers) sum -= once;
    System.out.println("Enhanced FOR: " + sum);
  }
}
