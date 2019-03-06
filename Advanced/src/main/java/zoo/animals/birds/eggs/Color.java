package zoo.animals.birds.eggs;

public enum Color {
  BLUE("blue"),
  RED("red"),
  YELLOW("yellow"),
  GREEN("green");

  private String color;

  Color(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }
}
