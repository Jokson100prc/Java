package demoFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class SecondExercise extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    Pane root = new Pane();

    Scene scene = new Scene(root, 1600, 900);
    scene.setFill(Color.rgb(22, 199, 170));

    primaryStage.setScene(scene);
    primaryStage.setTitle("Graphic Studio");
    primaryStage.show();


    double w = root.getWidth();
    double h = root.getHeight();
    Circle circle = new Circle(w / 2, h / 2, 120);
    circle.setFill(Color.WHITE);
    root.getChildren().add(circle);


    Circle circle2 = new Circle((w / 2) - 180, (h / 2) - 220, 150);
    circle2.setFill(Color.YELLOW);
    root.getChildren().add(circle2);


    Circle circle3 = new Circle((w / 2) - 300, (h / 2), 150);
    circle3.setFill(Color.GREEN);
    root.getChildren().add(circle3);


    Circle circle4 = new Circle((w / 2) - 180, (h / 2) + 220, 150);
    circle4.setFill(Color.BLUE);
    root.getChildren().add(circle4);


    Circle circle5 = new Circle((w / 2) + 180, (h / 2) + 220, 150);
    circle5.setFill(Color.VIOLET);
    root.getChildren().add(circle5);


    Circle circle6 = new Circle((w / 2) + 300, (h / 2), 150);
    circle6.setFill(Color.RED);
    root.getChildren().add(circle6);


    Circle circle7 = new Circle((w / 2) +180, (h / 2)-220, 150);
    circle7.setFill(Color.ORANGE);
    root.getChildren().add(circle7);



  }
}
