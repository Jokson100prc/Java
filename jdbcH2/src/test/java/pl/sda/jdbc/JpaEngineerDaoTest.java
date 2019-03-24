package pl.sda.jdbc;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.persistence.*;
import java.util.List;

class JpaEngineerDaoTest {

  EntityManagerFactory factory;
  EntityManager entityManager;


  @BeforeEach
  void setUp() {
    factory = Persistence.createEntityManagerFactory("myDB");
    entityManager = factory.createEntityManager();
  }

  @AfterEach
  void cleanUp() {
    entityManager.close();
  }


  @DisplayName("show how to use JPI")
  @Test
  void test() throws Exception {
    EntityTransaction transaction = entityManager.getTransaction();
    transaction.begin();

    JpaEngineerDao stuart = new JpaEngineerDao("Stuart", 6);
    entityManager.persist(stuart);
    transaction.commit();

    TypedQuery<JpaEngineerDao> query = entityManager.createQuery("SELECT u FROM User u ", JpaEngineerDao.class);
    List<JpaEngineerDao> resultEngineerDaoList = query.getResultList();

    Assertions.assertThat(resultEngineerDaoList).hasSize(1);
  }

}