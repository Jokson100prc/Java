import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryResourceDemo {
    public static void main(String[] args) {
        File file = new File("src//assets//data.txt");
        /*
         Wewnątrz  nawiasów można deklarować i tworzyć obiekty
         implementujace interfejs AutoClosable
         */
        try (FileInputStream fstream = new FileInputStream(file)){
            byte[] buffer = new byte[100];
            while(fstream.available() > 0) {
                fstream.read(buffer);
                System.out.println(new String(buffer));           }
        } catch (FileNotFoundException e) {
            System.out.println("Nie ma takiego pliku");
        } catch (IOException e) {
            System.out.println("Błąd podczas czytania pliku");
        }
        /*
        Po opuszczaniu bloku try..with..resources, wszystkie obiekty
        zazinicjowane przy wejściu zostaną zamknięte tzn. wywołana zostanie
        metoda close() dla każdego z nich
         */
    }
}
