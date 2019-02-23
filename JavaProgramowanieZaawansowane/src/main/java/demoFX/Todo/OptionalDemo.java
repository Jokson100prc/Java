package demoFX.Todo;

import java.time.LocalDate;

public class OptionalDemo {
  public static void main(String[] args) {
    TextTask task = new TextTask(null,"zadanie");
    task.getDaysToDeadLineOptional().ifPresent(a->System.out.println(a));

    task = new TextTask(LocalDate.of(2019,2,20),"zadanie2");
    System.out.println(task.getDaysToDeadLineOptional());

    task.getDaysToDeadLineOptional().ifPresent(a->System.out.println(a));
  }
}
