package Todo2;

public class Main {


  public static void main(String[] args) {
    TodoBox box = new TodoBox();

    box.addItem("sldkfa");
    box.addItem("sgs");
    box.addItem("dhd");
    box.addItem("bgfnhjfa");
    box.addItem("644wsdkfa");
    box.addItem("luityutdtrs");

    String a = box.getItem(4);
    System.out.println(a);
    box.deleteItem(0);
    String y = box.getItem(4);
    System.out.println(y);
    String x = box.getItem(0);
    System.out.println(x);


  }
}
