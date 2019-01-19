public class Train extends Vehicle {
  String engineType;
  public Train(double weight, String engineType) {
    super(weight);
    this.engineType = engineType;
  }

  public String getEngineType() {
    return engineType;
  }

  @Override
  public void start() {
    System.out.println("Train starts");
  }

  @Override
  public void stop() {
    System.out.println("Train stops");
  }
}
