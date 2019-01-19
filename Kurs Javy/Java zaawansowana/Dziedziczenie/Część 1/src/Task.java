class Computer{
  String typeName;

  public Computer(String typeName) {
    this.typeName = typeName;
  }

  @Override //alt+insert
  public String toString(){
    return"Computer{" +
            "typeName='" +typeName +'\"' +
            '}';
  }
}

class Laptop extends Computer{
  int batteryCapacity;

  public Laptop(String typeName, int batteryCapacity) {
    super(typeName);
    this.batteryCapacity = batteryCapacity;
  }

  @Override
  public String toString() {
    return "Laptop{" +
            "typeName='" + typeName + '\'' +
            ", batteryCapacity=" + batteryCapacity +
            '}';
  }
}

class Task {
  //put your task here
  public static void main(String[] args) {
    Computer ibm = new Computer("SuperFrame");
    Laptop hp = new Laptop("Jokson%prc", 1350);
    Object o = new Object();
    System.out.println(ibm);
    System.out.println(hp);
  }
}