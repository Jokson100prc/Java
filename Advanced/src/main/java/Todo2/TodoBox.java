package Todo2;

import java.util.ArrayList;
import java.util.List;

public class TodoBox {
  List<String> box = new ArrayList<String>();

  public String  getItem(int i){
    return box.get(i);
  }

  public void addItem (String item){
    box.add(item);
  }

  public boolean deleteItem(int i){
    return Boolean.parseBoolean(box.remove(i));
  }
}
