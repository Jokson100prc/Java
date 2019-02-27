package tdd.fizzBuzzKataTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tdd.fizzBuzzKata.FizzBuzzKata;
//import tdd.FizzBuzzKata;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzKata1Test {

  //@formatter:off
  @DisplayName("given the numbers" +
          "from 1 to som number bigger than 15" +
          "return this numbers as string, but" +
          "when the number is divisible by 3 return 'Fizz'" +
          "or if is divisible by 5 return 'Buzz'" +
          "and when the number is divisible by both 3 & 5" +
          "return 'FizzBuzz'")
//@formatter:on
  @Test
  void test() throws Exception {
    //given
    int num = 1;
    //when
    String getSN = FizzBuzzKata.getStringNumber(num);
    //then
    assertThat(getSN).isEqualTo("1");
  }

  //@formatter:off
  @DisplayName("given number not divisible by 3 or 5" +
          " return the number as string ")
  //@formatter:on
  @Test
  void test2() throws Exception {
    //given
    int num = 8;
    //when
    String getSN = FizzBuzzKata.getStringNumber(num);

    //then
    assertThat(getSN).isEqualTo("8");
  }

  @DisplayName("when program given 3 return string 'Fizz'")
  @Test
  void test3() throws Exception {
    //given
    int num = 3;
    //when
    String getSN = FizzBuzzKata.getStringNumber(num);

    //then
    assertThat(getSN).isEqualTo("Fizz");
  }

  @DisplayName("when program given 5 return string 'Buzz'")
  @Test
  void test4() throws Exception {
    //given
    int num = 5;
    //when
    String getSN = FizzBuzzKata.getStringNumber(num);

    //then
    assertThat(getSN).isEqualTo("Buzz");
  }

  @DisplayName("given number divisible by 3 return string 'Fizz'")
  @Test
  void test5() throws Exception {
    //given
    int num = 6;
    //when
    String getSN = FizzBuzzKata.getStringNumber(num);

    //then
    assertThat(getSN).isEqualTo("Fizz");
  }

  @DisplayName("given number divisible by 5 return string 'Buzz'")
  @Test
  void test6() throws Exception {
    //given
    int num = 10;
    //when
    String getSN = FizzBuzzKata.getStringNumber(num);

    //then
    assertThat(getSN).isEqualTo("Buzz");
  }

  @DisplayName("given number divisible by 3 and 5 return string 'FizzBuzz'")
  @Test
  void test7() throws Exception {
    //given
    int num = 15;
    //when
    String getSN = FizzBuzzKata.getStringNumber(num);

    //then
    assertThat(getSN).isEqualTo("FizzBuzz");
  }
}
