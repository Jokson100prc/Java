package tarr.app.ver1;

import java.time.LocalDate;
import java.util.Scanner;

public class ClientTodoList {

  static void printMenu() {
    System.out.println("aplikacja TodoList");
    System.out.println("1. Dodaj zadanie");
    System.out.println("2. Usuń zadanie");
    System.out.println("3. Zaznacz jako wykonane");
    System.out.println("4. Koniec");
  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    TaskContainer model = new TaskContainer();

    printMenu();
    while (true) {
      String com = scanner.nextLine();
      switch (com) {
        case "1":
          System.out.println("Wpisz treść zadania: ");
          String input = scanner.nextLine();
          System.out.println("Wpisz datę deadlin'u: ");
          String date = scanner.nextLine();
          LocalDate localDate = LocalDate.parse(date);
          if (localDate.compareTo(LocalDate.now()) >= 0) {
            TextTask newTask = new TextTask(input, LocalDate.parse(date));
            model.addTask(newTask);
            model.print();
          } else {
            System.out.println("Data musi być późniejsza bądź równa dzisiejszej.");
          }
          break;
        case "2":
          model.print();
          System.out.println("Usuń zadanie.");
          System.out.println("Podaj numer zadania: ");
          if (scanner.hasNextInt()) {
            int nr = scanner.nextInt();
            model.deleteTask(nr - 1);
            model.print();
          } else {
            System.out.println("Numer zadania Musi być liczbą");
          }
          break;
        case "3":
          model.print();
          System.out.println("Zgłoś wykonanie.");
          System.out.println("Podaj numer zadania: ");
          if (scanner.hasNextInt()) {
            int nr = scanner.nextInt();
            model.doneTask(nr - 1);
            model.print();
          } else {
            System.out.println("Numer zadania powinien być liczbą");
          }
          break;
        case "4":
          System.out.println("Koniec");
          return;
        default:
          System.out.println("Nieznane polecenie, wpisz jeszcze raz: ");
      }
    }
  }

}
