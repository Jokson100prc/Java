package Demos;

public class LoopDemo {
  public static void main(String[] args) throws InterruptedException {
//    forLoop();
//    loopinsIdeLoop();
//    whileLoop();
//    DoWhileLoop();
    enhancedLoopForArray();
  }

  public static void forLoop() throws InterruptedException {
    for (int i = 0; i < 10; i++) {
      Thread.sleep(500);
      System.out.println("Liczba1: " + i);
    }
  }

  public static void loopinsIdeLoop() throws InterruptedException {
    for (int i = 1; i < 11; i++) {
      Thread.sleep(100);
      for (int j = 1; j < 11; j++) {
        Thread.sleep(100);
        System.out.println("Liczba1: " + i * j);
      }
    }
  }

  public static void whileLoop() {

    int counter = 0;
    while (counter < 10) {
      System.out.println("Liczba2: " + counter);
      counter++;
    }
  }

  public static void DoWhileLoop() {
    int counter = 345;
    do {
      System.out.println("Liczba3: " + counter);
      counter++;
    } while (counter < 10);
  }

  public static void enhancedLoopForArray() {
    String[] myArray = {
            "first",
            "second",
            "third",
            "four"
    };

    for (String printArray : myArray) {
      System.out.println(printArray);
    }
  }

}
