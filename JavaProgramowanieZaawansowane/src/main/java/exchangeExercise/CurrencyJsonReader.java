package exchangeExercise;

import inputOutputFileIO.IOFile;

import javax.json.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CurrencyJsonReader {
  static private String url = "http://api.nbp.pl/api/exchangerates/tables/A/?format=json";
  private URL urlToAPI;


  public CurrencyJsonReader() throws MalformedURLException {
    urlToAPI = new URL(url);
  }

  public List<CurrencyRate> getCurencies() throws IOException {
    List<CurrencyRate> list = new ArrayList<>();

    if (urlToAPI != null) {
      JsonReaderFactory readerFactory = Json.createReaderFactory(Collections.emptyMap());
      JsonReader jsonReader = readerFactory.createReader(urlToAPI.openStream());
      JsonArray jsonObject = jsonReader.readArray();
      JsonArray rates = jsonObject.getJsonObject(0).getJsonArray("rates");

      rates.forEach(item -> {
        String cur = item.asJsonObject().getString("currency");
        JsonNumber rate = item.asJsonObject().getJsonNumber("mid");
        CurrencyRate currencyRate = new CurrencyRate(cur, rate.doubleValue());
        list.add(currencyRate);
      });

    }

    return list;
  }

  class CurrencyRate {
    String name;
    double rate;

    public CurrencyRate(String name, double rate) {
      this.name = name;
      this.rate = rate;
    }

    @Override
    public String toString() {
      return "CurrencyRate{" +
              "name='" + name + '\'' +
              ", rate=" + rate +
              '}';
    }
  }

}
