package demoFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ThirdExercises extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {

    Pane root = new Pane();


    Scene scene = new Scene(root, 1920, 1080);
    scene.setFill(Color.WHITE);

    double w = primaryStage.getWidth();
    double h = primaryStage.getHeight();

    Circle circle = new Circle((w / 2), (h / w), 150);
    circle.setFill(Color.WHITE);
    root.getChildren().add(circle);


    int satelites = 6;
    double x0 = w / 2;
    double y0 = h / 2;

    double bigRadius = 180;

    double smallRadius = 150;

    for (double alfa = 0; alfa < Math.PI * 2; alfa += 2 * Math.PI / satelites) {
      Circle c = new Circle(x0 + Math.sin(alfa) * bigRadius, y0 + Math.cos(alfa) * bigRadius, smallRadius);

      c.setFill(Color.ORANGERED);

      root.getChildren().add(c);
    }
  }
}

