package W147daysAbcTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDataTime {

  LocalDateTime localDateTime;
  DateTimeFormatter dateTimeFormatter;

   public LocalDateTime formatDataTime(){
    return LocalDateTime.now();
  }

}
