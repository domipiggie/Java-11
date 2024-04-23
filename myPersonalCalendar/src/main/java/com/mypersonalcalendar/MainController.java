package com.mypersonalcalendar;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class MainController {

    @FXML
    private Button createEventButton;
    @FXML
    private Button eventListButton;
    @FXML
    private Button searchEventButton;

    @FXML
    protected void createEvent() throws IOException {
        EventsApplication main = new EventsApplication();
        main.changeScene("createevent-view.fxml");
    }

    @FXML
    protected void eventList() throws IOException  {
        EventsApplication main = new EventsApplication();
        main.changeScene("eventlist-view.fxml");
    }

    @FXML
    protected void searchEvent() throws IOException {
        EventsApplication main = new EventsApplication();
        main.changeScene("searchevent-view.fxml");
    }
}
