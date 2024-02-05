module com.example.javafxsudoku {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxsudoku to javafx.fxml;
    exports com.example.javafxsudoku;
}