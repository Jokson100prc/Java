package Week4d2;


import java.util.regex.Pattern;

import static java.lang.System.out;

/**
 * **   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***
 * 1.
 * Napisz aplikację sprawdzającą czy wprowadzony przez użytkownika numer telefonu
 * jest poprawny. Przygotuj klasę o nazwie
 * TelephoneValidator posiadającą metodę
 * public boolean validate(String telephone);
 * Podany telefon uważa się za poprawny gdy składa się z 9 cyfr.
 * Poprawny numer telefonu to: 505879357, 505 879 357, 505-879-357
 * Błędny numer telefonu to: 50 58 79 35 7, 5058794, 44505879357
 * **   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***
 */
public class TelephoneValidator {

  public boolean validate(String regex, String fromConsole) {
    out.println(fromConsole);
    return Pattern.matches(regex, fromConsole);
  }
}
