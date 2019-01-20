interface Radiusable {

  double getRadius();

  double getAngle();

  default double getPerimeter(){
    return normalizeAngle(getAngle())*2 * Math.PI * getRadius() / (2 * Math.PI);
  }

  static double normalizeAngle(double a){
    a = Math.abs(a);
    return a > Math.PI*2 ? a - Math.round(a/(Math.PI*2)-1)*2*Math.PI : a;
  }
}

class Circle implements Radiusable{
  private double radius;

  public Circle(double radius){
    this.radius = radius;
  }

  @Override
  public double getRadius() {
    return radius;
  }

  @Override
  public double getAngle() {
    return Math.PI * 2;
  }
}

class Arc extends Circle{
  private double angle;

  public Arc(double radius, double angle){
    super(radius);
    this.angle = angle;
  }

  public Arc(double radius){
    super(radius);
    this.angle = 2 * Math.PI;
  }

  @Override
  public double getAngle(){
    return angle;
  }
}

class Ellipse extends Circle{
  private double focusDistance;

  public Ellipse(double radius, double focusDistance){
    super(radius);
    this.focusDistance = focusDistance;
  }

  public Ellipse(double radius){
    super(radius);
    this.focusDistance = radius;
  }

  @Override
  public double getPerimeter() {
    double a = getVertex();
    double b = getCoVertex();
    if (getRadius() == focusDistance){
      return super.getPerimeter();
    }
    return Math.PI * ( 3.0/2.0 * (a+b) - Math.sqrt(a*b));
  }

  public double getFocusDistance() {
    return focusDistance;
  }

  public double getCoVertex(){
    return Math.sqrt(getRadius()*getRadius()+focusDistance*focusDistance);
  }

  public double getVertex(){
    return getRadius();
  }
}

class BestWishes{

}

class Task {
  static public void main(String[] args){
    Circle a = new Circle(10);
    Circle b = new Arc(10, Math.PI/4);
    Radiusable c = new Circle(10);
    Radiusable d = new Arc(10, Math.PI /4);
    Radiusable e = new Ellipse(10);
    Circle f = new Ellipse(10, 0);

    System.out.println(a.getPerimeter());
    System.out.println(b.getPerimeter());
    System.out.println(c.getPerimeter());
    System.out.println(d.getPerimeter());
    System.out.println(e.getPerimeter());
    System.out.println(f.getPerimeter());
    System.out.println(((Ellipse) f).getCoVertex());
  }
}