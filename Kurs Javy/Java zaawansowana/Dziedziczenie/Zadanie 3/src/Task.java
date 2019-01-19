class Airplane{
  private String typeName;
  private int numberOfEngines;

  public Airplane(){
    typeName= "fake";
  }

  public Airplane(String typeName, int numberOfEngines) {
    this.typeName = typeName;
    this.numberOfEngines = numberOfEngines;
  }

  public int getNumberOfEngines(){
    return numberOfEngines;
  }
}

class Airliner extends Airplane{
  private int numberOfPassengers;
  //zdefiniuj konstruktor z trzema argumentami, który wywołuje konstruktor klasy Airplane
  public Airliner(wpisz listę parametrów){
    Wpisz kod konstruktora
  }

  public int getNumberOfPassengers() {
    return numberOfPassengers;
  }
}
class Task {
  public static void main(String[] args) {
    Airplane plane = new Airplane("JAK23", 1);
    Airplane airbus = new Airliner("A320", 2, 320);
    System.out.println(airbus.getNumberOfEngines());
  }
}