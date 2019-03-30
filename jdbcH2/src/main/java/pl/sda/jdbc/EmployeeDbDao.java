package pl.sda.jdbc;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.Collection;


public class EmployeeDbDao implements EmployeeDao {
  private EntityManager entityManager;

  public EmployeeDbDao(EntityManager entityManager) {

    this.entityManager = entityManager;

  }

  @Override

  public int add(Employee employee) {

    runInTransaction(() -> entityManager.persist(employee));

    return employee.getId();

  }

  @Override

  public void delete(int id) {

    runInTransaction(() -> {

      Employee employee = entityManager.find(Employee.class, id);

      entityManager.remove(employee);

    });

  }

  @Override

  public void update(int id, Employee newEmployee) {

    newEmployee.setId(id);

    runInTransaction(() -> entityManager.merge(newEmployee));

  }

  @Override

  public Collection<Employee> findByName(String name) {

    Collection<Employee> foundEmployees = entityManager.createQuery(

            "SELECT empl FROM Employee empl where empl.name=:nameQueryParameter", Employee.class)

            .setParameter("nameQueryParameter", name)

            .getResultList();

    return foundEmployees;

  }

  private void runInTransaction(Runnable runnable) {

    EntityTransaction transaction = entityManager.getTransaction();

    transaction.begin();

    runnable.run();

    transaction.commit();

  }
}