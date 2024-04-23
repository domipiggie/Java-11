package com.mypersonalcalendar;

import com.mypersonalcalendar.modell.Event;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class EventsApplication extends Application {

    private static Stage stg;
    public static ArrayList<Event> events = new ArrayList<>();

    @Override
    public void start(Stage stage) throws IOException {
        stg = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(EventsApplication.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 450, 350);
        stage.setTitle("Az én személyes naptáram");
        stage.setScene(scene);
        stage.show();
    }

    public void changeScene(String view) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource(view));
        stg.getScene().setRoot(pane);
    }

    public static void main(String[] args) {
        launch();
    }
}