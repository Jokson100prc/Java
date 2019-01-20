interface Message {
  String modifyMessage(String message);

}


class UpperCaseMessage implements Message {
  @Override
  public String modifyMessage(String message) {
    return message.toUpperCase();
  }
}


public class NoNameClass {
  public static void main(String[] args) {

    Message upper = new UpperCaseMessage();

    Message lower = new Message() {
      @Override
      public String modifyMessage(String message) {
        return message.toLowerCase();
      }
    };


    Message Capitalize = new Message() {
      @Override
      public String modifyMessage(String message) {
        return message.substring(0,1).toUpperCase() + message.substring(1);

        // niedziała bo mam zrobić  string pierwsza duża litera, pozostałe bez zmian
        /**
         * 1. dzielenie stringa na pojedyncze elementy
         * 2. pobieranie pierwszego elementu
         * 3. złączenie  elementów na powrót w stringa
         * 4. wyświetlenie przetworzonego stringa
         */
      }
    };

    System.out.println(Capitalize.modifyMessage("niedziela, to string z pierwszą duża literą"));
    System.out.println(upper.modifyMessage("jakiś strin z DUŻYCH I małych liter"));
    System.out.println(lower.modifyMessage("jakiś strin z DUŻYCH I małych liter"));
  }
}