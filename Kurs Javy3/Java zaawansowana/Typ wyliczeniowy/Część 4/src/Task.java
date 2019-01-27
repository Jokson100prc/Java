import java.time.LocalDateTime;
import java.util.*;

/**
 * Klasa udająca typ enum
 */
class SuitsC {
  public static SuitsC SPADES   = new SuitsC("SPADES", 40);
  public static SuitsC HEARTS   = new SuitsC("HEARTS", 40);
  public static SuitsC DIAMONDS = new SuitsC("DIAMONDS", 40);
  public static SuitsC CLUBS    = new SuitsC("CLUBS", 40);

  private int points;
  private String name;

  private SuitsC(String name, int points){
    this.points = points;
    this.name = name;
  }

  public String name(){
    return name;
  }

  public int getPoints(){
    return points;
  }

  public String toString(){
    return name;
  }
}

/**
 * Klasa enum
 */
enum SuitsE {
  SPADES(40),
  HEARTS(30),
  DIAMONDS(20),
  CLUBS(10);

  private int points;

  SuitsE(int points){
    this.points = points;
  }

  public int getPoints(){
    return points;
  }
}



class Task{
  public static void main(String[] args){
    SuitsE pe1 = SuitsE.SPADES;
    SuitsE pe2 = SuitsE.SPADES;
    SuitsC pc1 = SuitsC.SPADES;
    SuitsC pc2 = SuitsC.SPADES;

    System.out.println(pe1 == pe2);
    System.out.println(pc1 == pc2);

    System.out.println(pc1.name());
    System.out.println(pe2.name());

    System.out.println(pc1.getPoints());
    System.out.println(pe2.getPoints());
  }
}