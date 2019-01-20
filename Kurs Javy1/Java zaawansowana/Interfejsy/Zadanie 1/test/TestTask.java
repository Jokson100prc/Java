import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class TestTask{
  @Test
  public void testComputer() {
    Flyable duck = new Duck();
    assertEquals("Nie powinien istnieć obiekt", duck.takeOff(), LocalDate.now());
    assertEquals("Nie powinien istnieć obiekt", duck.land(), LocalDate.now());
  }
}