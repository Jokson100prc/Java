import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReaderDemo {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        char c;
        int raw;
        try (FileReader input = new FileReader(new File("src//assets//data.txt"))){
            while(input.ready()){
                raw = input.read();
                c = (char)raw;
                System.out.print(c + " ("+raw+")");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(String w : words){
            System.out.println(w);
        }
    }
}
