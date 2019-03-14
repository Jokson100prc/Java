package week12ReturnToRoots;

public class CollectionExercises {

  int[] intNumbers = new int[10];
  int[] duplicate = {11,22,33,44,55,66,77,88,99,100};
int number;
  void add10numbers(int[] intNumbers, int[]duplicate){
    for (int i = 0; i < 10; i++) {
      number++;
     this.intNumbers[i] = number;
            System.out.println(this.intNumbers[i]);
            this.intNumbers[i] = this.duplicate[i];
      System.out.println(this.intNumbers[i]);
    }
  }

}
