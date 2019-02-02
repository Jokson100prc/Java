package demoFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class FirstApp extends Application {//Klasa graficzna musi rozszerzać Aplication

  public static void main(String[] args) {
    launch(args);
  }

  @Override //primaryStage to główny węzeł (jak w DOM)
  public void start(Stage primaryStage) {
    Pane root = new Pane();

    Scene scene = new Scene(root, 600, 450);
    scene.setFill(Color.WHITE);

    primaryStage.setScene(scene);
    primaryStage.setTitle("First FX App");
    primaryStage.setResizable(false);
    primaryStage.show();

    Line line = new Line(50, 50, 550, 400);
    line.setFill(Color.GREEN);
    line.setStrokeWidth(2);
    root.getChildren().add(line);


    double width = root.getWidth();
    double height = root.getHeight();
    Circle circle = new Circle(width / 2, height / 2, 100);
    circle.setFill(Color.AQUAMARINE);
    circle.setStrokeWidth(2);
    root.getChildren().add(circle);


  }
}
