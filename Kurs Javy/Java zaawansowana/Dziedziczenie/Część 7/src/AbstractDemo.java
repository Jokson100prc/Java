abstract class Vehicle {
  protected final double weight;
  protected double mileage;

  public Vehicle(double weight) {
    this.weight = weight;
  }

  public double getMileage() {
    return mileage;
  }

  public double getWeigth() {
    return weight;
  }

  public abstract void start()
          ;

  public abstract void stop();
}

class Motorbike extends Vehicle {

  public Motorbike(double weight) {
    super(weight);
  }

  @Override
  public void start() {
    System.out.println("Motorbike starts");
  }

  @Override
  public void stop() {
    System.out.println("Motorbike stops");

  }
}

class AbstractDemo {
  public static void main(String[] args) {
    Vehicle romet = new Motorbike(200);
//    Vehicle comar = new Vehicle(45);


    romet.start();
    romet.stop();
  }
}