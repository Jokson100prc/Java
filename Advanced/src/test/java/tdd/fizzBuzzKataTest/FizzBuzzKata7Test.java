package tdd.fizzBuzzKataTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tdd.fizzBuzzKata.FizzBuzzkata7;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzKata7Test {


  // @formatter:off
  @DisplayName("Follow FizzBuzz specyfication. " +
          "First: " +
          "given 1 return '1'")
  // @formatter:on
  @Test
  void test() throws Exception {
    //given
    int number = 1;

    //when
    String get = FizzBuzzkata7.getStringFromNumber(number);

    //then
    assertThat(get).isEqualTo("1");
  }

  // @formatter:off
  @DisplayName("given 2 return '2'")
  // @formatter:on
  @Test
  void test2() throws Exception {
    //given
    int number = 2;

    //when
    String get = FizzBuzzkata7.getStringFromNumber(number);

    //then
    assertThat(get).isEqualTo("2");
  }

  // @formatter:off
  @DisplayName("given 3 return 'Fizz'")
  // @formatter:on
  @Test
  void test3() throws Exception {
    //given
    int number = 3;

    //when
    String get = FizzBuzzkata7.getStringFromNumber(number);

    //then
    assertThat(get).isEqualTo("Fizz");
  }

  // @formatter:off
  @DisplayName("given 5 return 'Buzz'")
  // @formatter:on
  @Test
  void test4() throws Exception {
    //given
    int number = 5;

    //when
    String get = FizzBuzzkata7.getStringFromNumber(number);

    //then
    assertThat(get).isEqualTo("Buzz");
  }

  // @formatter:off
  @DisplayName("given any 3 divisible return 'Fizz'")
  // @formatter:on
  @Test
  void test5() throws Exception {
    //given
    int number = 6;

    //when
    String get = FizzBuzzkata7.getStringFromNumber(number);

    //then
    assertThat(get).isEqualTo("Fizz");
  }

  // @formatter:off
  @DisplayName("given any 5 divisible return 'Buzz'")
  // @formatter:on
  @Test
  void test6() throws Exception {
    //given
    int number = 10;

    //when
    String get = FizzBuzzkata7.getStringFromNumber(number);

    //then
    assertThat(get).isEqualTo("Buzz");
  }

  // @formatter:off
  @DisplayName("given any 15 divisible return 'Buzz'")
  // @formatter:on
  @Test
  void test7() throws Exception {
    //given
    int number = 15;

    //when
    String get = FizzBuzzkata7.getStringFromNumber(number);

    //then
    assertThat(get).isEqualTo("FizzBuzz");
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
