package tdd.greetingKata;

public class GreetingKata2 {
  public static String getName(String name) {
    if (name == null){
      name = "my friend";
    }
    if(name.equals(name.toUpperCase())){
      return "HELLO " + name + "!";
    }
    return "Hello, " + name;
  }

  public static String getNames(String[] names) {
    String twoNames = names[0] +" and " + names[1];
  return "Hello, " + twoNames;
  }
}
