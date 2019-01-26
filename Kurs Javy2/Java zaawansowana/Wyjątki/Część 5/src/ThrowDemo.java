class ThrowDemo {

  static double divide(int a, int b) throws ArithmeticException {
    if (a == 0 && b == 0) {
      throw new ArithmeticException("Dzielenie zara przez zero: a = " + a + " b = " + b);
    }
    if (b == 0) {
      throw new ArithmeticException("Dzielenie przez zero: b = " + b);
    }
    return (double) a / b;
  }

  public static void main(String[] args) {
    try {
      System.out.println(divide(10, 0));
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    }
  }
}