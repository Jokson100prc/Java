class Truck extends Car {
  int wheels;

  public Truck(double weight, int power, int fuel, int wheels) {
    super(weight, power, fuel);
    this.wheels = wheels;
  }

  public int getWheels() {
    return wheels;
  }
}

class Task {
  public static void main(String[] args) {
    Vehicle[] flota = new Vehicle[4];
    flota[0] = new Car(900, 90, 23);
    flota[1] = new Truck(5300, 300, 120, 8);
    flota[2] = new Car(1200, 160, 34);
    flota[3] = new Train(1200, "electric");
    for (Vehicle v : flota) {
      if (v instanceof Truck)
        System.out.println("Truck - fuel " + ((Truck) v).getFuelLevel() + " wheels " + ((Truck) v).getWheels());
      else if (v instanceof Car)
        System.out.println("Car - fueal " + ((Car) v).getFuelLevel());
      else if (v instanceof Train) {
        System.out.println("Train - engine Type " + ((Train) v).getEngineType());
      }

//      if (v instanceof Train){
//        Train p = (Train) v;
//        System.out.println("");
//      }
    }


  }
}