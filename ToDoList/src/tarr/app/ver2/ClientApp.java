package tarr.app.ver2;

import tarr.app.ver1.TextTask;

import java.time.LocalDate;

public class ClientApp {
  public static void main(String[] args) {
    Todoable todoList = new TodoContainer();
    todoList.addTask(new TextTask("COŚ", LocalDate.of(2099,12,12)));
    todoList.addTask(new TextTask("COŚikkkk", LocalDate.of(2022,01,02)));

    System.out.println(todoList.size());
  System.out.println((todoList.getTask(0)));

    for (int i = 0; i < todoList.size(); i++) {
      System.out.println(todoList.getAsString(i));
    }
  }
}
