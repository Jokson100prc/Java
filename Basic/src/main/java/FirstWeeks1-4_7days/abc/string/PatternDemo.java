package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo {
  public static void main(String[] args) {


    Pattern pattern = Pattern.compile("\\b\\w+\\b\\s+b.*", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CHARACTER_CLASS);
    Matcher match = pattern.matcher("może być");

    System.out.println(match.matches());

    // grupy () -  grup może być maksymalnie od 0 do 9
    Pattern code = Pattern.compile("\\d\\d-\\d\\d\\d");
    Matcher codeMatcher = code.matcher("Kod pocztowy: 45-367");
    if (codeMatcher.find()) {
      System.out.println(codeMatcher.group());


      code = Pattern.compile(".*:\\s(\\d\\d-\\d\\d\\d)");
      codeMatcher = code.matcher("Kod pocztowy: 37-269");
      if (codeMatcher.matches()) {
        System.out.println(codeMatcher.groupCount());
        System.out.println(codeMatcher.group(1));
      }
      code = Pattern.compile(".*:\\s(\\d\\d)-(\\d\\d\\d)");
      ;
      codeMatcher = code.matcher("Kod pocztowy: 37-269");
      if (codeMatcher.matches()) {
        System.out.println(codeMatcher.groupCount());
        System.out.println(codeMatcher.group(1));
        System.out.println(codeMatcher.group(2));
        int n = 1;
        while (codeMatcher.groupCount() >= n) {
          System.out.println(codeMatcher.group(n));
          n++;
        }
      }
    }


  }
}

