package littleTodo;

import java.util.ArrayList;
import java.util.List;

public class TaskStorage {
  private List<String> storage = new ArrayList<String>();
  String task;

  NewTaskTodo taskTodo = new NewTaskTodo( task);

  public TaskStorage() {
  }

  public TaskStorage(List<String> storage, String taskTodo) {
    this.storage = storage;
    this.task = taskTodo;
  }

  void getTask(int i) {
    System.out.println(storage.get(i));
  }

  public void add(int i, String ajksdfha) {
  }
}
