package exchangeExercise;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

public class ExchangePanel extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws IOException {

    GridPane root = new GridPane();
    root.setAlignment(Pos.CENTER);
    root.setVgap(10);
    root.setHgap(10);



    Label labelCurrencyName = new Label("Currency:");
    root.getChildren().add(labelCurrencyName);

    ComboBox<String> currency = new ComboBox<>();
    CurrencyJsonReader reader = new CurrencyJsonReader();
    List<CurrencyJsonReader.CurrencyRate> list = reader.getCurencies();
    for(CurrencyJsonReader.CurrencyRate item: list){
      currency.getItems().add(item.name);
    }
    currency.setOnAction(event -> {

    });
    root.add( currency,1,0);


    root.add(new Label("Amount PLN:"),0 ,2);
    TextField amount = new TextField("Your amount (PLN)");
    amount.setAlignment(Pos.CENTER);
    root.getChildren().add( amount);



    root.add(new Label("New amount"),0,2);
    TextField newCurrency = new TextField("New amount");
    newCurrency.cancelEdit();
    newCurrency.setAlignment(Pos.CENTER);
    root.getChildren().add( newCurrency);

    amount.setOnAction(event ->{
      int index = currency.getSelectionModel().getSelectedIndex();
      CurrencyJsonReader.CurrencyRate rate = list.get(index);
      double price = Double.parseDouble(amount.getText());
      newCurrency.setText((rate.rate * price) + "");
    });

    Scene scene = new Scene(root,500,800);
    scene.setFill(Color.BURLYWOOD);


    primaryStage.setScene(scene);
    primaryStage.setTitle("exchangeExercise.ExchangePanel");
    primaryStage.show();



  }
}
