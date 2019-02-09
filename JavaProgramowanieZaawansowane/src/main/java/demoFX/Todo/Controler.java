package demoFX.Todo;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;


public class Controler {





  @FXML
  TextArea taskContent;

  @FXML
  DatePicker taskDateTodo;

  @FXML
  Button addTask;

  public Controler() {
  }

  public void initialize(){
  }

//  @FXML
//  public void addTaskTodo(){
//    //Dodanie zadania do kolekcji
//    Alert info = new Alert("Zadziałał przycisk addTask " + taskContent.getText());
//    info.show();
//  }

}
