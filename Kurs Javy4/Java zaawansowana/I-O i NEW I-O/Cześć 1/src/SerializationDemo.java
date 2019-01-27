import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Person implements Serializable{
    private static final long serialVersionUID = 2153163831931434056L;
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Worker extends Person implements Serializable{
    private static final long serialVersionUID = 2153163831931434041L;
    double salary;
    Manager manager;

    public Worker(String name, double salary, Manager manager) {
        super(name);
        this.salary = salary;
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", manager=" + manager +
                '}';
    }
}

class Manager extends Worker implements Serializable {
    private static final long serialVersionUID = 2153163831931434018L;
    String department;
    transient boolean  absent = true;
    public Manager(String name, double salary, Manager manager, String department) {
        super(name, salary, manager);
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", manager=" + manager +
                ", department='" + department + '\'' +
                ", absent=" + absent +
                '}';
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        Manager kierownik = new Manager("Ryszard", 12000, null, "dystrybucja");
        Worker portier = new Worker("Apolinary", 1200, kierownik);
        Worker lokaj = new  Worker("Alojzy",2100, kierownik);
        List<Worker> firma = new ArrayList<>();
        firma.add(portier);
        firma.add(lokaj);
        firma.add(kierownik);
        try (ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream("src//assets//objects.ser"))){
            for (Worker p: firma){
                ostream.writeObject(p);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Worker> restored = new ArrayList<>();
        try (ObjectInputStream ostream = new ObjectInputStream(new FileInputStream("src//assets//objects.ser"))){
            while(true){
                restored.add((Worker)ostream.readObject());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Błąd pliku");
        } catch (IOException e) {
            System.out.println("Błąd odczytu lub koniec danych.");
        } catch (ClassNotFoundException e) {
            System.out.println("Błąd klasy");
        }

        //testujemy, czy po deserializacji  Apolinary i Alojzy mają kierownika, który jest trzecim deserializowanym obiektem
        System.out.println(restored.get(0).manager == restored.get(1).manager && restored.get(1).manager == restored.get(2) ? "Poprawny kierownik": "Niepoprawny kierownik" );

        //zmiana departamentu kierownika powinna być widoczna u obu pracowników
        kierownik = (Manager) restored.get(2);
        kierownik.department = "booking";

        for (Worker w: restored){
            System.out.println(w);
        }

    }
}
