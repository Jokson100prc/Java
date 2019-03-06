package tdd.hi_lo;

public class HiLoPlayAndWin {
  void hiLoPlay(){
    GuesNumber guesNumber = new GuesNumber();
    int gues = guesNumber.guesNumber();

    NumberLottery numberLottery = new NumberLottery();
    int randomNumber = numberLottery.numberLottery();
    System.out.println(gues);
    System.out.println(randomNumber);
  while( gues != randomNumber ){
    if( gues > randomNumber ){
      System.out.println("your number is to high");
    }
    if( gues < randomNumber ){
      System.out.println("your number is to low");
    }
    }
  }

  void hiLoWin(){
    GuesNumber guesNumber = new GuesNumber();
    int gues = guesNumber.guesNumber();

    NumberLottery numberLottery = new NumberLottery();
    int randomNumber = numberLottery.numberLottery();
    if ( gues==randomNumber) {
      System.out.println("You Guessed The Number!");
    }
  }
}
