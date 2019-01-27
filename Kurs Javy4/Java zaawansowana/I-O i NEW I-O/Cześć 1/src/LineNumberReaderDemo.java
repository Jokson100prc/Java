import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Record {
    String line;
    int number;

    public Record(String line, int number) {
        this.line = line;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Record{" +
                "line='" + line + '\'' +
                ", number=" + number +
                '}';
    }
}

public class LineNumberReaderDemo {
    public static void main(String[] args) {
        System.out.println("BUFFERED READER DEMO");
        Random rg = new Random();
        int count = 0;
        List<Record> base = new ArrayList<>();
        try (FileReader file = new FileReader("src//assets/cities500.txt")){
            LineNumberReader lineReader = new LineNumberReader(file);
            while (lineReader.ready()){
                base.add(new Record(lineReader.readLine(),lineReader.getLineNumber()));
            }
            count = lineReader.getLineNumber();
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku.");
        } catch (IOException e) {
            System.out.println("Błąd odczytu pliku.");
        }
        System.out.println("END OF FILE READING. LINES READED "+count);
        System.out.println("RANDOM RECORD " + base.get(rg.nextInt(base.size())));
    }
}
