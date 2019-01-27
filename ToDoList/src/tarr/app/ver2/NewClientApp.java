package tarr.app.ver2;

import tarr.app.ver1.AbstractTask;
import tarr.app.ver1.TextTask;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class NewClientApp {
  public static void main(String[] args) {

    TodoContainer todoList = new TodoContainer();
    try {
      todoList = IOTodo.read("todolist.ser");
    } catch (IOException e) {
      System.out.println("Błąd odczytu pliku");
    }
    for (int i = 0; i <todoList.size(); i++) {
      System.out.println(todoList.getAsString(i));
    }

    Scanner scanner = new Scanner(System.in);
    System.out.println("Wpisz zadanie:");
    AbstractTask task = new TextTask(scanner.nextLine(), LocalDate.now());
    todoList.addTask(task);
    try {
      IOTodo.write("todolist.ser",todoList);
    } catch (IOException e) {
      System.out.println("Błąd zapisu do pliku");
    }

  }
}
