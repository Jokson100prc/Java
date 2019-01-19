class Engine{
  final double nominalPower;
  public Engine(double pnominalPower){
    this.nominalPower = pnominalPower;
  }
}

class Car{
  private Engine engine;
  String name;
  public Car(double power){
    this.engine = new Engine(power);
  }

  public String start(){
    if (engine != null){
      return "Start";
    } else {
      return "Can't start,no engine";
    }
  }
}

class Task {
  public static void main(String[] args) {
    System.out.println(new Car(200).start());
  }
}