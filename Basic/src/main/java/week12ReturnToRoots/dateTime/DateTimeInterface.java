package week12ReturnToRoots.dateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public interface DateTimeInterface {

  void getCurrentTime();

  void getCurrentDate();

  void getCurrentDateAndTime();

  void day();

  Month month();

  int year();

  void period(LocalDate blackDay, LocalDate whiteDay);

  void duration(LocalTime firstHour, LocalTime secongHour);

void cidadeDeRioDeJaneiro();

void miastoBydgoszcz();

}
