import java.time.LocalDate;

class Customer extends Person{

  String shippingAddress;
  String creditCard;

  public Customer(String firstName, String lastName, LocalDate birthDate) {
    super(firstName, lastName, birthDate);
  }

  Customer harry = new Customer("Harry", "Potter", );
}

