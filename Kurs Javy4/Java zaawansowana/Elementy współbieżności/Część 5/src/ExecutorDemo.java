import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{
  int n;
  public Task(int n){
    this.n = n;
  }

  @Override
  public void run() {
    try {
      for (int i = 0; i < 5; i++) {
        Thread.sleep(200);
        System.out.println(" THREAD " + n + " ITERATION "+ i);
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("END OF THREAD "+n);
  }
}

class ExecutorDemo {
  public static void main(String[] args) {
    ExecutorService threadManager = Executors.newFixedThreadPool(2);
    System.out.println("START");
    threadManager.submit(new Thread(new Task(1)));
    threadManager.submit(new Thread(new Task(2)));
    threadManager.submit(new Thread(new Task(3)));
    threadManager.submit(new Thread(new Task(4)));
    threadManager.shutdown();
    while(!threadManager.isShutdown()){
      System.out.println("RUNNING");
    }
  }
}