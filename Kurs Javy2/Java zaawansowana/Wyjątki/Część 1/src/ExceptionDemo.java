class ExceptionDemo {
  public static void main(String[] args) {
    int[] array = {1, 2, 3};
    try {
      System.out.println(array[0]);
      System.out.println(array[1]);
      System.out.println(array[2]);
      System.out.println(array[3]);
    } catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Nieładnie, indeks poza zakresem");
    }
    System.out.println("KONIEC");
  }
}