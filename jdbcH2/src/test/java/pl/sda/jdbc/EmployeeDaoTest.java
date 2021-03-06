package pl.sda.jdbc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collection;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class EmployeeDaoTest {

  private EmployeeDao employeeDao;
  private Connection connection;


  @BeforeEach
  void setup() throws Exception {
    connection = initDb();
    employeeDao = new JdbcEmployeeDao(connection);
  }

  @AfterEach
  void clean() throws Exception {
    connection.close();
  }


  @DisplayName("should add new employee")
  @Test
  void test1() throws Exception {
    //given
    Employee ala = new Employee("Ala");

    //when
    employeeDao.add(ala);

    //than
    Collection<Employee> allEmployees = employeeDao
            .findByName("Ala");
    assertThat(allEmployees).containsOnly(ala);
  }


  @DisplayName("should delete employee")
  @Test
  void test2() throws Exception {
    //given
    Employee ala = new Employee("Ala");
    Employee mike = new Employee("Mikeangelo");
    Employee sara = new Employee("Sara");
    Employee ala2 = new Employee("Ala");
    Employee dobrawa = new Employee("Dobrawa");

    employeeDao.add(ala);
    employeeDao.add(mike);
    employeeDao.add(sara);
    employeeDao.add(ala2);
    employeeDao.add(dobrawa);

    //when
    Collection<Employee> allEmployees = employeeDao
            .findByName("Ala");

    //then
    assertThat(allEmployees)
            .containsOnly(ala, ala2);
  }


  @DisplayName("should update employee")
  @Test
  void test3() throws Exception {

    //given
    Employee wojmil = new Employee("Wojmił");
    Employee donatello = new Employee("Donatello");

    employeeDao.add(wojmil);
    int id = employeeDao.add(donatello);

    //when
    employeeDao.delete(id);

    //then
    assertThat(employeeDao.findByName("Donatello")).isEmpty();


    /**
     //given
     Connection connection = initDb();
     EmployeeDao employeeDao = new JdbcEmployeeDao(connection);
     Employee newEmployee = new Employee("Donatello");
     int id = employeeDao.add(newEmployee);

     //when
     employeeDao.delete(id);

     //then
     assertThat(employeeDao.findByName("Donatello")).isEmpty();
     */
  }


  @DisplayName("should update using transactions")
  @Test
  void test4() throws Exception {
    //given
    Employee elen = new Employee("Elen");
    Employee grut = new Employee("Grut");
    Employee elenAfterChangeToHelena = new Employee("Helena");

    //when
    connection.setAutoCommit(false);
    int elenId = employeeDao.add(elen);
    employeeDao.add(grut);
    employeeDao.update(elenId, elenAfterChangeToHelena);
    connection.rollback();
//    connection.commit();

    //then
    assertThat(employeeDao.findByName("Grut")).isEmpty();
    assertThat(employeeDao.findByName("Helena")).isEmpty();
    assertThat(employeeDao.findByName("Elen")).isEmpty();
  }

  /***   ***   ***
   ***  ***   ***/
  @DisplayName("should update using transactions (with check added employee)")
  @Test
  void test4_5() throws Exception {
    //given
    Employee gabriel = new Employee("Gabriel");
    Employee figaro = new Employee("Figaro");
    Employee gabrielAfterChangeToGertruda = new Employee("Gertruda");

    //when
    connection.setAutoCommit(false);
    int gabrielId = employeeDao.add(gabriel);
    employeeDao.add(figaro);
    employeeDao.update(gabrielId, gabrielAfterChangeToGertruda);
    // connection.rollback();
    connection.commit();
    Collection<Employee> employees = employeeDao.findByName("Figaro");

    //then
    assertThat(employees).containsOnly(figaro);
    assertThat(employeeDao.findByName("Gertruda")).hasSize(1);
    assertThat(employeeDao.findByName("Gabriel")).isEmpty();
  }


  @DisplayName("Should update employee")
  @Test
  void test5() throws Exception {
    //given
    Employee gabriel = new Employee("Gabriel");
    Employee figaro = new Employee("Figaro");
    int gabrielId = employeeDao.add(gabriel);
    employeeDao.add(figaro);
    Employee gabrielAfterChangeToGertruda = new Employee("Gertruda");

    //when
    employeeDao.update(gabrielId, gabrielAfterChangeToGertruda);

    //then
    assertThat(employeeDao.findByName("Gertruda")).hasSize(1);
    assertThat(employeeDao.findByName("Gabriel")).isEmpty();
  }

  @DisplayName("should delete employee")
  @Test
  void test6() throws Exception {
    //given
    Employee ala = new Employee("Ala");
    Employee mike = new Employee("Mikeangelo");
    Employee sara = new Employee("Sara");
    Employee ala2 = new Employee("Ala");
    Employee dobrawa = new Employee("Dobrawa");

    employeeDao.add(ala);
    employeeDao.add(mike);
    employeeDao.add(sara);
    employeeDao.add(ala2);
    employeeDao.add(dobrawa);

    //when
    Collection<Employee> allEmployees = employeeDao
            .findByName("Ala");

    //then
    assertThat(allEmployees)
            .containsOnly(ala, ala2);
  }

  private Connection initDb() throws SQLException {
    Connection connection = DriverManager
            .getConnection("jdbc:h2:mem:");
    connection.createStatement()
            .execute("CREATE TABLE employee (id int PRIMARY KEY AUTO_INCREMENT, name varchar(30))");
    return connection;
  }


}
