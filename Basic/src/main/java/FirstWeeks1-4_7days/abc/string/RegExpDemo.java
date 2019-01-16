package string;

public class RegExpDemo {
  public static void main(String[] args) {

    String str = "Ala";

    // kropka . ozancza tu DOWOLNY ZNAK
    // gwiazdka * ozancza tu ZERO lub DOWOLNA ILOść ZNAKÓW
    System.out.println(str.matches("A.*"));


    // plus + ozancza tu Jeden lub WIELE POPRZEDNICH ZNAKÓW
    System.out.println("Beata".matches("A.*"));
    System.out.println("Beata".matches(".*a"));

    str = "aaaAaaaA";
    System.out.println(str.matches("a*"));

    //bez uwzględniania wielkości znaków
    // (?i) - ignoruj welkość naków
    str = "aaaaaBBBBbb";
    System.out.println(str.matches("a*(?i)b*"));

    //zbiór znaków [a-z], [afr], [a-zA-Z],
    //liczba powtórzeń - {n}, {n,m} od n do m,
    //czy pierwszy znak jest cyfrą
    str = "lkjhHGdsa";
    System.out.println(str.matches("[0-9]{1}.*"));
    System.out.println(str.matches("(?i)[a-z].*"));

    //znaki specjalne
    // \d - dowolna cyfra
    // \D - dowolny znak który nie jest cyfrą
    System.out.println(str.matches("\\d.*"));
    str = "34-890";
    System.out.println(str.matches("\\d\\d-\\d\\d\\d"));
    System.out.println(str.matches("\\d{2}-\\d{3}"));
    System.out.println(str.matches("[0-9]{2}-[0-9]{3}"));

    //Ssprawdź czy w łańcuchu znajduję się liczba dwucyfrowa, mniejsza od 50
    str = "49";
    System.out.println(str.matches("[1-4]\\d"));
    // \b - granica słowa
    // \B - poza granicą sowa
    // \s - znak biały
    // \w - znak słowa
    // \W - inny znak niż znak słowa

    //czy drugie słowo zaczyna się literą "b"
    str = "może być";
    System.out.println(str.matches("\\b.*\\b\\bb.*"));
    System.out.println(str.matches("\\b.*\\sb.*"));
    System.out.println(str.matches("\\b.*\\w\\b\\s+b.*"));
    System.out.println(str.matches("\\b.*\\w\\b.*b.*"));

  }
}
