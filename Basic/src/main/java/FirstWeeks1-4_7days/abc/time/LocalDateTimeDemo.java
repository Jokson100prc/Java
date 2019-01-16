package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class LocalDateTimeDemo {
  public static void main(String[] args){
    LocalDateTime timeStamp = LocalDateTime.now();
    System.out.println(timeStamp);
    System.out.println(timeStamp.toLocalDate() + " " + timeStamp.toLocalTime());


    //witch date will be after 100days
    System.out.println(timeStamp.plusDays(100));

    //how many seconds have passed since the date of birth
    LocalDateTime birthStamp = LocalDateTime.of(1990,1,1, 19,10, 0);
    System.out.print("Time in seconds from birth date: ");
    System.out.println(timeStamp.toEpochSecond(ZoneOffset.MAX) - birthStamp.toEpochSecond(ZoneOffset.MAX));
    //how many seconds have passed since the date of birth between diferent time zone
    System.out.print("Time in seconds from birth date (diferent time Zone): ");
    System.out.println(timeStamp.toEpochSecond(ZoneOffset.ofHours(0)) - birthStamp.toEpochSecond(ZoneOffset.ofHours(2)));
  }
}
