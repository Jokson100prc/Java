package tarr.app.ver1.client;

import tarr.app.ver1.AbstractTask;
import tarr.app.ver1.TaskContainer;

/**
 * Klasa wykorzystuje dziedziczenie
 * i nie zapewnia hermetyzacji kontenera.
 * Dostępne są wszystkie metody publiczne klasy TaskContainer
 * oraz składowe typu protected w bieżącym pakiecie.
 */
public class LimitedTaskContainer extends TaskContainer {

  final private int limit;

  public LimitedTaskContainer(int limit) {
    this.limit = limit;
  }

  public boolean addTask(AbstractTask task) {

    if (size() < limit) {

      int prev = size();

      super.addTask(task);

      return prev == size() - 1;
//      if (prev == size() - 1) {
//        return true;
//      } else {
//        return false;
//      }


    } else {

      this.deleteTask(0);

      super.addTask(task);

      return size() == limit;
//      if (size() == limit) {
//        return true;
//      } else {
//        return false;
//      }

    }
  }
}