package tarr.app.ver2;

import tarr.app.ver1.TextTask;

import java.time.LocalDate;
import java.util.Scanner;

public class ClientApp {
  public static void main(String[] args) {
    Todoable todoList = new TodoContainer();
    todoList.addTask(new TextTask("COŚ", LocalDate.of(2099,12,12)));
    todoList.addTask(new TextTask("COŚikkkk", LocalDate.of(2022,01,02)));


    //Symulacja odpowiedzi urzytkownika
    Events wydarzenie = Events.STANDARD;
    Scanner scan = new Scanner(System.in);
    System.out.println("Podaj jedną z ponizszych stałych");
    for (Events e: Events.values()){
      System.out.println(e);
    }

    String typ = scan.next().toUpperCase();
    try {
      wydarzenie = Events.valueOf(typ);
      TextTask task = new TextTask(wydarzenie.getContent(), LocalDate.now());
      todoList.addTask(task);
    } catch (IllegalArgumentException e) {
      System.out.println("Nieznany typ wydarzenia!!!");
    }

    try {
      int index = scan.nextInt();
      todoList.deleteTask(index);
    } catch (Exception e) {
      System.out.println(e);
    }


//  System.out.println((todoList.getTask(0)));

    for (int i = 0; i < todoList.size(); i++) {
      System.out.println(todoList.getAsString(i));
    }

    try {
      System.out.println(todoList.getTask(55));
    } catch (AbsentTaskException e) {
      System.out.println(e);
    }
  }
}
