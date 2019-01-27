interface Function{
  public double apply(double a, double b);
}

class Addition implements Function{

  @Override
  public double apply(double a, double b) {
    return a + b;
  }
}

class FunctionalInterfaceDemo{

  static double applyFunction(Function f, double a, double b){
    return f.apply(a, b);
  }

  public static void main(String[] args) {
    Function add = new Addition();
    Function addf = (a, b) -> a+ b;
    double w = applyFunction(add, 10, 5);
    System.out.println(w);
  }
}