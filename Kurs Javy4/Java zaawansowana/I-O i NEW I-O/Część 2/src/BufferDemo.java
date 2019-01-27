import java.nio.CharBuffer;

public class BufferDemo {
    public static void main(String[] args) {
        CharBuffer buffer = CharBuffer.allocate(128);
        //wstawienie łańcucha do bufora
        buffer.append("ALIBABA");
        //wstawienie znaków
        for (int i = 0; i < 20; i++){
            buffer.append((char) ('A'+i));
        }
        //ustawienie limit na obecną pozycję a pozycję na 0
        buffer.flip();
        System.out.println("char\tlimit\tposition");
        //usunięcie wszystkich znaków z bufora
        while (buffer.hasRemaining()){
            System.out.println(buffer.get() +"\t\t"+ buffer.remaining()+"\t\t"+buffer.position());
        }
        System.out.println("KONIEC");
    }

}
