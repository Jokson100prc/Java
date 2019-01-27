import java.util.Scanner;
class Counter{
  private int counter=0;

  public void set(int c){
    counter = c;
  }

  public int get(){
    return counter;
  }
}


class CounterThread extends Thread{
  private Counter commonCounter;
  private int counter = 0;

  public CounterThread(Counter counter){
    this.commonCounter = counter;

  }

  @Override
  public void run() {
    while(!isInterrupted()){
      try {
        Thread.sleep(10);
        synchronized(commonCounter){
          commonCounter.set(commonCounter.get()+1);
        }
        counter++;
      } catch (InterruptedException e) {
        this.interrupt();
      }
    }
    System.out.println("KONIEC WĄTKU. STAN LICZNIKA " + counter);
  }

  public int get(){
    return counter;
  }
}

class InterruptDemo {
  public static void main(String[] args) {
    Counter count = new Counter();
    CounterThread count1 = new CounterThread(count);
    CounterThread count2 = new CounterThread(count);
    count1.start();
    count2.start();
    Scanner scan = new Scanner(System.in);
    System.out.println("Wpisz cokolwiek, żeby zakończyć program");
    String query = scan.next();
    count1.interrupt();
    count2.interrupt();
    System.out.println(count.get() + " = "+ (count1.get()+count2.get()));
  }
}