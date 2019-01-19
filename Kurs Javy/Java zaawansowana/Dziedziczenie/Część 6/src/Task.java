class Box{
  final int width;
  final int height;

  public Box(int width, int height){
    this.width = width;
    this.height = height;
  }

  final public Box extend(int dw, int dh){
    return new Box(width+dw, height+dh);
  }
}

class Cube extends Box{
  final int depth;

  public Cube(int w, int h, int d){
    super(w, h);
    this.depth = d;
  }
  //to nie jest metoda odziedziczona - inny typ zwracany
  public Cube extend(int dw, int dh, int dd){
    return new Cube(width + dw, height+dh, depth + dd);
  }
  //sygnatura metody odziedziczonej - nie można nadpisać bo jest
  public Box extendBox(int dw, int dd){
      return new Box( width + dw, depth + dd);
  }
}

class Task {
  static public void main(String[] args){
    Box b = new Box(1, 4);
    b = b.extend(2,5);
    System.out.println(b.height+" "+ b.width);
  }
}