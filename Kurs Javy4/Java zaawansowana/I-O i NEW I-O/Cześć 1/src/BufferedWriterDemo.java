import java.io.*;
import java.util.Arrays;
import java.util.List;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        System.out.println("BUFFERED WRITER DEMO");
        int cout = 0;
        try (FileWriter file = new FileWriter("src//assets//outdata.txt")){
            BufferedWriter writer = new BufferedWriter(file);
            List<String> list = Arrays.asList("ADA", "ALA", "ADAM", "ZOFIA", "RYSZARD");
            for (String w: list){
                System.out.println("WORD "+ w +" WRITTEN");
                writer.write(w);
                writer.newLine();
                cout++;
            }
            writer.flush();
        } catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND.");
        } catch (IOException e) {
            System.out.println("ERROR DURING WRITTEN.");
        }
        System.out.println("END OF FILE WRITING. LINES WRITTEN "+cout);
    }
}
