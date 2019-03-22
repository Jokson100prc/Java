package week12ReturnToRoots.collections.priorityQuequeExerciseMonster;

import java.util.PriorityQueue;
import java.util.Scanner;

public class QuequeExercises extends AbstractPriorityQuequeExercise {


  public QuequeExercises(PriorityQueue priorityQueue) {

    super(priorityQueue);
  }

  @Override
  public int amountOfNumbers() {
    return numberOfNumbers = ConsoleReaderWriter.consoleReader();
  }

  @Override
  public void addToQueque() {
    for (int i = 0; i < numberOfNumbers; i++) {
      randomNumber = (int) (Math.random() * 100) + 1;
      priorityQueue.add(randomNumber);
      System.out.println(randomNumber);
    }
  }

  @Override
  public void showRandomNumbers() {
    for (int i = 0; i < numberOfNumbers; i++) {
      Object whatIsInsideQueue = priorityQueue.remove();
      System.out.println(whatIsInsideQueue);
  }}
}
