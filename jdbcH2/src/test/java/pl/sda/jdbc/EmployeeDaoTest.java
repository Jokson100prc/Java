package pl.sda.jdbc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collection;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class EmployeeDaoTest {

  @DisplayName("should add new employee")

  @Test

  void test1() throws Exception{

    //given

    Connection connection = initDb();

    EmployeeDao employeeDao = new JDBCEmployeeDao(connection);

    Employee newEmployee = new Employee("Ala");

    //when
    employeeDao.add(newEmployee);

    //than
    Collection<Employee> allEmployees = employeeDao.findByName("Ala");
    assertThat(allEmployees).containsOnly(newEmployee);
  }



  @DisplayName("should add new employee")
  @Test
  void test2() throws Exception {
    //given
    Connection connection = initDb();
    EmployeeDao employeeDao = new JDBCEmployeeDao(connection);
    Employee newEmployee1 = new Employee("Ala");
    Employee newEmployee2 = new Employee("Mike");
    Employee newEmployee3 = new Employee("Sara");
    Employee newEmployee4 = new Employee("Gabriel");
    Employee newEmployee5 = new Employee("Figaro");

    //when
    employeeDao.add(newEmployee1);
    employeeDao.add(newEmployee2);
    employeeDao.add(newEmployee3);
    employeeDao.add(newEmployee4);
    employeeDao.add(newEmployee5);

    //then
    Collection<Employee> allEmployee = employeeDao.findByName("Figaro");
    assertThat(allEmployee).containsOnly(newEmployee5);


  }

  private Connection initDb() throws SQLException {
    Connection connection = DriverManager.getConnection("jdbc:h2:mem:");
    connection.createStatement().execute("CREATE TABLE employee(id int, name varchar(24))");
    return connection;
  }



  @DisplayName("")
  @Test
  void test3() throws Exception{
    //given
    Connection connection = initDb();
    EmployeeDao employeeDao =  new JDBCEmployeeDao(connection);
    Employee newEmployee = new Employee("Donatello");
    int id  = employeeDao.add(newEmployee);

    //when
    employeeDao.delete(id);

    //then
    assertThat(employeeDao.findByName("Donatello")).isEmpty();

  }



}
