package pl.sda.jdbc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.persistence.*;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class UserHelloWorldTest {

  private EntityManagerFactory factory;
  private EntityManager entityManager;


  @BeforeEach
  void setUp() {
    factory = Persistence
            .createEntityManagerFactory("hello-world");
    entityManager = factory
            .createEntityManager();
  }

  @AfterEach
  void tearDown(){
    factory.close();
  }


  @DisplayName("show how to use JPI")
  @Test
  void test1() throws Exception {
    EntityTransaction transaction = entityManager.getTransaction();

    transaction.begin();
    entityManager.persist(new User("Marcel", 22));
    transaction.commit();

    TypedQuery<User> query = entityManager.createQuery("SELECT u FROM User u", User.class);
    List<User> resultList = query.getResultList();

    assertThat(resultList).hasSize(1);
  }

  @DisplayName("show how to query in IPA")
  @Test
  void test2() throws Exception {
    EntityTransaction transaction = entityManager.getTransaction();

    transaction.begin();
    entityManager.persist(new User("Bianka", 44));
    entityManager.persist(new User("Edi", 33));
    entityManager.persist(new User("Christien", 67));
    transaction.commit();

    TypedQuery<User> query = entityManager.createQuery("SELECT u FROM User u WHERE u.name = 'Edi'", User.class);

    List<User> allMatchingUsers = query.getResultList();

    assertThat(allMatchingUsers)
            .extracting(User::getName).containsOnly("Edi");
  }

  @DisplayName("show how to create and find  user with multiple addresses")
  @Test
  void test3()throws Exception{
    User borys = new User("Borys",27);
    Address address= new Address("Śniadeckich", "Bytom", "Polska");
    Address secondAddress= new Address("Wesoła", "Tuchola", "Polska");
    Address thirdAddress= new Address("Biała", "Wschowa", "Polska");

    borys.addAddress(address);
    borys.addAddress(secondAddress);
    borys.addAddress(thirdAddress);

    EntityTransaction transaction = entityManager.getTransaction();
    transaction.begin();
    entityManager.persist(borys);
//    entityManager.persist(address);
//    entityManager.persist(secondAddress);
//    entityManager.persist(thirdAddress);
    transaction.commit();

    User foundUser=entityManager.find(User.class, borys.userGetId());

    assertThat(foundUser.getAddresses()).hasSize(3);

  }
}
