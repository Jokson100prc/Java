import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        System.out.println("BUFFERED READER DEMO");
        int cout = 0;
        try (FileReader file = new FileReader("src//assets/cities500.txt")){
            BufferedReader reader = new BufferedReader(file);
            while (reader.ready()){
                System.out.println(reader.readLine());
                cout++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku.");
        } catch (IOException e) {
            System.out.println("Błąd odczytu pliku.");
        }
        System.out.println("END OF FILE READING. LINES READED "+cout);
    }
}
