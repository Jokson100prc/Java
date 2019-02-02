package exchangeExercise;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
//import javafx.scene.Scene;
//import javafx.scene.layout.Pane;
//import javafx.scene.paint.Color;

public class Exchange extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {

//    Pane root = new Pane();
//    Scene scene = new Scene(root,400,800);
//    scene.setFill(Color.BURLYWOOD);
//
//
//    primaryStage.setScene(scene);
//    primaryStage.setTitle("exchangeExercise.Exchange");
//    primaryStage.show();

    VBox root = new VBox();
    root.setAlignment(Pos.CENTER);
    root.setSpacing(10);
    root.setPadding(new Insets(10, 10, 10, 10));



    Label labelCurrencyName = new Label("Currency:");
    TextField currency = new TextField("Your currency");
    currency.setAlignment(Pos.CENTER);
    currency.setOnAction(event -> {

    });
    root.getChildren().addAll(labelCurrencyName, currency);


    Label labelAmountName = new Label("Amount PLN:");
    TextField amount = new TextField("Your amount (PLN)");
    amount.setAlignment(Pos.CENTER);
    amount.setOnAction(event ->{

    });
    root.getChildren().addAll(labelAmountName, amount);


    Label labelNewCurrency = new Label("New amount");
    TextField newCurrency = new TextField("New amount");
    newCurrency.cancelEdit();
    newCurrency.setAlignment(Pos.CENTER);
    root.getChildren().addAll(labelNewCurrency, newCurrency);


  }
}
