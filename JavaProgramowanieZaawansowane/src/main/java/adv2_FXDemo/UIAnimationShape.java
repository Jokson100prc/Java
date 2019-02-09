package adv2_FXDemo;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class UIAnimationShape extends Application {
  @Override
  public void start(Stage primaryStage) {
    Pane canvas = new Pane();
    Scene scene = new Scene(canvas, 600, 600);
    Circle ball = new Circle(20, Color.CHARTREUSE);
    ball.relocate(5, 5);

    canvas.getChildren().add(ball);

    primaryStage.setTitle("Animated ball");
    primaryStage.setScene(scene);
    primaryStage.show();

    Timeline timeline = new Timeline(new KeyFrame(Duration.millis(20),
            new EventHandler<ActionEvent>() {

              double dx = 7; // x speed
              double dy = 3; // y speed

              @Override
              public void handle(ActionEvent t) {
                ball.setLayoutX(ball.getLayoutX() + dx);
                ball.setLayoutY(ball.getLayoutY() + dy);

                Bounds bounds = canvas.getBoundsInLocal();

                if ((ball.getLayoutX() >= (bounds.getMaxX() - ball.getRadius())) || (ball.getLayoutX() <= (bounds.getMinX() + ball.getRadius()))) {
                  dx = -dx;
                }

                if ((ball.getLayoutY() >= (bounds.getMaxY() - ball.getRadius())) || (ball.getLayoutY() <= (bounds.getMinY() + ball.getRadius()))) {
                  dy = -dy;
                }
              }
            }));
    timeline.setCycleCount(Timeline.INDEFINITE);
    timeline.play();
  }
}
