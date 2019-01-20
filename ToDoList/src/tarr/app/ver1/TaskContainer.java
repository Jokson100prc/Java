package tarr.app.ver1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskContainer {

  private final List<AbstractTask> container;


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


  public boolean deleteTask(int i) {

    if (i < 0 || i >= container.size()) {
      return false;
    }

    container.remove(i);
    return true;
  }


  public boolean doneTask(int i) {

    if (i < 0 || i >= container.size()) {
      return false;
    }

    AbstractTask t = getTask(i);
    t.setDone(true);
    t.setComplited(LocalDate.now());

    return true;
  }


  public int size() {
    return container.size();
  }


  public void print() {
    int count = 0;
    for (AbstractTask t : container) {
      System.out.println(++count + " " + t.get() + "\n");
    }


  }
}
