package Demos;

public class IfContinueAndBreak {
  public static void main(String[] args) {
    System.out.print("\n");


    for (int i = 0; i < 10; i++) {
      System.out.print(i + " ");
    }


    System.out.print("\n");



    for (int i = 0; i < 10; i++) {

//      System.out.print(i);

      if (i == 5) {
        continue;
      }

      System.out.print(i + " ");
    }


    System.out.print("\n");


    for (int i = 0; i < 10; i++) {

      if (i == 5) {
        break;
      }

      System.out.print(i + " ");
    }

// tak to nie działa
//    System.out.print("\n");
//
//
//    for (int i = 0; i < 10; i++) {
//
//      if (i == 5) {
//        break;
//      }
//      if (i == 7) {
//        continue;
//      }
//
//      System.out.print(i + " ");
//    }

  }
}
