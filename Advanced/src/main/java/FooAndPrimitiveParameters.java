public class FooAndPrimitiveParameters {
  public static void main(String[] args) {

    String str = "xxx";

    MiddleBase supp = new MiddleBase();
    supp.support(str);
    System.out.println(str);
    SendDataFromThisToMain helloWorld = new SendDataFromThisToMain();
    supp.concatHelloWithWorld(helloWorld);
    System.out.println(helloWorld.str);
  }
}

class MiddleBase {
  void support(String str) {
    str = str + "ooo";
  }

  void concatHelloWithWorld(SendDataFromThisToMain thatString) {
    thatString.str = thatString.str + " " + "World";
  }
}

class SendDataFromThisToMain {
  String str = "Hello";
}
//***   ****   **** *** ** ***** *** ** ***  ** **
//  {
//
//    int x = 999;
//
//    Tests xyz = new Tests();
//    xyz.getPrimitive(x);
//    System.out.println(x);
//
//    ItSReferencys xy = new ItSReferencys();
//    xyz.getReferencys(xy);
//    System.out.println(xy.y);
//
//  }
//}
//
//class Tests {
//  int getPrimitive(int x) {
//    return x = x + 30;
//  }
//
//  int getReferencys(ItSReferencys x) {
//    return x.y = x.y * x.y;
//  }
//}
//
//class ItSReferencys {
//  int y = 6;
//}
//

//***   ****   **** *** ** ***** *** ** ***  ** **
//
//  PrimitiveTest var = new PrimitiveTest();
//  int x = 0;
//    var.changeContent(x);
//            System.out.println(x);
//
//
//            ReferencysTest test = new ReferencysTest();
//
//            var.changeReferContent(test);
//
//            System.out.println(test.let);
//
//
//            }
//class PrimitiveTest {
//  int var = 10;
//
//  int changeContent(int var) {
//    return var = var + 5;
//  }
//
//  void changeReferContent(ReferencysTest var) {
//    var.let = var.let + 20;
//  }
//}
//
//class ReferencysTest {
//  int let = 25;
//