package tarr.app.exercises;

import java.util.Scanner;

public class RunDemo {
  public static void main(String[] args) {

    ThreadDemo watek = new ThreadDemo(5000);

    long time = System.nanoTime();

    watek.start();

//    System.out.println("KONIEC PROGRAMU" + (System.nanoTime()-time)/1000);
//    System.out.println("Czas uruchomienia wątku" + " " + (System.nanoTime()-time)/1000);

    Scanner scanner =new Scanner(System.in);
    String string = scanner.next();
    watek.interrupt();
  }
}
