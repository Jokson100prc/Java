interface ElectricPower{

  default int supply(int power){
    setPower(power);
    return power;
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
   return power;
  }

  @Override
  public void setPower(int level) {

//    power = power - level;

    if (power - level >=0){
     power = power - level;
   }else{
     power = 0;
   }
  }

  @Override
  public void recharge() {
    power = 4000;
  }
}
class Main{
  public static void main(String[] args) {
    ElectricPower smart = new Smartphone(4000);
    System.out.println(smart.getPower());
    smart.recharge();
    System.out.println(smart.getPower());
    System.out.println(smart.supply(1000));
    System.out.println(smart.getPower());
    System.out.println(smart.supply(4000));
    System.out.println(smart.getPower());
    System.out.println(smart.supply(1000));
  }
}