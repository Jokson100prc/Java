public class Bicycle extends Vehicle {
  public Bicycle(double weight) {
    super(weight);
  }

  @Override
  public void start() {
    System.out.println("Bicycle is moving");
  }

  @Override
  public void stop() {

  }

}
