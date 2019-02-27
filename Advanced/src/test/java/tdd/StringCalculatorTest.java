package tdd;//package pl.sdacademy.tdd;
//
////import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//
//public class StringCalculatorTest {
//
//  @DisplayName("given any numbers string, " +
//  "then return sum of all numbers")
//  @ParameterizedTest(name = "given:\"{0}\" ex: {1}")
//  @CsvSource({
//          "'', 0",
//          "'1', 1",
//          "'1,2', 3",
//          "'1,2,3', 6",
//          "'1\n2,3', 6"
//  })
//  void test(String givenStr, int expectedSum){
//    //given
//
//    //when
//    int sum = StringCalculator.add(givenStr);
//
//
//    //then
//    assertThat(sum).isEqualTo(expectedSum);
//  }
//
////    @DisplayName("given empty string, then 0 is returned")
////  @Test
////  void test1(){
////    //given
////      String number ="";
////
////    //when
////      int string = StringCalculator.add(number);
////    //then
////      assertThat(string).isEqualTo(0);
////    }
////
////  @DisplayName("given 1 as string, then int 1 is returned")
////  @Test
////  void test2(){
////    //given
////    String number ="3";
////
////    //when
////    int string = StringCalculator.add(number);
////    //then
////    assertThat(string).isEqualTo(3);
////  }
//}
