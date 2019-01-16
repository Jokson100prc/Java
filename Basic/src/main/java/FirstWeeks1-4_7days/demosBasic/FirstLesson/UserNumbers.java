package FirstLesson;

import java.util.Random;
import java.util.Scanner;

public class UserNumbers {
    public static void main(String[] args) {

        //1. pobrać od urzytkownika ilość liczb do wprowadzenia - Scanner;
        //2. pobrać n liczb - Scanner + pętla for;
        //3. zapamietac te liczby - tablica n elementowa, jednowymiarowa;
        //4. wyświetlić liczby, które użytkownik wprowadził - System.out + while;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Podaj ilość liczb do wprowadzenia: ");
    int amountOfNumbers = scanner.nextInt();

    int[] numbers = new int[amountOfNumbers];

    for (int i = 0; i < amountOfNumbers; i++){
        System.out.print("Podaj " + (i+1) + " liczbę: ");
        int number = scanner.nextInt();
        numbers[i] = number;
        }
        int counter = 0;
    System.out.print("Twoje liczby to: ");
        while (counter< numbers.length){
            System.out.print(numbers[counter] +" ");
            counter++;
        }


        Random random = new Random();
        random.nextInt(50); // wylosuje 49 liczb - o jeden mniejszą niż podana;
        }
}
