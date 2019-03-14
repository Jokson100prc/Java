package Week4dAfterClassDemoStatic;

public class Main {
  public static void main(String[] args) {


    int a = 5;
    System.out.println(a);
    User rainmarDeBielau = new User();

    System.out.println(rainmarDeBielau.setId());

    User szarlej = new User();
    System.out.println(szarlej.setId());

    User samsonMiodek = new User();
    System.out.println(samsonMiodek.setId());

    samsonMiodek.setName("Samson");
    szarlej.setName("Szarlej");
    rainmarDeBielau.setName("Rejnevan");

    samsonMiodek.setJob("philosopher");
    szarlej.setJob("rogue");
    rainmarDeBielau.setJob("spy");

  }
}
