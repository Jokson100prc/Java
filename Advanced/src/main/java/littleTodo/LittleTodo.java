package littleTodo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LittleTodo {
  public static void main(String[] args) {
    List<String> storage = null;
    TodoStorage bookOfStorage = new TodoStorage( storage);
    bookOfStorage.addItems(storage.add());
  }
}

interface TodoStorageInterace {
 void getItems(int i);

 void addItems(int i);
}

class TodoStorage implements TodoStorageInterace{
  List<String> storage = new ArrayList<String>();

  public TodoStorage(List<String> storage) {
    this.storage = storage;
  }


  public void getItems(int i) {

    System.out.println(storage.get(i));
  }

  public void addItems(int i) {
    System.out.println("Write task you should to do: ");
    Scanner scanner = new Scanner(System.in);
    String string = scanner.next();
    storage.add(i, string);
  }
}