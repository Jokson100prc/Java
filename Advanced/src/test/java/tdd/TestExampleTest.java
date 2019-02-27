package tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestExampleTest {
  @DisplayName("Should  concat two string")
  @Test
  void test(){
    //given
    String str1 = "Hello ";
    String str2 = "Test";

    //when
    String strNew = Concat.concat(str1,str2);

    //then
    Assertions.assertThat(strNew).isEqualTo("Hello Test");
  }
}
