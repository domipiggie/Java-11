package com.example.login_page_04_16;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    protected void onLoginButtonClick() throws Exception{
        HelloApplication main = new HelloApplication();
        if (username.getText().equals("marci") && password.getText().equals("panda")) {
            main.changeScene("info-view.fxml");
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING, "Hibás felhasználónév vagy jelszó!");
            alert.show();
        }
    }
}