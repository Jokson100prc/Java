package InheritansEggAndHen;

public class Egg {

  // Egg Base/parent/general fild:life-temperature, size, kind, color, comFrom/ methodLife:true/false
  // Hen Extended/child fild:life , mainColor, secondColor, comeFrom, kind, method: grow, dead, run, peack, shittingOnTheBushes
  // Eagle extend/child fild: life , mainColor, secondColor, comeFrom, kind, method: grow, dead, fly, making nest,

  int eggTemperature = (int) 31.3;
  boolean life = eggTemperature >30 && eggTemperature <33? true: false;
  String shape= "elipse";

  public Egg(boolean life) {


  }

  @Override
  public String toString() {
    return "Egg{" +
            ", eggTemperature=" + eggTemperature +
            "life=" + life +
            ", shape='" + shape + '\'' +
            '}';
  }


  public void setLife(boolean life) {
    if (eggTemperature > 30 && eggTemperature < 33) {
      this.life = life;
    } else {
      this.life = false;
    }
  }

}
