package pl.sda.jdbc;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;


@Entity
public class Employee {

  @Id
  @GeneratedValue
  private int id;
  private String name;
  @ManyToMany (cascade = CascadeType.PERSIST)
//  @JoinColumn(name = "foreing_key_employee") // relation Addresses to Employees
  private Collection<Address> addresses;

  public Employee(String name) {
    this.name = name;
    addresses = new ArrayList<>();
  }



  public Collection<Address> getAddresses() {
        return addresses;
  }

  void addAddress(Address address) {
    address.setEmployee(this);
    addresses.add(address);
  }

  @Override
  public String toString() {
    return "Employee{" +
            "name='" + name + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Employee employee = (Employee) o;
    return Objects.equals(name, employee.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }


  public void setId(int id) {
    this.id = id;
  }
}
