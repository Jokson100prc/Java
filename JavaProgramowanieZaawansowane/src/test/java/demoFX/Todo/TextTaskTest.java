package demoFX.Todo;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TextTaskTest {

  @Test
  void isDone() {
    TextTask task = new TextTask(LocalDate.of(2019, 2, 20), "Zadanie 1");
    assertEquals(false, task.isDone(), "Metoda powinna zwrócić false");

    task.setCompleted(LocalDate.of(2019, 2, 19));
    assertEquals(true, task.isDone(), "Metoda powinna zwrócić true");
  }

  @Test
  void isDoneBeforeDeadline() {
    TextTask task = new TextTask(LocalDate.of(2019, 2, 20), "Zadanie 1");
    assertEquals(false, task.isDoneBeforeDeadline(), "Brak daty zakończenia - false");

    task.setCompleted(LocalDate.of(2019, 2, 19));
    assertEquals(true, task.isDoneBeforeDeadline(), "Data zakończenia przed deadlinem, true");

    task.setCompleted(LocalDate.of(2019, 3, 19));
    assertEquals(false, task.isDoneBeforeDeadline(), "Data zakończenia po deadline, false");

    task.setCompleted(LocalDate.of(2019, 2, 20));
    assertEquals(true, task.isDoneBeforeDeadline(), "Data zakończenia w dniu deadline, true");
  }

  @Test
  void getContent() {
    TextTask task = new TextTask(LocalDate.of(2019, 2, 20), "Zadanie 1");
    assertEquals("Zadanie 1", task.getContent());

    TextTask task2 = new TextTask(LocalDate.of(2019, 2, 20), null);
    assertEquals(null, task2.getContent());
  }

  @Test
  void getDaysToDeadLine() {
    LocalDate now = LocalDate.now();
    LocalDate after = now.plusMonths(1);
    LocalDate before = now.minusMonths(1);

    //deadline ==> null
    TextTask task = new TextTask(null, "Zadanie 1");
    assertEquals(Integer.MAX_VALUE, task.getDaysToDeadLine(), "Brak daty zakończenia zadania, MAX_VALUE");


    //deadline ==> po bieżącej dacie
    task = new TextTask(after, "Zadanie 2");
    assertEquals(task.getDeadLine().toEpochDay() - now.toEpochDay(), task.getDaysToDeadLine(), "Przed deadline, wartość dodatnia");


    //deadline ==> przed bieżącą datą
    task = new TextTask(before, "Zadanie 3");
    assertEquals(task.getDeadLine().toEpochDay() - now.toEpochDay(), task.getDaysToDeadLine(), "Po deadline, wartość ujemna");



    //deadline ==> dzisiaj
    task = new TextTask(now, "Zadanie 4");
    assertEquals(task.getDeadLine().toEpochDay() - now.toEpochDay(), task.getDaysToDeadLine(), "Deadline jest dziasiaj, wartość ZERO");


  }
}