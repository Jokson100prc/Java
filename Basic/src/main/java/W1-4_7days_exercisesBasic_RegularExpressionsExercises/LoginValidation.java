package RegularExpressionsExercises;


////  ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***    ***
//        3. Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzającą
//        czy wprowadzona wartość jest poprawnym loginem użytkownika. Za poprawny login
//        uważamy tekst zawierający małe i duże litery oraz cyfry. Jego minimalna długość to 8
//        a maksymalna 16 znaków.
////  ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***    ***


public class LoginValidation {
  public static void loginValidation() {
    System.out.println("Trzecie zadanie działa");


////  ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***    ***
////        Explanation:
////
////    ^                 # start-of-string
////    (?=.*[0-9])       # a digit must occur at least once
////    (?=.*[a-z])       # a lower case letter must occur at least once
////    (?=.*[A-Z])       # an upper case letter must occur at least once
////    (?=\S+$)          # no whitespace allowed in the entire string
////    .{8,}             # anything, at least eight places though
////    $                 # end-of-string
////  ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***    ***
//// ***  BONUS  ***   ***   ***   ***   ***   ***   ***   ***   ***   *** ***
////    (?i)              #  charakter size ignore
////    (?=.*[@#$%^&+=])  # a special character must occur at least once
//// ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***    ***


//    String passPattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,16}";
//
////    String passwd = "aaZZa44@";
////    System.out.println(passwd.matches(passPattern));
//
//    System.out.println("Podaj login z min. 8 znaków, zawierający małą i dużą literę oraz cyfrę:");
//    String fromConsole = BaseConsole.getTextFromConsole();
//    System.out.println(fromConsole);
//    System.out.println(fromConsole.matches(passPattern));


  }
}
