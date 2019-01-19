class Vehicle {
  private String name;

  public Vehicle() {
    this.name = "Vechicle";
  }


  public Vehicle(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void start(){
    System.out.println("Vahicle Started");
  }
}

class Car extends Vehicle {
  int power;

  public Car(String name, int power) {
    super(name);
    this.power = power;
  }

  @Override
  public void start() {
    super.start();
    System.out.println("Car started");
  }
}

class SuperDemo {
  public static void main(String[] args) {

    Vehicle porshe = new Car("Porshe fura", 240);
    System.out.println(porshe.getName());

    porshe.start();

    Car maluch = new Car("Fiat126",45);
    porshe.start();
    maluch.start();
  }
}