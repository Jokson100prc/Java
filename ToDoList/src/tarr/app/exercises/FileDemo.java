package tarr.app.exercises;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {
  public static void main(String[] args) throws IOException {
    File file = new File("data.txt");
    System.out.println("Czy  plik istnieje: " + file.exists());
    System.out.println("ścieżka: " + file.getAbsolutePath());

    file.createNewFile();
    System.out.println("Czy  plik istnieje: " + file.exists());

    //tworze strumnień wyjściowy skojarzony z plikiem
    FileWriter writer = new FileWriter(file);
    writer.write("Przykładowy tekst ");
    writer.append("Z");
    writer.close();

    System.out.println(file);
  }
}
