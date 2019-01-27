package tarr.app.exercises;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyOwnWriter {
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    File file = new File("zapisane_z_klawiatury.txt");

    if (file.exists()) {
      file.createNewFile();
    }

    FileWriter writer = new FileWriter(file);

//    String theEnd = "koniec";
    String fillFile;
    do {
      writer.write(fillFile = scanner.nextLine() + System.lineSeparator());

    } while (!(fillFile = scanner.nextLine()).equals("koniec"));
      writer.close();

  }
}