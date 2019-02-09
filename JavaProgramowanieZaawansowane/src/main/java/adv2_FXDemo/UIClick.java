package adv2_FXDemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class UIClick extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    Pane root = new Pane();
    Scene scene = new Scene(root, 900,600);
    root.setOnMouseClicked(event -> {
      Circle circle = new Circle(event.getSceneX(),event.getSceneY(),75);
    circle.setStroke(Color.AQUAMARINE);
    circle.setFill(Color.BURLYWOOD);
    root.getChildren().add(circle);
    });
    primaryStage.setScene(scene);
    primaryStage.setTitle("Click Demo");
    primaryStage.show();
  }
}
