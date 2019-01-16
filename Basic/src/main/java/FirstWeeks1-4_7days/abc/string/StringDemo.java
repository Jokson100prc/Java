package string;

public class StringDemo {
  public static void main(String[] args) {

    String city = "Bydgoszcz";
    String home1 = "Bydgoszcz";
    String home2 = new String("Bydgoszcz");

    //COMPARE
    System.out.println(city == home1);
    System.out.println(city == home2);

    //EQUALS
    System.out.println(city.equals(home1));
    System.out.println(city.equals(home2));
    System.out.println("Bydgoszcz".equals(home2));

    city.charAt(0);
    System.out.println(city.charAt(0));
    System.out.println(city.substring(1));
    city = "b" + city.substring(1);
    System.out.println(city);

    city = city.replace("b", "B");
    System.out.println(city);
    System.out.println(city.toUpperCase());
    System.out.println(city.toLowerCase());


    String str = "programowanie w java";
    String[] words = str.split(" ");
    for (String s : words) {
      System.out.println(s);
    }
    str = "";
    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      word = (word.charAt(0) + "").toUpperCase() + word.substring(1);
      if (i == words.length - 1) {
        str += word;
      } else {
        str += word + " ";
      }
    }
    System.out.println(str);


    //Change string to camelCase //replace split
    String str2 = "count of NUMBERS";
    str2 = str2.toLowerCase();
    String[] words2 = str2.split(" ");
    for (String s : words2) {
      System.out.println(s);
    }
    str2 = "";
    for (int i = 0; i < words2.length; i++) {
      String word2 = words2[i];
      if (i == 0) {
        str2 += word2;
        continue;
      }
      word2 = (word2.charAt(0) + "").toUpperCase() + word2.substring(1);
      str2 += word2;


      System.out.println(str2);
    }
  }
}

