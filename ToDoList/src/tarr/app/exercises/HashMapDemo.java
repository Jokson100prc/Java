package tarr.app.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapDemo {
  public static void main(String[] args) {

    Map<String, User> users = new HashMap<>();

    users.put("adas", new User("Adam", "uytr674"));
    users.put("becia", new User("Beata", "56526rr"));
    users.put("karolek", new User("Karol", "g44w45f"));


    Scanner scanner = new Scanner(System.in);
    String login = scanner.next();
    String pass = scanner.next();

    if (users.containsKey(login)) {
      User user = users.get(login);
      String usserpass = user.password;
      if (pass.equals(usserpass)) {
        System.out.println("Zalogowany");
      }
    } else {
      System.out.println("Niepoprawny login lub hasło");
    }
  }
}