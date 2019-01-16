package time;

import java.time.LocalDate;

public class LocalDateDemo {
  public static void main(String[] args){

    LocalDate date = LocalDate.now();
    LocalDate birth = LocalDate.of(1990,1,1);
    System.out.println(date);
    System.out.println(birth);

    //how many days of between birth and date
    System.out.println(LocalDate.ofEpochDay(0));
    System.out.println(date.toEpochDay()-birth.toEpochDay());

    //day after 100y
    System.out.println(date.plusYears(100));

    //how many days to my birthday
    //1.my case
    System.out.println(date.getMonthValue()<birth.getMonthValue()? true: false);
    //2.teacher case
    LocalDate currentBirth = LocalDate.of(date.getYear(),birth.getMonth(),birth.getDayOfMonth());
    if (date.isBefore(currentBirth)){
      //birth is in this year
      System.out.print(currentBirth.toEpochDay()- date.toEpochDay());
    } else {
    LocalDate nextBirth = currentBirth.plusYears(1);
    System.out.print(nextBirth.toEpochDay() - date.toEpochDay());
    }
    System.out.println(" day");


    //witch month will be after 3000 day?
    System.out.print(date.plusDays(3000).getMonth());
    System.out.print(" " + date.plusDays(3000).getYear());





  }
}
