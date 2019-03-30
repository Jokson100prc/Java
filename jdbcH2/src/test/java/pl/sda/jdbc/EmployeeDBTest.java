package pl.sda.jdbc;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Collection;

public class EmployeeDBTest {

  EntityManagerFactory factory;
  EntityManager entityManager;


  @BeforeEach
  void setUp() {
    factory = Persistence.
            createEntityManagerFactory("myDB");
    entityManager = factory.
            createEntityManager();
  }

  @AfterEach
  void cleanUp() {
    entityManager.close();
  }


//  @DisplayName("show how to use JPI")
//  @Test
//  void test() throws Exception {
//
//    EmployeeDao employeeDb = new EmployeeDb(factory);
////  employeeDb.add(new Employee("Krystooz");
//    Collection<Employee> users = employeeDb.findByName("Krystooz");
//  }


  @DisplayName("P2: Add new employee")
  @Test
  void test2() {

    EmployeeDao employeeDb = new EmployeeDb(factory);

    employeeDb.add(new Employee("Ala"));

    Collection<Employee> users = employeeDb.findByName("Ala");

    Assertions.assertThat(users).hasSize(1);
  }
}
