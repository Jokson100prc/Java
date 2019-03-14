package Week4dAfterClassDemoStatic;

import java.util.List;

public class User <JOKER> {

  static int nextId;
  String name;

  List<Integer> id;
  String job;


  List<Integer> setId() {
    id.add(nextId);
    nextId++;
    return id;
  }

  String setName( String firstName) {
    this.name = firstName;
    return name;
  }

  String setJob(String jobby){
    this.job = jobby;
    return job;
  }
}
