package com.example.colorchanger;

import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import java.util.Random;

public class HelloController {
    @FXML
    public Circle circle;
    @FXML
    public Ellipse ellipse;
    @FXML
    public Rectangle rectangle;
    @FXML
    public Arc arch;
    @FXML
    public Circle circle2;
    @FXML
    public ColorPicker picker;
    @FXML
    public ScrollBar hslider;
    @FXML
    public ScrollBar vslider;
    @FXML
    public Rectangle rectangle2;
    Random rand = new Random();

    private Color generateRandomColor(){
        return Color.rgb(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
    }

    @FXML
    private void setCircleColor(){
        circle.setFill(generateRandomColor());
    }
    @FXML
    private void setEllipseColor(){
        ellipse.setStroke(generateRandomColor());
        ellipse.setStrokeWidth(rand.nextInt(10));
    }
    @FXML
    private void setRectangleColor(){
        rectangle.setFill(generateRandomColor());
    }
    @FXML
    private void archEnter(){
        arch.setStroke(generateRandomColor());
        arch.setStrokeWidth(5);
    }
    @FXML
    private void archLeave(){
        arch.setStrokeWidth(0);
    }
    @FXML
    private void setCircle2Color(){
        circle2.setFill(picker.getValue());
    }
    @FXML
    private void setRectangleHeight(){
        rectangle2.setHeight(vslider.getValue());
    }
    @FXML
    private void setRectangleWidth(){
        rectangle2.setWidth(hslider.getValue());
    }
}