package W147daysExercisesBasicExercisesArray;

import java.util.List;

//***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ******   ***   ***   ***   ***   ***
//        3. Utwórz listę ArrayList przechowującą liczby zmiennoprzecinkowe. Dodaj ręcznie 10
//        liczb do listy.
//        a. Wyświetl sumę pierwszego i ostatniego elementu zapisanego w liście..
//        b. Wyświetl iloczyn pierwszego i ostatniego elementu zapisanego w liście.
//        c. Wyświetl iloraz drugiego i przedostatniego elementu zapisanego w liście.
//***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ******   ***   ***   ***   ***   ***
public class ThirdExerciseArrLiDouble {

  public List<Double> addToDoubleList(List<Double> doubleList) {

    doubleList.add(45.4);
    doubleList.add(7.1);
    doubleList.add(2.);
    doubleList.add(0.998);
    doubleList.add(354.45);
    doubleList.add(11.11);
    doubleList.add(77.25);
    doubleList.add(6.6);
    doubleList.add(.44);
    doubleList.add(537.784);
    return doubleList;
  }

    Double summaryDouble (Double firstNum, Double secondNum) {
      double sum = firstNum + secondNum;
      System.out.println("\n" + sum + " sum: here I am!" +"\n");
      return sum;

  }
}
