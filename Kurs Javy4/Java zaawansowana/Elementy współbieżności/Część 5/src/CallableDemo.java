import java.util.concurrent.*;

class Calculator implements Callable<Double> {

  @Override
  public Double call() throws Exception {
    double result = 0;
    int N = 10000000;
    for (int i = 0; i < N; i++){
      result += Math.random();
    }
    return result/N;
  }
}

public class CallableDemo {
  public static void main(String[] args) {

    ExecutorService threadManager = Executors.newFixedThreadPool(2);
    ExecutorService exec = Executors.newSingleThreadExecutor();
    Future<Double> result1 = threadManager.submit(new Calculator());
    Future<Double> result2 = threadManager.submit(new Calculator());
    threadManager.submit(new Runnable() {
      @Override
      public void run() {
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println("END OF THREAD");
      }
    });
    try {
      System.out.println(result1.get());
      System.out.println(result2.get());
      threadManager.shutdown();
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }
  }
}
