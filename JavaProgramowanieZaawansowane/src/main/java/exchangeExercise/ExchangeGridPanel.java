package exchangeExercise;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

public class ExchangeGridPanel extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws IOException {
    GridPane root = new GridPane();
    root.setVgap(10);
    root.setHgap(10);
    root.setAlignment(Pos.CENTER);



    root.add(new Label("Currency"),0,0);
    ComboBox<String> currency = new ComboBox<>();
    root.add(currency, 1,0);

    root.add(new Label("Rate"),0,1);
    TextField rate = new TextField();
    rate.setEditable(false);
    root.add(rate,1,1);

    root.add(new Label("Amount PLN"),0,2);
    TextField amountPLN = new TextField();
    root.add(amountPLN,1,2);

    root.add(new Label("New currency amount"),0,3);
    TextField newCurrAmount = new TextField();
    root.add(newCurrAmount,1,3);



    CurrencyJsonReader reader = new CurrencyJsonReader();
    List<CurrencyJsonReader.CurrencyRate> list = reader.getCurencies();
    for(CurrencyJsonReader.CurrencyRate item: list){
      currency.getItems().add(item.name);
    }
    currency.setOnAction(event -> {

    });

    amountPLN.setOnAction(event ->{
      int index = currency.getSelectionModel().getSelectedIndex();
      CurrencyJsonReader.CurrencyRate rateA = list.get(index);
      double price = Double.parseDouble(amountPLN.getText());
      newCurrAmount.setText((price / rateA.rate) + "");
    });

    Scene scene = new Scene(root,500, 800);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Exchange");
    primaryStage.show();
  }
}
