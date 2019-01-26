class InsufficientAmountException extends Exception {
  long amount;
  InsufficientAmountException(long amount, String message) {
    super(message);
    this.amount = amount;
  }
}

class ExcessiveAmountException extends Exception {
  long amount;
  ExcessiveAmountException(long amount, String message) {
    super(message);
    this.amount = amount;
  }
}

class Bank {
  static long MaximumAmount = 15000;
  private long balance;

  public Bank(long balance){
    this.balance = balance;
  }

  public void withdraw(long amount) throws InsufficientAmountException, ExcessiveAmountException {
    long newBalance = getBalance(amount);
    if(newBalance < 0)
      throw new InsufficientAmountException(amount, "Za mały stan konta na wypłatę");
    if(amount > MaximumAmount)
      throw new ExcessiveAmountException(amount, "Zbyt duża kwota wypłaty");
    balance = newBalance;
  }

  public long getBalance(){
    return balance;
  }

  private long getBalance(long amount) {
    return balance - amount;
  }
}

public class CustomExceptionDemo {
  public static void main(String[] args) {
    Bank myBank = new Bank(2400);
    try {
      myBank.withdraw(300);
    } catch (InsufficientAmountException e) {
      System.out.println(e.getMessage() + " " + e.amount);
    } catch (ExcessiveAmountException e) {
      System.out.println(e.getMessage() + " " + e.amount);
    }
    System.out.println(myBank.getBalance());
  }
}
