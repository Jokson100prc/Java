import java.util.Scanner;
class CounterSynchronized{
  private int counter=0;

  public synchronized void set(int c) {
    counter = c;
  }

  public synchronized int get(){
    return counter;
  }
}


class CounterThreadS extends Thread{
  private CounterSynchronized commonCounter;
  private int counter = 0;

  public CounterThreadS(CounterSynchronized counter){
    this.commonCounter = counter;

  }

  @Override
  public void run() {
    while(!isInterrupted()){
      try {
        Thread.sleep(10);
        commonCounter.set(commonCounter.get()+1);
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

class MethodSynchronizedDemo {
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