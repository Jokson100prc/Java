package W147daysExercisesBasicExercisesArray;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    int[] numbers = new int[10];
    System.out.println(numbers + " initialized array");

    ArrayList<Double> DoubleArr= new ArrayList<>();
    DoubleArr.add(0,2.9);
    double index0 = DoubleArr.get(0);
    DoubleArr.add(1,5.97);
    double index1 = DoubleArr.get(1);
    DoubleArr.add(2,25.13);
    double index2 = DoubleArr.get(2);
    DoubleArr.add(3,4.52);
    double index3 = DoubleArr.get(3);
    DoubleArr.add(4,.8);
    double index4 = DoubleArr.get(4);
    DoubleArr.add(5,11.02);
    double index5 = DoubleArr.get(5);
    DoubleArr.add(6,76.38);
    double index6 = DoubleArr.get(6);
    DoubleArr.add(7,.009);
    double index7 = DoubleArr.get(7);
    DoubleArr.add(8,5.97);
    double index8 = DoubleArr.get(8);
    DoubleArr.add(9,54.344);
    double index9 = DoubleArr.get(9);

    FirstExerciseArray addToArray = new FirstExerciseArray();
    addToArray.incrementation(numbers);
    System.out.println(addToArray.incrementation(numbers) + " ee.. hmm...");

    FirstExerciseArray addAndProduct = new FirstExerciseArray();
    addAndProduct.product(numbers);

    FirstExerciseArray give = new FirstExerciseArray();
    System.out.println(give.giveItBack());

    FirstExerciseArray giveMeTheQueen = new FirstExerciseArray();
    System.out.println(giveMeTheQueen.givArrayBack() + " QUEEN");

    FirstExerciseArray giveMeTheQueen2 = new FirstExerciseArray();
    System.out.println(giveMeTheQueen2.givArrayBack2(numbers) + " MainQueen");

    SecondExerciseArrayList show = new SecondExerciseArrayList();
    System.out.println(show.addToArrayList());

    ThirdExerciseArrLiDouble printThird = new ThirdExerciseArrLiDouble();
    System.out.println(" looking at Main ;)" + printThird.addToDoubleList(DoubleArr));
    System.out.println(printThird.summaryDouble(index0, index9));

  }
}


//***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ******   ***   ***   ***   ***   ***
//Kolekcje


//***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ******   ***   ***   ***   ***   ***
//        1. Utwórz 10 elementową tablicę przechowującą liczby całkowite (int)
//        a. Dodaj 10 kolejnych liczb do tablicy rozpoczynając od liczby 1
//        b. Wyświetl długość tablicy
//        c. Wyświetl kolejno elementy tablicy wykorzystując pętlę for.
//        d. Wykorzystując pętlę for pomnóż przez 2 kolejno każdy element w tablicy i
//        zapisz go ponownie w tablicy.
//        e. Wyświetl kolejno elementy tablicy wykorzystując pętlę for.
//***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ******   ***   ***   ***   ***   ***
//        2. Utwórz listę ArrayList przechowującą liczby całkowite.
//        a. Dodaj 3 dowolne liczby, a następnie wyświetl długość tablicy.
//        b. Wyświetl pierwszy element zapisany w liście.
//        c. Wyświetl ostatni element zapisany w liście
//***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ******   ***   ***   ***   ***   ***
//        3. Utwórz listę ArrayList przechowującą liczby zmiennoprzecinkowe. Dodaj ręcznie 10
//        liczb do listy.
//        a. Wyświetl sumę pierwszego i ostatniego elementu zapisanego w liście..
//        b. Wyświetl iloczyn pierwszego i ostatniego elementu zapisanego w liście.
//        c. Wyświetl iloraz drugiego i przedostatniego elementu zapisanego w liście.
//***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ******   ***   ***   ***   ***   ***
//        4. Utwórz listę ArrayList przechowującą imiona.
//        a. Dodaj 5 imion do listy,
//        b. Wykorzystując pętle for pobierz i wyświetl kolejno wszystkie elementy z listy.
//        c. Wykorzystując pętle for pobierz i wyświetl kolejno wszystkie elementy z listy
//        zaczynając od ostatniego, a kończąc na pierwszym.
//***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ******   ***   ***   ***   ***   ***
//        5. Utwórz tablicę ArrayList przechowującą imiona
//        a. Korzystając z klasy Scanner pobierz od użytkownika 5 imion i zapisz je w
//        liście.
//        b. Wykorzystując pętlę while wyświetl wszystkie elementy znajdujące się w
//        liście.
//***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ******   ***   ***   ***   ***   ***
//        6. Utwórz kolejkę Queue korzystając z implementacji PriorityQueue.
//        a. Pobierz od użytkownika ilość liczb jakie mają zostać wylosowane
//        b. Wylosuj wskazaną przez użytkownika ilość liczb korzystając z klasy Random
//        z zakresu <1,100> i dodaj je do kolejki.
//        c. Wyświetl kolejno liczby występujące w kolejce.
//***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ******   ***   ***   ***   ***   ***