package tdd.greetingKata;

public class GreetingKata1 {

  public static String whoIsGreeting(String name) {

    if (name == null) {
      return "Hello, my friend";
    }

    if (name.equals(name.toUpperCase())) {
      return "HELLO " + name;
    }

    return "Hello, " + name;
  }

  public static String whoAreGreeting(String[] names) {

    for (int i = 0; i < names.length; i++) {
//      int j = i-1;
//      int k = i - 2;
//      if(names[i].equals(names[j])) {
//      return names[j];
//      }
        return names[i]+ ", ";
    }

    String nameAndName = names[0] + " and " + names[1];

    return "Hello, " + nameAndName;
  }
}
