import java.util.Scanner;

public class DemoAnimal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Write dog, cat, fish or horse: ");
    String animal = scanner.nextLine();
    Animal anyAnimal;

    switch (animal) {
      case "dog":
        anyAnimal = new Dog("Smithy");
        break;
      case "cat":
        anyAnimal = new Cat("Garfield");
        break;
      case"fish":
          anyAnimal = new Fish("...");
          break;
      case "horse":
  anyAnimal = new Horse("Elbrus");
        break;
      default:
        anyAnimal = new AnAnimal("an animal");
    }
  System.out.println(anyAnimal.getSound());
  }
}
