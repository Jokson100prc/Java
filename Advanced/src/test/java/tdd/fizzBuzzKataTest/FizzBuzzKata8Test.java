package tdd.fizzBuzzKataTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tdd.fizzBuzzKata.FizzBuzzKata8;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzKata8Test {

  // @formatter:off
  @DisplayName("Follow the FizzBuzz Kata specification. " +
          "first step: " +
          "given int 1 return string '1'")
  // @formatter:on
  @Test
  void test() throws Exception {
    //given
    int number = 1;

    //when
    String getString = FizzBuzzKata8.numberToString(number);

    //then
    assertThat(getString).isEqualTo("1");
  }

  // @formatter:off
  @DisplayName("given 2 return '2'")
  // @formatter:on
  @Test
  void test2() throws Exception {
    //given
    int number = 2;

    //when
    String getString = FizzBuzzKata8.numberToString(number);

    //then
    assertThat(getString).isEqualTo("2");
  }

  // @formatter:off
  @DisplayName("given 3 return 'Fizz'")
  // @formatter:on
  @Test
  void test3() throws Exception {
    //given
    int number = 3;

    //when
    String getString = FizzBuzzKata8.numberToString(number);

    //then
    assertThat(getString).isEqualTo("Fizz");
  }

  // @formatter:off
  @DisplayName("given 5 return 'Buzz'")
  // @formatter:on
  @Test
  void test4() throws Exception {
    //given
    int number = 5;

    //when
    String getString = FizzBuzzKata8.numberToString(number);

    //then
    assertThat(getString).isEqualTo("Buzz");
  }

  // @formatter:off
  @DisplayName("given any 3 divisible return 'Fizz'")
  // @formatter:on
  @Test
  void test5() throws Exception {
    //given
    int number = 66;

    //when
    String getString = FizzBuzzKata8.numberToString(number);

    //then
    assertThat(getString).isEqualTo("Fizz");
  }

  // @formatter:off
  @DisplayName("given any 5 divisible return 'Buzz'")
  // @formatter:on
  @Test
  void test6() throws Exception {
    //given
    int number = 55;

    //when
    String getString = FizzBuzzKata8.numberToString(number);

    //then
    assertThat(getString).isEqualTo("Buzz");
  }

  // @formatter:off
  @DisplayName("given any 3 * 5 divisible return 'FizzBuzz'")
  // @formatter:on
  @Test
  void test7() throws Exception {
    //given
    int number = 15;

    //when
    String getString = FizzBuzzKata8.numberToString(number);

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
