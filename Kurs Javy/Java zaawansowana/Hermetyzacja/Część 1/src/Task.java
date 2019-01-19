class User{
  private String name;

  public User(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }
}


class Admin extends User{
  private String rights;
  public Admin(String name, String rights){
    super(name);
    this.rights = rights;
  }

  public String getName(){
    return super.getName();
  }
}

class Task {
  public static void main(String[] args){
    User p1 = new User("MISIEK");
    User p2 = new Admin("SUPER", "AAAE");
    System.out.println(p1.getName());
    System.out.println(p2.getName());
  }
}