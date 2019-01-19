package tarr.app;

import java.time.LocalDate;

public abstract class AbstractTask {
  private final String content;
  private final LocalDate creation;
  private boolean isDone;
  private LocalDate deadline;
  private LocalDate complited;

  public AbstractTask(String content, LocalDate deadline) {
    this.content = content;
    this.creation = LocalDate.now();
    this.deadline = deadline;
    this.isDone = false;
  }


  // GETER
  abstract public String get();

  public String getContent() {
    return content;
  }

  public boolean isDone() {
    return isDone;
  }

  protected void setDone(boolean done) {
    isDone = done;
  }

  public LocalDate getCreation() {
    return creation;
  }

  public LocalDate getDeadline() {
    return deadline;
  }

  // SETER
  public void setDeadline(LocalDate deadline) {
    this.deadline = deadline;
  }

  public LocalDate getComplited() {
    return complited;
  }

  public void setComplited(LocalDate complited) {
    this.complited = complited;
  }
}
