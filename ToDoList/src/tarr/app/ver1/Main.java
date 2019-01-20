package tarr.app.ver1;


import tarr.app.ver1.client.*;

import java.time.LocalDate;

public class Main {

  public static void main(String[] args) {

    TaskContainer todoList = new TaskContainer();

    todoList.addTask(new TextTask("Turn on the Computer", LocalDate.of(2019, 1, 19)));
    todoList.addTask(new TextTask("Turn off the Computer and going sleep ;)", LocalDate.of(2019, 01, 19)));

    todoList.print();


    LimitedTaskContainer limitedList = new LimitedTaskContainer(2);

    limitedList.addTask(new TextTask("Turn on the Computer2", LocalDate.of(2019, 1, 19)));
    limitedList.addTask(new TextTask("Turn off the Computer2", LocalDate.of(2019, 01, 19)));

    limitedList.addTask(new TextTask("add input)", LocalDate.of(2019, 01, 19)));

    limitedList.print();


    LimitedTaskContainerSuper limitedListSuper = new LimitedTaskContainerSuper(2);

    limitedListSuper.addTask(new TextTask("Turn on the Computer2", LocalDate.of(2019, 1, 19)));
    limitedListSuper.addTask(new TextTask("Turn off the Computer2", LocalDate.of(2019, 01, 19)));

    limitedListSuper.print();

    limitedListSuper.addTask(new TextTask("add input)", LocalDate.of(2019, 01, 19)));

    limitedListSuper.print();
  }
}
