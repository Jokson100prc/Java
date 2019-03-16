package week12ReturnToRoots.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExerrcises<JOKER> {

  private List<JOKER> jokerList = new ArrayList<>();

  public ArrayListExerrcises(List<JOKER> itemList) {
    this.jokerList = itemList;
  }

  public void addJokerElements(JOKER item) {
    jokerList.add(item);
  }

  public void showRevertCollectElements() {
    for (int i = 0; i < jokerList.size(); i++) {
      int revert = (jokerList.size() - 1) - i;
      System.out.println(jokerList.get(revert));
    }
  }

  public void showCollectElements() {
    for (JOKER j : jokerList) {
      System.out.println(j);
    }
  }
}
