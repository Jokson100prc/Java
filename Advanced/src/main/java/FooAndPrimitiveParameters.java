public class FooAndPrimitiveParameters {
  public static void main(String[] args) {

    PrimitiveTest var = new PrimitiveTest();
    int x = 0;
    var.changeContent(x);
    System.out.println(x);


    ReferencysTest test = new ReferencysTest();



  }
}


class PrimitiveTest {
  int var = 10;

  int changeContent(int var) {
    return var = var + 5;
  }

  void changeReferContent(ReferencysTest var) {
    var.let = var.let + 20;
  }
}

class ReferencysTest {
  int let = 25;
}