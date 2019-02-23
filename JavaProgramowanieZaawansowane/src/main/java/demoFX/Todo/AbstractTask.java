package demoFX.Todo;

import java.time.LocalDate;
import java.util.Optional;

public abstract class AbstractTask {
  private final LocalDate created;
  private final LocalDate deadLine;
  private LocalDate completed;

  public AbstractTask(LocalDate deadLine) {
    this.deadLine = deadLine;
    created = LocalDate.now();
  }

  public LocalDate getCreated() {
    return created;
  }

  public LocalDate getDeadLine() {
    return deadLine;
  }

  public LocalDate getCompleted() {
    return completed;
  }

  public void setCompleted(LocalDate completed) {
    this.completed = completed;
  }

  public boolean isDone() {
    /*if(completed != null){
      return true;
    }
    return false;*/
    return completed != null;
  }

  public boolean isDoneBeforeDeadline() {
    if (!isDone()) return false;

    return completed.isBefore(deadLine) || completed.equals(deadLine);
  }

  abstract public Object getContent();

  public int getDaysToDeadLine() {
    if (deadLine == null) {
      return Integer.MAX_VALUE;
    }
    return (int) (deadLine.toEpochDay() - LocalDate.now().toEpochDay());
  }

  public Optional<Integer> getDaysToDeadLineOptional(){
    if( deadLine==null){
      return Optional.ofNullable(null);
    }
    return Optional.ofNullable((int)(deadLine.toEpochDay() - LocalDate.now().toEpochDay()));
  }
}
