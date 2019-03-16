package week12ReturnToRoots.collections.priorityQuequeExerciseMonster;

import java.util.PriorityQueue;

public abstract class AbstractPriorityQuequeExercise implements PriorityQequeInterface {

  PriorityQueue priorityQueue = new PriorityQueue();

  int randomNumber = 0;
  int numberOfNumbers = 0;

  public AbstractPriorityQuequeExercise(PriorityQueue priorityQueue, int randomNumber, int numberOfNumbers) {
    this.priorityQueue = priorityQueue;
    this.randomNumber = randomNumber;
    this.numberOfNumbers = numberOfNumbers;
  }

  @Override
  public int getNumberOfNumbers() {
    return numberOfNumbers;
  }

  @Override
  public void addToQueque() {

  }

  @Override
  public void showRandomNumbers() {

  }
}
