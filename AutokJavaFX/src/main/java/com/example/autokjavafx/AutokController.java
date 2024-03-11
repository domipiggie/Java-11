package com.example.autokjavafx;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class AutokController {
    ArrayList<Auto> cars = new ArrayList<>();
    @FXML
    public TextField marka;
    @FXML
    public TextField tipus;
    @FXML
    public TextField henger;
    @FXML
    public TextField szemelyek;
    @FXML
    public TextField rendszam;

    @FXML
    protected void addCar(){
        cars.add(new Auto(marka.getText(), tipus.getText(), rendszam.getText(), Integer.parseInt(henger.getText()), Integer.parseInt(szemelyek.getText())));
        marka.setText("");
        tipus.setText("");
        rendszam.setText("");
        henger.setText("");
        szemelyek.setText("");
        for (Auto c:cars){
            System.out.println(c);
        }
    }
}