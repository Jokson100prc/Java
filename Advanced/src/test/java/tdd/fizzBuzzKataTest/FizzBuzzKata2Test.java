package tdd.fizzBuzzKataTest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tdd.fizzBuzzKata.FizzBuzzKata2;

public class FizzBuzzKata2Test {

  // @formatter:off
  @DisplayName("According to specyfication FizzBuzz" +
          "First step:" +
          "given int 1 return string '1'")
  // @formatter:on
  @Test
  void test() {
    //given
    int number = 1;

    //when
    String isOK = FizzBuzzKata2.getNumberAsString(number);
    //then

    Assertions.assertThat(isOK).isEqualTo("1");
  }

  // @formatter:off
  @DisplayName("given int 2 return string '2'")
  // @formatter:on
  @Test
  void test2() {
    //given
    int number = 2;

    //when
    String isOK = FizzBuzzKata2.getNumberAsString(number);
    //then

    Assertions.assertThat(isOK).isEqualTo("2");
  }

  // @formatter:off
  @DisplayName("given int 3 return string 'Fizz'")
  // @formatter:on
  @Test
  void test3() {
    //given
    int number = 3;

    //when
    String isOK = FizzBuzzKata2.getNumberAsString(number);
    //then

    Assertions.assertThat(isOK).isEqualTo("Fizz");
  }

  // @formatter:off
  @DisplayName("given int 5 return string 'Buzz'")
  // @formatter:on
  @Test
  void test4() {
    //given
    int number = 5;

    //when
    String isOK = FizzBuzzKata2.getNumberAsString(number);
    //then

    Assertions.assertThat(isOK).isEqualTo("Buzz");
  }

  // @formatter:off
  @DisplayName("given multiple of 3 return 'Fizz'")
  // @formatter:on
  @Test
  void test5() {
    //given
    int number = 6;

    //when
    String isOK = FizzBuzzKata2.getNumberAsString(number);
    //then

    Assertions.assertThat(isOK).isEqualTo("Fizz");
  }

  // @formatter:off
  @DisplayName("given multiple of 5 return 'Buzz'")
  // @formatter:on
  @Test
  void test6() {
    //given
    int number = 10;

    //when
    String isOK = FizzBuzzKata2.getNumberAsString(number);
    //then

    Assertions.assertThat(isOK).isEqualTo("Buzz");
  }

  // @formatter:off
  @DisplayName("given multiple of 3 and 5 return 'FizzBuzz'")
  // @formatter:on
  @Test
  void test7() {
    //given
    int number = 15;

    //when
    String isOK = FizzBuzzKata2.getNumberAsString(number);
    //then

    Assertions.assertThat(isOK).isEqualTo("FizzBuzz");
  }
}
