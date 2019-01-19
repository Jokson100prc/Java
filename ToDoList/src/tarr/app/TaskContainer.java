package tarr.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskContainer {
  private List<AbstractTask> container;

  public TaskContainer() {
    container = new ArrayList<>();
  }

  public TaskContainer(List<AbstractTask> container) {
    this.container = container;
  }

  public AbstractTask getTask(int i) {
    return container.get(i);
  }

  public boolean addTask(AbstractTask task) {
    return container.add(task);
  }

  public void deleteTask(int i) {
    container.remove(i);
  }

  public void doneTask(int i) {
    AbstractTask t = getTask(i);
    t.setDone(true);
    t.setComplited(LocalDate.now());
  }

  public void print() {
    for (AbstractTask t : container) {
      int count = 0;
      System.out.println(++count + " " + t.get() + "\n");
    }
  }
}
