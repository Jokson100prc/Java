interface ElectricPower{

  default int supply(int power){
    uzupełni kod
  }

  int getPower();
  void setPower(int level);
  void recharge();
}

class Smartphone implements ElectricPower {
  private int power;
  private final int powerCapacity;

  public Smartphone(int powerCapacity) {
    this.powerCapacity = powerCapacity;
    power = 0;
  }

  @Override
  public int getPower() {
    zdefiniuj metodę
  }

  @Override
  public void setPower(int level) {
   zdefiniuj metodę
  }

  @Override
  public void recharge() {
    zdefiniuj metodę
  }
}