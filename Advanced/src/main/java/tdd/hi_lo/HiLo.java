package tdd.hi_lo;

import java.util.Scanner;

public class HiLo {
  public static void main(String[] args) {

    int number=(int) (Math.random()*100)+1;
//    System.out.println(number);
    Scanner scanner= new Scanner(System.in);
    int str;
    str = scanner.nextInt();
    while(str!=number){
      if(str >number) {
        System.out.println("Try again, Your number is to high");
      }
      if(str <number) {
        System.out.println("Try again, Your number is to low");
      }
      str = scanner.nextInt();
    }
      System.out.println("You winn");

}
}
