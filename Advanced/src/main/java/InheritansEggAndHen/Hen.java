package InheritansEggAndHen;

public class Hen extends Egg {

  String wings;
  String legs;
  String head;
  public Hen(boolean life) {
    super(true);
    this.life = life;
  }

  @Override
  public String toString() {
    return "Hen growing and have a: {" +
            ", shape='" + shape + '\'' +
            "wings='" + wings + '\'' +
            ", legs='" + legs + '\'' +
            ", head='" + head + '\'' +
            "and is it still a life: " + life +
            '}';
  }

  @Override
  public void setLife(boolean life) {
    super.setLife(life);
  }

}
