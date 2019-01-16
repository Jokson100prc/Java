package RegularExpressionsExercises;

////  ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***    ***
//        6. Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzającą
//        czy wprowadzony numer seryjny jest poprawny. Numer seryjny składa się z 3 dużych
//        liter, 5 cyfr, 1 małej litery i 1 dużej litery np. VSD43281fA.
////  ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***    ***
//        7. Numer seryjny oprogramowania ma postać "CFG&Y-TYH67-GH56T-UIO99-RY4RT",
//        gdzie każdy blok może składać się z dużych liter lub cyfr. Bloki oddzielone są
//        myślnikami "-". W numerze występuje dokładnie 5 bloków z wartościami. Przygotuj
//        wyrażenie regularne sprawdzające numer seryjny.
////  ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***    ***

public class SerialNumberValidatin {
  public static void serialNumberValidatin() {
    System.out.println("Szóste i siódme zadania, działają");

//    System.out.println("Wprowadź nr seryjny (dwa wzory: \"VSD43281fA lub CFG4Y-TYH67-GH56T-UIO99-RY4RT\"):");
//    String fromConsole = BaseConsole.getTextFromConsole();
//
//    String regexFirstSerial = "[A-Z]{3}[0-9]{5}[a-z]{1}[A-Z]{1}";
//    String regexSecondSerial = "([0-9A-Z]{5}-){4}[0-9A-Z]{5}";/*.{4}(?=.*[0-9][A-Z]-{5}){1}*/
//
//    System.out.println(fromConsole.matches(regexFirstSerial));
//    System.out.println(fromConsole.matches(regexSecondSerial));
  }
}
