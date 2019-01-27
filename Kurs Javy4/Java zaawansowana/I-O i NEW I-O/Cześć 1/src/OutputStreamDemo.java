import java.io.*;

public class OutputStreamDemo {
    public static void main(String[] args) {
        File file = new File("src//assets//outdata.txt");
        //Zapisujemy do pliku
        try {
            FileOutputStream fstream = new FileOutputStream(file);
            byte[] arr = { 64, 65, 66, 67, 68};
            int[] arrInt = {1230, 1240, 1250, 1260, 1270};
            for (int i = 0; i < arrInt.length; i++) {
                fstream.write(arrInt[i]);
            }
            fstream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nie ma takiego pliku");
        } catch (IOException e) {
            System.out.println("Błąd podczas zapisu do pliku");
        }
        //Odczytujemy z pliku
        try {
            FileInputStream fstream = new FileInputStream(file);
            while (fstream.available() > 0) {
                System.out.println(fstream.read());
            }
            fstream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nie ma takiego pliku");
        } catch (IOException e) {
            System.out.println("Błąd podczas czytania pliku");
        }
    }
}
