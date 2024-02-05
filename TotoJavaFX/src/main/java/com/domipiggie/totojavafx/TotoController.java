package com.domipiggie.totojavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Arrays;

public class TotoController {
    @FXML
    public TextField resultField;
    @FXML
    public CheckBox incorrectCount;
    @FXML
    public CheckBox incorrectChar;
    @FXML
    public Label incorrectCharLabel;
    @FXML
    public Button saveButton;
    @FXML
    public Label incorrectLengthLabel;

    protected ArrayList<Character> allowedChars = new ArrayList<>(Arrays.asList('1', '2', 'X'));

    @FXML
    protected void checkResult(){
        incorrectCount.setSelected(false);
        incorrectChar.setSelected(false);

        String result = resultField.getText();
        if (result.length() != 14){
            incorrectCount.setSelected(true);
        }
        incorrectLengthLabel.setText(String.valueOf(result.length()));

        char[] resultChars = result.toCharArray();
        ArrayList<String> incorrectChars = new ArrayList<>();
        for (char c : resultChars){
            if (!allowedChars.contains(c) && !incorrectChars.contains(String.valueOf(c))){
                incorrectChars.add(String.valueOf(c));
                incorrectChar.setSelected(true);
            }
        }

        incorrectCharLabel.setText(String.join(",", incorrectChars));

        if (incorrectChar.isSelected()||incorrectCount.isSelected()){
            saveButton.setDisable(true);
            return;
        }
        saveButton.setDisable(false);
    }
}