package ExercisesArray;

import java.util.ArrayList;
import java.util.List;

//***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ******   ***   ***   ***   ***   ***
//        3. Utwórz listę ArrayList przechowującą liczby zmiennoprzecinkowe. Dodaj ręcznie 10
//        liczb do listy.
//        a. Wyświetl sumę pierwszego i ostatniego elementu zapisanego w liście..
//        b. Wyświetl iloczyn pierwszego i ostatniego elementu zapisanego w liście.
//        c. Wyświetl iloraz drugiego i przedostatniego elementu zapisanego w liście.
//***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ******   ***   ***   ***   ***   ***
public class ThirdExerciseArrLiDouble {

  List<Double> actionOnDouble() {
    List<Double> actOnDouble = new ArrayList() {
    };
    actOnDouble.add(45.4);
    actOnDouble.add(7.1);
    actOnDouble.add(2.);
    actOnDouble.add(0.998);
    actOnDouble.add(354.45);
    actOnDouble.add(11.11);
    actOnDouble.add(77.25);
    actOnDouble.add(6.6);
    actOnDouble.add(.44);
    actOnDouble.add(537.784);

    double summaryDouble = actOnDouble.get(0) + actOnDouble.get(9);
    System.out.println(summaryDouble);
    return actOnDouble;
  }
}
