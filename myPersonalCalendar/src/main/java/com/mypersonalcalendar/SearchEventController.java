package com.mypersonalcalendar;

import com.mypersonalcalendar.modell.DataManager;
import com.mypersonalcalendar.modell.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SearchEventController extends DataManager implements Initializable {
    @FXML
    public TableView myTableView;
    @FXML
    public TextField search;

    @FXML
    protected void backToMain() throws IOException {
        EventsApplication main = new EventsApplication();
        main.changeScene("main-view.fxml");
    }

    @FXML
    public void initialize(URL location, ResourceBundle resources){
        TableColumn<String, Event> cl1 = new TableColumn<>("Név");
        cl1.setCellValueFactory(new PropertyValueFactory<>("eventName"));
        TableColumn<Integer, Event> cl2 = new TableColumn<>("Helyszín");
        cl2.setCellValueFactory(new PropertyValueFactory<>("eventLocation"));
        TableColumn<Integer, Event> cl3 = new TableColumn<>("Dátum");
        cl3.setCellValueFactory(new PropertyValueFactory<>("eventDate"));
        myTableView.getColumns().add(cl1);
        myTableView.getColumns().add(cl2);
        myTableView.getColumns().add(cl3);

        for (Event e : getEvents()){
            myTableView.getItems().add(e);
        }
    }

    @FXML
    public void searchText(){
        myTableView.getItems().clear();
        for (Event e : getEvents()){
            if (e.eventName.startsWith(search.getText())){
                myTableView.getItems().add(e);
            }
        }
    }
}
