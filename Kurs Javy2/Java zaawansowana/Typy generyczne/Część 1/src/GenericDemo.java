import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

import java.time.LocalDate;

class Node<T> {
  T data;
  Node next;

  @Override
  public String toString(){
    return data.toString();
  }
}


class GenericDemo {

  public static void main(String[] args) {
    Node<String> stringNode = new Node<>();
    Node<LocalDate> dateNode = new Node<>();

    stringNode.data = "Obiekt typu generycznego";
    dateNode.data = LocalDate.now();

    stringNode.next = dateNode;
    while(stringNode != null){
      System.out.println(stringNode);
      stringNode = stringNode.next;
    }
  }
}