import java.util.Scanner;
enum Kolor{
  PIK, KIER, KARO, TREFL;
}

class Task {
  public static void main(String[] args){
    Kolor card;
    Scanner scan = new Scanner(System.in);
    System.out.println("Wpisz jeden z kolorów kart: PIK, KIER, KARO, TREFL: ");
    card = Kolor.valueOf(scan.nextLine());
    System.out.println(card == Kolor.KIER);
    switch(card){
      case PIK:
        System.out.println("Pik ma 40 punktów");
        break;
      case KIER:
        System.out.println("Kier 30 punktów");
        break;
      case KARO:
        System.out.println("Karo 20 punktów");
        break;
      case TREFL:
        System.out.println("Trefl 10 punktów");
        break;
    }
  }
}