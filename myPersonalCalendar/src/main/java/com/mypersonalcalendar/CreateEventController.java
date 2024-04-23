package com.mypersonalcalendar;

import com.mypersonalcalendar.modell.DataManager;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class CreateEventController extends DataManager{

    @FXML
    public TextField eventNameTextField;
    @FXML
    public TextField eventDateTextField;
    @FXML
    public TextField eventLocationTextField;

    @FXML
    protected void backToMain() throws IOException {
        EventsApplication main = new EventsApplication();
        main.changeScene("main-view.fxml");
    }

    @FXML
    protected void addEvent() throws IOException {
        String eventName = eventNameTextField.getText();
        String eventDate = eventDateTextField.getText();
        String eventLocation = eventLocationTextField.getText();
        Alert alertJo = new Alert(Alert.AlertType.INFORMATION, "Esemény sikeresen hozzáadva!");
        if (eventName.isEmpty()) {
            hiba();
        }
        else if(eventDate.isEmpty()){
            hiba();
        }
        else if(eventLocation.isEmpty()){
            hiba();
        }
        else{
            addEventToList(eventName,eventDate,eventLocation);
            alertJo.show();
            backToMain();
        }
    }

    protected void hiba() throws IOException {
        Alert alertRossz = new Alert(Alert.AlertType.ERROR, "Az esemény hiányos vagy érvénytelenek az adatok!");
        alertRossz.show();
        backToMain();
    }
}
