package tdd.greetingKataTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tdd.greetingKata.GreetingKata1;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GreetingKata1Test {


  // @formatter:off
  @DisplayName("Follow 'The Greeting Kata'specyfication" +
          "First step:" +
          "Given 'Namee' return 'Hello, Namee'")
  // @formatter:on
  @Test
  void test() throws Exception {
    //given
    String name = "Namee";

    //when
    String who = GreetingKata1.greet(name);

    //then
    assertThat(who).isEqualTo("Hello, Namee");
  }

  // @formatter:off
  @DisplayName("given 'null' return 'Hello, my friend'")
  // @formatter:on
  @Test
  void test2() throws Exception {
    //given
    String name = null;

    //when
    String who = GreetingKata1.greet(name);

    //then
    assertThat(who).isEqualTo("Hello, my friend");
  }

  // @formatter:off
  @DisplayName("Given 'NAMEE' (uppercase) return 'HELLO NAMEE'")
  // @formatter:on
  @Test
  void test3() throws Exception {
    //given
    String name = "NAMEE";

    //when
    String who = GreetingKata1.greet(name);

    //then
    assertThat(who).isEqualTo("HELLO NAMEE");
  }

  // @formatter:off
  @DisplayName("Given array [Namee, Seth] return 'Hello, Namee and Seth'")
  // @formatter:on
  @Test
  void test4() {
    //given
    String[] names = {"Namee", "Seth"};

    //when
    String who = GreetingKata1.greet(names);

    //then
    assertThat(who).isEqualTo("Hello, Namee and Seth");
  }

  // @formatter:off
  @DisplayName("Given Arrays more than two names" +
          "like [Namee, Seth, Arie]" +
          "return 'Hello, Namee, Seth and Arie'")
  // @formatter:on
  @Test
  void test5() {
    //given
    String[] names = {"Namee", "Seth", "Arie"};

    //when
    String who = GreetingKata1.greet(names);

    //then
    assertThat(who).isEqualTo("Hello, Namee, Seth and Arie");
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
