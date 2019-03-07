package tdd.fizzBuzzKataTest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tdd.fizzBuzzKata.FizzBuzzKata9;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzKata9Test {

  // @formatter:off
  @DisplayName("Follow the FizzBuzz specyfication: " +
          "given int 1 return string '1'")
  // @formatter:on
  @Test
  void test() throws Exception {
    //given
    int number = 1;

    //when
    String get = FizzBuzzKata9.getString(number);

    //then
    assertThat(get).isEqualTo("1");
  }

  // @formatter:off
  @DisplayName("given 2 return '2'")
  // @formatter:on
  @Test
  void test2() throws Exception {
    //given
    int num=2;

    //when
    String get= FizzBuzzKata9.getString(num);

    //then
    assertThat(get).isEqualTo("2");
  }

  // @formatter:off
  @DisplayName("given 3 return 'Fizz'")
  // @formatter:on
  @Test
  void test3()throws Exception {
    //given
    int num=3;

    //when
    String get= FizzBuzzKata9.getString(num);

    //then
    assertThat(get).isEqualTo("Fizz");
  }

  // @formatter:off
  @DisplayName("given 5 return 'Buzz'")
  // @formatter:on
  @Test
  void test4()throws Exception {
    //given
    int num=5;

    //when
    String get= FizzBuzzKata9.getString(num);

    //then
    assertThat(get).isEqualTo("Buzz");
  }

  // @formatter:off
  @DisplayName("given each 3 multiolication return 'Fizz'")
  // @formatter:on
  @Test
  void test5()throws Exception {
    //given
    int num=9;

    //when
    String get= FizzBuzzKata9.getString(num);

    //then
    assertThat(get).isEqualTo("Fizz");
  }

  // @formatter:off
  @DisplayName("given each 5 multiplikation return 'Buzz'")
  // @formatter:on
  @Test
  void test6()throws Exception {
    //given
    int num=25;

    //when
    String get= FizzBuzzKata9.getString(num);

    //then
    assertThat(get).isEqualTo("Buzz");
  }

  // @formatter:off
  @DisplayName("given each 15 multiplikation return 'Buzz'")
  // @formatter:on
  @Test
  void test7()throws Exception {
    //given
    int num=45;

    //when
    String get= FizzBuzzKata9.getString(num);

    //then
    assertThat(get).isEqualTo("FizzBuzz");
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
