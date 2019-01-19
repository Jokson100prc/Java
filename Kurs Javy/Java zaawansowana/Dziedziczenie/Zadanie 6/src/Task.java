class Truck extends Car{
  int wheels;

  public Truck(double weight, int power, int fuel, int wheels) {
    super(weight, power, fuel);
    this.wheels = wheels;
  }

  public int getWheels() {
    return wheels;
  }
}

class Task{
  public static void main(String[] args) {
    Vehicle[] flota = new Vehicle[3];
    flota[0] = new Car(900, 90, 23);
    flota[1] = new Truck(5300, 300, 120, 8);
    flota[2] = new Car(1200, 160, 34);
    for (Vehicle v: flota){
      if (v instanceof Truck)
        System.out.println("Truck - fuel "+((Truck) v).getFuelLevel() +" wheels "+((Truck) v).getWheels());
      else
      if (v instanceof Car)
        System.out.println("Car - fueal "+ ((Car) v).getFuelLevel());
    }
  }
}