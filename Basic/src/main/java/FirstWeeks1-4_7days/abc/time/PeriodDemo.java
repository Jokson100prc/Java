package time;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodDemo {
  public static void main(String[] args) {

    Period period = Period.between(LocalDate.of(2017,04,24), LocalDate.now());
    System.out.println(period);
    System.out.println(period.getDays());
    System.out.println(period.toTotalMonths());


    period = Period.between(LocalDate.of(2017,04,24), LocalDate.now().plusDays(26));
    System.out.println(period);
    System.out.println(period.toTotalMonths());

  }
}
