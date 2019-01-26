package tarr.app.ver2;

import tarr.app.ver1.TextTask;

import java.time.LocalDate;

public class FindTaskApp {
  public static void main(String[] args) {

    Todoable todoList = new TodoContainer();
    todoList.addTask(new TextTask("Pierwszy Task", LocalDate.of(2099,12,12)));
    todoList.addTask(new TextTask("Drugi Task", LocalDate.of(2022,01,02)));

    System.out.println(todoList.contains(LocalDate.of(2019,1,20)));
    System.out.println(todoList.contains(LocalDate.of(2099,12,12)));
  }
}
