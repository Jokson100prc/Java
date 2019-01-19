package Week4dAfterClassDemoStatic;

public class User {

  static Integer nextId = 1;
  String name;

  ;
  Integer id;
  String job;

  Integer setId() {
    id = nextId;
    nextId++;
    return id;
  }

  String setName(String firstName) {
    this.name = firstName;
    return name;
  }
}
