package RegularExpressionsExercises;

////  ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***    ***
//        8. Przygotuj wyrażenie regularne sprawdzające czy numer faktury VAT jest poprawny.
//        Przykładowy numer faktury to "FV/1024/02/2018", gdzie
//        FV - stały wpis
//        / - stały znak rozdzielający sekcje
//        1024 - kolejny numer faktury w danym miesiącu. Numer rozpoczyna się od 1
//        / - stały znak rozdzielający sekcje
//        02 - numer miesiąca w danym roku kalendarzowym
//        / - stały znak rozdzielający sekcje
//        2018 - rok
////  ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***    ***
public class VATInvoiceValidation {
  public static void vatInvoiceValidation() {
    System.out.println("Ósme zadanie działa");

//    System.out.println("Wprowadź nr faktury (wzór \"FV/1024/02/2018\"):");
//    String fromConsole = BaseConsole.getTextFromConsole();
//
//    String regex = "FV/([1][0-9]{3})(/)([0-9][012])(/201[0-9])";
//    System.out.println(fromConsole.matches(regex));
  }
}
