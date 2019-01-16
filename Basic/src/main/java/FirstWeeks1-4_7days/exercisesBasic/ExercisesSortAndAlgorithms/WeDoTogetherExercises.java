package ExercisesSortAndAlgorithms;

//    1. Przygotuj aplikację, która umożliwia wprowadzenie 10 liczb przez użytkownika.
//        Spośród wprowadzonych liczb program wyszukuje najmniejszą i największą liczbę,
//        oblicza średnią arytmetyczną, średnią geometryczną oraz wyświetla obliczone
//        wartości użytkownikowi
//        .

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WeDoTogetherExercises {
  private static Calculations calculations = new Calculations();

  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>(10);


    // Pobierz 10 integer od urzytkownika
    numbers = getNumberFromUser(10);

    // znajdź liczbe maxymalną
    Integer maxValue = calculations.findMax(numbers);

    // znajdź liczbe minimalną

    Integer minValue = calculations.findMin(numbers);

    // Oblicz średnią Arytmetyczną
    Float arithmeticAvg = calculations.findArithmeticAvg(numbers);

    //Oblicz średnią geometryczną
    Float geometricAvg = calculations.findGeometricAvg(numbers);

    displayResult(minValue, maxValue, arithmeticAvg, geometricAvg);
  }


  private static void displayResult(Integer minValue, Integer maxValue, Float arithmeticAvg, Float geometricAvg) {
    System.out.println("--== Wynik działania programu ==--");
    System.out.println("Liczba maxymalna: " + maxValue);
    System.out.println("Liczba minimalna: " + minValue);
    System.out.println("Liczba arytmetyczna: " + arithmeticAvg);
    System.out.println("Liczba geometryczna: " + geometricAvg);
  }

  private static List<Integer> getNumberFromUser(Integer amountOfNumbers) {
    System.out.println("Podaj swoje liczby całkowite: ");

    Scanner scan = new Scanner(System.in);
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < amountOfNumbers; i++) {
      result.add(scan.nextInt());
    }
    return result;
  }
}