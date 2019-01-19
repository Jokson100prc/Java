public class Train extends Vehicle{
  public Train(double weight) {
    super(weight);
  }

  @Override
  public void start() {
    System.out.println("Train is moving");
  }

  @Override
  public void stop() {

  }

}
