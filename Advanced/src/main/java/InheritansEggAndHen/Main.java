package InheritansEggAndHen;

public class Main {
  public static void main(String[] args) {

    Egg chickenEgg = new Egg(false, "white", "chicken", "bio village");
    System.out.println(chickenEgg);

  Hen hen = new Hen(31,'m', "poultry", "red brown", "village");

  System.out.println(hen);
}
}