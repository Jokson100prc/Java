package tarr.app.client;

import tarr.app.AbstractTask;
import tarr.app.TaskContainer;

/*
 * Klasa wykorzystuje kompozycję,
 * posiada pole klasy TaskContainer
 * Zapewnia  pełną hermetyzację tego pola
 * */
public class LimitedTaskContainerSuper {

  /**
   * maksymalna liczba zadań
   * pole kontenera do przechowywania zadań,
   * kompozyt - bez tego pola klasa nie ma sensu
   *
   * @param limit - maksymalna liczba zadań
   */
  final private int limit;
  final private TaskContainer container;


  public LimitedTaskContainerSuper(int limit) {
    this.limit = limit;
    container = new TaskContainer();
  }

  /**
   * * Funkcja dodaje zadanie i jeśli brakuje miejsca
   * * to usuwa najpierw najstarsze zadanie
   * * a potem podaje nowe
   *
   * @param task - dodawanie zadania
   * @return - true jeśli zadanie dodane pomyślnie
   */

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
