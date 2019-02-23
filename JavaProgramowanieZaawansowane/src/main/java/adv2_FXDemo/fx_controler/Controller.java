package adv2_FXDemo.fx_controler;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.util.converter.DoubleStringConverter;

import java.util.function.UnaryOperator;

public class Controller {
  @FXML
  private TextArea firstName;

  @FXML
  private TextArea lastName;

  @FXML
  private DatePicker birthDate;

  @FXML
  private ComboBox colorEye;

  @FXML
  private Spinner salary;

  @FXML
  private Button submitBtn;

  public Controller(){}

  @FXML
  private void initialize(){
    colorEye.getItems().add("green");
    colorEye.getItems().add("blue");
    colorEye.getItems().add("brown");

    SpinnerValueFactory<Double> factory = new SpinnerValueFactory.DoubleSpinnerValueFactory(0,10000,0);
    salary.setValueFactory(factory);

    UnaryOperator<TextFormatter.Change> filter = c->{
      if(c.isContentChange() && c.getControlNewText().length() >0){
        try {
          Double.parseDouble(c.getControlNewText());
          return c;
        }catch (NumberFormatException e){
          return null;
        }
      }
    return c;
    };

    TextFormatter<Double> doubleTextFormatter = new TextFormatter<Double>(new DoubleStringConverter(),0.0,filter);
    salary.getEditor().setTextFormatter(doubleTextFormatter);

  }

  @FXML
  public void add(){
    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
    alert.setTitle("Alert title");
    alert.setHeaderText("Header");
    String string = "Message... ";
    alert.setContentText(string);
    alert.show();
  }

}
