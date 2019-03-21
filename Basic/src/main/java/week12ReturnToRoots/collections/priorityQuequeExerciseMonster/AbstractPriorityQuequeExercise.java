package week12ReturnToRoots.collections.priorityQuequeExerciseMonster;

import java.util.PriorityQueue;

public abstract class AbstractPriorityQuequeExercise implements PriorityQequeInterface {

  PriorityQueue priorityQueue = new PriorityQueue();

  int randomNumber = 0;
  int numberOfNumbers = 0;

  public AbstractPriorityQuequeExercise(PriorityQueue priorityQueue) {
    this.priorityQueue = priorityQueue;
  }


  @Override
  public int amountOfNumbers() {
    return numberOfNumbers;
  }

  @Override
  public void addToQueque() {
  }

  @Override
  public void showRandomNumbers() {
  }
}
