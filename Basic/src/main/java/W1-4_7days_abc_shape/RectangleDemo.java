package shape;

public class RectangleDemo {

    public static void main(String[]  args){
        Rectangle rect = new Rectangle(4,6);
        Rectangle square = rect.makeSquare(8);
        Rectangle rect2 = new Rectangle(7,8);

        Rectangle box = Rectangle.makeUnitSquare();

        System.out.println(rect);
        System.out.println(square);
        System.out.println(Rectangle.count);

        System.out.println(box);

        System.out.println(rect.count);
        System.out.println(square.count);
        System.out.println(rect2.count);

        System.out.println(box.count);
    }
}
