import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.READ;
import static java.nio.file.StandardOpenOption.WRITE;

public class ChannelDemo {
    public static void main(String[] args) throws FileNotFoundException {
        //Program zamienia w pliku małe znaki na duże
        Path path = Paths.get("src//assets//outdata.txt");
        try(FileChannel fileChannel = FileChannel.open(path, READ, WRITE)) {
            ByteBuffer buffer = ByteBuffer.allocate((int) fileChannel.size());
            //wczytanie pliku do bufora
            int size = fileChannel.read(buffer);
            buffer.flip();
            while (buffer.hasRemaining()){
                int p = buffer.position();
                char i = buffer.getChar(p);
                char c = Character.toLowerCase(i);
                buffer.putChar(c);
            }
            fileChannel.position(0);
            buffer.position(0);
            System.out.println("Zapisano " + fileChannel.write(buffer));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
