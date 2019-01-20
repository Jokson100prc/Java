import java.util.ArrayList;
import java.util.List;

interface Grid{

  String getAt(int row, int column);
  int getColumns();
  int getRows();

  static String toString(String[] arr){
    String result = "|";
    for (String s: arr){
      result += s +"|";
    }
    return result;
  }

  default String[] getRow(int row){
    String[] rowValues = new String[getColumns()];
    for(int column = 0; column < rowValues.length; column++){
      rowValues[column] = getAt(row, column);
    }
    return rowValues;
  }

  default String[] getColumn(int column){
    String[] values = new String[getRows()];
    for(int row = 0; row < values.length; row++){
      values[row] = getAt(row, column);
    }
    return values;
  }
}

class Diagram implements Grid {
  private String[][] grid;

  public Diagram(int rows, int columns){
    grid = new String[rows][columns];
  }

  public void fill(String pattern){
    for(int row = 0; row < getRows(); row++){
      for (int column = 0; column < getColumns(); column++){
        grid[row][column] = pattern+" "+row+" "+column;
      }
    }
  }

  @Override
  public String getAt(int row , int column) {
    return grid[row][column];
  }

  @Override
  public int getColumns() {
    return grid[0].length;
  }

  @Override
  public int getRows() {
    return grid.length;
  }
}
class Task {
  public static void main(String[] args) {
    Grid diagram = new Diagram(5, 10);
    System.out.println(diagram.getColumns());
    ((Diagram)diagram).fill("");
    String[] row5 = diagram.getRow(4);
    System.out.println(Grid.toString(row5));
  }
}