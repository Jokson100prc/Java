package tdd.greetingKata;

import java.util.Arrays;
import java.util.List;

public class GreetingKata2 {
  public static String getName(String name) {
    if (name == null) {
      name = "my friend";
    }
    if (name.equals(name.toUpperCase())) {
      return "HELLO " + name + "!";
    }
    return "Hello, " + name + ".";
  }

  public static String getNames(String[] names) {
    int lastIndex = (names.length - 1);
    List<String> namesAsList = Arrays.asList(names);


    if (names.length >= 3) {
      int indexBetween = namesAsList.size() - 1;
      int indexLast = namesAsList.size();

      List<String> tempList = namesAsList.subList(0, indexBetween);
      List<String> tempLastIndex = namesAsList.subList(indexBetween, indexLast);

      String joinNames = String.join(", ", tempList);
      return "Hello, " + joinNames + ", and " + tempLastIndex.get(0) + ".";
    }


    return "Hello, " + names[0] + " and " + names[1] + ".";
  }

//  public static void main(String[] args) {
//    List<String> example = new ArrayList<String>();
//    example.add(0, "one");
//    example.add(1, "two");
//    example.add(2, "three");
//
//    String test = String.join(" 123 ", example);
//    System.out.println(test);
//  }
}