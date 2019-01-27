import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("Test istniejącego pliku "+"src\\assets\\cities500.txt");
        String pathStr = "src\\assets\\cities500.txt";
        File file = new File(pathStr);
        //pełna ścieżka do pliku
        System.out.println("Pełna ścieżka do pliku "+file.getCanonicalPath());
        //rozmiar pliku
        System.out.println("Rozmiar pliku " + file.getTotalSpace());
        //nazwa pliku (z rozszerzeniem)
        System.out.println("Nazwa pliku " + file.getName());
        //ścieżka względna
        System.out.println("Ścieżka względna do pliku "+ file.getPath());
        //katalog nadrzędny
        System.out.println("Katalog pliku " + file.getParent());
        //czy to jest plik
        System.out.println(file.isFile()?"To jest plik":"To nie jest plik");
        //czy to jest katalog
        System.out.println(file.isDirectory()?"To jest folder":"To nie jest folder");
        System.out.println();

        System.out.println("Wyświetlenie zawartości katalogu src/assets");
        for(File f: (new File("src\\assets")).listFiles()){
            System.out.println(f.isDirectory()?"Katalog " + f.getName(): "Plik "+f.getName());
        }
        System.out.println();

        System.out.println("Test nie istniejącego pliku "+ "src\\assets\\data.txt");
        //Utworzenie obiektu dla nowego pliku nie jest równoznaczne z utworzneiem fizycznego pliku
        File fileOut = new File("src\\assets\\data.txt");
        //czy plik istnieje
        System.out.println(fileOut.exists()?"PLik itnieje":"Nie ma takiego pliku");
        //ustawienie pliku do zapisu
        System.out.println(fileOut.setWritable(true)?"Plik ustawiony do zapisu":"Nie można ustawić pliku do zapisu");
        //czy można pisać do liku
        System.out.println(fileOut.canWrite()?"PLik zdolny do zapisu":"Do pliku nie można pisać");

        //utworzenie pliku
        System.out.println(fileOut.createNewFile() ? "Plik utworzony":"Pliku nie utworzono bo już istnieje");
        System.out.println("Skasuj plik data.txt w src\\assets i uruchom powtórnie.");
        System.out.println(fileOut.exists()?"PLik istnieje":"Nie ma takiego pliku");
        System.out.println(fileOut.canWrite()?"PLik gotowy do zapisu":"Do pliku nie można zapisywać");
    }
}
