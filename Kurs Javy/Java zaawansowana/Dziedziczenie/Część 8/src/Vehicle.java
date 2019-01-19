abstract class Vehicle {
  protected final double weight;
  protected double mileage;

  public Vehicle(double weight){
    this.weight = weight;
  }

  public double getMileage(){
    return mileage;
  }

  public double getWeight(){
    return weight;
  }

  public abstract void start();
  public abstract void stop();
}