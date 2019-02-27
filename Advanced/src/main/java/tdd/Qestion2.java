package tdd;

//import java.util.ArrayList;
//import java.util.List;

import java.util.HashSet;
import java.util.Set;

public class Qestion2 {
  private  int score;
  private  Set<String> voters;
  private String author = "Samuel";


  public Qestion2(String author,String user, int score) {
    voters = new HashSet<>();
    this.score = score;
  } public void upvoteBy( String user) {
    if (userCanVote(user)){
      voters.add(user);
      score++;
    }
  }

  private boolean userCanVote(String user) {
    return !voters.contains(user) && !author.equals(user);
  }

  public int score() {
    return score;
  }


}

//
//  public void upvoteBy(String author, String user) {
//    voters.add(author);
//    if (!voters.contains(user)&& voters.contains(author))
//      score++;
//    voters.add(user);
//  }
//
//  public int score() {
//    return score;
//  }
//}

