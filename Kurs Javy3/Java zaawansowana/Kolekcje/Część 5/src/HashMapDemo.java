import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

class HashMapDemo {
  public static void main(String[] args) {
    Map<String, Person> mapTeam = new HashMap<>();
    //wstawianie elementów do mapy
    mapTeam.put("szef", new Person("LUDWIK","KOZAK", LocalDate.parse("1976-07-03")));
    mapTeam.put("sekretarka", new Person("ANNA","KRUK", LocalDate.parse("1998-05-13")));
    mapTeam.put("portier", new Person("KAZIMIERZ","KOWALSKI", LocalDate.parse("1964-12-23")));
    //wyświetlenie kluczy mapy
    for(String key: mapTeam.keySet()){
      System.out.println(key);
    }
    //wyświetlenie wartości
    for(Person value: mapTeam.values()){
      System.out.println(value);
    }
    //wyświetlenie wartości na podstawie klucza
    System.out.println("SZEF "+ mapTeam.get("szef"));
    //usunięcie wartości o podanym kluczu
    mapTeam.remove("portier");
    //
    mapTeam.containsKey("portier");
  }

}