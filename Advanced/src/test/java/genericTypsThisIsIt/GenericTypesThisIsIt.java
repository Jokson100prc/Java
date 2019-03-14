package genericTypsThisIsIt;

public class GenericTypesThisIsIt {
  public static void main(String[] args) {

    Joker<String> jokerString = new Joker();
    jokerString.giveRightHand("Right Person");
    Joker<Integer> jokerInteger = new Joker();
    jokerInteger.giveRightHand(80);

    System.out.println(jokerString.joker() + " is is similar in " + jokerInteger.joker() + " prc.");

    School<Character> nameOfMyClass = new School<>();
    nameOfMyClass.thatCouldBeSome('B');
    System.out
            .println(nameOfMyClass.whatIsSome);
  }
}


class Joker<JOKSON> {

  JOKSON youRule;

  void giveRightHand(JOKSON rightHand) {
    this.youRule = rightHand;
  }

  JOKSON joker() {
    return this.youRule;
  }
}

class School<SOME> {
  SOME whatIsSome;

  void thatCouldBeSome(SOME property) {
    this.whatIsSome = property;
  }

  SOME inClass() {
    return this.whatIsSome;
  }
}
