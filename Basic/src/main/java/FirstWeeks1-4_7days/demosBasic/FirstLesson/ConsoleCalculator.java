package FirstLesson;

import java.util.Scanner;

public class ConsoleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intFirstNumber = readNumber(1);

        int intSecondNumber = readNumber(2);


        int sumNumbers = intFirstNumber + intSecondNumber;
        System.out.println("Suma wprowadzonych liczb wynosi: " + sumNumbers);
    }
    private static int readNumber(int counter){
        System.out.print("Wprowadź" + counter + "liczbę:");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        int intNumber = 0;
        try {
            intNumber = Integer.parseInt(number);
        } catch (NumberFormatException exception){
            System.out.println("Wprowadzona liczba" + number + "nie jest liczbą całkowitą");
        }
        return intNumber;
    }
}