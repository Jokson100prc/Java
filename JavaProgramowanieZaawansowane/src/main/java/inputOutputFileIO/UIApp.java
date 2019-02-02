package inputOutputFileIO;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UIApp extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    VBox root = new VBox();
    root.setAlignment(Pos.CENTER);
    root.setSpacing(10);
    root.setPadding(new Insets(10, 10, 10, 10));


    Label labelName = new Label("Write Name:");
//    root.getChildren().add(labelName);
    TextField name = new TextField("Name");
    name.setAlignment(Pos.CENTER);
    name.setOnAction(event -> {
      name.setText(name.getText().toUpperCase());
    });
    root.getChildren().addAll(labelName, name);


    Label labelData = new Label("Set date:");
    DatePicker date = new DatePicker();
    root.getChildren().addAll(labelData, date);


    Label labelEye = new Label("Eye color");
    ComboBox<String> eyeColor = new ComboBox<>();
    eyeColor.getItems().addAll("green", "blue", "brown");
    root.getChildren().addAll(labelEye, eyeColor);


    ListView<String> list = new ListView<>();
    root.getChildren().add(list);


    Button submit = new Button("Click");
    root.getChildren().add(submit);
    submit.setOnAction(event -> {
      String data = name.getText() + " " + date.getValue() + ", " + eyeColor.getValue();
      list.getItems().add(data);

//      Alert info = new Alert(Alert.AlertType.INFORMATION);
//      info.setHeaderText("WARNING");
//      info.setContentText("Writed name: " + name.getText() + " and date: " + date.getValue());
//      info.show();
    });



    Button remove = new Button("Remove");
    root.getChildren().add(remove);
    remove.setOnAction(event -> {
      list.getItems().remove(list.getSelectionModel().getSelectedItem());
    });


    Button save = new Button("Save to file");
    root.getChildren().add(save);
    save.setOnAction(event->{
      IOFile.saveToFile(list.getItems(), "UIApp.txt");
    });

    list.getItems().addAll((IOFile.readFromFile("UIApp.txt")));


    Scene scene = new Scene(root, 300, 600);
    primaryStage.setScene(scene);
    primaryStage.setTitle("UI Application");
    primaryStage.show();
  }
}
