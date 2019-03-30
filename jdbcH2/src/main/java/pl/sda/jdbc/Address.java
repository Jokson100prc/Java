package pl.sda.jdbc;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Address {

  @Id
  @GeneratedValue
  private int id;
  private String city;
  private String street;
  private String country;
  @ManyToMany
  private Collection<Employee> employees;

  public Address() {
  }

  public Address(String street, String city, String country) {
    this.city = city;
    this.street = street;
    this.country = country;
    this.employees = new ArrayList<>();
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Address address = (Address) o;
    return id == address.id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  public void setEmployee(Employee employee) {
    this.employees.add((employee));
  }


  public Collection<Employee> getEmployees() {
    return employees;
  }
}
