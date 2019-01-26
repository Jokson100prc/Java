package tarr.app.exercises;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ComparableDemo {
  public static void main(String[] args) {
    List<User> users = new LinkedList<>();
    users.add(new User("JÓZEF", "io78y"));
    users.add(new User("ADELAJDA", "345tq"));
    users.add(new User("BERNARD", "ge4t5"));

    Collections.sort(users, new Comparator<User>() {
      @Override
      public int compare(User o1, User o2) {
        if (o1.name.length() > o2.name.length()) {
          return 1;
        }
        if (o1.name.length() < o2.name.length()) {
          return -1;
        }
        return 0;
      }
    });
    for (User u : users) {
      System.out.println(u.name);
    }
  }
}
