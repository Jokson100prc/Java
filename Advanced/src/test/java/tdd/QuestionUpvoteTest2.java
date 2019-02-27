package tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class QuestionUpvoteTest2 {
//formater: off
  @DisplayName("given posibility to upvote question by user, when he isn't the author of the question" +
          "vote has value 1")
  //formater: on
  @Test
  void test() throws Exception {
    //given
    String author = "Samuel";
    String user = "Elen";
    Qestion2 question = new Qestion2(author, user, 0);
    //when
    question.upvoteBy(user);
    //then
    assertThat(question.score()).isEqualTo(1);
  }

  //formater: off
  @DisplayName("the user can give score upvote value only 1")
  @Test
  //formater: on
  void test2() throws Exception {
    //given
    String author = "Samuel";
    String user = "Elen";
    Qestion2 question = new Qestion2(author, user, 0);

    //when
    question.upvoteBy(user);
    question.upvoteBy(user);
    //then
    assertThat(question.score()).isEqualTo(1);
  }

  //formater: off
  @DisplayName("Question Author couldn't be a voter of his question")
  @Test
  //formater: on
  void test3() throws Exception {
    //given
    String author = "Samuel";
    String user = author;
    Qestion2 question = new Qestion2(author, user, 0);
    //when
    question.upvoteBy(user);
    //then
    assertThat(question.score()).isEqualTo(0);
  }
}
