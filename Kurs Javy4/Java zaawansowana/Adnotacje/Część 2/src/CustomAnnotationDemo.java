import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Default{
  int value();
}


class Person{
  @Default(value = 3)
  int id;

  private String name;

  Person(String name, int id) {
    this.name = name;
    this.id = id;
  }

  @Override
  public String toString(){
    return name+" "+id;
  }
}

class MyFrameworkManager{
  static final MyFrameworkManager MANAGER = new MyFrameworkManager();
  private Collection collection = new ArrayList<>();

  private MyFrameworkManager() {
    System.out.println("MANAGER STARTS");
  }

  public void addObject(Object o) throws IllegalAccessException {
    processAnnotation(o);
    collection.add(o);
  }
  private void processAnnotation(Object o) throws IllegalAccessException {
    if (o == null){
      return;
    }
    if (o instanceof Person){
        Person p = (Person) o;
        for (Field f: p.getClass().getDeclaredFields()){
          if (f.getAnnotation(Default.class) instanceof Default && f.getType().getName().equals("int") && f.getInt(p) == 0){
            f.setInt(p, f.getAnnotation(Default.class).value());
          }
        }
    }
  }

  public void print(){
    for (Object o:collection){
      System.out.println(o);
    }
  }
}

class Task {
  public static void main(String[] args) throws IllegalAccessException {
    Person adam = new Person("ADAM", 0);
    MyFrameworkManager.MANAGER.addObject(adam);
    MyFrameworkManager.MANAGER.print();
  }
}