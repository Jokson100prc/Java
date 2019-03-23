package pl.sda.jdbc;

import java.sql.SQLException;
import java.util.Collection;

public interface EmployeeDao {

  int add(Employee employee);

  void delete(int id) throws SQLException;

  void update(int id, Employee newEmployee);

  Collection<Employee> findByName(String name);

}
