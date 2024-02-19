package com.example.maraton;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class HelloController {
    @FXML
    public ChoiceBox tavId;
    @FXML
    public TextField timeIn;
    @FXML
    public Button calcualteBtn;
    @FXML
    public Label kmHour;
    @FXML
    public Label meterSecond;

    private int[] tavok = {16,38,54,57,94};

    @FXML
    protected void initialize(){
        tavId.setItems(FXCollections.observableArrayList(
                "Mini - 16km",
                "Rövid - 38km",
                "Pedelec - 54km",
                "Közép - 57km",
                "Hosszú - 94km"
        ));

        tavId.getSelectionModel().select("Közép - 57km");
    }



    @FXML
    protected void calculateSpeed(){
        double distance = tavok[tavId.getSelectionModel().getSelectedIndex()];
        String[] time = timeIn.getText().split(":");
        int seconds = Integer.parseInt(time[0])*3600+Integer.parseInt(time[1])*60+Integer.parseInt(time[2]);
        meterSecond.setText(String.format("%.2f",(distance*1000)/seconds));
        kmHour.setText(String.format("%.2f",distance / ((double) seconds / 3600d)));
    }
}