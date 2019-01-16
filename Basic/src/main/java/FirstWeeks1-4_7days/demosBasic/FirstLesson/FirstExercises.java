package FirstLesson;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class FirstExercises {

    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

//              exercise12();
      exercise13();




//       1. Przygotuj program, który pobierze od użytkownika 2 liczby oraz wyświetli wynik
//        podstawowych działań matematycznych (dodawania, odejmowania, dzielenia,
//                mnożenia)

//
//        System.out.print("Podaj pierwszą dowolną liczbę naturalną: ");
//        int a = scanner.nextInt();
//        System.out.print("Podaj drugą dowolną liczbę naturalną: ");
//        int b = scanner.nextInt();
//
//        System.out.println("Wynik dodawania Twoich liczb: "+(a+b));
//        System.out.println("Wynik dodawania Twoich liczb: "+(a-b));
//        System.out.println("Wynik dodawania Twoich liczb: "+(a*b));
//        System.out.println("Wynik dodawania Twoich liczb: "+(a/(float)b));


//       2. Zadeklaruj i zainicjalizuj 5 elementową tablicę przechowującą łańcuchy znaków
//                (StringDemo). Dodaj do każdego elementu tablicy jedno dowolne imię a następnie wyświetl
//        kolejno wszystkie imiona z tablicy.

//        StringDemo[] string = new StringDemo[] {"Wesemir","Dobrawa","Mirmił","Boromir","Jagna"};
//        for (int i = 0; i < string.length; i++) {
//            System.out.println(string[i]);
//        }
//
//        StringDemo[] string2 = new StringDemo[5];
//        string2[0]= "Bianka";
//        string2[1]= "Radomir";
//        string2[2]= "Lubawa";
//        string2[3]= "Jagoda";
//        string2[4]= "Wojmił";
//
//        for (int i = 0; i < string2.length; i++) {
//            System.out.println(string2[i]);
//        }
//        System.out.print("\n");

//    3.    Przygotuj program, który wyświetli na konsoli liczby od 1 do 49.
//        Użyj w tym celu pętli for;

//        for (int i = 1; i < 50; i++) {
//            System.out.print(i +",");
//        }
//
//
//        System.out.print("\n");



//     4.   Użyj w tym celu pętli while;

//        int x=0;
//        while (x<49){
//            ++x;
//            System.out.print(x +",");
//        }
//
//
//        System.out.print("\n");



//     5.   Użyj w tym celu pętli while do;

//        int y=0;
//        do{
//            ++y;
//            System.out.print(y +",");
//        }while (y<49);



//     6.       Przygotuj program, który sprawdzi czy wprowadzona przez użytkownika liczba jest
//        parzysta. Wyświetl odpowiedni komunikat w zależności od tego czy liczba jest parzysta
//        czy nieparzysta Skorzystaj z instrukcji warunkowej if oraz operatora modulo %;

//        System.out.println("Wprowadź dowolną liczbę naturalną: ");
//        int userNumber = scanner.nextInt();
//
//        if((userNumber % 2)== 0) {
//            System.out.println("Twoja liczba jest parzysta.");
//        }else {
//            System.out.println("Twoja liczba jest nieparzysta.");
//        }



//    7.    Przygotuj program, który pobierze od użytkownika długość boku kwadratu,
//       a następnie obliczy obwód kwadratu, oraz jego pole powierzchni;

//        System.out.println("Twoja długość boku kwadratu to: ");
//        int squareSide = scanner.nextInt();
//
//        System.out.println("Obwód kwadratu: "+(squareSide*4)+"\n"+ "Pole Twojego kwadratu to: "+ (squareSide*squareSide));
//
//
//        System.out.print("\n");



//     8.   Przygotuj program, który pobierze od użytkownika długość podstawy trójkąta
//       oraz jego wysokość, a następnie obliczy jego pole powierzchni;

//        System.out.print("Podaj podstawę trójkąta: ");
//        int t = scanner.nextInt();
//        System.out.print("Podaj wysokość trójkąta: ");
//        int h = scanner.nextInt();
//
//        System.out.print("Pole powierzchni Twojego trójkąta to: "+ (0.5*t*h));





//   9. Przygotuj program, który pobierze od użytkownika temperaturę w oC
//      a następnie zamieni ją na temperaturę w oF
//            °F = (°C × 1.8) + 32;
//            °C = (°F − 32) / 1.8;

//        System.out.print("Podaj temperaturę °C: ");
//        float celc = scanner.nextInt();
//
//        System.out.print(celc + " °C to: " + ((celc * 1.8) + 32) + "°F");
//
//
//        System.out.print("\n");



//10. Dodaj do poprzedniego zadania możliwość wyboru czy chcesz wykonać konwersję  oC=> oF czy oF => oC
//            °F = (°C × 1.8) + 32;
//            °C = (°F − 32) / 1.8;


//
//      System.out.print("Program konwertuje stopnie Celcjusza do Fahrenheita i odwrotnie.\n" +
//              "Podaj jednostki z których chcesz konwertować, c dla Celcjusza lub f dla Fahrenheita: ");
//      String degrees = scanner.next();
//
//        System.out.print("Podaj temperaturę: ");
//        float degr = scanner.nextInt();
//
//      if (degrees.equals("c")){
//        System.out.println(degr + " °C to: " + ((degr * 1.8) + 32) + "°F");
//
//      }else if (degrees.equals("C")){
//        System.out.println(degr + " °C to: " + ((degr * 1.8) + 32) + "°F");
//
//      }else if (degrees.equals("f")){
//        System.out.println(degr + " °F to: " + ((degr - 32) / 1.8) + "°C");
//
//      }else if (degrees.equals("F")){
//        System.out.println(degr + " °F to: " + ((degr - 32) / 1.8) + "°C");
//      }





//    11.      Przygotuj program, który oblicza średnią arytmetyczną
//     2 podanych liczb i wyświetla ją na ekranie.

//        System.out.print("Podaj pierwszą liczbę: ");
//        float number1 = scanner.nextInt();
//        System.out.print("Podaj drugą liczbę: ");
//        float number2 = scanner.nextInt();
//
//        System.out.print("Średnia arytmetyczna tych liczb to: " + ((number1 +number2)/2));
//
//
//        System.out.print("\n");
//}


    }


