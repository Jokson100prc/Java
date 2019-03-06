package tdd.fizzBuzzKataTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tdd.fizzBuzzKata.FizzBuzzKata4;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzKata4Test {

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
    String get = FizzBuzzKata4.intToString(number);

    //then
    assertThat(get).isEqualTo("1");
  }

  // @formatter:off
  @DisplayName("Given int 2 return string '2'")
  // @formatter:on
  @Test
  void test2() throws Exception {
    //given
    int number = 2;

    //when
    String get = FizzBuzzKata4.intToString(number);

    //then
    assertThat(get).isEqualTo("2");
  }

  // @formatter:off
  @DisplayName("Given 3 return 'Fizz'")
  // @formatter:on
  @Test
  void test3() throws Exception {
    //given
    int number = 3;

    //when
    String getString = FizzBuzzKata4.intToString(number);
    //then
    assertThat(getString).isEqualTo("Fizz");
  }

  // @formatter:off
  @DisplayName("Given 5 return 'Buzz'")
  // @formatter:on
  @Test
  void test4() throws Exception {
    //given
    int number = 5;

    //when
    String getString = FizzBuzzKata4.intToString(number);

    //then
    assertThat(getString).isEqualTo("Buzz");
  }

  // @formatter:off
  @DisplayName("given any number divisible by 3 return 'Fizz'")
  // @formatter:on
  @Test
  void test5() throws Exception {
    //given
    int number = 66;

    //when
    String getString = FizzBuzzKata4.intToString(number);
    //then

    assertThat(getString).isEqualTo("Fizz");
  }

  // @formatter:off
  @DisplayName("Given any number divisible by 5" +
          "return 'Buzz'")
  // @formatter:on
  @Test
  void test6() {
    //given
    int number=55;

    //when
    String getString=FizzBuzzKata4.intToString(number);

    //then
    assertThat(getString).isEqualTo("Buzz");
  }

  // @formatter:off
  @DisplayName("given any number divisible by 3 and 5 " +
          "return 'FizzBuzz'")
  // @formatter:on
  @Test
  void test7() {
    //given
    int number=45;

    //when
    String getString=FizzBuzzKata4.intToString(number);

    //then
    assertThat(getString).isEqualTo("FizzBuzz");
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
