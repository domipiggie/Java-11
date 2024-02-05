package com.example.hellojavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    public Label counter;
    @FXML
    private Label welcomeText;
    @FXML
    private TextField nameTextField;

    private int clickCount = 0;

    @FXML
    protected void onHelloButtonClick() {
        String name = nameTextField.getText();
        welcomeText.setText("Hello "+(name.isEmpty()?"Anonymous":name)+"!");
        nameTextField.setText("");
    }

    @FXML
    protected void onCounterButtonClick(){
        counter.setText(String.valueOf(++clickCount));
    }
}