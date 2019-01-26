package tarr.app.ver2;

public class AbsentTaskException extends Exception {
  private int index;

  public AbsentTaskException(int index){
    this.index = index;
  }

  @Override
  public String toString() {
    return "Index: " + index + " Poza zakresem kolekcji. Brak takiego zadania";
  }
}
