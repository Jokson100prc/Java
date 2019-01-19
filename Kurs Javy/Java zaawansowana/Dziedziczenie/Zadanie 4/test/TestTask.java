import org.junit.Test;
import static org.junit.Assert.*;

public class TestTask{
  @Test
  public void testLaptop() {
    Laptop acer = new Laptop(4000);
    Computer comp = new Computer();
    assertEquals("Niepoprawna wartość pola ramSize.", acer.ramSize, 8);
    assertEquals("Brak odpowiedniego konstruktora klasy Computer.", comp.ramSize, 8);
  }
}