package tdd.greetingKata;

import java.util.Arrays;
import java.util.List;

public class GreetingKata1 {

  public static String greet(String name) {

    if (name == null) {
      return "Hello, my friend";
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
      List <String> namesAsList = Arrays.asList(names);
      String result = "";
      for(int i=0; i< namesAsList.size() -1; i++) {
        result += namesAsList.get(i) + ", ";
      }

      return GreetingKata1.connectTwoNames(result, namesAsList.get(namesAsList.size() -1));
  }

  public static String connectTwoNames(String name1, String name2) {
    return name1 + "and" +name2;
  }



  }
//    for (int i = 0; i < names.length; i++) {
////      int j = i-1;
////      int k = i - 2;
////      if(names[i].equals(names[j])) {
////      return names[j];
////      }
//        return names[i]+ ", ";
//    }
//
//    String nameAndName = names[0] + " and " + names[1];
//    return "Hello, " + nameAndName;

