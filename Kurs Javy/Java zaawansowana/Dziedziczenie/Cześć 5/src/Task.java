class Person{
  protected String name;

  public Person(String name){
    this.name = name;
  }

  public Person(){
  }

  public String getName(){
    return name;
  }
}

class Worker extends Person{
  protected char[] name;

  public Worker(char[] name){
    this.name = name;
  }

  public String getName(){
    return new String(name);
  }
}

class Task {
  public static void main(String[] args) {
    Person p = new Worker("Adam".toCharArray());
    System.out.println(p.getName());
    System.out.println(p.name);
  }
}