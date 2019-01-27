import java.util.Scanner;

class MessageThread extends Thread{
  private String message;
  private int pause;

  public MessageThread(String message, int pasue){
    this.message = message;
    this.pause = pasue;
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

class ThreadDemo {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    MessageThread thread1 = new MessageThread("UWAGA!", 200);
    MessageThread thread2 = new MessageThread("STOP!", 300);
    thread1.start();
    thread2.start();
  }
}