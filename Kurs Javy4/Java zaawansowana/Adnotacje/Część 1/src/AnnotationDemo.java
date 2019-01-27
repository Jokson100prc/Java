class Car{
  String name;

  public Car(String name){
    this.name = name;
  }

  @Override
  public String toString(){
    return name;
  }
}

class AnnotationDemo{
  public static void main(String[] args) {
    System.out.println(new Car("Porsche"));
  }
}