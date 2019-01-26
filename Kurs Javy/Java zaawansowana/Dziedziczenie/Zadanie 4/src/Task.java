class Computer {
  int ramSize;

  Computer() {
    this.ramSize = 16000;
  }
}


class Laptop extends Computer {
  int batteryCellCapacity;

  public Laptop(int batteryCellCapacity) {
    this.batteryCellCapacity = batteryCellCapacity;
  }
}

public class Task {
  public static void main(String[] args) {
    Laptop acer = new Laptop(4000);
    System.out.println(acer.ramSize);
  }
}