import org.junit.Test;
import static org.junit.Assert.*;

public class TestTask{
  @Test
  public void testCustomer() {
    assertTrue("Typ tablicy team niepoprawny.", Task.team instanceof Person[]);
    assertEquals("Niepoprawna wartość zmiennej wife.",Task.wife, Task.team[1]);
  }
}