package tdd.mock;

import java.util.Collection;

public interface CurrencyProvider {
  Collection<CurrencyRatio> getCurrencies();
}
