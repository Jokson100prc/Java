package time;

import java.time.LocalTime;

public class LocalTimeDemo {
  public static void main(String[] args){
    LocalTime currentTime = LocalTime.now();
    System.out.println((currentTime.getNano() - LocalTime.of(0,0,0).getNano()) / 10E9);
    System.out.println(currentTime.toSecondOfDay());

      //JavaClass Time
    LocalTime start = LocalTime.of(9,0,0);
    LocalTime end = LocalTime.of(16,30,0);
    System.out.println(end.toSecondOfDay() - start.toSecondOfDay());

    // Time to end of JavaClass today
    System.out.println(end.toSecondOfDay() - currentTime.toSecondOfDay());

    //how will be time after 1200 sec.
    System.out.println(currentTime.plusSeconds(1200));

    //how will be time after 2h and 23min.
    System.out.println(currentTime.plusHours(2).plusMinutes(23));


    //How is cost of phonecall during 3 min and 25sec, if cost of each 10sec start is 5 cent
    int seconds = LocalTime.of(0,3,25).toSecondOfDay();
    System.out.println((seconds/10) *5 +(seconds%10>0?5:0));





  }
}
