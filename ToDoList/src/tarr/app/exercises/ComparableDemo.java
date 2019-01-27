package tarr.app.exercises;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ComparableDemo {
  public static void main(String[] args) {
    List<User> users = new LinkedList<>();
    users.add(new User("JÓZEF", "io78yt"));
    users.add(new User("ADELAJDA", "345tqttt"));
    users.add(new User("BERNARD", "ge4t54"));
    users.add(new User("MARCELA", "54321"));
    users.add(new User("EDMUND", "12345"));

//    Collections.sort(users, new Comparator<User>() {
//      @Override
//      public int compare(User o1, User o2) {
//        if (o1.name.length() > o2.name.length()) {
//          return 1;
//        }
//        if (o1.name.length() < o2.name.length()) {
//          return -1;
//        }
//        return 0;
//      }
//    });

Collections.sort(users);
    System.out.println("Lista posortowana wg długości imion");
    for (User u : users) {
      System.out.println(u.name);
    }

    Collections.sort(users, new Comparator<User>() {
      @Override
      public int compare(User o1, User o2) {
        return User.comparePass(o1, o2);
      }
    });
    System.out.println("Lista posortowana wg długości haseł");
    for (User u : users) {
      System.out.println(u.password);
    }
  }
}
