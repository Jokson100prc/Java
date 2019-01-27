package tarr.app.exercises;


class User implements Comparable <User> {
  String name;
  String password;

  public User(String name, String password) {
    this.name = name;
    this.password = password;
  }

  @Override
  public int compareTo(User o) {
    if (this.name.length() > o.name.length()) {
      return 1;
    }
    if (this.name.length() < o.name.length()) {
      return -1;
    }
    return 0;
  }


  static public int comparePass(User u1, User u2){
    if (u1.password.length() > u2.password.length()) {
      return 1;
    }
    if (u1.password.length() < u2.password.length()) {
      return -1;
    }
    return u1.compareTo(u2);
  }
}
