package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceDemo {
  public static void main(String[] args) {

    String text = "Programowanie w Java w i o";
    System.out.println(text);

    System.out.println(text.replaceAll("\\b\\w\\b", "z"));

    System.out.println(text.replaceAll("\\b\\w{4}\\b", "JAVA"));

    text = "Programowanie w Java w i o nie";
    System.out.println(text.replaceAll("nie", "tak"));

// ? dokładnie jeden dowolny znak
// odwołanie wsteczne |numer_grupy
    text = "kod kod kod pocztowy";
    System.out.println(text.replaceAll(".*(\\b\\w+\\b)\\s(\\1)", "kod"));

    text = "kod kod pocztowy";
    Pattern pat = Pattern.compile(".*(\\b\\w+\\b)\\s\\1.*");
    Matcher mat = pat.matcher(text);
    System.out.println(mat.matches());
    System.out.println(text.replaceAll("(\\b\\w+\\b)\\s\\1", mat.group(1)));

  }
}
