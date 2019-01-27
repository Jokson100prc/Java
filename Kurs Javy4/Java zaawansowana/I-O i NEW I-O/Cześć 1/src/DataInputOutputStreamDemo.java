import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class User implements Serializable {
    private String name;
    private int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

public class DataInputOutputStreamDemo {
    public static void main(String[] args) {
        List<User> list = Arrays.asList(
                new User("admin", 2),
                new User("ryszard", 3),
                new User("borewicz", 7));

        System.out.println("SERIALIZATION STARED");

        try (ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream("src//assets//objects.ser"))) {
            for (User u: list){
                ostream.writeObject(u);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nie ma takiego pliku.");
        } catch (IOException e) {
            System.out.println("Bład zapisu.");
        }

        System.out.println("DESERIALIZATION STARED");
        List<User> restored = new ArrayList<>();
        try (ObjectInputStream istream = new ObjectInputStream(new FileInputStream("src//assets//objects.ser"))) {
            User u;
            while(true){
                restored.add((User)istream.readObject());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nie ma takiego pliku.");
        } catch (IOException e) {
            System.out.println("Bład odczytu lub koniec strumienia.");
        } catch (ClassNotFoundException e) {
            System.out.println("Niepoprawna klasa obiektu.");
        }
        System.out.println("LIST OF RESTORED OBJECTS");
        for(User u: restored){
            System.out.println(u);
        }
    }
}
