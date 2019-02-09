package adv2_FXDemo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class UIImage extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    GridPane root = new GridPane();
    Scene scene = new Scene(root, 1200, 800);
    root.setAlignment(Pos.CENTER);
    root.setVgap(10);
    String remoteUrl = "http://marcinzawacki.pl/img/CVMarcinZawacki.jpg";
    Image remoteImage = new Image(remoteUrl, true);
    TextField urlField = new TextField();
    Button downloadButton = new Button("Download img");
    ImageView imageView = new ImageView(remoteImage);
    ProgressIndicator progressIndicator = new ProgressIndicator();
    progressIndicator.setVisible(false);
    downloadButton.setOnAction(event -> {
      Image img = new Image(urlField.getText(),true);
      progressIndicator.setVisible(true);
      imageView.setImage(img);
      new Thread(()->{
        while (img.getProgress() < 1.0) {
          try{
            Thread.sleep(1);
          } catch (InterruptedException e){
            e.printStackTrace();
          }
        }
        progressIndicator.setVisible(false);
      }).start();
    });

    root.add(imageView,0,0);
    root.add(urlField, 0,1);
    root.add(downloadButton, 0,2);
    root.add(progressIndicator,0,0);

    primaryStage.setScene(scene);
    primaryStage.setTitle("Image from url");
    primaryStage.setResizable(true);
    primaryStage.show();
  }
}
