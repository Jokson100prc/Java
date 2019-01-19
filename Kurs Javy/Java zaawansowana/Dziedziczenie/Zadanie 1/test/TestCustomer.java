import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class TestCustomer{
  @Test
  public void testCustomer() {
    Person c = new Customer("A","B", LocalDate.of(2000,10,10),"AA 12 234","23457643GB");
    assertTrue("Klasa worker nie dziedziczy po Person", c instanceof Person);
    assertEquals("Brak pola shippingAddress", "AA 12 234",((Customer) c).shippingAddress);
    assertEquals("Brak pola creditCard", "23457643GB",((Customer) c).creditCard);
    assertEquals("Brak pola firstName", "A", c.firstName);
    assertEquals("Brak pola lastName", "B", c.lastName);
    assertEquals("Brak pola birthDate", LocalDate.of(2000,10,10).toString(), c.birthDate.toString());
  }
}