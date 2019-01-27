import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

public class FilesDemo {
    public static void main(String[] args) throws URISyntaxException {
        Path pathToSourceFile = Paths.get("data.txt");
        try {
            System.out.println("Liczba linii " + Files.lines(pathToSourceFile).count());
            System.out.println("Rozmiar pliku " + Files.size(pathToSourceFile));
            System.out.println("Typ pliku " + Files.probeContentType(pathToSourceFile));
            System.out.println("Lista plików w katalogu:");
        } catch (IOException e) {
        }
        try {
            System.out.println("Wyszukiwanie pierwszego rekordu, którego wartość w 5 piątej kolumnie  jest mniejsza od 50");
            Optional<String> finded = Files.lines(pathToSourceFile)
                            .filter(line -> Double.parseDouble(line.split("\t")[4]) > 50)
                            .findFirst();
            finded.ifPresent(a->System.out.println(a));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
