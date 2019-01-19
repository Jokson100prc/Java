import org.junit.Test;
import static org.junit.Assert.*;

public class TestTask{
  @Test
  public void testComputer() {
    Computer comp = Computer.build(new CPU("i5"), new Ram(8), new Disk(1000));
    assertNotEquals("Powinien istnieć obiekt", comp, null );
    Computer compNull = Computer.build(null, null, null);
    assertEquals("Nie powinien istnieć obiekt", compNull, null );
    compNull = Computer.build(new CPU("i5"), null, null);
    assertEquals("Nie powinien istnieć obiekt", compNull, null );
    compNull = Computer.build(null, new Ram(8), null);
    assertEquals("Nie powinien istnieć obiekt", compNull, null );
    compNull = Computer.build(null, null, new Disk(1000));
    assertEquals("Nie powinien istnieć obiekt", compNull, null );
  }
}