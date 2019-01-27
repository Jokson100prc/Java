package tarr.app.ver2;

import tarr.app.ver1.AbstractTask;

import java.io.*;

public class IOTodo {

  static public TodoContainer read(String path) throws IOException {
    File file = new File(path);
    if(!file.exists()){
     return new TodoContainer();
    }
    TodoContainer container = new TodoContainer();
    FileInputStream stream = new FileInputStream(path);
    ObjectInputStream istream =new ObjectInputStream(stream);
    while(true){
      try {
        Object obj = istream.readObject();
        AbstractTask task =  (AbstractTask) obj;
        container.addTask(task);
      } catch (ClassNotFoundException e) {
        e.printStackTrace();
        break;
      }catch (IOException e){
        istream.close();
        break;
      }

    }
    return container;
  }

  static public void write(String path, TodoContainer container) throws IOException {
    FileOutputStream file = new FileOutputStream(path);
    ObjectOutputStream ostream = new ObjectOutputStream(file);

    for (int i = 0; i < container.size(); i++) {
      try {
        AbstractTask task  = container.getTask(i);
        ostream.writeObject(task);
      } catch (AbsentTaskException e) {
        e.printStackTrace();
      }
    }
    ostream.close();
    file.close();
  }
}
