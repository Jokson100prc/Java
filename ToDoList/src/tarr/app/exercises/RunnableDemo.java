package tarr.app.exercises;

public class RunnableDemo implements Runnable {

  @Override
  public void run() {
    System.out.println("START");
    while(!TreadDemo.currentThread().isInterrupted()){
      try {
        Thread.sleep(100);
        System.out.println("PRACA WĄTKU");
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
  }
}