package inputOutputFileIO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFile {

  static void saveToFile(List<String> list, String fileName) {
    try (FileWriter writer = new FileWriter(fileName)) {
      for (String str : list) {
        writer.append(str + System.lineSeparator());
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
