package demoFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;

public class ClickApp extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {

    Pane root = new Pane();
    Scene scene = new Scene(root, 600, 400);
    Random random = new Random();


    Circle circle = new Circle(random.nextInt((int) scene.getWidth()), random.nextInt((int) scene.getHeight()), 25);
    root.getChildren().add(circle);
//watek obsługi znikającego kółka
    new Thread(() -> {
      while (true) {
        circle.setVisible(false);
        try {
          Thread.sleep(1000);
          circle.setCenterX(random.nextInt((int) scene.getWidth()));
          circle.setCenterY(random.nextInt((int) scene.getHeight()));
          circle.setVisible(true);
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }).start();

    root.setOnMouseClicked(event -> {
      double xMouse = event.getSceneX();
      double yMouse = event.getSceneY();
      double xCircle = circle.getCenterX();
      double yCircle = circle.getCenterY();
      double rCircle = circle.getRadius();
//      System.out.println(xCircle + " " + yCircle + " " + rCircle + " " + xMouse + " " + yMouse);

      int score = 0;

    });

//    System.out.println("Clicked");
//    root.setOnMouseClicked(event -> {
//      double x = event.getSceneX();
//      double y = event.getSceneY();
//      int red = 100;
//      int green = 220;
//      int blue = 200;
//      Circle c = new Circle(x, y, 25);
//      c.setFill(Color.rgb(red, green, blue));
//      root.getChildren().add(c);
//    });

    primaryStage.setScene(scene);
    primaryStage.setTitle("Click Me!");
    primaryStage.show();
  }
}
