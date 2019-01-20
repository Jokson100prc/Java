class Diagram {
  private Field[] fields;

  public Diagram(String theme) {
    fields = new Field[theme.length()];
    int i = 0;
    for(char c: theme.toCharArray()){
      fields[i++] = new Field(c, i);
    }
  }

  public Field fieldAt(int i){
    return i > -1 && i < fields.length ? fields[i]: null;
  }

  public char letterAt(int i){
    return fields[i].letter;
  }

  public static class Field{
    private final char letter;
    private final int number;

    public Field(char letter, int number){
      this.letter = letter;
      this.number = number;
    }

    @Override
    public String toString() {
      return letter+" "+number;
    }
  }
}

class Task {
  public static void main(String[] args) {
    Diagram diagram = new Diagram("JAVA");
    System.out.println(diagram.fieldAt(2));
    System.out.println(diagram.letterAt(2));
    Diagram.Field f = new Diagram.Field('D', 8);
    System.out.println(f);
}
}