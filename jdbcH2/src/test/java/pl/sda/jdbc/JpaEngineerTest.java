package pl.sda.jdbc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.persistence.*;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

class JpaEngineerTest {

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


  @DisplayName("show how to use JPI")
  @Test
  void test() throws Exception {
    EntityTransaction transaction = entityManager.getTransaction();
    transaction.begin();

    JpaEngineer stuart = new JpaEngineer("Stuart", 6);
    entityManager.persist(stuart);
    transaction.commit();

    TypedQuery<JpaEngineer> query = entityManager.createQuery("SELECT e FROM JpaEngineer e ", JpaEngineer.class);
    List<JpaEngineer> resultEngineerList = query.getResultList();

    assertThat(resultEngineerList).hasSize(1);
  }

  @DisplayName("add few object to DB")
  @Test
  void test2 ()throws Exception{
   EntityTransaction entityTransaction = entityManager.getTransaction();
   entityTransaction.begin();

    JpaEngineer greg = new JpaEngineer("Greg", 5);
    entityManager.persist(greg);
    JpaEngineer breg = new JpaEngineer("Breg", 12);
    entityManager.persist(breg);
    JpaEngineer reg = new JpaEngineer("Reg", 1);
    entityManager.persist(reg);
    entityTransaction.commit();

    TypedQuery<JpaEngineer> query = entityManager.createQuery("SELECT u FROM JpaEngineer u WHERE u.experience >= 5", JpaEngineer.class);
    List<JpaEngineer> jpaEngineers = query.getResultList();

    assertThat(jpaEngineers).extracting(JpaEngineer::getExperience).hasSize(2);
  }



}