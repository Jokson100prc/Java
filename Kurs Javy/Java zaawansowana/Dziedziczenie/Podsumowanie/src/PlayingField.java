public class PlayingField {

  int fieldSize;
  int seats;
  String surface;

  PlayingField(){
  }

  public PlayingField(int fieldSize, int seats, String surface) {
    this.fieldSize = fieldSize;
    this.seats = seats;
    this.surface = surface;
  }

  public PlayingField(int fieldSize, String surface) {
    this.fieldSize = fieldSize;
    this.surface = surface;
  }

  String setSurface() {
    return surface;
  }

  public int getFieldSize() {
    return fieldSize;
  }

  public int getSeats() {
    return seats;
  }
}
