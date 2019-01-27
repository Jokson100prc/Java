import java.util.Scanner;

class CounterThread extends Thread{
  private int pause;
  private int counter;
  public CounterThread(int pasue){
    this.pause = pasue;
    this.counter = 0;
  }

  @Override
  public void run() {
    while(!isInterrupted()){
      try {
        Thread.sleep(pause);
        counter++;
      } catch (InterruptedException e) {
        this.interrupt();
      }
    }
    System.out.println("KONIEC WĄTKU. STAN LICZNIKA " + counter);
  }
}

class InterruptDemo {
  public static void main(String[] args) {
    CounterThread count1 = new CounterThread(400);
    CounterThread count2 = new CounterThread(600);
    count1.start();
    count2.start();
    Scanner scan = new Scanner(System.in);
    System.out.println("Wpisz cokolwiek, żeby zakończyć program");
    String query = scan.next();
    count1.interrupt();
    count2.interrupt();
  }
}