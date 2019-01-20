interface ROM{
  int size();
}

interface CPU{
  String getType();
}

interface CPUandROM extends ROM, CPU{
  int numberOfCores();
}


class MySuperHiperComputer implements CPUandROM{
  @Override
  public int size() {
    return 8;
  }

  @Override
  public String getType() {
    return "i5";
  }

  @Override
  public int numberOfCores() {
    return 4;
  }
}


class Task {
  public static void main(String[] args) {

  MySuperHiperComputer apple = new MySuperHiperComputer();

  CPUandROM acer = new MySuperHiperComputer();

  ROM ibm = new MySuperHiperComputer();

  CPU hp = new MySuperHiperComputer();

  Object asus = new MySuperHiperComputer();


System.out.println();
  }
}