package littleTodo;

import java.util.ArrayList;
import java.util.List;

public class TaskStorage {
  List <String> storage = new ArrayList<String>();
  int index;



  public TaskStorage(List<String> storage, int index) {
    this.storage = storage;
    this.index = index;
    storage.add(0, "ajksdfha");
    storage.add(1, "14rfs");
    storage.add(2, "2esf");
    storage.add(3, "3sefsfs");
  }

  void getTask(List<String> storage, int index){
    storage.get(index);
    System.out.println(storage.get(index));
  }

}
