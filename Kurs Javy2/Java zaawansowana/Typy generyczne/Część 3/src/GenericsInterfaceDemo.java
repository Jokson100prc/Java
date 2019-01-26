interface Comparable<T>{
  int compareTo(T o);
}

class Theme implements Comparable<Theme>{
  String data;
  public Theme(String data){
    this.data = data;
  }

  @Override
  public int compareTo(Theme o) {
    return data.length() > o.data.length() ? 1 : data.length() < o.data.length() ? -1 : 0;
  }
}

class Number implements Comparable<Number> {
  Integer data;

  public Number(Integer data) {
    this.data = data;
  }

  @Override
  public int compareTo(Number o) {
    return data.intValue() > o.data.intValue() ? 1 : data.intValue() < o.data.intValue() ? -1 : 0;
  }
}

class GenericsInterfaceDemo{
  public static void main(String[] args) {
    Comparable str1 = new Theme("ALA");
    Comparable str2 = new Theme("ELA");
    Comparable n1 = new Number(12);
    Comparable n2 = new Number(34);
    System.out.println(str1.compareTo(str2));
    System.out.println(n1.compareTo(n2));
  }
}