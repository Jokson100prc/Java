interface Message{
  String getMessage();
}

class EnglishMessage implements Message {

  @Override
  public String getMessage() {
    return "Programming in JAVA";
  }
}

class Task {

  public static void main(String[] args) {
    Message polishMessage = new Message() {
      @Override
      public String getMessage() {
        return "Programowanie w JAVA";
      }
    };

    Message englishMessage = new Message() {
      @Override
      public String getMessage() {
        return "Programming in JAVA";
      }
    };
    System.out.println(polishMessage.getMessage());
    System.out.println(englishMessage.getMessage());
  }
}