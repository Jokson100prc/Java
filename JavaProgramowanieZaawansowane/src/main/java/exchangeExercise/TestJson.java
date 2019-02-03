package exchangeExercise;

//import java.net.MalformedURLException;
import java.io.IOException;
import java.util.List;

public class TestJson {
  public static void main(String[] args) throws IOException {
    CurrencyJsonReader reader = new CurrencyJsonReader();
    List<CurrencyJsonReader.CurrencyRate> lista = reader.getCurencies();

    for (CurrencyJsonReader.CurrencyRate item: lista) {
      System.out.println(item);
    }
  }
}
