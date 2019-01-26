import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class User{
  private String name;
  private String email;
  private String password;
  private int id;

  public User(){
    this.password ="";
    this.name = "";
    this.name = "no name";
  }

  public User(String name, String email, String password, Integer id) {
    this.name = name;
    this.email = email;
    this.password = password;
    this.id = id;
  }

  @Override
  public String toString() {
    return name+" "+email+" "+password+" "+id;
  }
}

class Message{
  public String send(){
    return "New message";
  }
}

class Task {
  public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, InstantiationException, NoSuchMethodException, InvocationTargetException {
    User member = new User("amin","admin@jps.pl","123456",3);
    //wyświetlenie pól obiektu wraz z wartościami
    System.out.println("Lista pól");
    for(Field f: member.getClass().getDeclaredFields()){
      //udostępniamy pola do odczytu
      f.setAccessible(true);
      System.out.println(f.getName() + " "+f.get(member).toString());
    }
    System.out.println();
    //wyświetlenie metod
    System.out.println("Lista metod");
    for(Method m: member.getClass().getMethods()){
      System.out.println(m.getName());
    }
    System.out.println();
    //zmieniamy wartość wybranego pola
    System.out.println("Zmiana wartości pola password");
    System.out.println("Obiekt przed zmianą");
    System.out.println(member);
    Field f = member.getClass().getDeclaredField("password");
    f.setAccessible(true);
    f.set(member, "abcd");
    System.out.println("Obiekt po zmianie zmianą");
    System.out.println(member);

    Message m = Message.class.newInstance();
    System.out.println(m.send());
    User u = User.class.newInstance();
    System.out.println(u);
  }
}