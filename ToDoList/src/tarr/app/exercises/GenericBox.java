package tarr.app.exercises;

public class GenericBox<T> {
  private T value;
  private String name;

  public GenericBox(T value, String name) {
    this.value = value;
    this.name = name;
  }

  public T getValue() {
    return value;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "GenericBox{ " +
            " value = " + value +
            ", name = '" + name + '\'' +
            " " + '}';
  }
}
