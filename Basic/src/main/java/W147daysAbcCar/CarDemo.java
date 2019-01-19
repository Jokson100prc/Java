package W147daysAbcCar;


public class CarDemo {

    public static void main(String[] args) {

        Car fiesta = new Car("Tk 6718D", 57, 43);

        System.out.println(fiesta);
        System.out.println("In bag after refuel: " + fiesta.refuel(10));

        System.out.println("Fuel level: " + fiesta.getFuelLevel());

        System.out.println("In bag after refuel: " + fiesta.refuel(56));
        System.out.println("Fuel level: " + fiesta.getFuelLevel());

    }
}
