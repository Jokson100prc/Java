package InheritansEggAndHen;

public class Egg {

  // Egg Base/parent/general fild:life-temperature, size, kind, color, comFrom/ methodLife:true/false
  // Hen Extended/child fild:life , mainColor, secondColor, comeFrom, kind, method: grow, dead, run, peack, shittingOnTheBushes
  // Eagle extend/child fild: life , mainColor, secondColor, comeFrom, kind, method: grow, dead, fly, making nest,

  boolean life = true;
  int eggTemperature;
  char size;
  String kind;
  String color;
  String originOrEnviro;


  public Egg(boolean b, String white, String chicken, String bio_village) {


  }

  @Override
  public String toString() {
    return "Egg{" +
            "life=" + life +
            ", eggTemperature=" + eggTemperature +
            ", size=" + size +
            ", kind='" + kind + '\'' +
            ", color='" + color + '\'' +
            ", originOrEnviro='" + originOrEnviro + '\'' +
            '}';
  }

  public void setOriginOrEnviro(String originOrEnviro) {

    this.originOrEnviro = originOrEnviro;
  }

  public void setLife(boolean life) {
    if (eggTemperature > 30 && eggTemperature < 33) {
      this.life = life;
    } else {
      this.life = false;
    }
  }

}
