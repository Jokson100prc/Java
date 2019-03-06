package tdd.hi_lo;

public class NumberLottery {
  int numberLottery(){
    int randomNumber = (int) (Math.random()*100)+1;
    return randomNumber;
  }
}
