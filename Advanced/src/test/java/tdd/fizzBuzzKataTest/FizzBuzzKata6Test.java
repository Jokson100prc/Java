package tdd.fizzBuzzKataTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tdd.fizzBuzzKata.FizzBuzzKata6;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzKata6Test {

  // @formatter:off
  @DisplayName("follow the specyfication the FizzBuzz Kata. " +
          "First step: " +
          "Given int 1 return string '1'")
  // @formatter:on
  @Test
  void test() throws Exception {
    //given
    int number = 1;

    //when
    String getString = FizzBuzzKata6.getStingFromNumber(number);

    //then
    assertThat(getString).isEqualTo("1");
  }

  // @formatter:off
  @DisplayName("Given int 2 return string '2'")
  // @formatter:on
  @Test
  void test2() throws Exception {
    //given
    int number = 2;

    //when
    String getString = FizzBuzzKata6.getStingFromNumber(number);

    //then
    assertThat(getString).isEqualTo("2");
  }

  // @formatter:off
  @DisplayName("given int 3 return 'FIzz'")
  // @formatter:on
  @Test
  void test3() throws Exception {
    //given
    int number = 3;

    //when
    String getString = FizzBuzzKata6.getStingFromNumber(number);

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
    String getString = FizzBuzzKata6.getStingFromNumber(number);

    //then
    assertThat(getString).isEqualTo("Buzz");
  }

  // @formatter:off
  @DisplayName("Given any muliplication 3 return 'Fizz'")
  // @formatter:on
  @Test
  void test5() throws Exception {
    //given
    int number = 6;

    //when
    String getString = FizzBuzzKata6.getStingFromNumber(number);

    //then
    assertThat(getString).isEqualTo("Fizz");
  }

  // @formatter:off
  @DisplayName("Given any multiplication by 5 return 'Buzz'")
  // @formatter:on
  @Test
  void test6() throws Exception {
    //given
    int number = 10;

    //when
    String getString = FizzBuzzKata6.getStingFromNumber(number);

    //then
    assertThat(getString).isEqualTo("Buzz");
  }

  // @formatter:off
  @DisplayName("given any multiplication by 15 return 'FizzBuzz'")
  // @formatter:on
  @Test
  void test7() throws Exception {
    //given
    int number = 45;

    //when
    String getString = FizzBuzzKata6.getStingFromNumber(number);

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

