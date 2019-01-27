public class ThreadLambdaDemo {
  public static void main(String[] args) {
    new Thread(()->{
      try{
        System.out.println("START");
        Thread.sleep(1000);
        System.out.println("END");
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }).start();
  }
}
