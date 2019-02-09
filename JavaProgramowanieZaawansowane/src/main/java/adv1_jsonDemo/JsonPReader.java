package adv1_jsonDemo;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonReaderFactory;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;

public class JsonPReader {
  public static void main(String[] args) {

    try {
      URL url = new URL("https://api-v3.mojepanstwo.pl/dane/zamowienia_publiczne.json");
      JsonReaderFactory readerFactory = Json.createReaderFactory(Collections.emptyMap());
      JsonReader jsonReader = readerFactory.createReader(url.openStream());
      JsonObject jsonObject = jsonReader.readObject();

      jsonObject
              .getJsonArray("Dataobject")
              .get(0).asJsonObject()
              .forEach((key, val) -> {
                if (key.equals("data")) {
                  val.asJsonObject()
                          .forEach((k, v) -> {
                            System.out.println("\t" + k + " :: " + v);
                          });
                } else {
                  System.out.println(key + " :: " + val);
                }
              });
    } catch (MalformedURLException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
