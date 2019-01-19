class Person {
  protected String firstName;
  protected String lastName;

  public Person(){
    firstName = "brak";
    lastName = "brak";
  }

  public Person(String firstName, String lastName){
    this.firstName = firstName;
    this.lastName = lastName;
  }
}

class Worker extends Person{
  String position;


  public Worker(String position){
    this.position = position;
  }

  public String toString(){
    return firstName+" "+lastName+" "+position;
  }
}

class Task {
 public static void main(String[] args){
   Worker w = new Worker("magazynier");
   System.out.println(w);
 }
}