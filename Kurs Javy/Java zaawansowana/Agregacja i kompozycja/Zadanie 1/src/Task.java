class Computer{
  Ram ram;
  CPU cpu;
  Disk dis;

  wpisz modyfikator zasięgu Computer(CPU cpu, Ram ram, Disk dis) {
    this.ram = ram;
    this.cpu = cpu;
    this.dis = dis;
  }

  public static Computer build(wpisz listę parametrów){
    Uzupełnij kod metody
  }
}

class Ram{
  int size;

  public Ram(int size) {
    this.size = size;
  }
}

class CPU{
  public CPU(String type) {
    this.type = type;
  }

  String type;

}

class Disk{
  public Disk(int size) {
    this.size = size;
  }

  int size;
}