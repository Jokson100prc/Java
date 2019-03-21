package week12ReturnToRoots.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringExercise {
  public String string = "Olgierd";

  public static void main(String[] args) {
    StringExercise exercises = new StringExercise();
//    exercises.lowerCase();
//    exercises.upperCase();
//    exercises.myLength();
    exercises.checkLetter();
  }

  void lowerCase() {
    System.out.println(string.toLowerCase());
  }

  void upperCase() {
    System.out.println(string.toUpperCase());
  }

  void myLength() {
    System.out.println(string.length());
  }

  void checkLetter() {
    // https://www.samouczekprogramisty.pl/wyrazenia-regularne-w-jezyku-java/

    Pattern letter_O = Pattern.compile("^O.*");
    Pattern letter_e = Pattern.compile(".*e.*");
    Pattern letter_X = Pattern.compile(".*X.*");

    Matcher matcher1 = letter_e.matcher(string);
    Matcher matcher2 = letter_O.matcher(string);
    Matcher matcher3 = letter_X.matcher(string);

    System.out.print("'find()' - Is first letter 'O'? " + matcher1.find() + " *** ");
    System.out.println("'matches()' - Is first letter 'O'? " + matcher1.matches());
    System.out.print("'find()' - Is there letter 'e'? " + matcher2.find() + " *** ");
    System.out.println("'matches()' - Is there letter 'e'? " + matcher2.matches());
    System.out.print("'find()' - Is there letter 'X'? " + matcher3.find() + " *** ");
    System.out.println("'matches()' - Is there letter 'X'? " + matcher3.matches());
  }
}
