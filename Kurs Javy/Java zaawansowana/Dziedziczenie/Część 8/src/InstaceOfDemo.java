import java.util.Scanner;

public class InstaceOfDemo {
  public static void main(String[] args) {
    Vehicle[] vehicles = new Vehicle[3];
    vehicles[0] = new Car(1200, 100, 45);
    vehicles[1] = new Bicycle(15);
    vehicles[2] = new Train(25000);
    for(Vehicle v: vehicles){
      v.start();
      v.stop();
      System.out.println(v.getWeight());
    }
    for(Vehicle v: vehicles){
      v.start();

      if (v instanceof Car)
        System.out.println("The fule level in car = " +((Car) v).getFuelLevel());
    }
  }
}
