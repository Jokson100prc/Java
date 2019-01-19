package tarr.app;

import java.time.LocalDate;

public class Main {

  public static void main(String[] args) {
    // write your code here
    TaskContainer todoList = new TaskContainer();
    todoList.addTask(new TextTask("Turn on the Computer", LocalDate.of(2019,1,19)));
    todoList.addTask(new TextTask("Turn off the Computer and going sleep ;)", LocalDate.of(2019,01,19)));

    todoList.print();
  }
}
