import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        //od wersji 9 można w bloku try umieszczać zaincjalizowane zmienne finalne lub efektywnie finalne
        try (FileWriter output = new FileWriter("src//assets/outdata.txt")) {
            List<String> cities = Arrays.asList("WARSAW", "MOSCOW", "PARIS", "TOKYO");
            for (String city: cities){
                output.write(city+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
