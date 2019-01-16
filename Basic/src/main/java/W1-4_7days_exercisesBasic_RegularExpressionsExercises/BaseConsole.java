package RegularExpressionsExercises;

import java.util.Scanner;

public class BaseConsole {

  // scaner dla wprowadzania danych z konsoli
  private static Scanner scanner = new Scanner(System.in);


  public static String getTextFromConsole() {
    return scanner.nextLine(); // przykład zastosowania dziedziczenia metody i reUżywania
  }

}
