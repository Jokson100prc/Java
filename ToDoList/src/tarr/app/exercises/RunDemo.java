package tarr.app.exercises;

import java.util.Scanner;

public class RunDemo {
  public static void main(String[] args) throws InterruptedException {
    TreadDemo watek = new TreadDemo(5000);
//    long time = System.nanoTime();
    watek.start();
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    watek.interrupt();

//    System.out.println("Koniec programu");
//    System.out.println("Czas uruchomienia wątku i wyświetlenia komunikatu: "+(System.nanoTime() - time)/1000000.0 +" ms");
    // Tworzenie wątku z klasy implementujacej Runnable
    Thread watek2 = new Thread(new RunnableDemo());
    Thread.sleep(1000);
    watek2.start();
    str = scan.next();
  }
}
