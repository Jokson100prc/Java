package FirstLesson;

import FirstLesson.ConsoleDisplay;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ConsoleDisplay consoleDisplay = new ConsoleDisplay();
        consoleDisplay.display("Hello world");

        String name  = "Marcin";
        String surname = "Zawacki";
        String nameAndSurname = name + surname;
        System.out.println(nameAndSurname);

        String nameAndSurnameWithSpace = name + " " + surname + "!";
        System.out.println(nameAndSurnameWithSpace);
        System.out.printf("%s %s", name, surname);

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nWprowadź imię: ");
        name = scanner.nextLine();
        System.out.println("Wprowadzone imię: " + name);
        System.out.println("Długość wprowadzonego imienia to: " + name.length());

        String first3Chars = name.substring(0,3);
        System.out.println("3 Pierwsze znaki wprowadzonego imienia to: " + first3Chars);
        System.out.println("Pierwsza litera imienia to: " + name.charAt(0));
        System.out.println("Ostatnia litera imienia to: " + name.charAt(name.length()-1));

    }
}
