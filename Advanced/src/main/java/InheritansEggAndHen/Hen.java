package InheritansEggAndHen;

public class Hen extends Egg {

  String wings = "wings";
  String legs = "legs";
  String head = "head";
  String heart = "beats";

  public Hen(boolean life) {
    super(true);
    this.life = (heart=="beats")? true: false;
  }

  @Override
  public String toString() {
    return "Hen growing and have a: {" +
            ", shape = '" + shape + '\'' +
            " wings = '" + wings + '\'' +
            ", legs = '" + legs + '\'' +
            ", head = '" + head + '\'' +
            " and is it still a life if heart beats: " + life +
            '}';
  }

  @Override
  public void setLife(boolean life) {
    super.setLife(life);
  }

}
