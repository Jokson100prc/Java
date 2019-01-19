import org.junit.Test;
import static org.junit.Assert.*;

public class TestTask{
  @Test
  public void testLaptop() {
    Dog dog = new Dog("AAAA");
    Cat cat = new Cat("BBBB");
    assertEquals("", dog.getSound(),  "AAAA makes wuff wuff");
    assertEquals("", cat.getSound(), "BBBB makes miau miau");
  }
}