class Car extends Vehicle{
  int power;
  int fuel;
  public Car(double weight, int power, int fuel) {

    super(weight);
    this.power = power;
    this.fuel = fuel;
  }

  @Override
  public void start() {
    System.out.println("Car is moving!");
  }

  @Override
  public void stop() {

  }

  public int getFuelLevel(){
    return fuel;
  }
}