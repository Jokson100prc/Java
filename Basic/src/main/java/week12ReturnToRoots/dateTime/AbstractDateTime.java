package week12ReturnToRoots.dateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class AbstractDateTime implements DateTimeInterface, FormatterDateTimeInterface {


  public static LocalDate localDate;
  public static LocalDateTime localDateTime;

  public DateTimeFormatter formatter;

//  public static LocalTime localTime;
//  public static LocalDateTime localDateTime;

  public AbstractDateTime() {

  }

  @Override
  public void getCurrentTime() {
    System.out.println(LocalTime.now());
  }

  @Override
  public void getCurrentDate() {
    localDate = LocalDate.now();
    System.out.println(localDate);
  }

  @Override
  public void getCurrentDateAndTime() {
    System.out.println(LocalDateTime.now().getHour() + ":" + LocalDateTime.now().getMinute() + ":" + LocalDateTime.now().getSecond());
  }

  @Override
  public void day() {
    System.out.print(" " + LocalDate.now().getDayOfWeek() + " ");
  }

  @Override
  public Month month() {
    return LocalDate.now().getMonth();
  }

  @Override
  public int year() {
    return LocalDate.now().getYear();
  }

  void getMonthANDYear() {
    int year = year();
    Month month = month();
    System.out.println(month + " " + year);
  }

  @Override
  public void period(LocalDate blackDay, LocalDate whiteDay) {

    System.out.println("Between " + blackDay + " and " + whiteDay + " have passed" + " " + Period.between(blackDay, whiteDay).get(ChronoUnit.YEARS) + " years");
    System.out.println("Between " + blackDay + " and " + whiteDay + " have passed" + " " + ChronoUnit.DAYS.between(blackDay, whiteDay) + " days");
  }

  @Override
  public void duration(LocalTime firstHour, LocalTime secongHour) {

  }

  @Override
  public void cidadeDeRioDeJaneiro() {

  }

  @Override
  public void miastoBydgoszcz() {

  }

  @Override
  public void dateTimePattern() {

  }
}
