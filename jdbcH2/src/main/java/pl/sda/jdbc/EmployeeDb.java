package pl.sda.jdbc;

import javax.persistence.*;
import java.util.Collection;


public class EmployeeDb implements EmployeeDao {

  private EntityManagerFactory factory;
  private EntityManager entityManager;
  public EmployeeDb(EntityManagerFactory factory) {

    this.factory = factory;

  }

  @Override

  public int add(Employee employee) {

    entityManager = factory.createEntityManager();

    EntityTransaction insertEmployee = entityManager.getTransaction();

    insertEmployee.begin();

    entityManager.persist(employee);

    insertEmployee.commit();

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

    Collection<Employee> resultEmployee = entityManager
            .createQuery("SELECT empl FROM Employee empl where empl.name = :nameQueryParameter",
                    Employee.class).setParameter("nameQueryParameter", name)
            .getResultList();

    return resultEmployee;
  }

}