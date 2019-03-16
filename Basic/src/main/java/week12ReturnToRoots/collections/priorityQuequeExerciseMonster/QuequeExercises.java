package week12ReturnToRoots.collections.priorityQuequeExerciseMonster;

import java.util.PriorityQueue;
import java.util.Scanner;

public class QuequeExercises extends AbstractPriorityQuequeExercise {

  Scanner scanner = new Scanner(System.in);


  public QuequeExercises(PriorityQueue priorityQueue, int randomNumber, int numberOfNumbers) {

    super(priorityQueue, randomNumber, numberOfNumbers);

    numberOfNumbers = scanner.nextInt();

    randomNumber = (int) (Math.random() * 100) + 1;
  }

  @Override
  public int getNumberOfNumbers() {
    return numberOfNumbers;
  }

  @Override
  public void addToQueque() {
    for (int i = 0; i < numberOfNumbers; i++) {
      priorityQueue.add(i);
    }
  }

  @Override
  public void showRandomNumbers() {
    for (int i = 0; i < priorityQueue.size(); i++) {
      System.out.println(priorityQueue.remove(i));

      System.out.println(priorityQueue.remove(i));
    }
  }
}
