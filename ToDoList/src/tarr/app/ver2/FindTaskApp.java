package tarr.app.ver2;

import tarr.app.ver1.AbstractTask;
import tarr.app.ver1.TextTask;

import java.time.LocalDate;

public class FindTaskApp {
  public static void main(String[] args) {

    Todoable todoList = new TodoContainer();
    todoList.addTask(new TextTask("Pierwszy Task", LocalDate.of(2099,12,12)));
    todoList.addTask(new TextTask("Drugi Task", LocalDate.of(2022,01,02)));

    //testowanie metody contains(date)
    AbstractTask task = new TextTask( "Trzeci Task", LocalDate.now());

//testowanie  metody removeDone()
//    System.out.println(todoList.contains(LocalDate.of(2019,1,20)));
//    System.out.println(todoList.contains(LocalDate.of(2099,12,12)));


    ((TextTask)task).setAsDone();
    todoList.addTask(task);
//    todoList.removeDone();
    ((TodoContainer) todoList).prinTodoTask();


    System.out.println("\n");
    for (int i = 0; i < todoList.size(); i++) {
      System.out.println(todoList.getAsString(i)+ " - Szukaj mnie w FindTaskApp");
    }
  }
}
