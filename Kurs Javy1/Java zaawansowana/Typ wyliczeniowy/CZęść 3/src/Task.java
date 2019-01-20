import java.util.Scanner;

/**
 * Typ wyliczeniowy wykorzystujący możliwości klasy
 */
enum Suits{
  SPADES(40),
  HEARTS(30),
  DIMAONDS(20),
  CLUBS(10);

  private int points;

  private Suits(int points){
    this.points = points;
  }

  public int getPoints(){
    return points;
  }

  public static boolean contains(String name){
    for(Suits c: Suits.values()){
      if (name.equals(c.name()))
        return true;
    }
    return false;
  }
}

class Task {
  public static void main(String[] args){
    Suits card1 = Suits.DIMAONDS;
    Suits card2 = Suits.HEARTS;
    Suits card3 = Suits.DIMAONDS;
    System.out.println(card1 == card3);
    for(Suits c: Suits.values()){
      System.out.println(c);
    }

    Scanner scan = new Scanner(System.in);
    System.out.print("Wpisz jedną z nazw poniższych kolorów: ");
    for(Suits c: Suits.values()){
      System.out.print(c+" ");
    }
    String cName = scan.next();
    Suits card;
    if (Suits.contains(cName)) {
      card = Suits.valueOf(cName);
      System.out.println(card.getPoints());
    } else {
      System.out.println("Wpisałeś niepoprawny kolor");
    }
  }
}