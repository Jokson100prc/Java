package week12ReturnToRoots;

public class MainCollector {
  public static void main(String[] args) {
    CollectionExercises test = new CollectionExercises();
    int[] intNumbers = new int[10];
    int[] duplicate = new int[10];
    test.add10numbers(intNumbers, duplicate);
    test.showSize(intNumbers);
  }
}
