package pl.sda.jdbc;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Collection;
import java.util.Objects;

public class JpaEngineerDao implements EmployeeDao {


  @Id
  @GeneratedValue
  private int id;
  private String name;
  private int experience;


  public JpaEngineerDao() {
  }

  public JpaEngineerDao(String name, int experience) {
    this.name = name;
    this.experience = experience;
  }


  public int getId() {
    return id;
  }

  @Override
  public int add(Employee employee) {
    return 0;
  }

  @Override
  public void delete(int id) {

  }

  @Override
  public void update(int id, Employee newEmployee) {

  }

  @Override
  public Collection<Employee> findByName(String name) {
    return null;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JpaEngineerDao that = (JpaEngineerDao) o;
    return id == that.id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }


}
