package DemoConstructor;

public class MainConstructor {
  public static void main(String[] args) {

    Point instanceOfPoint = new Point();
    System.out.println(instanceOfPoint.x + instanceOfPoint.y);

    Point secondInstanceOfPoint = new Point(177, 64);
    System.out.println((secondInstanceOfPoint.x * 2 + secondInstanceOfPoint.y));

    Point thirdInstanceOfPoint = new Point(7, 7, 7);
    System.out.println(thirdInstanceOfPoint.x * thirdInstanceOfPoint.y * thirdInstanceOfPoint.z);

    RepeatPARAMAndARG hair = new RepeatPARAMAndARG("argument-hair", "argument-coper", "argument-bob", "argument-curly");

    RepeatPARAMAndARG rope = new RepeatPARAMAndARG( "static", 10);
  }
}