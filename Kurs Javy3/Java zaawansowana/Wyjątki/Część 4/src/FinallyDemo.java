class FinallyDemo {

  public static int getElement(int[] arr, int i){
    int element = 0;
    try{
      return arr[i];
    } catch (ArrayIndexOutOfBoundsException e) {
      return 0;
    }
    finally {
      return -10;
    }
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4};
    System.out.println(getElement(arr, 3));
  }
}