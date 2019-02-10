package demoFX.Todo;

import java.time.LocalDate;

public class TextTask extends AbstractTask {
  private final String content;

  public TextTask(LocalDate deadline, String content){
    super(deadline);
    this.content = content;
  }

  @Override
  public Object getContent(){
    return content;
  }
}