//      12.    Zmodyfikuj program z poprzedniego zadania, tak aby poprosił użytkownika o podanie
//      ilości liczb jakie chce wprowadzić do obliczenia średniej arytmetycznej.



//  private static void exercise12() {
//
//    Scanner scanner= new Scanner(System.in);
//    System.out.print("Ile podasz liczb? (max5): ");
//    int qty = scanner.nextInt()+1;
//    if (qty <= 6) {
//      int[] num = new int[qty];
//      for (int i = 1; i < qty; i++) {
//        System.out.print("Podaj " + i + " liczbę: ");
//        num[i] = scanner.nextInt();
//      }
//
//      float sumNr = Arrays.stream(num).sum();
//      System.out.println("Średnia arytmetyczna tych liczb to: " + (sumNr/(qty-1)));
//    } else System.out.println("podałeś niewłąściwą ilość");
//  }


//     13.   Zmodyfikuj program z poprzedniego zadania, tak aby użytkownik mógł wprowadzić
//        dowolną ilość liczb. Koniec wprowadzenia liczb powinien odbywać się poprzez
//        wpisanie słowa koniec


                // 1. możliwość dodania do systemu cyfr (w formie stringa)oraz "koniec"  przez użytkownika
                // 2. Parsownie  stringa do integer
                // 3. sumowanie liczb
                // 4. zakończenie sumowania przy zaobserwowanym stringu "koniec"
                // 5. podzielenie sumy liczb przez ilość wprowadzonych liczb = wynik
                // 6. wyświetlenie wiadomości z wynikiem




  private static void exercise13() {

Scanner scanner= new Scanner(System.in);
    System.out.print("Wprowadzaj po kolei po jednej dowolnej liczbie, a następnie zakończ wpisując \"koniec\": ");

    String string = scanner.next();

//String[] both = Stream.concat(Arrays.stream(a), Arrays.stream(b))
//                      .toArray(String[]::new);

    int qty = scanner.nextInt()+1;
    if (qty <= 6) {
      int[] num = new int[qty];
      for (int i = 1; i < qty; i++) {
        System.out.print("Podaj " + i + " liczbę: ");
        num[i] = scanner.nextInt();
      }

      float sumNr = Arrays.stream(num).sum();
      System.out.println("Średnia arytmetyczna tych liczb to: " + (sumNr/(qty-1)));
    } else System.out.println("podałeś niewłąściwą ilość");
  }
}
