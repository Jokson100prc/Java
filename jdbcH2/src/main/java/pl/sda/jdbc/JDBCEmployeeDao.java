package pl.sda.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class JDBCEmployeeDao implements EmployeeDao {

  private static final String INSERT_EMPLOYEE_STATEMENT = "INSERT INTO" + "employee (name) VALUES (?)";

  private static final String FIND_EMPLOYEE_STATEMENT = "SELECT name" + "FROM employee WHERE name = (?)";

  private static final String DELETE_EMPLOYEE_STATEMENT = "DELETE FROM employee WHERE id = (?)";


  private Connection connection;


  public JDBCEmployeeDao(Connection connection) {
    this.connection = connection;
  }


  @Override
  public int add(Employee employee) {
    try {
      PreparedStatement insertStatement = connection.prepareStatement(INSERT_EMPLOYEE_STATEMENT);
      insertStatement.setString(1, employee.getName());
      insertStatement.execute();
    } catch (SQLException e) {
      throw new RuntimeException("Failed to add employee. ", e);
    }
    return 0;
  }

  @Override
  public void delete(int id) throws SQLException {
    try (PreparedStatement deleteStatement = connection.prepareStatement(DELETE_EMPLOYEE_STATEMENT)) {
      deleteStatement.setInt(1, id);
      deleteStatement.execute();

    } catch (SQLException e) {
      throw new RuntimeException("Faild delete employee. ", e);
    }
  }


  @Override
  public void update(int id, Employee newEmployee) {

  }

  @Override
  public Collection<Employee> findByName(String name) {

    try {

      PreparedStatement findStatement = connection.prepareStatement("SELECT name FROM employee WHERE name = ?");
      findStatement.setString(1, name);
      ResultSet resultSet = findStatement.executeQuery();

      Collection<Employee> employeesList = new ArrayList();

      while (resultSet.next()) {
        employeesList.add(new Employee(resultSet.getString("name")));
      }
      return employeesList;

    } catch (SQLException e) {
      throw new RuntimeException("Failed to add employee. ", e);
    }
  }
}
