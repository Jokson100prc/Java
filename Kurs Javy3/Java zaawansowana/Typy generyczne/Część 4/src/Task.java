class Person {
  String firstName;
  String lastName;
  public Person(String fName, String lName){
    firstName = fName;
    lastName = lName;
  }

  @Override
  public String toString(){
    return firstName+" "+lastName;
  }
}

class Team<T extends Person>{
  Person[] staff;
  int count = 0;

  public Team(int size){
    staff = new Person[size];
  }

  public void add(T member){
    if (count < staff.length) {
      staff[count++] = member;
    }
  }

  @Override
  public String toString(){
    String result = "";
    for(Person m: staff){
      result += m != null?m+" ":"";
    }
    return result;
  }

  public T getMember(int i){
    if (i < staff.length)
      return (T) staff[i];
    else
      return null;
  }
}

class Worker extends Person{
  String rank;
  double salary;

  public Worker(String fName, String lName, String rank, double salary){
    super(fName,lName);
    this.rank = rank;
    this.salary = salary;
  }

  @Override
  public String toString(){
    return super.toString()+" "+rank+" "+salary;
  }
}

class Task {
  public static void main(String[] args) {
    Team<Worker> smurfs = new Team<>(4);
    smurfs.add(new Worker("Ważniak", "Smurf", "mądrala", 10.0));
    smurfs.add(new Worker("Osiłek", "Smurf", "siłacz", 100.0));
    smurfs.add(new Worker("Papa", "Smurf", "szef", 1000.0));
    System.out.println(smurfs);
  }
}