package tarr.app.exercises;


interface Funkcja {
  double apply(double a, double b);
}

class Dodawanie implements Funkcja {

  @Override
  public double apply(double a, double b) {
    return a + b;
  }
}


public class FunctionalDemo {
  static double oblicz(Funkcja f, double a, double b) {
    return f.apply(a, b);
  }

  public static void main(String[] args) {

    Dodawanie dod = new Dodawanie();
    System.out.println(oblicz(dod, 4, 5));
    System.out.println(oblicz((a, b) -> a - b, 4, 5));
    System.out.println(oblicz((a, b) -> a + b, 4, 5));
    System.out.println(oblicz((a, b) -> a * b, 4, 5));
    System.out.println(oblicz((a, b) -> b== 0?Double.MAX_VALUE: a / b, 4, 0));
  }
}
