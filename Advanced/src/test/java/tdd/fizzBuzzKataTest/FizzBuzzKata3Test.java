package tdd.fizzBuzzKataTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tdd.fizzBuzzKata.FizzBuzzKata3;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzKata3Test {

  // @formatter:off
  @DisplayName("Follow the FizzBuz Documentation" +
          "First step:" +
          "given int 1 return string '1'")
  // @formatter:on
  @Test
  void test() throws Exception {
    //given
    int number = 1;

    //when
    String result = FizzBuzzKata3.numberToString(number);

    //then
    assertThat(result).isEqualTo("1");
  }

  // @formatter:off
  @DisplayName("given int 2 return string '2'")
  // @formatter:on
  @Test
  void test2() throws Exception {
    //given
    int number = 2;

    //when
    String result = FizzBuzzKata3.numberToString(number);

    //then
    assertThat(result).isEqualTo("2");
  }

  // @formatter:off
  @DisplayName("Given int 3 return 'Fizz'")
  // @formatter:on
  @Test
  void test3() throws Exception {
    //given
    int number = 3;

    //when
    String get = FizzBuzzKata3.numberToString(number);

    //then
    assertThat(get).isEqualTo("Fizz");
  }

  // @formatter:off
  @DisplayName("Given int 5 return string 'Buzz'")
  // @formatter:on
  @Test
  void test4() throws Exception {
    //given
    int number = 5;

    //when
    String get = FizzBuzzKata3.numberToString(number);

    //then
    assertThat(get).isEqualTo("Buzz");
  }

  // @formatter:off
  @DisplayName("Given every 3plus return 'Fizz;")
  // @formatter:on
  @Test
  void test5() {
    //given
    int number = 6;

    //when
    String get = FizzBuzzKata3.numberToString(number);

    //then
    assertThat(get).isEqualTo("Fizz");
  }

  // @formatter:off
  @DisplayName("given every 5plus return 'Buzz'")
  // @formatter:on
  @Test
  void test6() {
    //given
    int number = 10;

    //when
    String get = FizzBuzzKata3.numberToString(number);

    //then
assertThat(get).isEqualTo("Buzz");
  }

  // @formatter:off
  @DisplayName("Given every 15plus return 'FizzBuzz'")
  // @formatter:on
  @Test
  void test7() {
    //given
int number = 15;

    //when
String result = FizzBuzzKata3.numberToString(number);

    //then
assertThat(result).isEqualTo("FizzBuzz");
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