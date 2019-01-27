package tarr.app.exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class NewIODemo {
  public static void main(String[] args) {


    try {
      Stream<String> lines = Files.lines(Paths.get("data.txt"));
      lines.forEach(line -> {
//        System.out.println(line.length());
//        System.out.println(line.toUpperCase());
      });
      lines = Files.lines(Paths.get("data.txt"));
      lines.filter(line -> line.equals("znak")).forEach(lin -> System.out.println(lin));

//      lines = Files.lines(Paths.get("data.txt"));
//      lines.filter(line -> line.length()>3).forEach(lin -> System.out.println(lin));
    } catch (IOException e) {
      e.printStackTrace();
    }


  }
}
