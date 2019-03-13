package tdd.greetingKata;

import java.util.Arrays;
import java.util.List;

public class GreetingKata1 {

  public static String greet(String name) {

    if (name == null) {
      return "Hello, my friend.";
    }

    if (name.equals(name.toUpperCase())) {
      return "HELLO " + name + "!";
    }

    return "Hello, " + name + ".";
  }


  public static String greet(String[] names) {

    //1 gdy jedno imię -> Hello, <imie>
    //2 gdy dwoje imion -> Hello, <imie> and <imie>.
    //gdy więcej niż 2
    List<String> namesAsList = Arrays.asList(names);
    String result = "";
    if (namesAsList.size() >= 3) {
      for (int i = 0; i < namesAsList.size() - 2; i++) {
        result += namesAsList.get(i) + ", ";
      }
      return "Hello, " + GreetingKata1.connectTwoNames(result, namesAsList.get(namesAsList.size() - 2) + ", and " + namesAsList.get(namesAsList.size() - 1));
    }
    for (int i = 0; i < namesAsList.size(); i++) {
      result = namesAsList.get(0) + " and " + namesAsList.get(1) + ".";


    }
    return "Hello, " + result;
  }

  public static String connectTwoNames(String name1, String name2) {
    return name1 + name2 + ".";
  }

}

