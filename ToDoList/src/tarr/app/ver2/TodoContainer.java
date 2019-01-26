package tarr.app.ver2;

import tarr.app.ver1.AbstractTask;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TodoContainer implements Todoable {

  private final List<AbstractTask> container;


  public TodoContainer() {
    this.container = new LinkedList<>();
  }


  @Override
  public AbstractTask getTask(int i) throws AbsentTaskException {
//    if (valid(i)){
//    }
//    return null;
    try {
      return (container.get(i));
    } catch (Exception e) {
      throw new AbsentTaskException(i);
    }
  }


  @Override
  public boolean addTask(AbstractTask task) {
    return container.add(task);
  }


  @Override
  public void deleteTask(int i) throws IndexOutOfBoundsException {
//    if (valid(i)) {
    container.remove(i);
//      return true;
//    } else
//      return false;
  }


  @Override
  public String getAsString(int i) {
    if (valid(i)) {
      AbstractTask task = container.get(i);
      return task.getContent() + " " + task.getCreation() + " " + task.isDone();
    }
    return null;
  }


  @Override
  public int size() {
    return container.size();
  }

  private boolean valid(int index) {

    return index >= 0 || index < size();
  }


  public void print() {
    System.out.println();
  }


  
}
