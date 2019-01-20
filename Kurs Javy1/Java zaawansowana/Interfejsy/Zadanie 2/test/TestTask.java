import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class TestTask{
  @Test
  public void testComputer() {
    ElectricPower apple = new Smartphone(4000);
    assertEquals("Niepoprawna wartość power", apple.getPower(), 0 );
    apple.recharge();
    assertEquals("Niepoprawna wartość power po wywołaniu recharge", apple.getPower(), 4000 );
    assertEquals("Niepoprawna wartość power o wywołaniu supply 1", apple.supply(1000), 1000);
    assertEquals("Niepoprawna wartość power o wywołaniu supply 2", apple.supply(-1000), 0);
    assertEquals("Niepoprawna wartość power o wywołaniu supply 3", apple.supply(3000), 3000);
    assertEquals("Niepoprawna wartość power o wywołaniu supply 4", apple.supply(3000), 0);
  }
}