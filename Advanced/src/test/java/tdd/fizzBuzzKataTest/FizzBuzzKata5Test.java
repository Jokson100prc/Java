package tdd.fizzBuzzKataTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tdd.fizzBuzzKata.FizzBuzzKata5;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzKata5Test {

  // @formatter:off
  @DisplayName("Follow FizzBuzz Kata specyfication. " +
          "First step: " +
          "Given int 1 return string '1'")
  // @formatter:on
  @Test
  void test() throws Exception {
    //given
    int number = 1;

    //when
    String getString = FizzBuzzKata5.intToString(number);

    //then
    assertThat(getString).isEqualTo("1");
  }

  // @formatter:off
  @DisplayName("given int return same but string")
  // @formatter:on
  @Test
  void test2() throws Exception {
    //given
    int num = 7;

    //when
    String grtStr = FizzBuzzKata5.intToString(num);

    //then
    assertThat(grtStr).isEqualTo("7");
  }

  // @formatter:off
  @DisplayName("given 3 return 'Fizz'")
  // @formatter:on
  @Test
  void test3() throws Exception {
    //given
    int num = 3;

    //when
    String getStr = FizzBuzzKata5.intToString(num);

    //then
    assertThat(getStr).isEqualTo("Fizz");
  }

  // @formatter:off
  @DisplayName("given 5 return 'Buzz'")
  // @formatter:on
  @Test
  void test4() throws Exception {
    //given
    int num = 5;

    //when
    String getStr = FizzBuzzKata5.intToString(num);

    //then
    assertThat(getStr).isEqualTo("Buzz");
  }

  // @formatter:off
  @DisplayName("given multiplication by 3 return 'Fizz'")
  // @formatter:on
  @Test
  void test5() throws Exception {
    //given
    int num = 6;

    //when
    String getStr = FizzBuzzKata5.intToString(num);

    //then
    assertThat(getStr).isEqualTo("Fizz");
  }

  // @formatter:off
  @DisplayName("given muliplikation by 5 return 'Buzz'")
  // @formatter:on
  @Test
  void test6() throws Exception {
    //given
    int num = 10;

    //when
    String grtStr = FizzBuzzKata5.intToString(num);

    //then
    assertThat(grtStr).isEqualTo("Buzz");
  }

  // @formatter:off
  @DisplayName("given multiplikcation by 15 return 'FizzBuzz'")
  // @formatter:on
  @Test
  void test7() throws Exception {
    //given
    int num = 15;

    //when
    String getStr = FizzBuzzKata5.intToString(num);

    //then
    assertThat(getStr).isEqualTo("FizzBuzz");
  }
}


//  // @formatter:off
//  @DisplayName("")
//  // @formatter:on
//  @Test
//  void test() {
//    //given
//
//    //when
//
//    //then
//
//  }