import java.awt.*;
import java.util.concurrent.ArrayBlockingQueue;

class MagicBox{
  private ArrayBlockingQueue<Integer> monitor = new ArrayBlockingQueue<>(1);
  private Rectangle border;

  public MagicBox(Rectangle rect){
    this.border = rect;
  }

  public void enter(int n) throws InterruptedException {
    monitor.put(1);
    System.out.println("Kulka nr "+n + " wchodzi do środka");
  }

  public void exit(int n) throws InterruptedException {
    monitor.take();
    System.out.println("Kulka nr " + n + " wychodzi ze środka");
  }

  public boolean isInside(int x, int y){
    return border.contains(x, y);
  }
}

class Ball implements Runnable{
  private int x, y;
  private boolean isRunning = true;
  private MagicBox box;
  private boolean isInside = false;
  private int number;

  public Ball(MagicBox box, int number){
    this.box = box;
    this.number = number;
  }
  @Override
  public void run() {
    while (isRunning){
      x = (int)(11*Math.random());
      y = (int)(11*Math.random());
      try {
        if (box.isInside(x, y) && !isInside) {
          System.out.println("Kulka nr " + number +" chce wejść do środka");
          box.enter(number);
          isInside = true;
        }
        if (!box.isInside(x, y) && isInside) {
          box.exit(number);
          isInside = false;
        }
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("Kulka nr " + number +" "+x+" "+y);
    }
  }

  public void stop(){
    isRunning = false;
  }
}

public class Task {

  public static void main(String[] args) {
    MagicBox box = new MagicBox(new Rectangle(10,10));
    Thread[] balls = new Thread[10];
    for (int i = 0; i < balls.length; i++){
      balls[i] = new Thread(new Ball(box, i+1));
      balls[i].start();
    }
  }
}