package com.example.javafxsudoku;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    public Button plus;
    @FXML
    public Label counter;
    @FXML
    public Button minus;
    @FXML
    public Label length;
    @FXML
    public TextField startState;

    private int size = 4;

    @FXML
    protected void counterDecrease(){
        if (size<=4) return;
        counter.setText(String.valueOf(--size));
        lengthCalc();
    }
    @FXML
    protected void counterIncrease(){
        if (size>=9) return;
        counter.setText(String.valueOf(++size));
        lengthCalc();
    }
    @FXML
    protected void lengthCalc(){
        if (startState.getText().length()>(size*size)){
            startState.setText(startState.getText().substring(0,(size*size)));
            startState.positionCaret(size*size);
        }
        if (!Character.isDigit(startState.getText().charAt(startState.getText().length()-1))){
            startState.setText(startState.getText().substring(0,startState.getText().length()-1));
            startState.positionCaret(startState.getText().length());
        }
        length.setText(String.valueOf(startState.getText().length()));
    }
}