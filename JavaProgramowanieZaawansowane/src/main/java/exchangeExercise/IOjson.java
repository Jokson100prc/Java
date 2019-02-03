package exchangeExercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOjson {

  static void saveToFile(List<CurrencyJsonReader.CurrencyRate> list, String fileName) {
    try (FileWriter writer = new FileWriter(fileName)) {
      for (CurrencyJsonReader.CurrencyRate item : list) {
        writer.append(item + System.lineSeparator());
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  static List<String> readFromFile(String fileName) {
    List<String> list = new ArrayList<>();

    try (FileReader reader = new FileReader(fileName)) {
      LineNumberReader lineNumberReader = new LineNumberReader(reader);
      while (lineNumberReader.ready()) {
        String line = lineNumberReader.readLine();
        list.add(line);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      return list;
    }
  }
}
