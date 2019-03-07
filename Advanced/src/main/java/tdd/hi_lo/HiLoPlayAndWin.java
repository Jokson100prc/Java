package tdd.hi_lo;

public class HiLoPlayAndWin {

  void hiLoPlay(int randomNumber) {
    GuesNumber.guesNumber();
    int gues = 0;
    System.out.println(randomNumber);

    while (gues != randomNumber) {
      if (gues > randomNumber) {
        System.out.println("your number is to high");
      }
      if (gues < randomNumber) {
        System.out.println("your number is to low");
      }
      GuesNumber.guesNumber();
    }

    System.out.println("Congratulation! You win!");
  }

//  void hiLoWin() {
//    GuesNumber guesNumber = new GuesNumber();
//    int gues = guesNumber.guesNumber();
//
//    NumberLottery numberLottery = new NumberLottery();
//    int randomNumber = numberLottery.numberLottery();
//    if (gues == randomNumber) {
//      System.out.println("You Guessed The Number!");
//    }
//  }
}
