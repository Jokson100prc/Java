package shape;

public class Rectangle {

    static final int UNIT = 1;

    static int count;
    int width;
    int height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
        count++;
    }

    public static Rectangle makeSquare(int side){
        return new Rectangle(side,side);
    }

    public static Rectangle makeUnitSquare(){
        return new Rectangle(Rectangle.UNIT, Rectangle.UNIT);
    }

    public String toString(){
        return width + " " + height;
    }
}
