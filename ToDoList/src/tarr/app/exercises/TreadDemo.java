package tarr.app.exercises;

public class TreadDemo extends Thread {
  private int pause;

  public TreadDemo (int pause){
    this.pause = pause;
  }

  @Override
  public void run() {
    int count = 0;
    while(!isInterrupted()|| count < 100000000){
//      System.out.println("PRACA WĄTKU");
      count++;
    }
    System.out.println("KONIEC WĄTKU");
  }

}
