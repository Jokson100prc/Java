package ExercisesArray;

//***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ******   ***   ***   ***   ***   ***
//        1. Utwórz 10 elementową tablicę przechowującą liczby całkowite (int)
//        a. Dodaj 10 kolejnych liczb do tablicy rozpoczynając od liczby 1
//        b. Wyświetl długość tablicy
//        c. Wyświetl kolejno elementy tablicy wykorzystując pętlę for.
//        d. Wykorzystując pętlę for pomnóż przez 2 kolejno każdy element w tablicy i
//        zapisz go ponownie w tablicy.
//        e. Wyświetl kolejno elementy tablicy wykorzystując pętlę for.
//***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ******   ***   ***   ***   ***   ***
public class FirstExerciseArray {

  int[] incrementation(int[] nums) {
    int number = 0;
    for (int i = 0; i < nums.length; i++) {
      number++;
      nums[i] = number;
    }
    System.out.println("first index" + nums[0]);
    System.out.println("last index" + nums[9]);
    return nums;
  }

  void product(int[] numbers) {
    int number = 0;

    for (int i = 0; i < numbers.length; i++) {

      number++;
      numbers[i] = number;
      numbers[i] *= 2;

    }
    System.out.println(numbers[0] + " !!!");
    System.out.println(numbers[9] + " !!!");
  }

  int giveItBack(){
    return 5;
  }

  int[] givArrayBack(){

    int[] arrayQueen = {123, 456, 789};
    return arrayQueen;
  }

  int[] givArrayBack2(int[] arr){

    int[] arrayQueen = arr;
    return arrayQueen;
  }

}
