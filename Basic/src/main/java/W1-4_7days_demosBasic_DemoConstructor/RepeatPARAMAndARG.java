package DemoConstructor;

public class RepeatPARAMAndARG {

  String tRope;
  int lRope;

  RepeatPARAMAndARG(String name, String color, String shape, String structure) {
    System.out.println("My PARAMETER name is " + name + " and PARAMETER color: " + color + ", PARAMETER shape: " + shape + " and PARAMETER structure: " + structure);
  }
  RepeatPARAMAndARG(String type, int length) {
    System.out.println("ARGUMENTS strictly from PARAMETERS: Black rope is " + type + " and have a " + length + " meters");
    tRope = type;
    lRope = length;
    System.out.println("ARGUMENTS go to variables: Black rope is " + tRope + " and have a " + lRope + " meters");
    this.lRope = length - 2;
    this.tRope = type + " XYZ";
    System.out.println(lRope + " " + tRope);
  }
}
