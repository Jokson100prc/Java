import java.util.EmptyStackException;

class GStack<T> {
  private class Node<T> {
    T data;
    Node next;

    Node(T element){
      this.data = element;
      this.next = null;
    }

    @Override
    public String toString(){
      return data.toString();
    }
  }

  private Node<T> stack;

  public GStack(){
    stack = null;
  }

  public void push(T element){
    Node<T> node = new Node<>(element);
    node.next = stack;
    stack = node;
  }

  public T pop(){
    if (stack == null){
      throw new EmptyStackException();
    }
    T element = stack.data;
    stack = stack.next;
    return element;
  }

  public boolean isEmpty(){
    return stack == null;
  }
}
class GenericsMethodDemo {
  public static void main(String[] args) {
    GStack<String> stack = new GStack<>();
    stack.push("ALA");
    stack.push("OLA");
    stack.push("ELA");
    while(!stack.isEmpty()){
      System.out.println(stack.pop());
    }

    GStack<Integer> istack = new GStack<>();
    istack.push(10);
    istack.push(12);
    istack.push(14);
    while(!istack.isEmpty()){
      System.out.println(istack.pop());
    }
  }


}