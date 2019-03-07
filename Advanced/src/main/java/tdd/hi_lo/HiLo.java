package tdd.hi_lo;

import java.util.Scanner;

public class HiLo {
  public static void main(String[] args) {

    int number=(int) (Math.random()*100)+1;
//    System.out.println(number);
    Scanner scanner= new Scanner(System.in);
    int num;
    num = scanner.nextInt();
    while(num!=number){
      if(num >number) {
        System.out.println("Try again, Your number is to high");
      }
      if(num <number) {
        System.out.println("Try again, Your number is to low");
      }
      num = scanner.nextInt();
    }
      System.out.println("You winn");

}
}
