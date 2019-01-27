class MessageRunnable implements Runnable{
  private int pause;
  private String message;
  public MessageRunnable(String message, int pause){
    this.pause = pause;
    this.message = message;
  }

  @Override
  public void run() {
    int count = 20;
    while(count-- > 0){
      try {
        Thread.sleep(pause);
        System.out.println(message);
      } catch (InterruptedException e) {

      }
    }
    System.out.println("KONIEC WĄTKU");
  }
}
public class RunnableDemo {
  public static void main(String[] args) {
    MessageRunnable messageThread = new MessageRunnable("UWAGA!!!", 500);
    Thread thread1 = new Thread(messageThread);
    Thread thread2 = new Thread(new MessageRunnable("STOP!!!", 300));

    thread1.start();
    thread2.start();
    System.out.println("KONIEC");
  }
}
