package InheritansEggAndHen;

import java.util.Random;

public class Hen extends Egg{

  public Hen(int eggTemperature,
             char size,
             String kind,
             String color,
             String originOrEnviro) {
    super(true, "white", "chicken", "bio village");

  }

  @Override
  public void setOriginOrEnviro(String originOrEnviro) {

    super.setOriginOrEnviro(originOrEnviro);
  }

  @Override
  public void setLife(boolean life) {
    super.setLife(life);
  }

  String[] nourishment = {"warms", "seeds", "something ugly"};
  Random r = new Random();
  int i = r.nextInt(2);
  public void peack(String[] nourishment){
System.out.println(nourishment[i]);
  }
}
