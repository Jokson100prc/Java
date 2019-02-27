package tdd.greetingKataTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tdd.greetingKata.GreetingKata2;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GreetingKata2Test {


  // @formatter:off
  @DisplayName("Follow The Greeting Kata specification" +
          "Given 'Arnold' return 'Hello, Arnold'")
  // @formatter:on
  @Test
  void test() throws Exception{
    //given
    String name = "Arnold";

    //when
    String load = GreetingKata2.getName(name);

    //then
    assertThat(load).isEqualTo("Hello, Arnold");
  }

  // @formatter:off
  @DisplayName("Given null, return 'Hello, my friend'")
  // @formatter:on
  @Test
  void test2() throws Exception{
    //given
    String name = null;

    //when
    String load = GreetingKata2.getName(name);

    //then
    assertThat(load).isEqualTo("Hello, my friend");
  }

  // @formatter:off
  @DisplayName("Given 'ANA' (upper case), return 'HELLO ANA!'")
  // @formatter:on
  @Test
  void test3() {
    //given
    String name= "ANA";

    //when
    String getName = GreetingKata2.getName(name);

    //then
assertThat(getName).isEqualTo("HELLO ANA!");
  }

  // @formatter:off
  @DisplayName("Given array [Arnold, Zin]")
  // @formatter:on
  @Test
  void test4() throws Exception{
    //given
    String[] names={"Arnold", "Zin"};

    //when
    String greetingNames = GreetingKata2.getNames(names);
    //then
assertThat(greetingNames).isEqualTo("Hello, Arnold and Zin");
  }

  // @formatter:off
  @DisplayName("Given more than two names in array" +
          "eg. [Arnold, Zin, Viki]" +
          "return 'Hello, Arnold, Zin, and" +
          " Viki'")
  // @formatter:on
  @Test
  void test5() {
    //given

    //when

    //then

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
