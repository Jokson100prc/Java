package tarr.app.ver1;

import java.time.LocalDate;

public class TextTask extends AbstractTask {

  public TextTask(String content, LocalDate deadline) {
    super(content, deadline);
  }

  @Override
  public String get() {
    return getContent() + " " + getCreation() + " " + getDeadline() + " " + isDone();
  }

  public void setAsDone(){
    this.setDone(true);
  }
}
