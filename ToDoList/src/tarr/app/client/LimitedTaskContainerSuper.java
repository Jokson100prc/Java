package tarr.app.client;

import tarr.app.AbstractTask;
import tarr.app.TaskContainer;

public class LimitedTaskContainerSuper {

  final private int limit;
  TaskContainer container;

  public LimitedTaskContainerSuper(int limit) {
    this.limit = limit;
    container = new TaskContainer();
  }

  public boolean addTask(AbstractTask task) {

    if (container.size() < limit) {

      int prev = container.size();

      container.addTask(task);

      return prev == container.size() - 1;


    } else {

      container.deleteTask(0);

      container.addTask(task);

      return container.size() == limit;

    }
  }

  public void print() {
    container.print();
  }
}
