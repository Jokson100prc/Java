package myHelloJDBCWorld;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyHelloJDBCWorldTest {

  @Test
  void test() throws Exception {
    try (Connection connection = DriverManager.getConnection("jdbc:h2:mem:");
         Statement statemet = connection.createStatement()) {
      statemet.execute("CREATE TABLE mytable (id int, name varchar(24))");
      statemet.execute("INSERT INTO mytable (id,name) VALUES (1, 'Joker')");
      ResultSet resultSet = statemet.executeQuery("SELECT * FROM mytable");
      resultSet.next();
      String name = resultSet.getString("name");

      Assertions.assertThat(name).isEqualTo("Joker");
    }
  }
}
