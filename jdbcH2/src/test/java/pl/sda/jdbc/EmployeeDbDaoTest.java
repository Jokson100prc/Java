package pl.sda.jdbc;


        import org.junit.jupiter.api.AfterEach;
        import org.junit.jupiter.api.BeforeEach;
        import org.junit.jupiter.api.DisplayName;
        import org.junit.jupiter.api.Test;

        import javax.persistence.Persistence;
        import java.sql.Connection;
        import java.sql.SQLException;
        import java.util.Collection;

        import static org.assertj.core.api.Java6Assertions.assertThat;


public class EmployeeDbDaoTest {
  private EmployeeDao employeeDao;

  private Connection connection;

  @BeforeEach
  void setup() throws SQLException {

    // connection = initDb();

    // employeeDao = new JdbcEmployeeDao(connection);
    employeeDao = new EmployeeDbDao(Persistence.createEntityManagerFactory("hello-world.2").createEntityManager());

  }

  @AfterEach
  void clean() throws SQLException {
    // connection.close();

  }

  @DisplayName("Should add new employee")

  @Test
  void test1() throws Exception {

    //given
    Employee leszek = new Employee("Leszek");

    //when
    employeeDao.add(leszek);

    //then
    Collection<Employee> allEmployees = employeeDao.findByName("Leszek");

    //   Assertions.assertThat(allEmployees.contains("Leszek"));
    assertThat(allEmployees).containsOnly(leszek);

  }

  @DisplayName("Should find employee by name")

  @Test
  void test2() throws Exception {

    //given
    Employee newEmployee1 = new Employee("Ada");
    employeeDao.add(newEmployee1);
    Employee newEmployee2 = new Employee("Iza");
    employeeDao.add(newEmployee2);
    Employee newEmployee3 = new Employee("Iza");
    employeeDao.add(newEmployee3);
    Employee newEmployee4 = new Employee("Ola");
    employeeDao.add(newEmployee4);

    //then
    Collection<Employee> allEmployees = employeeDao.findByName("Iza");

    //   Assertions.assertThat(allEmployees.contains("Iza"));
    assertThat(allEmployees).containsOnly(newEmployee2, newEmployee3);

  }

  @DisplayName("Should delete employee")

  @Test
  void test3() throws Exception {

    //given
    Employee newEmployee1 = new Employee("Ada");
    employeeDao.add(newEmployee1);
    Employee newEmployee2 = new Employee("Iza");
    int id = employeeDao.add(newEmployee2);
    Employee newEmployee3 = new Employee("Aga");
    employeeDao.add(newEmployee3);
    Employee newEmployee4 = new Employee("Ola");
    employeeDao.add(newEmployee4);

    //then
    employeeDao.delete(id);

    //   Assertions.assertThat(allEmployees.contains("Iza"));
    assertThat(employeeDao.findByName("Iza")).isEmpty();

  }

  @DisplayName("Should update employee")

  @Test
  void test4() throws Exception {

    //given
    Employee john = new Employee("John");
    Employee goobar = new Employee("Goobar");
    int johnId = employeeDao.add(john);
    employeeDao.add(goobar);
    Employee toGeorge = new Employee("George");

    //when
    employeeDao.update(johnId, toGeorge);

    //then
    assertThat(employeeDao.findByName("George")).hasSize(1);
    assertThat(employeeDao.findByName("John")).isEmpty();
  }

  @DisplayName("Should update employee")

  @Test
  void test5() throws Exception {

    //given
    Employee john = new Employee("John");
    Employee goobar = new Employee("Goobar");
    employeeDao.add(goobar);
    Employee toGeorge = new Employee("George");

    //when
    int johnId = employeeDao.add(john);
    employeeDao.update(johnId, toGeorge);

    //then
    assertThat(employeeDao.findByName("George")).hasSize(1);
    assertThat(employeeDao.findByName("John")).isEmpty();
  }


  @DisplayName("add and find employee with many addresses")
  @Test
  void test6 ()throws Exception{
    Employee janek  = new Employee("Janek");
    janek.addAddress( new Address("666", "las Vegas", "Usa"));
    janek.addAddress( new Address("Jackowskiego", "Coś", "nrd"));

    employeeDao.add(janek);

    Employee foundJanek = employeeDao.findByName("Janek").iterator().next();

    assertThat(foundJanek.getAddresses()).hasSize(2);
  }


  @DisplayName("add and find employee with bidirectional address")
  @Test
  void test7 () throws Exception{
    Employee janek  = new Employee("Janek");
    janek.addAddress( new Address("666", "las Vegas", "Usa"));
    janek.addAddress( new Address("Jackowskiego", "Coś", "nrd"));

    employeeDao.add(janek);

    Employee foundJanek = employeeDao.findByName("Janek").iterator().next();
    Address founJanekAddress = foundJanek.getAddresses().iterator().next();

    assertThat(founJanekAddress.getEmployees()).hasSize(1);

  }

}