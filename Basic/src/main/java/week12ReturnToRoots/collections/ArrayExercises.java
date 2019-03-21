package week12ReturnToRoots.collections;

public class ArrayExercises {

  int[] intNumbers = new int[10];
  int[] duplicate = {11, 22, 33, 44, 55, 66, 77, 88, 99, 100};

  public void add10numbers() {

    for (int i = 0; i < 10; i++) {


      this.intNumbers[i] = i;
      System.out.println(this.intNumbers[i]);

      this.intNumbers[i] = this.duplicate[i];
      System.out.println(this.intNumbers[i]);

    }
  }

  public void showSize() {
    System.out.println("Array length is: " + intNumbers.length);
  }

  public void multiplicationOfArrayElements() {
    add10numbers();
    for (int i = 0; i < intNumbers.length; i++) {
      intNumbers[i] *= 2;
      System.out.println(intNumbers[i]);
      duplicate[i] *= duplicate[i];
      System.out.println(duplicate[i]);
    }
  }

}


// args and prarams - wasn't needed here
// int[] return - wasn't needed too

//  int[] intNumbers = new int[10];
//  int[] duplicate = {11, 22, 33, 44, 55, 66, 77, 88, 99, 100};
//  int number;
//
//  int[] add10numbers(int[] intNumbers, int[] duplicate) {
//
//    for (int i = 0; i < 10; i++) {
//
//      number++;
//
//      this.intNumbers[i] = number;
//      System.out.println(this.intNumbers[i]);
//
//      this.intNumbers[i] = this.duplicate[i];
//      System.out.println(this.intNumbers[i]);
//    }
//    return this.duplicate;
//  }
//
//  void showSize(int[] intNumbers) {
//    System.out.println("Array length is: " + intNumbers.length);
//  }
//
//  void multiplicationOfArrayElements() {
//    add10numbers(intNumbers, duplicate);
//    for (int i = 0; i < intNumbers.length; i++) {
//      intNumbers[i] *= 2;
//      System.out.println(intNumbers[i]);
//      duplicate[i] *= duplicate[i];
//      System.out.println(duplicate[i]);
//    }
//  }



//  int[] intNumbers = new int[10];
//  int[] duplicate = {11, 22, 33, 44, 55, 66, 77, 88, 99, 100};
//  int number;
//
//  void add10numbers(int[] intNumbers, int[] duplicate) {
//    for (int i = 0; i < 10; i++) {
//      number++;
//      this.intNumbers[i] = number;
//      System.out.println(this.intNumbers[i]);
//      this.intNumbers[i] = this.duplicate[i];
//      System.out.println(this.intNumbers[i]);
//    }
//  }
//
//  void showSize(int[] intNumbers) {
//    System.out.println("Array length is: " + intNumbers.length);
//  }