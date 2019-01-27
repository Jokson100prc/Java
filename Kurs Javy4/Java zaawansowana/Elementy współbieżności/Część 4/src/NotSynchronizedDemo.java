import java.util.Scanner;

class CounterNotSynchronized{
  private int counter=0;

  public void set(int c){
    counter = c;
  }

  public int get(){
    return counter;
  }
}


class CounterThreadNotSynchronized extends Thread{
  private CounterNotSynchronized commonCounter;
  private int counter = 0;

  public CounterThreadNotSynchronized(CounterNotSynchronized counter){
    this.commonCounter = counter;

  }

  @Override
  public void run() {
    while(!isInterrupted()){
      try {
        Thread.sleep(10);
        commonCounter.set(commonCounter.get() + 1);
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

class NotSynchronizedDemo {
  public static void main(String[] args) {
    CounterNotSynchronized count = new CounterNotSynchronized();
    CounterThreadNotSynchronized count1 = new CounterThreadNotSynchronized(count);
    CounterThreadNotSynchronized count2 = new CounterThreadNotSynchronized(count);
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