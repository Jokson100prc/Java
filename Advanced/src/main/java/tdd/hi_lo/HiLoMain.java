package tdd.hi_lo;

public class HiLoMain {
  public static void main(String[] args) {

    int randomNumber = NumberLottery.numberLottery();
    System.out.println(randomNumber);
    System.out.println("I have a number between 1 and 100. " +
            "Guess which one.");

    HiLoPlayAndWin hiLoPlay = new HiLoPlayAndWin();
    hiLoPlay.hiLoPlay(randomNumber);

  }
}
