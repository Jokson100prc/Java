package tarr.app.exercises;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {
  public static void main(String[] args) throws IllegalAccessException {
     User user =new User("Adam","111111");

    System.out.println(user.getClass());
    System.out.println(user.getClass().getDeclaredFields());
    Field[] fields = user.getClass().getDeclaredFields();
    for (Field f: fields){
      System.out.println(f.getName() + " " + f.get(user));
      Method[] methods = user.getClass().getDeclaredMethods();
    for (Method m: methods){
      System.out.println(f.getName() + " " + f.get(user));

    }

    }
  }
}
