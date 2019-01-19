abstract class Animal {
  String name;

  public Animal(String name) {
    this.name = name;
  }

  abstract public String getSound();
}

class Dog extends Animal {

  public Dog(String name) {
    super(name);
  }

  public String getSound() {
    return name + " makes wuff wuff";
  }
}

class Cat extends Animal {
  public Cat(String name) {
    super(name);
  }

  public String getSound() {
    return name + " makes miau miau";
  }
}

class Fish extends Animal {
  public Fish(String name) {
    super(name);
  }

  @Override
  public String getSound() {
    return name + " pook...";
  }
}

class Horse extends Animal {
  public Horse(String name) {
    super(name);
  }

  @Override
  public String getSound() {
    return name + " makes Iiiiiihhjjaa";
  }
}

class AnAnimal extends Animal {
  public AnAnimal(String name) {
    super(name);
  }

  @Override
  public String getSound() {
    return "noise";
  }
}

class Task {
  public static void main(String[] args) {
    Animal[] pets = new Animal[2];
    pets[0] = new Dog("Szarik");
    pets[1] = new Cat("Filemon");
    for (Animal a : pets) {
      System.out.println(a.getSound());
    }
  }
}