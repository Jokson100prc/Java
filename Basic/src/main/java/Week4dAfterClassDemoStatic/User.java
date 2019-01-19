package Week4dAfterClassDemoStatic;

public class User {

  Integer setId(){
    id = nextId;
    nextId ++;
    return id;
  }

  void  setName(String  firstName){
//    name: firstName;
  };
  String name;
  Integer id;
  String job;

  static Integer nextId = 1;
}
