package tdd.mock;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CurrencyConverterTest {

  @DisplayName("Should calculate amount after conversion")
  @Test
  void test() throws Exception {
    //given
    // formatter: off
    List<CurrencyRatio> currencies = Arrays.asList(
            (new CurrencyRatio("USD", "GBP", 1.20)),
            (new CurrencyRatio("USD", "PLN", 3.00))
    );
    // formatter: on
    CurrencyProvider currencyProvider = Mockito.mock(CurrencyProvider.class);
    Mockito.when(currencyProvider.getCurrencies()).thenReturn(currencies);
    CurrencyConverter converter = new CurrencyConverter(currencyProvider);
    //when
    double amountInPLN = converter.convert(10.00, "USD", "PLN");

    //then
    assertThat(amountInPLN).isEqualTo(30.00);
  }

  @DisplayName("Should throw exception when currency doesn't contains  the request pair")
  @Test
  void test2 () throws Exception{
    //given
    // formatter: off
    List<CurrencyRatio> currencies = Arrays.asList(
            (new CurrencyRatio("USD", "GBP", 1.20)),
            (new CurrencyRatio("USD", "PLN", 3.00))
    );
    // formatter: on
    CurrencyProvider currencyProvider = Mockito.mock(CurrencyProvider.class);
    Mockito.when(currencyProvider.getCurrencies()).thenReturn(currencies);
    CurrencyConverter converter = new CurrencyConverter(currencyProvider);
    //when
    double ex = converter.convert(10.00, "USD", "PKP");

    //then
    assertThat(ex).isEqualTo(CurrencyPairNotFoundException.class);

  }
}
