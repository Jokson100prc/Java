import java.util.Arrays;
import java.util.List;

class Task {
  public static void main(String[] args) {
    List<String> names= Arrays.asList("ADAM", "KAROL", "BOGDAN","DORIAN","PAWEŁ","ANDRZEJ","JAN");
    //lista imion małymi literami
    names.stream().map(a->a.toLowerCase()).forEach(a->System.out.println(a));
    //Lista imion zaczynających się literą a
    names.stream().filter(a-> a.charAt(0)=='A').map(a->a.toLowerCase()).forEach(a->System.out.println(a));
  }
}