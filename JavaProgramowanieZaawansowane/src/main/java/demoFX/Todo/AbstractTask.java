package demoFX.Todo;

import java.time.LocalDate;

public abstract class AbstractTask {
  private final LocalDate created;
  private final LocalDate deadLine;
  private LocalDate completed;

  public AbstractTask(LocalDate deadLine) {
    this.deadLine = deadLine;
    created = LocalDate.now();
  }

  public LocalDate getCeated() {
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
    if (isDone()) return false;
    
    return completed.isBefore(deadLine);
  }

  abstract public Object getContent();


}
