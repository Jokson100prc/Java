import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

class Consumer extends Thread {
  private LinkedBlockingQueue<Integer> queue;
  private ArrayList<Integer> consumedValues = new ArrayList<Integer>();

  public Consumer(LinkedBlockingQueue<Integer> queue) {
    this.queue = queue;
  }

  @Override
  public void run() {
      while(!this.isInterrupted()) {
        try {
          System.out.println("Przed konsumpcją... " + this.getName());
          int value = queue.take();
          System.out.println("...po konsumpcji! " + this.getName());
          consumedValues.add(value);
          System.out.println(this.getName() + " konsumuje: " + value);
        } catch (InterruptedException ex) {
          this.interrupt();
          System.out.println("Przerwano Consumer: " + this);
        }
      }
      System.out.println("KONIEC KOSNUMENTA");
  }
}

class Producer implements Runnable {
  LinkedBlockingQueue<Integer> queue;
  Consumer[] consumers;

  public Producer(LinkedBlockingQueue<Integer> queue, Consumer... consumers) {
    this.queue = queue;
    this.consumers = consumers;
  }

  @Override
  public void run() {
      for(int i=0; i<10; ++i) {
        try {
          //queue.put(i);
          Thread.sleep(500);
        } catch (InterruptedException ex) {
          System.out.println("Przerwano prace producenta!");
        }
      }
      System.out.println("Koniec zadania producer!");
  }

  public synchronized void stop(){
    Thread.currentThread().interrupt();
  }
}

public class ProducerConsumerDemo {

  public static void main(String[] args) throws Exception {
    LinkedBlockingQueue queue = new LinkedBlockingQueue(10);
    Consumer consumer1 = new Consumer(queue);
    Consumer consumer2 = new Consumer(queue);
    Producer producer = new Producer(queue,consumer1,consumer2);

    ExecutorService exec = Executors.newCachedThreadPool();

    exec.execute(producer);
    exec.execute(consumer1);
    exec.execute(consumer2);

    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    producer.stop();
    consumer1.interrupt();
    consumer2.interrupt();
    exec.shutdown();
    System.out.println(s);
  }

}