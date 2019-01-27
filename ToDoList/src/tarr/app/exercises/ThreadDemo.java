package tarr.app.exercises;

public class ThreadDemo extends  Thread {

//  long time = System.nanoTime();
  private int pause;

  public ThreadDemo(int pause){
    this.pause = pause;
  }

  @Override
  public void run() {
    try{
      for (int i = 0; i < 1000; i++) {
        System.out.println("praca wątku");
      }
      Thread.sleep(1000);
      System.out.println("KONIEC DZIAŁĄNIA WĄTKU"/*+ (System.nanoTime()-time)/1000*/);
    } catch(InterruptedException e){
      System.out.println("PRZERWANIE WĄTKU");
      e.printStackTrace();
    }
  }
}
