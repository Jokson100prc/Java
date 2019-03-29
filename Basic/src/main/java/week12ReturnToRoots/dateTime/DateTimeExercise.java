package week12ReturnToRoots.dateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeExercise extends AbstractDateTime {


  public DateTimeExercise() {
    super();
  }

  @Override
  public void getCurrentTime() {
    super.getCurrentTime();
  }

  @Override
  public void getCurrentDate() {
    super.getCurrentDate();
  }

  @Override
  public void day() {
    super.day();
  }

  @Override
  void getMonthANDYear() {
    super.getMonthANDYear();
  }

  @Override
  public void getCurrentDateAndTime() {
    super.getCurrentDateAndTime();
  }

  @Override
  public Month month() {
    return super.month();
  }

  @Override
  public int year() {
    return super.year();
  }

  @Override
  public void period(LocalDate blackDay, LocalDate whiteDay) {
    super.period(blackDay, whiteDay);
  }

  @Override
  public void duration(LocalTime firstHour, LocalTime secondHour) {
    super.duration(firstHour, secondHour);
    long time = Duration.between(firstHour, secondHour).getSeconds();
    System.out.println(time);
    System.out.println("Between " + firstHour + " and " + secondHour + " is " + (time /= 3600) + " hours and " + (time % 36) + " min");
  }

  @Override
  public void cidadeDeRioDeJaneiro() {
    super.cidadeDeRioDeJaneiro();
    System.out.println("Current time in Rio de Janeiro: " + LocalDateTime.now(ZoneId.of("America/Sao_Paulo")));
  }

  @Override
  public void miastoBydgoszcz() {
    super.miastoBydgoszcz();
    System.out.println("Current time in Bydgoszcz in Poland: " + LocalDateTime.now(ZoneId.of("Poland")));
  }

  @Override
  public void dateTimePattern() {
    super.dateTimePattern();
    DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME; // pattern to changed
    String beutyDateForm = formatter.format(LocalDateTime.now());
    System.out.println("FORMATTED: " + beutyDateForm);
  }
}
