import org.junit.Test;
        import static org.junit.Assert.*;

public class TestTask{
  @Test
  public void testAirliner() {
    Airliner plain = new Airliner("YAK3", 3, 230);
    assertEquals("Niepoprawna definicja konstruktora.", plain.getNumberOfEngines(), 3);
    assertEquals("Zbyt mali liczba parametrów konstruktora.", plain.getNumberOfPassengers(), 230);
  }
}