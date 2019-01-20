class Car {
  private Engine engine = null;
  private String registerNumber;

  public Car(double power, int pistonNumber, String registerNumber){
    this.engine = new Engine(power, pistonNumber);
    this.registerNumber = registerNumber;
  }

  @Override
  public String toString() {
    return engine.power+" "+engine.pistonNumber+" "+registerNumber;
  }

  public class Engine{
    private double power;
    private int pistonNumber;

    public Engine(double  power, int pistonNumber){
      this.power = power;
      this.pistonNumber = pistonNumber;
    }

    double getPower(){
      return power;
    }

    int getPistonNumber(){
      return pistonNumber;
    }

    @Override
    public String toString() {
      return "należy do: "+registerNumber+", moc: "+this.power+", liczba cylindrów: "+this.pistonNumber;
    }
  }
}

class Task {
  public static void main(String[] args){
    Car porsche = new Car(250, 8, "TK 6789E");
    System.out.println(porsche);
    Car.Engine engine = porsche. new Engine(405, 12);
    System.out.println(engine);
  }
}