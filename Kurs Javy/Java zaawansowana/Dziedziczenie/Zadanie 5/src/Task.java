abstract class Animal{
  uzupełnij klasę abstrakcyjną
}

class Dog extends Animal{

  public Dog(String name) {
    super(name);
  }

  public String getSound(){
    return name + " makes wuff wuff";
  }
}

class Cat extends Animal{
  public Cat(String name) {
    super(name);
  }

  public String getSound(){
    return name + " makes miau miau";
  }
}

class Task {
  public static void main(String[] args) {
    Animal[] pets = new Animal[2];
    pets[0] = new Dog("Szarik");
    pets[1] = new Cat("Filemon");
    for (Animal a: pets){
      System.out.println(a.getSound());
    }
  }
}