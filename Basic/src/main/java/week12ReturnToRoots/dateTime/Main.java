package week12ReturnToRoots.dateTime;

import W147daysAbcTime.DayOfDate;
import W147daysAbcTime.OurHours;

public class Main {
  public static void main(String[] args) {
    DateTimeExercise dateTimeExercise = new DateTimeExercise();
    DayOfDate dayOfDay = new DayOfDate();
    OurHours ourHours = new OurHours();

    dateTimeExercise.getCurrentTime();
    dateTimeExercise.getCurrentDate();
    dateTimeExercise.getCurrentDateAndTime();
    dateTimeExercise.day();
    dateTimeExercise.getMonthANDYear();
    dateTimeExercise.period(dayOfDay.blackDay(),dayOfDay.whiteDay());
    dateTimeExercise.duration(ourHours.firstHour(),ourHours.secondHoure());
    dateTimeExercise.cidadeDeRioDeJaneiro();
    dateTimeExercise.miastoBydgoszcz();
    dateTimeExercise.dateTimePattern();
  }
}
