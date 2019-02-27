package tdd.mock;

import java.util.Collection;

public class CurrencyConverter {
  private CurrencyProvider provider;

  public CurrencyConverter(CurrencyProvider provider) {
    this.provider = provider;
  }

  protected double convert(double amount, String from, String to){
    Collection<CurrencyRatio> currencies = provider.getCurrencies();
    for (CurrencyRatio currency :currencies) {
      if(from.equals(currency.getLeft()) && to.equals(currency.getRight())){
        return amount *currency.getRatio();
      }
    }
    return 0;
  }
}
