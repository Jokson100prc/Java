package DemoConstructor;

public class Point {

  int x;
  int y;
  int z;

  Point() {
    System.out.println("Instancja obiektu bez parametru");

    x = 4;
    y = 6;
  }

  Point(int param1, int param2) {

    x = param1;
    y = param2;

    System.out.println("Instancja obiektu z dwoma parametrami");
  }

  Point(int param1, int param2, int param3) {

    x = param1;
    y = param2;
    z = param3;

    System.out.println("Instancja obiektu z dwoma parametrami");
  }

}
