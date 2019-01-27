import java.io.*;

public class InputStreamDemo {
    public static void main(String[] args) {
        try (FileInputStream fstream = new FileInputStream("src//assets//data.txt")) {
            byte[] buffer = new byte[100];
            while(fstream.available() > 0) {
                fstream.read(buffer);
                System.out.println(new String(buffer));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nie ma takiego pliku");
        } catch (IOException e) {
            System.out.println("Błąd podczas czytania pliku");
        }
    }
}
