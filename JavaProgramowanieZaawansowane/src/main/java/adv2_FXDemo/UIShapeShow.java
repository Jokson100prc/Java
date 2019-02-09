package adv2_FXDemo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class UIShapeShow extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("From line to shape");
    Group root = new Group();
    Scene scene = new Scene(root,1920,900);

    Line redLine = new Line(250,250,1600,250);
    redLine.setStroke(Color.CRIMSON);
    redLine.setStrokeWidth(5);
    redLine.setStrokeLineCap(StrokeLineCap.BUTT);

    Circle circle = new Circle(900,566, 250);
    circle.setStroke(Color.ALICEBLUE);
    circle.setFill(Color.YELLOWGREEN);

    Rectangle rect = new Rectangle(550,253,250,250);
    rect.setStroke(Color.YELLOW);
    rect.setFill(Color.ORANGE);

    Path shape = new Path();
    shape.getElements().addAll(
            new MoveTo(255,255),
            new LineTo(450,450),
            new LineTo(600, 255),
            new LineTo(255,255));
    shape.setStroke(Color.GREEN);
    shape.setStrokeWidth(5);
    root.getChildren().addAll(shape,rect,circle,redLine);

    primaryStage.setScene(scene);
    primaryStage.show();


  }
}
