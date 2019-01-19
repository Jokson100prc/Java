import java.util.Scanner;

public class PolymorphismDemo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Wpisz nazwę klasy:");
    String klasa = input.nextLine();
    Vehicle pojazd = null;
    switch(klasa){
      case "Car":
        pojazd = new Car(1200, 125, 30);
        break;
      case "Bicycle":
        pojazd = new Bicycle(15);
        break;
    }
    if (pojazd != null)
      pojazd.start();
  }
}
