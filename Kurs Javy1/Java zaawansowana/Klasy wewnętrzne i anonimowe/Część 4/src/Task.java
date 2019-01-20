abstract class Operation{
  abstract public double apply(double a);
}

class Task {
  static void apply(double[] arr, Operation a){
    for (int i = 0; i < arr.length; i++) {
      arr[i] = a.apply(arr[i]);
    }
  }

  static void printArray(double[] arr){
    for(double d: arr){
      System.out.println(d);
    }
  }

  public static void main(String[] args) {

    Operation vat = new Operation() {
      @Override
      public double apply(double a) {
        return a*1.23;
      }
    };

    double[] values = {1.34, 34.6 , 455, 78.56};
    apply(values, vat);
    printArray(values);

    apply(values, new Operation() {
      @Override
      public double apply(double a) {
        return Math.sqrt(a);
      }
    });

    printArray(values);
  }
}