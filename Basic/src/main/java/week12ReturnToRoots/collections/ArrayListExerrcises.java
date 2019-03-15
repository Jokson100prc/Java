package week12ReturnToRoots.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExerrcises <JOKER>{

  private List<JOKER> jokerList = new ArrayList<>();

  public ArrayListExerrcises(List<JOKER> itemList) {
    this.jokerList = itemList;
  }

  public void addJokerElements(JOKER item) {
    jokerList.add(item);
  }

  public void showRevertCollectElements() {
    for (int i = 0; i < jokerList.size(); i++) {
      int revert = (jokerList.size()-1) - i;
      System.out.println(jokerList.get(revert));
    }
  }
}



//public class ArrayListExerrcises {
//
//  private List<String> stringList = new ArrayList<>();
//
//  public ArrayListExerrcises(List<String> stringList) {
//    this.stringList = stringList;
//  }
//
//  public void addStringElements(String str) {
//    stringList.add(str);
//  }
//
//  public void showRevertCollectElements() {
//    for (int i = 0; i < stringList.size(); i++) {
//      int revert = (stringList.size()-1) - i;
//      System.out.println(stringList.get(revert));
//    }
//  }
//}
