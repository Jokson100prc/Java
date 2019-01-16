package ListsDemoAndExercices;

public class Exercises {
  public static void main(String[] args) {
    int[] myArr = new int[]{1, 2, 3, 4, 5, 6};
    int[] myAr2 = new int[]{1, 2, 3, 4, 5, 6};
    int[] myAr3 = new int[]{11, 12, 13, 14, 15, 16};
    //
    // 1.
//    System.out.println(myArr);

    // 2.
    PrintArray.printArray(myArr);
    String text = PrintArray2.printArray2(myArr);
    System.out.println(text);

    // 3.
    int key = 6;
    boolean retrCont = Contains.contains(myArr, key);
    System.out.println(retrCont);

    // 4.
    boolean firstEquals = Equals.equals(myArr, myAr2);
    boolean secondEquals = Equals.equals(myArr, myAr3);
    System.out.println(firstEquals);
    System.out.println(secondEquals);

    // 5.
    int[] arrayCopy = CopyArray.copyArray(myAr3);
    String text5Exercise = PrintArray2.printArray2(arrayCopy);
    System.out.println(text5Exercise);

    // 6.
    ReverceArray.reverse(myArr);

    // 7.
    // ...
  }


  //  1.
//  Napisz program wyświetlający wyświetlający tablicę w formacie
//  { x1, x2, x3, x4, x5, x6 }
//  Metoda wyświetlająca tablicę ma następującą sygnaturę
//  public void printArray(int[] array)


//2.
//  Napisz program zwracający zwracający tablicę w następującym formacie tekstowym
//  { x1, x2, x3, x4, x5, x6 }
//  Metoda wyświetlająca tablicę ma następującą sygnaturę
//  public String printArray(int[] array)

//3.
//  Napisz program, który sprawdza czy w danej tablicy “array” znajduje się szukana
//  liczba “key”. Sygnatura metody jest następująca:
//  public boolean contains(int[] array, int key)

//4.
//  Napisz program, który sprawdza czy podane 2 tablice są identyczne. Sygnatura
//  metody sprawdzającej jest następująca
//  public boolean equals(int[] array1, int[] array2)

//5.
//  Napisz program, który zwraca kopię podanej tablicy. Sygnatura metody kopiującej
//  jest następująca:
//  public int[] copyArray(int[] array)

//6.
//  Napisz program, który zwraca tablicę w kolejności odwrotnej niż podana.
//  Przykładowo dla tablicy [1, 5, 6, 9, 55] program zwraca tablicę [55, 9, 6, 5, 1].
//  Sygnatura metody odwracającej tablicę jest następująca:
//  public static void reverse(int[] array)

//7.
//        * Napisz program, który oblicza osobno sumę liczb w tablicy na pozycjach parzystych
//  i nieparzystych, a następnie sprawdza która suma jest większa wyświetlając
//  stosowny komunikat. Przygotuj testy jednostkowe sprawdzające działanie metody.





//          8.
//          * Napisz program, który sprawdza czy w podanej tablicy 3 liczby o indeksach n-1, n,
//  n+1 spełniają warunek x n-1 +1 = x n = x n+1 -1. Sygnatura metody sprawdzającej jest
//  następująca:
//  public boolean checkArray(int[] array)
//  Przygotuj testy jednostkowe sprawdzające działanie metody.
//          9.
//          * Napisz program, który usuwa z tablicy wartości znajdujące się w drugiej tablicy.
//  Przykładowo tablica wejściowa wygląda następująco [1, 5, 19, 100, 999]. Tablica z
//  liczbami do usunięcia wygląda następująco [19, 100]. Tablica będąca wynikiem
//  działania algorytmu powinna wyglądać następująco [1, 5, 999]. Sygnatura metody
//  usuwającej elementy z tablicy wygląda następująco:
//  public int[] removeValues(int[] array1, int[] array2)
//
}